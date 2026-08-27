import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMaps;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap.Entry;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public record cq(ck.d d, Optional<ctf> e, List<cq.e<?>> f, Object2BooleanMap<ahd> g, Map<ahd, cq.c> h, Optional<bp> i) implements bq {
   public static final int b = 100;
   public static final MapCodec<cq> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               atq.a(ck.d.d, "level", ck.d.c).forGetter(cq::b),
               ctf.f.optionalFieldOf("gamemode").forGetter(cq::c),
               atq.a(cq.e.a.listOf(), "stats", List.of()).forGetter(cq::d),
               atq.a(atq.d(ahd.a), "recipes", Object2BooleanMaps.emptyMap()).forGetter(cq::e),
               atq.a(Codec.unboundedMap(ahd.a, cq.c.b), "advancements", Map.of()).forGetter(cq::f),
               atq.a(bp.a, "looking_at").forGetter(cq::g)
            )
            .apply($$0, cq::new)
   );

   @Override
   public boolean a(blp $$0, amz $$1, @Nullable elm $$2) {
      if (!($$0 instanceof ana $$3)) {
         return false;
      } else if (!this.d.d($$3.cf)) {
         return false;
      } else if (this.e.isPresent() && this.e.get() != $$3.e.b()) {
         return false;
      } else {
         arx $$5 = $$3.H();

         for (cq.e<?> $$6 : this.f) {
            if (!$$6.a($$5)) {
               return false;
            }
         }

         arp $$7 = $$3.I();
         ObjectIterator var13 = this.g.object2BooleanEntrySet().iterator();

         while (var13.hasNext()) {
            Entry<ahd> $$8 = (Entry<ahd>)var13.next();
            if ($$7.b((ahd)$$8.getKey()) != $$8.getBooleanValue()) {
               return false;
            }
         }

         if (!this.h.isEmpty()) {
            ahl $$9 = $$3.Q();
            ahp $$10 = $$3.cL().aB();

            for (java.util.Map.Entry<ahd, cq.c> $$11 : this.h.entrySet()) {
               af $$12 = $$10.a($$11.getKey());
               if ($$12 == null || !$$11.getValue().test($$9.b($$12))) {
                  return false;
               }
            }
         }

         if (this.i.isPresent()) {
            elm $$13 = $$3.br();
            elm $$14 = $$3.f(1.0F);
            elm $$15 = $$13.b($$14.c * 100.0, $$14.d * 100.0, $$14.e * 100.0);
            elj $$16 = cfu.a($$3.dM(), $$3, $$13, $$15, new elh($$13, $$15).g(1.0), $$0x -> !$$0x.P_(), 0.0F);
            if ($$16 == null || $$16.c() != elk.a.c) {
               return false;
            }

            blp $$17 = $$16.a();
            if (!this.i.get().a($$3, $$17) || !$$3.E($$17)) {
               return false;
            }
         }

         return true;
      }
   }

   @Override
   public bq.a a() {
      return bq.b.d;
   }

   public ck.d b() {
      return this.d;
   }

   public Optional<ctf> c() {
      return this.e;
   }

   public List<cq.e<?>> d() {
      return this.f;
   }

   public Object2BooleanMap<ahd> e() {
      return this.g;
   }

   public Map<ahd, cq.c> f() {
      return this.h;
   }

   public Optional<bp> g() {
      return this.i;
   }

   static record a(Object2BooleanMap<String> c) implements cq.c {
      public static final Codec<cq.a> a = atq.d(Codec.STRING).xmap(cq.a::new, cq.a::a);

      public boolean a(ah $$0) {
         ObjectIterator var2 = this.c.object2BooleanEntrySet().iterator();

         while (var2.hasNext()) {
            Entry<String> $$1 = (Entry<String>)var2.next();
            ao $$2 = $$0.c((String)$$1.getKey());
            if ($$2 == null || $$2.a() != $$1.getBooleanValue()) {
               return false;
            }
         }

         return true;
      }

      public Object2BooleanMap<String> a() {
         return this.c;
      }
   }

   static record b(boolean c) implements cq.c {
      public static final Codec<cq.b> a = Codec.BOOL.xmap(cq.b::new, cq.b::a);

      public boolean a(ah $$0) {
         return $$0.a() == this.c;
      }

      public boolean a() {
         return this.c;
      }
   }

   interface c extends Predicate<ah> {
      Codec<cq.c> b = Codec.either(cq.b.a, cq.a.a).xmap($$0 -> (cq.c)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof cq.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof cq.a $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });
   }

   public static class d {
      private ck.d a = ck.d.c;
      private Optional<ctf> b = Optional.empty();
      private final Builder<cq.e<?>> c = ImmutableList.builder();
      private final Object2BooleanMap<ahd> d = new Object2BooleanOpenHashMap();
      private final Map<ahd, cq.c> e = Maps.newHashMap();
      private Optional<bp> f = Optional.empty();

      public static cq.d a() {
         return new cq.d();
      }

      public cq.d a(ck.d $$0) {
         this.a = $$0;
         return this;
      }

      public <T> cq.d a(arv<T> $$0, ih.c<T> $$1, ck.d $$2) {
         this.c.add(new cq.e<>($$0, $$1, $$2));
         return this;
      }

      public cq.d a(ahd $$0, boolean $$1) {
         this.d.put($$0, $$1);
         return this;
      }

      public cq.d a(ctf $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public cq.d a(bp.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public cq.d b(ahd $$0, boolean $$1) {
         this.e.put($$0, new cq.b($$1));
         return this;
      }

      public cq.d a(ahd $$0, Map<String, Boolean> $$1) {
         this.e.put($$0, new cq.a(new Object2BooleanOpenHashMap($$1)));
         return this;
      }

      public cq b() {
         return new cq(this.a, this.b, this.c.build(), this.d, this.e, this.f);
      }
   }

   static record e<T>(arv<T> b, ih<T> c, ck.d d, Supplier<art<T>> e) {
      public static final Codec<cq.e<?>> a = kd.x.q().dispatch(cq.e::a, cq.e::a);

      public e(arv<T> $$0, ih<T> $$1, ck.d $$2) {
         this($$0, $$1, $$2, Suppliers.memoize(() -> $$0.b($$1.a())));
      }

      private static <T> Codec<cq.e<T>> a(arv<T> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.a().r().fieldOf("stat").forGetter(cq.e::b), atq.a(ck.d.d, "value", ck.d.c).forGetter(cq.e::c))
                  .apply($$1, ($$1x, $$2) -> new cq.e<>($$0, $$1x, $$2))
         );
      }

      public boolean a(arx $$0) {
         return this.d.d($$0.a(this.e.get()));
      }

      public arv<T> a() {
         return this.b;
      }

      public ih<T> b() {
         return this.c;
      }

      public ck.d c() {
         return this.d;
      }

      public Supplier<art<T>> d() {
         return this.e;
      }
   }
}
