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

public record dc(cv.d d, cg e, List<dc.e<?>> f, Object2BooleanMap<alf<ddp<?>>> g, Map<alg, dc.c> h, Optional<bx> i, Optional<ci> j) implements by {
   public static final int b = 100;
   public static final MapCodec<dc> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               cv.d.d.optionalFieldOf("level", cv.d.c).forGetter(dc::b),
               cg.c.optionalFieldOf("gamemode", cg.a).forGetter(dc::c),
               dc.e.a.listOf().optionalFieldOf("stats", List.of()).forGetter(dc::d),
               ayu.f(alf.a(mg.bt)).optionalFieldOf("recipes", Object2BooleanMaps.emptyMap()).forGetter(dc::e),
               Codec.unboundedMap(alg.a, dc.c.b).optionalFieldOf("advancements", Map.of()).forGetter(dc::f),
               bx.a.optionalFieldOf("looking_at").forGetter(dc::g),
               ci.a.optionalFieldOf("input").forGetter(dc::h)
            )
            .apply($$0, dc::new)
   );

   @Override
   public boolean a(bwd $$0, arq $$1, @Nullable fei $$2) {
      if (!($$0 instanceof arr $$3)) {
         return false;
      } else if (!this.d.d($$3.ce)) {
         return false;
      } else if (!this.e.a($$3.h.b())) {
         return false;
      } else {
         awy $$5 = $$3.I();

         for (dc.e<?> $$6 : this.f) {
            if (!$$6.a($$5)) {
               return false;
            }
         }

         aws $$7 = $$3.J();
         ObjectIterator var13 = this.g.object2BooleanEntrySet().iterator();

         while (var13.hasNext()) {
            Entry<alf<ddp<?>>> $$8 = (Entry<alf<ddp<?>>>)var13.next();
            if ($$7.b((alf<ddp<?>>)$$8.getKey()) != $$8.getBooleanValue()) {
               return false;
            }
         }

         if (!this.h.isEmpty()) {
            alo $$9 = $$3.S();
            alt $$10 = $$3.cV().aD();

            for (java.util.Map.Entry<alg, dc.c> $$11 : this.h.entrySet()) {
               ai $$12 = $$10.a($$11.getKey());
               if ($$12 == null || !$$11.getValue().test($$9.b($$12))) {
                  return false;
               }
            }
         }

         if (this.i.isPresent()) {
            fei $$13 = $$3.bE();
            fei $$14 = $$3.h(1.0F);
            fei $$15 = $$13.b($$14.d * 100.0, $$14.e * 100.0, $$14.f * 100.0);
            fef $$16 = cru.a($$3.dV(), $$3, $$13, $$15, new fed($$13, $$15).g(1.0), $$0x -> !$$0x.U_(), 0.0F);
            if ($$16 == null || $$16.d() != feg.a.c) {
               return false;
            }

            bwd $$17 = $$16.a();
            if (!this.i.get().a($$3, $$17) || !$$3.E($$17)) {
               return false;
            }
         }

         return !this.j.isPresent() || this.j.get().a($$3.ai());
      }
   }

   @Override
   public MapCodec<dc> a() {
      return bz.c;
   }

   public cv.d b() {
      return this.d;
   }

   public cg c() {
      return this.e;
   }

   public List<dc.e<?>> d() {
      return this.f;
   }

   public Object2BooleanMap<alf<ddp<?>>> e() {
      return this.g;
   }

   public Map<alg, dc.c> f() {
      return this.h;
   }

   public Optional<bx> g() {
      return this.i;
   }

   public Optional<ci> h() {
      return this.j;
   }

   static record a(Object2BooleanMap<String> c) implements dc.c {
      public static final Codec<dc.a> a = ayu.f(Codec.STRING).xmap(dc.a::new, dc.a::a);

      public boolean a(ak $$0) {
         ObjectIterator var2 = this.c.object2BooleanEntrySet().iterator();

         while (var2.hasNext()) {
            Entry<String> $$1 = (Entry<String>)var2.next();
            ar $$2 = $$0.c((String)$$1.getKey());
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

   static record b(boolean c) implements dc.c {
      public static final Codec<dc.b> a = Codec.BOOL.xmap(dc.b::new, dc.b::a);

      public boolean a(ak $$0) {
         return $$0.a() == this.c;
      }

      public boolean a() {
         return this.c;
      }
   }

   interface c extends Predicate<ak> {
      Codec<dc.c> b = Codec.either(dc.b.a, dc.a.a).xmap(Either::unwrap, $$0 -> {
         if ($$0 instanceof dc.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof dc.a $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });
   }

   public static class d {
      private cv.d a = cv.d.c;
      private cg b = cg.a;
      private final Builder<dc.e<?>> c = ImmutableList.builder();
      private final Object2BooleanMap<alf<ddp<?>>> d = new Object2BooleanOpenHashMap();
      private final Map<alg, dc.c> e = Maps.newHashMap();
      private Optional<bx> f = Optional.empty();
      private Optional<ci> g = Optional.empty();

      public static dc.d a() {
         return new dc.d();
      }

      public dc.d a(cv.d $$0) {
         this.a = $$0;
         return this;
      }

      public <T> dc.d a(aww<T> $$0, je.c<T> $$1, cv.d $$2) {
         this.c.add(new dc.e<>($$0, $$1, $$2));
         return this;
      }

      public dc.d a(alf<ddp<?>> $$0, boolean $$1) {
         this.d.put($$0, $$1);
         return this;
      }

      public dc.d a(cg $$0) {
         this.b = $$0;
         return this;
      }

      public dc.d a(bx.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public dc.d a(alg $$0, boolean $$1) {
         this.e.put($$0, new dc.b($$1));
         return this;
      }

      public dc.d a(alg $$0, Map<String, Boolean> $$1) {
         this.e.put($$0, new dc.a(new Object2BooleanOpenHashMap($$1)));
         return this;
      }

      public dc.d a(ci $$0) {
         this.g = Optional.of($$0);
         return this;
      }

      public dc b() {
         return new dc(this.a, this.b, this.c.build(), this.d, this.e, this.f, this.g);
      }
   }

   static record e<T>(aww<T> b, je<T> c, cv.d d, Supplier<awu<T>> e) {
      public static final Codec<dc.e<?>> a = mf.v.q().dispatch(dc.e::a, dc.e::a);

      public e(aww<T> $$0, je<T> $$1, cv.d $$2) {
         this($$0, $$1, $$2, Suppliers.memoize(() -> $$0.b($$1.a())));
      }

      private static <T> MapCodec<dc.e<T>> a(aww<T> $$0) {
         return RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group($$0.b().r().fieldOf("stat").forGetter(dc.e::b), cv.d.d.optionalFieldOf("value", cv.d.c).forGetter(dc.e::c))
                  .apply($$1, ($$1x, $$2) -> new dc.e<>($$0, $$1x, $$2))
         );
      }

      public boolean a(awy $$0) {
         return this.d.d($$0.a(this.e.get()));
      }

      public aww<T> a() {
         return this.b;
      }

      public je<T> b() {
         return this.c;
      }

      public cv.d c() {
         return this.d;
      }

      public Supplier<awu<T>> d() {
         return this.e;
      }
   }
}
