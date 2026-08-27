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

public record cq(ck.d d, Optional<ctu> e, List<cq.e<?>> f, Object2BooleanMap<ahh> g, Map<ahh, cq.c> h, Optional<bp> i) implements bq {
   public static final int b = 100;
   public static final MapCodec<cq> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               atx.a(ck.d.d, "level", ck.d.c).forGetter(cq::b),
               ctu.f.optionalFieldOf("gamemode").forGetter(cq::c),
               atx.a(cq.e.a.listOf(), "stats", List.of()).forGetter(cq::d),
               atx.a(atx.d(ahh.a), "recipes", Object2BooleanMaps.emptyMap()).forGetter(cq::e),
               atx.a(Codec.unboundedMap(ahh.a, cq.c.b), "advancements", Map.of()).forGetter(cq::f),
               atx.a(bp.a, "looking_at").forGetter(cq::g)
            )
            .apply($$0, cq::new)
   );

   @Override
   public boolean a(blw $$0, ane $$1, @Nullable emc $$2) {
      if (!($$0 instanceof anf $$3)) {
         return false;
      } else if (!this.d.d($$3.cj)) {
         return false;
      } else if (this.e.isPresent() && this.e.get() != $$3.e.b()) {
         return false;
      } else {
         ase $$5 = $$3.H();

         for (cq.e<?> $$6 : this.f) {
            if (!$$6.a($$5)) {
               return false;
            }
         }

         arw $$7 = $$3.I();
         ObjectIterator var13 = this.g.object2BooleanEntrySet().iterator();

         while (var13.hasNext()) {
            Entry<ahh> $$8 = (Entry<ahh>)var13.next();
            if ($$7.b((ahh)$$8.getKey()) != $$8.getBooleanValue()) {
               return false;
            }
         }

         if (!this.h.isEmpty()) {
            ahp $$9 = $$3.Q();
            aht $$10 = $$3.cL().aB();

            for (java.util.Map.Entry<ahh, cq.c> $$11 : this.h.entrySet()) {
               af $$12 = $$10.a($$11.getKey());
               if ($$12 == null || !$$11.getValue().test($$9.b($$12))) {
                  return false;
               }
            }
         }

         if (this.i.isPresent()) {
            emc $$13 = $$3.br();
            emc $$14 = $$3.f(1.0F);
            emc $$15 = $$13.b($$14.c * 100.0, $$14.d * 100.0, $$14.e * 100.0);
            elz $$16 = cgj.a($$3.dL(), $$3, $$13, $$15, new elx($$13, $$15).g(1.0), $$0x -> !$$0x.P_(), 0.0F);
            if ($$16 == null || $$16.c() != ema.a.c) {
               return false;
            }

            blw $$17 = $$16.a();
            if (!this.i.get().a($$3, $$17) || !$$3.D($$17)) {
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

   public Optional<ctu> c() {
      return this.e;
   }

   public List<cq.e<?>> d() {
      return this.f;
   }

   public Object2BooleanMap<ahh> e() {
      return this.g;
   }

   public Map<ahh, cq.c> f() {
      return this.h;
   }

   public Optional<bp> g() {
      return this.i;
   }

   static record a(Object2BooleanMap<String> c) implements cq.c {
      public static final Codec<cq.a> a = atx.d(Codec.STRING).xmap(cq.a::new, cq.a::a);

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
      private Optional<ctu> b = Optional.empty();
      private final Builder<cq.e<?>> c = ImmutableList.builder();
      private final Object2BooleanMap<ahh> d = new Object2BooleanOpenHashMap();
      private final Map<ahh, cq.c> e = Maps.newHashMap();
      private Optional<bp> f = Optional.empty();

      public static cq.d a() {
         return new cq.d();
      }

      public cq.d a(ck.d $$0) {
         this.a = $$0;
         return this;
      }

      public <T> cq.d a(asc<T> $$0, ih.c<T> $$1, ck.d $$2) {
         this.c.add(new cq.e<>($$0, $$1, $$2));
         return this;
      }

      public cq.d a(ahh $$0, boolean $$1) {
         this.d.put($$0, $$1);
         return this;
      }

      public cq.d a(ctu $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public cq.d a(bp.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public cq.d b(ahh $$0, boolean $$1) {
         this.e.put($$0, new cq.b($$1));
         return this;
      }

      public cq.d a(ahh $$0, Map<String, Boolean> $$1) {
         this.e.put($$0, new cq.a(new Object2BooleanOpenHashMap($$1)));
         return this;
      }

      public cq b() {
         return new cq(this.a, this.b, this.c.build(), this.d, this.e, this.f);
      }
   }

   static record e<T>(asc<T> b, ih<T> c, ck.d d, Supplier<asa<T>> e) {
      public static final Codec<cq.e<?>> a = kd.x.q().dispatch(cq.e::a, cq.e::a);

      public e(asc<T> $$0, ih<T> $$1, ck.d $$2) {
         this($$0, $$1, $$2, Suppliers.memoize(() -> $$0.b($$1.a())));
      }

      private static <T> Codec<cq.e<T>> a(asc<T> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.a().r().fieldOf("stat").forGetter(cq.e::b), atx.a(ck.d.d, "value", ck.d.c).forGetter(cq.e::c))
                  .apply($$1, ($$1x, $$2) -> new cq.e<>($$0, $$1x, $$2))
         );
      }

      public boolean a(ase $$0) {
         return this.d.d($$0.a(this.e.get()));
      }

      public asc<T> a() {
         return this.b;
      }

      public ih<T> b() {
         return this.c;
      }

      public ck.d c() {
         return this.d;
      }

      public Supplier<asa<T>> d() {
         return this.e;
      }
   }
}
