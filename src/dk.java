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

public record dk(de.d d, Optional<dbq> e, List<dk.e<?>> f, Object2BooleanMap<alb> g, Map<alb, dk.c> h, Optional<bu> i) implements bv {
   public static final int b = 100;
   public static final MapCodec<dk> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               de.d.d.optionalFieldOf("level", de.d.c).forGetter(dk::b),
               dbq.f.optionalFieldOf("gamemode").forGetter(dk::c),
               dk.e.a.listOf().optionalFieldOf("stats", List.of()).forGetter(dk::d),
               ayc.d(alb.a).optionalFieldOf("recipes", Object2BooleanMaps.emptyMap()).forGetter(dk::e),
               Codec.unboundedMap(alb.a, dk.c.b).optionalFieldOf("advancements", Map.of()).forGetter(dk::f),
               bu.a.optionalFieldOf("looking_at").forGetter(dk::g)
            )
            .apply($$0, dk::new)
   );

   @Override
   public boolean a(bsp $$0, arb $$1, @Nullable evm $$2) {
      if (!($$0 instanceof arc $$3)) {
         return false;
      } else if (!this.d.d($$3.co)) {
         return false;
      } else if (this.e.isPresent() && this.e.get() != $$3.e.b()) {
         return false;
      } else {
         awh $$5 = $$3.H();

         for (dk.e<?> $$6 : this.f) {
            if (!$$6.a($$5)) {
               return false;
            }
         }

         avz $$7 = $$3.I();
         ObjectIterator var13 = this.g.object2BooleanEntrySet().iterator();

         while (var13.hasNext()) {
            Entry<alb> $$8 = (Entry<alb>)var13.next();
            if ($$7.b((alb)$$8.getKey()) != $$8.getBooleanValue()) {
               return false;
            }
         }

         if (!this.h.isEmpty()) {
            alj $$9 = $$3.Q();
            alo $$10 = $$3.cO().aE();

            for (java.util.Map.Entry<alb, dk.c> $$11 : this.h.entrySet()) {
               af $$12 = $$10.a($$11.getKey());
               if ($$12 == null || !$$11.getValue().test($$9.b($$12))) {
                  return false;
               }
            }
         }

         if (this.i.isPresent()) {
            evm $$13 = $$3.bx();
            evm $$14 = $$3.f(1.0F);
            evm $$15 = $$13.b($$14.c * 100.0, $$14.d * 100.0, $$14.e * 100.0);
            evj $$16 = cnm.a($$3.dP(), $$3, $$13, $$15, new evh($$13, $$15).g(1.0), $$0x -> !$$0x.N_(), 0.0F);
            if ($$16 == null || $$16.c() != evk.a.c) {
               return false;
            }

            bsp $$17 = $$16.a();
            if (!this.i.get().a($$3, $$17) || !$$3.E($$17)) {
               return false;
            }
         }

         return true;
      }
   }

   @Override
   public MapCodec<dk> a() {
      return bw.c;
   }

   public de.d b() {
      return this.d;
   }

   public Optional<dbq> c() {
      return this.e;
   }

   public List<dk.e<?>> d() {
      return this.f;
   }

   public Object2BooleanMap<alb> e() {
      return this.g;
   }

   public Map<alb, dk.c> f() {
      return this.h;
   }

   public Optional<bu> g() {
      return this.i;
   }

   static record a(Object2BooleanMap<String> c) implements dk.c {
      public static final Codec<dk.a> a = ayc.d(Codec.STRING).xmap(dk.a::new, dk.a::a);

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

   static record b(boolean c) implements dk.c {
      public static final Codec<dk.b> a = Codec.BOOL.xmap(dk.b::new, dk.b::a);

      public boolean a(ah $$0) {
         return $$0.a() == this.c;
      }

      public boolean a() {
         return this.c;
      }
   }

   interface c extends Predicate<ah> {
      Codec<dk.c> b = Codec.either(dk.b.a, dk.a.a).xmap(Either::unwrap, $$0 -> {
         if ($$0 instanceof dk.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof dk.a $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });
   }

   public static class d {
      private de.d a = de.d.c;
      private Optional<dbq> b = Optional.empty();
      private final Builder<dk.e<?>> c = ImmutableList.builder();
      private final Object2BooleanMap<alb> d = new Object2BooleanOpenHashMap();
      private final Map<alb, dk.c> e = Maps.newHashMap();
      private Optional<bu> f = Optional.empty();

      public static dk.d a() {
         return new dk.d();
      }

      public dk.d a(de.d $$0) {
         this.a = $$0;
         return this;
      }

      public <T> dk.d a(awf<T> $$0, ji.c<T> $$1, de.d $$2) {
         this.c.add(new dk.e<>($$0, $$1, $$2));
         return this;
      }

      public dk.d a(alb $$0, boolean $$1) {
         this.d.put($$0, $$1);
         return this;
      }

      public dk.d a(dbq $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public dk.d a(bu.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public dk.d b(alb $$0, boolean $$1) {
         this.e.put($$0, new dk.b($$1));
         return this;
      }

      public dk.d a(alb $$0, Map<String, Boolean> $$1) {
         this.e.put($$0, new dk.a(new Object2BooleanOpenHashMap($$1)));
         return this;
      }

      public dk b() {
         return new dk(this.a, this.b, this.c.build(), this.d, this.e, this.f);
      }
   }

   static record e<T>(awf<T> b, ji<T> c, de.d d, Supplier<awd<T>> e) {
      public static final Codec<dk.e<?>> a = lp.x.q().dispatch(dk.e::a, dk.e::a);

      public e(awf<T> $$0, ji<T> $$1, de.d $$2) {
         this($$0, $$1, $$2, Suppliers.memoize(() -> $$0.b($$1.a())));
      }

      private static <T> MapCodec<dk.e<T>> a(awf<T> $$0) {
         return RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group($$0.b().r().fieldOf("stat").forGetter(dk.e::b), de.d.d.optionalFieldOf("value", de.d.c).forGetter(dk.e::c))
                  .apply($$1, ($$1x, $$2) -> new dk.e<>($$0, $$1x, $$2))
         );
      }

      public boolean a(awh $$0) {
         return this.d.d($$0.a(this.e.get()));
      }

      public awf<T> a() {
         return this.b;
      }

      public ji<T> b() {
         return this.c;
      }

      public de.d c() {
         return this.d;
      }

      public Supplier<awd<T>> d() {
         return this.e;
      }
   }
}
