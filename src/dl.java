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

public record dl(de.d d, Optional<dcc> e, List<dl.e<?>> f, Object2BooleanMap<akk> g, Map<akk, dl.c> h, Optional<bu> i) implements bv {
   public static final int b = 100;
   public static final MapCodec<dl> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               de.d.d.optionalFieldOf("level", de.d.c).forGetter(dl::b),
               dcc.f.optionalFieldOf("gamemode").forGetter(dl::c),
               dl.e.a.listOf().optionalFieldOf("stats", List.of()).forGetter(dl::d),
               axo.d(akk.a).optionalFieldOf("recipes", Object2BooleanMaps.emptyMap()).forGetter(dl::e),
               Codec.unboundedMap(akk.a, dl.c.b).optionalFieldOf("advancements", Map.of()).forGetter(dl::f),
               bu.a.optionalFieldOf("looking_at").forGetter(dl::g)
            )
            .apply($$0, dl::new)
   );

   @Override
   public boolean a(bsg $$0, aqm $$1, @Nullable ewf $$2) {
      if (!($$0 instanceof aqn $$3)) {
         return false;
      } else if (!this.d.d($$3.cq)) {
         return false;
      } else if (this.e.isPresent() && this.e.get() != $$3.e.b()) {
         return false;
      } else {
         avs $$5 = $$3.H();

         for (dl.e<?> $$6 : this.f) {
            if (!$$6.a($$5)) {
               return false;
            }
         }

         avk $$7 = $$3.I();
         ObjectIterator var13 = this.g.object2BooleanEntrySet().iterator();

         while (var13.hasNext()) {
            Entry<akk> $$8 = (Entry<akk>)var13.next();
            if ($$7.b((akk)$$8.getKey()) != $$8.getBooleanValue()) {
               return false;
            }
         }

         if (!this.h.isEmpty()) {
            aks $$9 = $$3.Q();
            akx $$10 = $$3.cP().aF();

            for (java.util.Map.Entry<akk, dl.c> $$11 : this.h.entrySet()) {
               af $$12 = $$10.a($$11.getKey());
               if ($$12 == null || !$$11.getValue().test($$9.b($$12))) {
                  return false;
               }
            }
         }

         if (this.i.isPresent()) {
            ewf $$13 = $$3.by();
            ewf $$14 = $$3.g(1.0F);
            ewf $$15 = $$13.b($$14.c * 100.0, $$14.d * 100.0, $$14.e * 100.0);
            ewc $$16 = cne.a($$3.dQ(), $$3, $$13, $$15, new ewa($$13, $$15).g(1.0), $$0x -> !$$0x.N_(), 0.0F);
            if ($$16 == null || $$16.c() != ewd.a.c) {
               return false;
            }

            bsg $$17 = $$16.a();
            if (!this.i.get().a($$3, $$17) || !$$3.F($$17)) {
               return false;
            }
         }

         return true;
      }
   }

   @Override
   public MapCodec<dl> a() {
      return bw.c;
   }

   public de.d b() {
      return this.d;
   }

   public Optional<dcc> c() {
      return this.e;
   }

   public List<dl.e<?>> d() {
      return this.f;
   }

   public Object2BooleanMap<akk> e() {
      return this.g;
   }

   public Map<akk, dl.c> f() {
      return this.h;
   }

   public Optional<bu> g() {
      return this.i;
   }

   static record a(Object2BooleanMap<String> c) implements dl.c {
      public static final Codec<dl.a> a = axo.d(Codec.STRING).xmap(dl.a::new, dl.a::a);

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

   static record b(boolean c) implements dl.c {
      public static final Codec<dl.b> a = Codec.BOOL.xmap(dl.b::new, dl.b::a);

      public boolean a(ah $$0) {
         return $$0.a() == this.c;
      }

      public boolean a() {
         return this.c;
      }
   }

   interface c extends Predicate<ah> {
      Codec<dl.c> b = Codec.either(dl.b.a, dl.a.a).xmap(Either::unwrap, $$0 -> {
         if ($$0 instanceof dl.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof dl.a $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });
   }

   public static class d {
      private de.d a = de.d.c;
      private Optional<dcc> b = Optional.empty();
      private final Builder<dl.e<?>> c = ImmutableList.builder();
      private final Object2BooleanMap<akk> d = new Object2BooleanOpenHashMap();
      private final Map<akk, dl.c> e = Maps.newHashMap();
      private Optional<bu> f = Optional.empty();

      public static dl.d a() {
         return new dl.d();
      }

      public dl.d a(de.d $$0) {
         this.a = $$0;
         return this;
      }

      public <T> dl.d a(avq<T> $$0, jj.c<T> $$1, de.d $$2) {
         this.c.add(new dl.e<>($$0, $$1, $$2));
         return this;
      }

      public dl.d a(akk $$0, boolean $$1) {
         this.d.put($$0, $$1);
         return this;
      }

      public dl.d a(dcc $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public dl.d a(bu.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public dl.d b(akk $$0, boolean $$1) {
         this.e.put($$0, new dl.b($$1));
         return this;
      }

      public dl.d a(akk $$0, Map<String, Boolean> $$1) {
         this.e.put($$0, new dl.a(new Object2BooleanOpenHashMap($$1)));
         return this;
      }

      public dl b() {
         return new dl(this.a, this.b, this.c.build(), this.d, this.e, this.f);
      }
   }

   static record e<T>(avq<T> b, jj<T> c, de.d d, Supplier<avo<T>> e) {
      public static final Codec<dl.e<?>> a = lq.v.r().dispatch(dl.e::a, dl.e::a);

      public e(avq<T> $$0, jj<T> $$1, de.d $$2) {
         this($$0, $$1, $$2, Suppliers.memoize(() -> $$0.b($$1.a())));
      }

      private static <T> MapCodec<dl.e<T>> a(avq<T> $$0) {
         return RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group($$0.b().s().fieldOf("stat").forGetter(dl.e::b), de.d.d.optionalFieldOf("value", de.d.c).forGetter(dl.e::c))
                  .apply($$1, ($$1x, $$2) -> new dl.e<>($$0, $$1x, $$2))
         );
      }

      public boolean a(avs $$0) {
         return this.d.d($$0.a(this.e.get()));
      }

      public avq<T> a() {
         return this.b;
      }

      public jj<T> b() {
         return this.c;
      }

      public de.d c() {
         return this.d;
      }

      public Supplier<avo<T>> d() {
         return this.e;
      }
   }
}
