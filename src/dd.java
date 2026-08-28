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

public record dd(cw.d d, ch e, List<dd.e<?>> f, Object2BooleanMap<alf<dee<?>>> g, Map<alg, dd.c> h, Optional<by> i, Optional<cj> j) implements bz {
   public static final int b = 100;
   public static final MapCodec<dd> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               cw.d.d.optionalFieldOf("level", cw.d.c).forGetter(dd::b),
               ch.c.optionalFieldOf("gamemode", ch.a).forGetter(dd::c),
               dd.e.a.listOf().optionalFieldOf("stats", List.of()).forGetter(dd::d),
               ayu.f(dee.b).optionalFieldOf("recipes", Object2BooleanMaps.emptyMap()).forGetter(dd::e),
               Codec.unboundedMap(alg.a, dd.c.b).optionalFieldOf("advancements", Map.of()).forGetter(dd::f),
               by.a.optionalFieldOf("looking_at").forGetter(dd::g),
               cj.a.optionalFieldOf("input").forGetter(dd::h)
            )
            .apply($$0, dd::new)
   );

   @Override
   public boolean a(bwi $$0, arq $$1, @Nullable ffc $$2) {
      if (!($$0 instanceof arr $$3)) {
         return false;
      } else if (!this.d.d($$3.cf)) {
         return false;
      } else if (!this.e.a($$3.h.b())) {
         return false;
      } else {
         awy $$5 = $$3.I();

         for (dd.e<?> $$6 : this.f) {
            if (!$$6.a($$5)) {
               return false;
            }
         }

         aws $$7 = $$3.J();
         ObjectIterator var13 = this.g.object2BooleanEntrySet().iterator();

         while (var13.hasNext()) {
            Entry<alf<dee<?>>> $$8 = (Entry<alf<dee<?>>>)var13.next();
            if ($$7.b((alf<dee<?>>)$$8.getKey()) != $$8.getBooleanValue()) {
               return false;
            }
         }

         if (!this.h.isEmpty()) {
            alo $$9 = $$3.S();
            alt $$10 = $$3.cU().aD();

            for (java.util.Map.Entry<alg, dd.c> $$11 : this.h.entrySet()) {
               aj $$12 = $$10.a($$11.getKey());
               if ($$12 == null || !$$11.getValue().test($$9.b($$12))) {
                  return false;
               }
            }
         }

         if (this.i.isPresent()) {
            ffc $$13 = $$3.bC();
            ffc $$14 = $$3.h(1.0F);
            ffc $$15 = $$13.b($$14.d * 100.0, $$14.e * 100.0, $$14.f * 100.0);
            fez $$16 = csj.a($$3.dU(), $$3, $$13, $$15, new fex($$13, $$15).g(1.0), $$0x -> !$$0x.V_(), 0.0F);
            if ($$16 == null || $$16.d() != ffa.a.c) {
               return false;
            }

            bwi $$17 = $$16.a();
            if (!this.i.get().a($$3, $$17) || !$$3.E($$17)) {
               return false;
            }
         }

         return !this.j.isPresent() || this.j.get().a($$3.af());
      }
   }

   @Override
   public MapCodec<dd> a() {
      return ca.c;
   }

   public cw.d b() {
      return this.d;
   }

   public ch c() {
      return this.e;
   }

   public List<dd.e<?>> d() {
      return this.f;
   }

   public Object2BooleanMap<alf<dee<?>>> e() {
      return this.g;
   }

   public Map<alg, dd.c> f() {
      return this.h;
   }

   public Optional<by> g() {
      return this.i;
   }

   public Optional<cj> h() {
      return this.j;
   }

   static record a(Object2BooleanMap<String> c) implements dd.c {
      public static final Codec<dd.a> a = ayu.f(Codec.STRING).xmap(dd.a::new, dd.a::a);

      public boolean a(al $$0) {
         ObjectIterator var2 = this.c.object2BooleanEntrySet().iterator();

         while (var2.hasNext()) {
            Entry<String> $$1 = (Entry<String>)var2.next();
            as $$2 = $$0.c((String)$$1.getKey());
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

   static record b(boolean c) implements dd.c {
      public static final Codec<dd.b> a = Codec.BOOL.xmap(dd.b::new, dd.b::a);

      public boolean a(al $$0) {
         return $$0.a() == this.c;
      }

      public boolean a() {
         return this.c;
      }
   }

   interface c extends Predicate<al> {
      Codec<dd.c> b = Codec.either(dd.b.a, dd.a.a).xmap(Either::unwrap, $$0 -> {
         if ($$0 instanceof dd.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof dd.a $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });
   }

   public static class d {
      private cw.d a = cw.d.c;
      private ch b = ch.a;
      private final Builder<dd.e<?>> c = ImmutableList.builder();
      private final Object2BooleanMap<alf<dee<?>>> d = new Object2BooleanOpenHashMap();
      private final Map<alg, dd.c> e = Maps.newHashMap();
      private Optional<by> f = Optional.empty();
      private Optional<cj> g = Optional.empty();

      public static dd.d a() {
         return new dd.d();
      }

      public dd.d a(cw.d $$0) {
         this.a = $$0;
         return this;
      }

      public <T> dd.d a(aww<T> $$0, jf.c<T> $$1, cw.d $$2) {
         this.c.add(new dd.e<>($$0, $$1, $$2));
         return this;
      }

      public dd.d a(alf<dee<?>> $$0, boolean $$1) {
         this.d.put($$0, $$1);
         return this;
      }

      public dd.d a(ch $$0) {
         this.b = $$0;
         return this;
      }

      public dd.d a(by.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public dd.d a(alg $$0, boolean $$1) {
         this.e.put($$0, new dd.b($$1));
         return this;
      }

      public dd.d a(alg $$0, Map<String, Boolean> $$1) {
         this.e.put($$0, new dd.a(new Object2BooleanOpenHashMap($$1)));
         return this;
      }

      public dd.d a(cj $$0) {
         this.g = Optional.of($$0);
         return this;
      }

      public dd b() {
         return new dd(this.a, this.b, this.c.build(), this.d, this.e, this.f, this.g);
      }
   }

   static record e<T>(aww<T> b, jf<T> c, cw.d d, Supplier<awu<T>> e) {
      public static final Codec<dd.e<?>> a = mg.v.q().dispatch(dd.e::a, dd.e::a);

      public e(aww<T> $$0, jf<T> $$1, cw.d $$2) {
         this($$0, $$1, $$2, Suppliers.memoize(() -> $$0.b($$1.a())));
      }

      private static <T> MapCodec<dd.e<T>> a(aww<T> $$0) {
         return RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group($$0.b().r().fieldOf("stat").forGetter(dd.e::b), cw.d.d.optionalFieldOf("value", cw.d.c).forGetter(dd.e::c))
                  .apply($$1, ($$1x, $$2) -> new dd.e<>($$0, $$1x, $$2))
         );
      }

      public boolean a(awy $$0) {
         return this.d.d($$0.a(this.e.get()));
      }

      public aww<T> a() {
         return this.b;
      }

      public jf<T> b() {
         return this.c;
      }

      public cw.d c() {
         return this.d;
      }

      public Supplier<awu<T>> d() {
         return this.e;
      }
   }
}
