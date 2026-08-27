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

public record cr(cl.d d, Optional<cpn> e, List<cr.e<?>> f, Object2BooleanMap<aeu> g, Map<aeu, cr.c> h, Optional<bq> i) implements br {
   public static final int b = 100;
   public static final MapCodec<cr> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               arb.a(cl.d.d, "level", cl.d.c).forGetter(cr::b),
               cpn.f.optionalFieldOf("gamemode").forGetter(cr::c),
               arb.a(cr.e.a.listOf(), "stats", List.of()).forGetter(cr::d),
               arb.a(arb.d(aeu.a), "recipes", Object2BooleanMaps.emptyMap()).forGetter(cr::e),
               arb.a(Codec.unboundedMap(aeu.a, cr.c.b), "advancements", Map.of()).forGetter(cr::f),
               arb.a(bq.a, "looking_at").forGetter(cr::g)
            )
            .apply($$0, cr::new)
   );

   @Override
   public boolean a(bil $$0, akn $$1, @Nullable ehi $$2) {
      if (!($$0 instanceof ako $$3)) {
         return false;
      } else if (!this.d.d($$3.cd)) {
         return false;
      } else if (this.e.isPresent() && this.e.get() != $$3.e.b()) {
         return false;
      } else {
         apk $$5 = $$3.E();

         for (cr.e<?> $$6 : this.f) {
            if (!$$6.a($$5)) {
               return false;
            }
         }

         apc $$7 = $$3.F();
         ObjectIterator var13 = this.g.object2BooleanEntrySet().iterator();

         while (var13.hasNext()) {
            Entry<aeu> $$8 = (Entry<aeu>)var13.next();
            if ($$7.b((aeu)$$8.getKey()) != $$8.getBooleanValue()) {
               return false;
            }
         }

         if (!this.h.isEmpty()) {
            afc $$9 = $$3.N();
            afg $$10 = $$3.cK().az();

            for (java.util.Map.Entry<aeu, cr.c> $$11 : this.h.entrySet()) {
               af $$12 = $$10.a($$11.getKey());
               if ($$12 == null || !$$11.getValue().test($$9.b($$12))) {
                  return false;
               }
            }
         }

         if (this.i.isPresent()) {
            ehi $$13 = $$3.bp();
            ehi $$14 = $$3.f(1.0F);
            ehi $$15 = $$13.b($$14.c * 100.0, $$14.d * 100.0, $$14.e * 100.0);
            ehf $$16 = cci.a($$3.dK(), $$3, $$13, $$15, new ehd($$13, $$15).g(1.0), $$0x -> !$$0x.G_(), 0.0F);
            if ($$16 == null || $$16.c() != ehg.a.c) {
               return false;
            }

            bil $$17 = $$16.a();
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

   public Optional<cpn> c() {
      return this.e;
   }

   public List<cr.e<?>> d() {
      return this.f;
   }

   public Object2BooleanMap<aeu> e() {
      return this.g;
   }

   public Map<aeu, cr.c> f() {
      return this.h;
   }

   public Optional<bq> g() {
      return this.i;
   }

   static record a(Object2BooleanMap<String> c) implements cr.c {
      public static final Codec<cr.a> a = arb.d(Codec.STRING).xmap(cr.a::new, cr.a::a);

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
      private Optional<cpn> b = Optional.empty();
      private final Builder<cr.e<?>> c = ImmutableList.builder();
      private final Object2BooleanMap<aeu> d = new Object2BooleanOpenHashMap();
      private final Map<aeu, cr.c> e = Maps.newHashMap();
      private Optional<bq> f = Optional.empty();

      public static cr.d a() {
         return new cr.d();
      }

      public cr.d a(cl.d $$0) {
         this.a = $$0;
         return this;
      }

      public <T> cr.d a(api<T> $$0, hg.c<T> $$1, cl.d $$2) {
         this.c.add(new cr.e<>($$0, $$1, $$2));
         return this;
      }

      public cr.d a(aeu $$0, boolean $$1) {
         this.d.put($$0, $$1);
         return this;
      }

      public cr.d a(cpn $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public cr.d a(bq.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public cr.d b(aeu $$0, boolean $$1) {
         this.e.put($$0, new cr.b($$1));
         return this;
      }

      public cr.d a(aeu $$0, Map<String, Boolean> $$1) {
         this.e.put($$0, new cr.a(new Object2BooleanOpenHashMap($$1)));
         return this;
      }

      public cr b() {
         return new cr(this.a, this.b, this.c.build(), this.d, this.e, this.f);
      }
   }

   static record e<T>(api<T> b, hg<T> c, cl.d d, Supplier<apg<T>> e) {
      public static final Codec<cr.e<?>> a = jd.y.q().dispatch(cr.e::a, cr.e::a);

      public e(api<T> $$0, hg<T> $$1, cl.d $$2) {
         this($$0, $$1, $$2, Suppliers.memoize(() -> $$0.b($$1.a())));
      }

      private static <T> Codec<cr.e<T>> a(api<T> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.a().r().fieldOf("stat").forGetter(cr.e::b), arb.a(cl.d.d, "value", cl.d.c).forGetter(cr.e::c))
                  .apply($$1, ($$1x, $$2) -> new cr.e<>($$0, $$1x, $$2))
         );
      }

      public boolean a(apk $$0) {
         return this.d.d($$0.a(this.e.get()));
      }

      public api<T> a() {
         return this.b;
      }

      public hg<T> b() {
         return this.c;
      }

      public cl.d c() {
         return this.d;
      }

      public Supplier<apg<T>> d() {
         return this.e;
      }
   }
}
