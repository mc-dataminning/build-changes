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

public record cr(cl.d d, Optional<crp> e, List<cr.e<?>> f, Object2BooleanMap<agg> g, Map<agg, cr.c> h, Optional<bq> i) implements br {
   public static final int b = 100;
   public static final MapCodec<cr> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               asq.a(cl.d.d, "level", cl.d.c).forGetter(cr::b),
               crp.f.optionalFieldOf("gamemode").forGetter(cr::c),
               asq.a(cr.e.a.listOf(), "stats", List.of()).forGetter(cr::d),
               asq.a(asq.d(agg.a), "recipes", Object2BooleanMaps.emptyMap()).forGetter(cr::e),
               asq.a(Codec.unboundedMap(agg.a, cr.c.b), "advancements", Map.of()).forGetter(cr::f),
               asq.a(bq.a, "looking_at").forGetter(cr::g)
            )
            .apply($$0, cr::new)
   );

   @Override
   public boolean a(bki $$0, ama $$1, @Nullable eji $$2) {
      if (!($$0 instanceof amb $$3)) {
         return false;
      } else if (!this.d.d($$3.cf)) {
         return false;
      } else if (this.e.isPresent() && this.e.get() != $$3.e.b()) {
         return false;
      } else {
         aqy $$5 = $$3.F();

         for (cr.e<?> $$6 : this.f) {
            if (!$$6.a($$5)) {
               return false;
            }
         }

         aqq $$7 = $$3.G();
         ObjectIterator var13 = this.g.object2BooleanEntrySet().iterator();

         while (var13.hasNext()) {
            Entry<agg> $$8 = (Entry<agg>)var13.next();
            if ($$7.b((agg)$$8.getKey()) != $$8.getBooleanValue()) {
               return false;
            }
         }

         if (!this.h.isEmpty()) {
            ago $$9 = $$3.O();
            ags $$10 = $$3.cK().az();

            for (java.util.Map.Entry<agg, cr.c> $$11 : this.h.entrySet()) {
               af $$12 = $$10.a($$11.getKey());
               if ($$12 == null || !$$11.getValue().test($$9.b($$12))) {
                  return false;
               }
            }
         }

         if (this.i.isPresent()) {
            eji $$13 = $$3.bp();
            eji $$14 = $$3.f(1.0F);
            eji $$15 = $$13.b($$14.c * 100.0, $$14.d * 100.0, $$14.e * 100.0);
            ejf $$16 = cef.a($$3.dL(), $$3, $$13, $$15, new ejd($$13, $$15).g(1.0), $$0x -> !$$0x.N_(), 0.0F);
            if ($$16 == null || $$16.c() != ejg.a.c) {
               return false;
            }

            bki $$17 = $$16.a();
            if (!this.i.get().a($$3, $$17) || !$$3.E($$17)) {
               return false;
            }
         }

         return true;
      }
   }

   @Override
   public br.a a() {
      return br.b.d;
   }

   public cl.d b() {
      return this.d;
   }

   public Optional<crp> c() {
      return this.e;
   }

   public List<cr.e<?>> d() {
      return this.f;
   }

   public Object2BooleanMap<agg> e() {
      return this.g;
   }

   public Map<agg, cr.c> f() {
      return this.h;
   }

   public Optional<bq> g() {
      return this.i;
   }

   static record a(Object2BooleanMap<String> c) implements cr.c {
      public static final Codec<cr.a> a = asq.d(Codec.STRING).xmap(cr.a::new, cr.a::a);

      public boolean a(ah $$0) {
         ObjectIterator var2 = this.c.object2BooleanEntrySet().iterator();

         while (var2.hasNext()) {
            Entry<String> $$1 = (Entry<String>)var2.next();
            an $$2 = $$0.c((String)$$1.getKey());
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

   static record b(boolean c) implements cr.c {
      public static final Codec<cr.b> a = Codec.BOOL.xmap(cr.b::new, cr.b::a);

      public boolean a(ah $$0) {
         return $$0.a() == this.c;
      }

      public boolean a() {
         return this.c;
      }
   }

   interface c extends Predicate<ah> {
      Codec<cr.c> b = Codec.either(cr.b.a, cr.a.a).xmap($$0 -> (cr.c)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof cr.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof cr.a $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });
   }

   public static class d {
      private cl.d a = cl.d.c;
      private Optional<crp> b = Optional.empty();
      private final Builder<cr.e<?>> c = ImmutableList.builder();
      private final Object2BooleanMap<agg> d = new Object2BooleanOpenHashMap();
      private final Map<agg, cr.c> e = Maps.newHashMap();
      private Optional<bq> f = Optional.empty();

      public static cr.d a() {
         return new cr.d();
      }

      public cr.d a(cl.d $$0) {
         this.a = $$0;
         return this;
      }

      public <T> cr.d a(aqw<T> $$0, ib.c<T> $$1, cl.d $$2) {
         this.c.add(new cr.e<>($$0, $$1, $$2));
         return this;
      }

      public cr.d a(agg $$0, boolean $$1) {
         this.d.put($$0, $$1);
         return this;
      }

      public cr.d a(crp $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public cr.d a(bq.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public cr.d b(agg $$0, boolean $$1) {
         this.e.put($$0, new cr.b($$1));
         return this;
      }

      public cr.d a(agg $$0, Map<String, Boolean> $$1) {
         this.e.put($$0, new cr.a(new Object2BooleanOpenHashMap($$1)));
         return this;
      }

      public cr b() {
         return new cr(this.a, this.b, this.c.build(), this.d, this.e, this.f);
      }
   }

   static record e<T>(aqw<T> b, ib<T> c, cl.d d, Supplier<aqu<T>> e) {
      public static final Codec<cr.e<?>> a = jy.y.q().dispatch(cr.e::a, cr.e::a);

      public e(aqw<T> $$0, ib<T> $$1, cl.d $$2) {
         this($$0, $$1, $$2, Suppliers.memoize(() -> $$0.b($$1.a())));
      }

      private static <T> Codec<cr.e<T>> a(aqw<T> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.a().r().fieldOf("stat").forGetter(cr.e::b), asq.a(cl.d.d, "value", cl.d.c).forGetter(cr.e::c))
                  .apply($$1, ($$1x, $$2) -> new cr.e<>($$0, $$1x, $$2))
         );
      }

      public boolean a(aqy $$0) {
         return this.d.d($$0.a(this.e.get()));
      }

      public aqw<T> a() {
         return this.b;
      }

      public ib<T> b() {
         return this.c;
      }

      public cl.d c() {
         return this.d;
      }

      public Supplier<aqu<T>> d() {
         return this.e;
      }
   }
}
