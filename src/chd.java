import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class chd {
   private static final Logger a = LogUtils.getLogger();
   private final Short2ObjectMap<chc> b = new Short2ObjectOpenHashMap();
   private final Map<jq<che>, Set<chc>> c = Maps.newHashMap();
   private final Runnable d;
   private boolean e;

   public chd(Runnable $$0) {
      this($$0, true, ImmutableList.of());
   }

   chd(Runnable $$0, boolean $$1, List<chc> $$2) {
      this.d = $$0;
      this.e = $$1;
      $$2.forEach(this::a);
   }

   public chd.a a() {
      return new chd.a(this.e, this.b.values().stream().map(chc::a).toList());
   }

   public Stream<chc> a(Predicate<jq<che>> $$0, chb.b $$1) {
      return this.c.entrySet().stream().filter($$1x -> $$0.test((jq<che>)$$1x.getKey())).flatMap($$0x -> ((Set)$$0x.getValue()).stream()).filter($$1.a());
   }

   public void a(jh $$0, jq<che> $$1) {
      if (this.a(new chc($$0, $$1, this.d))) {
         a.debug("Added POI of type {} @ {}", $$1.g(), $$0);
         this.d.run();
      }
   }

   private boolean a(chc $$0) {
      jh $$1 = $$0.g();
      jq<che> $$2 = $$0.h();
      short $$3 = kj.b($$1);
      chc $$4 = (chc)this.b.get($$3);
      if ($$4 != null) {
         if ($$2.equals($$4.h())) {
            return false;
         }

         ae.b("POI data mismatch: already registered at " + $$1);
      }

      this.b.put($$3, $$0);
      this.c.computeIfAbsent($$2, $$0x -> Sets.newHashSet()).add($$0);
      return true;
   }

   public void a(jh $$0) {
      chc $$1 = (chc)this.b.remove(kj.b($$0));
      if ($$1 == null) {
         a.error("POI data mismatch: never registered at {}", $$0);
      } else {
         this.c.get($$1.h()).remove($$1);
         a.debug("Removed POI of type {} @ {}", LogUtils.defer($$1::h), LogUtils.defer($$1::g));
         this.d.run();
      }
   }

   @Deprecated
   @bbb
   public int b(jh $$0) {
      return this.e($$0).map(chc::b).orElse(0);
   }

   public boolean c(jh $$0) {
      chc $$1 = (chc)this.b.get(kj.b($$0));
      if ($$1 == null) {
         throw (IllegalStateException)ae.b(new IllegalStateException("POI never registered at " + $$0));
      } else {
         boolean $$2 = $$1.d();
         this.d.run();
         return $$2;
      }
   }

   public boolean a(jh $$0, Predicate<jq<che>> $$1) {
      return this.d($$0).filter($$1).isPresent();
   }

   public Optional<jq<che>> d(jh $$0) {
      return this.e($$0).map(chc::h);
   }

   private Optional<chc> e(jh $$0) {
      return Optional.ofNullable((chc)this.b.get(kj.b($$0)));
   }

   public void a(Consumer<BiConsumer<jh, jq<che>>> $$0) {
      if (!this.e) {
         Short2ObjectMap<chc> $$1 = new Short2ObjectOpenHashMap(this.b);
         this.c();
         $$0.accept(($$1x, $$2) -> {
            short $$3 = kj.b($$1x);
            chc $$4 = (chc)$$1.computeIfAbsent($$3, $$2x -> new chc($$1x, $$2, this.d));
            this.a($$4);
         });
         this.e = true;
         this.d.run();
      }
   }

   private void c() {
      this.b.clear();
      this.c.clear();
   }

   boolean b() {
      return this.e;
   }

   public static record a(boolean b, List<chc.a> c) {
      public static final Codec<chd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.BOOL.lenientOptionalFieldOf("Valid", false).forGetter(chd.a::a), chc.a.a.listOf().fieldOf("Records").forGetter(chd.a::b))
               .apply($$0, chd.a::new)
      );

      public chd a(Runnable $$0) {
         return new chd($$0, this.b, this.c.stream().map($$1 -> $$1.a($$0)).toList());
      }

      public boolean a() {
         return this.b;
      }

      public List<chc.a> b() {
         return this.c;
      }
   }
}
