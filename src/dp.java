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

public record dp(dh.d d, ce e, List<dp.e<?>> f, Object2BooleanMap<akr> g, Map<akr, dp.c> h, Optional<bv> i) implements bw {
   public static final int b = 100;
   public static final MapCodec<dp> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dh.d.d.optionalFieldOf("level", dh.d.c).forGetter(dp::b),
               ce.c.optionalFieldOf("gamemode", ce.a).forGetter(dp::c),
               dp.e.a.listOf().optionalFieldOf("stats", List.of()).forGetter(dp::d),
               axw.d(akr.a).optionalFieldOf("recipes", Object2BooleanMaps.emptyMap()).forGetter(dp::e),
               Codec.unboundedMap(akr.a, dp.c.b).optionalFieldOf("advancements", Map.of()).forGetter(dp::f),
               bv.a.optionalFieldOf("looking_at").forGetter(dp::g)
            )
            .apply($$0, dp::new)
   );

   @Override
   public boolean a(bsr $$0, aqu $$1, @Nullable exc $$2) {
      if (!($$0 instanceof aqv $$3)) {
         return false;
      } else if (!this.d.d($$3.cq)) {
         return false;
      } else if (!this.e.a($$3.e.b())) {
         return false;
      } else {
         awa $$5 = $$3.I();

         for (dp.e<?> $$6 : this.f) {
            if (!$$6.a($$5)) {
               return false;
            }
         }

         avs $$7 = $$3.J();
         ObjectIterator var13 = this.g.object2BooleanEntrySet().iterator();

         while (var13.hasNext()) {
            Entry<akr> $$8 = (Entry<akr>)var13.next();
            if ($$7.b((akr)$$8.getKey()) != $$8.getBooleanValue()) {
               return false;
            }
         }

         if (!this.h.isEmpty()) {
            akz $$9 = $$3.R();
            ale $$10 = $$3.cO().aE();

            for (java.util.Map.Entry<akr, dp.c> $$11 : this.h.entrySet()) {
               ag $$12 = $$10.a($$11.getKey());
               if ($$12 == null || !$$11.getValue().test($$9.b($$12))) {
                  return false;
               }
            }
         }

         if (this.i.isPresent()) {
            exc $$13 = $$3.by();
            exc $$14 = $$3.g(1.0F);
            exc $$15 = $$13.b($$14.c * 100.0, $$14.d * 100.0, $$14.e * 100.0);
            ewz $$16 = cnr.a($$3.dO(), $$3, $$13, $$15, new ewx($$13, $$15).g(1.0), $$0x -> !$$0x.R_(), 0.0F);
            if ($$16 == null || $$16.c() != exa.a.c) {
               return false;
            }

            bsr $$17 = $$16.a();
            if (!this.i.get().a($$3, $$17) || !$$3.F($$17)) {
               return false;
            }
         }

         return true;
      }
   }

   @Override
   public MapCodec<dp> a() {
      return bx.c;
   }

   public dh.d b() {
      return this.d;
   }

   public ce c() {
      return this.e;
   }

   public List<dp.e<?>> d() {
      return this.f;
   }

   public Object2BooleanMap<akr> e() {
      return this.g;
   }

   public Map<akr, dp.c> f() {
      return this.h;
   }

   public Optional<bv> g() {
      return this.i;
   }

   static record a(Object2BooleanMap<String> c) implements dp.c {
      public static final Codec<dp.a> a = axw.d(Codec.STRING).xmap(dp.a::new, dp.a::a);

      public boolean a(ai $$0) {
         ObjectIterator var2 = this.c.object2BooleanEntrySet().iterator();

         while (var2.hasNext()) {
            Entry<String> $$1 = (Entry<String>)var2.next();
            ap $$2 = $$0.c((String)$$1.getKey());
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

   static record b(boolean c) implements dp.c {
      public static final Codec<dp.b> a = Codec.BOOL.xmap(dp.b::new, dp.b::a);

      public boolean a(ai $$0) {
         return $$0.a() == this.c;
      }

      public boolean a() {
         return this.c;
      }
   }

   interface c extends Predicate<ai> {
      Codec<dp.c> b = Codec.either(dp.b.a, dp.a.a).xmap(Either::unwrap, $$0 -> {
         if ($$0 instanceof dp.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof dp.a $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });
   }

   public static class d {
      private dh.d a = dh.d.c;
      private ce b = ce.a;
      private final Builder<dp.e<?>> c = ImmutableList.builder();
      private final Object2BooleanMap<akr> d = new Object2BooleanOpenHashMap();
      private final Map<akr, dp.c> e = Maps.newHashMap();
      private Optional<bv> f = Optional.empty();

      public static dp.d a() {
         return new dp.d();
      }

      public dp.d a(dh.d $$0) {
         this.a = $$0;
         return this;
      }

      public <T> dp.d a(avy<T> $$0, jm.c<T> $$1, dh.d $$2) {
         this.c.add(new dp.e<>($$0, $$1, $$2));
         return this;
      }

      public dp.d a(akr $$0, boolean $$1) {
         this.d.put($$0, $$1);
         return this;
      }

      public dp.d a(ce $$0) {
         this.b = $$0;
         return this;
      }

      public dp.d a(bv.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public dp.d b(akr $$0, boolean $$1) {
         this.e.put($$0, new dp.b($$1));
         return this;
      }

      public dp.d a(akr $$0, Map<String, Boolean> $$1) {
         this.e.put($$0, new dp.a(new Object2BooleanOpenHashMap($$1)));
         return this;
      }

      public dp b() {
         return new dp(this.a, this.b, this.c.build(), this.d, this.e, this.f);
      }
   }

   static record e<T>(avy<T> b, jm<T> c, dh.d d, Supplier<avw<T>> e) {
      public static final Codec<dp.e<?>> a = lt.v.r().dispatch(dp.e::a, dp.e::a);

      public e(avy<T> $$0, jm<T> $$1, dh.d $$2) {
         this($$0, $$1, $$2, Suppliers.memoize(() -> $$0.b($$1.a())));
      }

      private static <T> MapCodec<dp.e<T>> a(avy<T> $$0) {
         return RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group($$0.b().s().fieldOf("stat").forGetter(dp.e::b), dh.d.d.optionalFieldOf("value", dh.d.c).forGetter(dp.e::c))
                  .apply($$1, ($$1x, $$2) -> new dp.e<>($$0, $$1x, $$2))
         );
      }

      public boolean a(awa $$0) {
         return this.d.d($$0.a(this.e.get()));
      }

      public avy<T> a() {
         return this.b;
      }

      public jm<T> b() {
         return this.c;
      }

      public dh.d c() {
         return this.d;
      }

      public Supplier<avw<T>> d() {
         return this.e;
      }
   }
}
