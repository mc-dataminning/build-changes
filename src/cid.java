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

public class cid {
   private static final Logger a = LogUtils.getLogger();
   private final Short2ObjectMap<cic> b = new Short2ObjectOpenHashMap();
   private final Map<je<cie>, Set<cic>> c = Maps.newHashMap();
   private final Runnable d;
   private boolean e;

   public cid(Runnable $$0) {
      this($$0, true, ImmutableList.of());
   }

   cid(Runnable $$0, boolean $$1, List<cic> $$2) {
      this.d = $$0;
      this.e = $$1;
      $$2.forEach(this::a);
   }

   public cid.a a() {
      return new cid.a(this.e, this.b.values().stream().map(cic::a).toList());
   }

   public Stream<cic> a(Predicate<je<cie>> $$0, cib.b $$1) {
      return this.c.entrySet().stream().filter($$1x -> $$0.test((je<cie>)$$1x.getKey())).flatMap($$0x -> ((Set)$$0x.getValue()).stream()).filter($$1.a());
   }

   public void a(iu $$0, je<cie> $$1) {
      if (this.a(new cic($$0, $$1, this.d))) {
         a.debug("Added POI of type {} @ {}", $$1.g(), $$0);
         this.d.run();
      }
   }

   private boolean a(cic $$0) {
      iu $$1 = $$0.g();
      je<cie> $$2 = $$0.h();
      short $$3 = jx.b($$1);
      cic $$4 = (cic)this.b.get($$3);
      if ($$4 != null) {
         if ($$2.equals($$4.h())) {
            return false;
         }

         af.b("POI data mismatch: already registered at " + $$1);
      }

      this.b.put($$3, $$0);
      this.c.computeIfAbsent($$2, $$0x -> Sets.newHashSet()).add($$0);
      return true;
   }

   public void a(iu $$0) {
      cic $$1 = (cic)this.b.remove(jx.b($$0));
      if ($$1 == null) {
         a.error("POI data mismatch: never registered at {}", $$0);
      } else {
         this.c.get($$1.h()).remove($$1);
         a.debug("Removed POI of type {} @ {}", LogUtils.defer($$1::h), LogUtils.defer($$1::g));
         this.d.run();
      }
   }

   @Deprecated
   @bat
   public int b(iu $$0) {
      return this.e($$0).map(cic::b).orElse(0);
   }

   public boolean c(iu $$0) {
      cic $$1 = (cic)this.b.get(jx.b($$0));
      if ($$1 == null) {
         throw (IllegalStateException)af.b(new IllegalStateException("POI never registered at " + $$0));
      } else {
         boolean $$2 = $$1.d();
         this.d.run();
         return $$2;
      }
   }

   public boolean a(iu $$0, Predicate<je<cie>> $$1) {
      return this.d($$0).filter($$1).isPresent();
   }

   public Optional<je<cie>> d(iu $$0) {
      return this.e($$0).map(cic::h);
   }

   private Optional<cic> e(iu $$0) {
      return Optional.ofNullable((cic)this.b.get(jx.b($$0)));
   }

   public void a(Consumer<BiConsumer<iu, je<cie>>> $$0) {
      if (!this.e) {
         Short2ObjectMap<cic> $$1 = new Short2ObjectOpenHashMap(this.b);
         this.c();
         $$0.accept(($$1x, $$2) -> {
            short $$3 = jx.b($$1x);
            cic $$4 = (cic)$$1.computeIfAbsent($$3, $$2x -> new cic($$1x, $$2, this.d));
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

   public static record a(boolean b, List<cic.a> c) {
      public static final Codec<cid.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.BOOL.lenientOptionalFieldOf("Valid", false).forGetter(cid.a::a), cic.a.a.listOf().fieldOf("Records").forGetter(cid.a::b))
               .apply($$0, cid.a::new)
      );

      public cid a(Runnable $$0) {
         return new cid($$0, this.b, this.c.stream().map($$1 -> $$1.a($$0)).toList());
      }

      public boolean a() {
         return this.b;
      }

      public List<cic.a> b() {
         return this.c;
      }
   }
}
