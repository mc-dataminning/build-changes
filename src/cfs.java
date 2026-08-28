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

public class cfs {
   private static final Logger a = LogUtils.getLogger();
   private final Short2ObjectMap<cfr> b = new Short2ObjectOpenHashMap();
   private final Map<jo<cft>, Set<cfr>> c = Maps.newHashMap();
   private final Runnable d;
   private boolean e;

   public cfs(Runnable $$0) {
      this($$0, true, ImmutableList.of());
   }

   cfs(Runnable $$0, boolean $$1, List<cfr> $$2) {
      this.d = $$0;
      this.e = $$1;
      $$2.forEach(this::a);
   }

   public cfs.a a() {
      return new cfs.a(this.e, this.b.values().stream().map(cfr::a).toList());
   }

   public Stream<cfr> a(Predicate<jo<cft>> $$0, cfq.b $$1) {
      return this.c.entrySet().stream().filter($$1x -> $$0.test((jo<cft>)$$1x.getKey())).flatMap($$0x -> ((Set)$$0x.getValue()).stream()).filter($$1.a());
   }

   public void a(jf $$0, jo<cft> $$1) {
      if (this.a(new cfr($$0, $$1, this.d))) {
         a.debug("Added POI of type {} @ {}", $$1.g(), $$0);
         this.d.run();
      }
   }

   private boolean a(cfr $$0) {
      jf $$1 = $$0.g();
      jo<cft> $$2 = $$0.h();
      short $$3 = kh.b($$1);
      cfr $$4 = (cfr)this.b.get($$3);
      if ($$4 != null) {
         if ($$2.equals($$4.h())) {
            return false;
         }

         ad.b("POI data mismatch: already registered at " + $$1);
      }

      this.b.put($$3, $$0);
      this.c.computeIfAbsent($$2, $$0x -> Sets.newHashSet()).add($$0);
      return true;
   }

   public void a(jf $$0) {
      cfr $$1 = (cfr)this.b.remove(kh.b($$0));
      if ($$1 == null) {
         a.error("POI data mismatch: never registered at {}", $$0);
      } else {
         this.c.get($$1.h()).remove($$1);
         a.debug("Removed POI of type {} @ {}", LogUtils.defer($$1::h), LogUtils.defer($$1::g));
         this.d.run();
      }
   }

   @Deprecated
   @bal
   public int b(jf $$0) {
      return this.e($$0).map(cfr::b).orElse(0);
   }

   public boolean c(jf $$0) {
      cfr $$1 = (cfr)this.b.get(kh.b($$0));
      if ($$1 == null) {
         throw (IllegalStateException)ad.b(new IllegalStateException("POI never registered at " + $$0));
      } else {
         boolean $$2 = $$1.d();
         this.d.run();
         return $$2;
      }
   }

   public boolean a(jf $$0, Predicate<jo<cft>> $$1) {
      return this.d($$0).filter($$1).isPresent();
   }

   public Optional<jo<cft>> d(jf $$0) {
      return this.e($$0).map(cfr::h);
   }

   private Optional<cfr> e(jf $$0) {
      return Optional.ofNullable((cfr)this.b.get(kh.b($$0)));
   }

   public void a(Consumer<BiConsumer<jf, jo<cft>>> $$0) {
      if (!this.e) {
         Short2ObjectMap<cfr> $$1 = new Short2ObjectOpenHashMap(this.b);
         this.c();
         $$0.accept(($$1x, $$2) -> {
            short $$3 = kh.b($$1x);
            cfr $$4 = (cfr)$$1.computeIfAbsent($$3, $$2x -> new cfr($$1x, $$2, this.d));
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

   public static record a(boolean b, List<cfr.a> c) {
      public static final Codec<cfs.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.BOOL.lenientOptionalFieldOf("Valid", false).forGetter(cfs.a::a), cfr.a.a.listOf().fieldOf("Records").forGetter(cfs.a::b))
               .apply($$0, cfs.a::new)
      );

      public cfs a(Runnable $$0) {
         return new cfs($$0, this.b, this.c.stream().map($$1 -> $$1.a($$0)).toList());
      }

      public boolean a() {
         return this.b;
      }

      public List<cfr.a> b() {
         return this.c;
      }
   }
}
