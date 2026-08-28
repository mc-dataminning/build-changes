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

public record dr(dj.d d, cf e, List<dr.e<?>> f, Object2BooleanMap<alj> g, Map<alj, dr.c> h, Optional<bw> i, Optional<ch> j) implements bx {
   public static final int b = 100;
   public static final MapCodec<dr> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dj.d.d.optionalFieldOf("level", dj.d.c).forGetter(dr::b),
               cf.c.optionalFieldOf("gamemode", cf.a).forGetter(dr::c),
               dr.e.a.listOf().optionalFieldOf("stats", List.of()).forGetter(dr::d),
               ayv.e(alj.a).optionalFieldOf("recipes", Object2BooleanMaps.emptyMap()).forGetter(dr::e),
               Codec.unboundedMap(alj.a, dr.c.b).optionalFieldOf("advancements", Map.of()).forGetter(dr::f),
               bw.a.optionalFieldOf("looking_at").forGetter(dr::g),
               ch.a.optionalFieldOf("input").forGetter(dr::h)
            )
            .apply($$0, dr::new)
   );

   @Override
   public boolean a(bul $$0, arp $$1, @Nullable ezy $$2) {
      if (!($$0 instanceof arq $$3)) {
         return false;
      } else if (!this.d.d($$3.cp)) {
         return false;
      } else if (!this.e.a($$3.h.b())) {
         return false;
      } else {
         awy $$5 = $$3.I();

         for (dr.e<?> $$6 : this.f) {
            if (!$$6.a($$5)) {
               return false;
            }
         }

         awq $$7 = $$3.J();
         ObjectIterator var13 = this.g.object2BooleanEntrySet().iterator();

         while (var13.hasNext()) {
            Entry<alj> $$8 = (Entry<alj>)var13.next();
            if ($$7.b((alj)$$8.getKey()) != $$8.getBooleanValue()) {
               return false;
            }
         }

         if (!this.h.isEmpty()) {
            alr $$9 = $$3.S();
            alw $$10 = $$3.cV().aD();

            for (java.util.Map.Entry<alj, dr.c> $$11 : this.h.entrySet()) {
               ah $$12 = $$10.a($$11.getKey());
               if ($$12 == null || !$$11.getValue().test($$9.b($$12))) {
                  return false;
               }
            }
         }

         if (this.i.isPresent()) {
            ezy $$13 = $$3.bF();
            ezy $$14 = $$3.g(1.0F);
            ezy $$15 = $$13.b($$14.d * 100.0, $$14.e * 100.0, $$14.f * 100.0);
            ezv $$16 = cpp.a($$3.dV(), $$3, $$13, $$15, new ezt($$13, $$15).g(1.0), $$0x -> !$$0x.Y_(), 0.0F);
            if ($$16 == null || $$16.d() != ezw.a.c) {
               return false;
            }

            bul $$17 = $$16.a();
            if (!this.i.get().a($$3, $$17) || !$$3.E($$17)) {
               return false;
            }
         }

         return !this.j.isPresent() || this.j.get().a($$3.ai());
      }
   }

   @Override
   public MapCodec<dr> a() {
      return by.c;
   }

   public dj.d b() {
      return this.d;
   }

   public cf c() {
      return this.e;
   }

   public List<dr.e<?>> d() {
      return this.f;
   }

   public Object2BooleanMap<alj> e() {
      return this.g;
   }

   public Map<alj, dr.c> f() {
      return this.h;
   }

   public Optional<bw> g() {
      return this.i;
   }

   public Optional<ch> h() {
      return this.j;
   }

   static record a(Object2BooleanMap<String> c) implements dr.c {
      public static final Codec<dr.a> a = ayv.e(Codec.STRING).xmap(dr.a::new, dr.a::a);

      public boolean a(aj $$0) {
         ObjectIterator var2 = this.c.object2BooleanEntrySet().iterator();

         while (var2.hasNext()) {
            Entry<String> $$1 = (Entry<String>)var2.next();
            aq $$2 = $$0.c((String)$$1.getKey());
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

   static record b(boolean c) implements dr.c {
      public static final Codec<dr.b> a = Codec.BOOL.xmap(dr.b::new, dr.b::a);

      public boolean a(aj $$0) {
         return $$0.a() == this.c;
      }

      public boolean a() {
         return this.c;
      }
   }

   interface c extends Predicate<aj> {
      Codec<dr.c> b = Codec.either(dr.b.a, dr.a.a).xmap(Either::unwrap, $$0 -> {
         if ($$0 instanceof dr.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof dr.a $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });
   }

   public static class d {
      private dj.d a = dj.d.c;
      private cf b = cf.a;
      private final Builder<dr.e<?>> c = ImmutableList.builder();
      private final Object2BooleanMap<alj> d = new Object2BooleanOpenHashMap();
      private final Map<alj, dr.c> e = Maps.newHashMap();
      private Optional<bw> f = Optional.empty();
      private Optional<ch> g = Optional.empty();

      public static dr.d a() {
         return new dr.d();
      }

      public dr.d a(dj.d $$0) {
         this.a = $$0;
         return this;
      }

      public <T> dr.d a(aww<T> $$0, jq.c<T> $$1, dj.d $$2) {
         this.c.add(new dr.e<>($$0, $$1, $$2));
         return this;
      }

      public dr.d a(alj $$0, boolean $$1) {
         this.d.put($$0, $$1);
         return this;
      }

      public dr.d a(cf $$0) {
         this.b = $$0;
         return this;
      }

      public dr.d a(bw.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public dr.d b(alj $$0, boolean $$1) {
         this.e.put($$0, new dr.b($$1));
         return this;
      }

      public dr.d a(alj $$0, Map<String, Boolean> $$1) {
         this.e.put($$0, new dr.a(new Object2BooleanOpenHashMap($$1)));
         return this;
      }

      public dr.d a(ch $$0) {
         this.g = Optional.of($$0);
         return this;
      }

      public dr b() {
         return new dr(this.a, this.b, this.c.build(), this.d, this.e, this.f, this.g);
      }
   }

   static record e<T>(aww<T> b, jq<T> c, dj.d d, Supplier<awu<T>> e) {
      public static final Codec<dr.e<?>> a = lz.v.q().dispatch(dr.e::a, dr.e::a);

      public e(aww<T> $$0, jq<T> $$1, dj.d $$2) {
         this($$0, $$1, $$2, Suppliers.memoize(() -> $$0.b($$1.a())));
      }

      private static <T> MapCodec<dr.e<T>> a(aww<T> $$0) {
         return RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group($$0.b().r().fieldOf("stat").forGetter(dr.e::b), dj.d.d.optionalFieldOf("value", dj.d.c).forGetter(dr.e::c))
                  .apply($$1, ($$1x, $$2) -> new dr.e<>($$0, $$1x, $$2))
         );
      }

      public boolean a(awy $$0) {
         return this.d.d($$0.a(this.e.get()));
      }

      public aww<T> a() {
         return this.b;
      }

      public jq<T> b() {
         return this.c;
      }

      public dj.d c() {
         return this.d;
      }

      public Supplier<awu<T>> d() {
         return this.e;
      }
   }
}
