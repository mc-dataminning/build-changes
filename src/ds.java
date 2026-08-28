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

public record ds(dk.d d, cg e, List<ds.e<?>> f, Object2BooleanMap<akt<dbc<?>>> g, Map<aku, ds.c> h, Optional<bx> i, Optional<ci> j) implements by {
   public static final int b = 100;
   public static final MapCodec<ds> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dk.d.d.optionalFieldOf("level", dk.d.c).forGetter(ds::b),
               cg.c.optionalFieldOf("gamemode", cg.a).forGetter(ds::c),
               ds.e.a.listOf().optionalFieldOf("stats", List.of()).forGetter(ds::d),
               ayh.f(akt.a(mc.bk)).optionalFieldOf("recipes", Object2BooleanMaps.emptyMap()).forGetter(ds::e),
               Codec.unboundedMap(aku.a, ds.c.b).optionalFieldOf("advancements", Map.of()).forGetter(ds::f),
               bx.a.optionalFieldOf("looking_at").forGetter(ds::g),
               ci.a.optionalFieldOf("input").forGetter(ds::h)
            )
            .apply($$0, ds::new)
   );

   @Override
   public boolean a(buj $$0, arc $$1, @Nullable fay $$2) {
      if (!($$0 instanceof ard $$3)) {
         return false;
      } else if (!this.d.d($$3.cr)) {
         return false;
      } else if (!this.e.a($$3.h.b())) {
         return false;
      } else {
         awk $$5 = $$3.I();

         for (ds.e<?> $$6 : this.f) {
            if (!$$6.a($$5)) {
               return false;
            }
         }

         awe $$7 = $$3.J();
         ObjectIterator var13 = this.g.object2BooleanEntrySet().iterator();

         while (var13.hasNext()) {
            Entry<akt<dbc<?>>> $$8 = (Entry<akt<dbc<?>>>)var13.next();
            if ($$7.b((akt<dbc<?>>)$$8.getKey()) != $$8.getBooleanValue()) {
               return false;
            }
         }

         if (!this.h.isEmpty()) {
            alc $$9 = $$3.S();
            alh $$10 = $$3.cV().aD();

            for (java.util.Map.Entry<aku, ds.c> $$11 : this.h.entrySet()) {
               ai $$12 = $$10.a($$11.getKey());
               if ($$12 == null || !$$11.getValue().test($$9.b($$12))) {
                  return false;
               }
            }
         }

         if (this.i.isPresent()) {
            fay $$13 = $$3.bF();
            fay $$14 = $$3.g(1.0F);
            fay $$15 = $$13.b($$14.d * 100.0, $$14.e * 100.0, $$14.f * 100.0);
            fav $$16 = cpq.a($$3.dW(), $$3, $$13, $$15, new fat($$13, $$15).g(1.0), $$0x -> !$$0x.Z_(), 0.0F);
            if ($$16 == null || $$16.d() != faw.a.c) {
               return false;
            }

            buj $$17 = $$16.a();
            if (!this.i.get().a($$3, $$17) || !$$3.E($$17)) {
               return false;
            }
         }

         return !this.j.isPresent() || this.j.get().a($$3.ai());
      }
   }

   @Override
   public MapCodec<ds> a() {
      return bz.c;
   }

   public dk.d b() {
      return this.d;
   }

   public cg c() {
      return this.e;
   }

   public List<ds.e<?>> d() {
      return this.f;
   }

   public Object2BooleanMap<akt<dbc<?>>> e() {
      return this.g;
   }

   public Map<aku, ds.c> f() {
      return this.h;
   }

   public Optional<bx> g() {
      return this.i;
   }

   public Optional<ci> h() {
      return this.j;
   }

   static record a(Object2BooleanMap<String> c) implements ds.c {
      public static final Codec<ds.a> a = ayh.f(Codec.STRING).xmap(ds.a::new, ds.a::a);

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

   static record b(boolean c) implements ds.c {
      public static final Codec<ds.b> a = Codec.BOOL.xmap(ds.b::new, ds.b::a);

      public boolean a(ak $$0) {
         return $$0.a() == this.c;
      }

      public boolean a() {
         return this.c;
      }
   }

   interface c extends Predicate<ak> {
      Codec<ds.c> b = Codec.either(ds.b.a, ds.a.a).xmap(Either::unwrap, $$0 -> {
         if ($$0 instanceof ds.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof ds.a $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });
   }

   public static class d {
      private dk.d a = dk.d.c;
      private cg b = cg.a;
      private final Builder<ds.e<?>> c = ImmutableList.builder();
      private final Object2BooleanMap<akt<dbc<?>>> d = new Object2BooleanOpenHashMap();
      private final Map<aku, ds.c> e = Maps.newHashMap();
      private Optional<bx> f = Optional.empty();
      private Optional<ci> g = Optional.empty();

      public static ds.d a() {
         return new ds.d();
      }

      public ds.d a(dk.d $$0) {
         this.a = $$0;
         return this;
      }

      public <T> ds.d a(awi<T> $$0, jr.c<T> $$1, dk.d $$2) {
         this.c.add(new ds.e<>($$0, $$1, $$2));
         return this;
      }

      public ds.d a(akt<dbc<?>> $$0, boolean $$1) {
         this.d.put($$0, $$1);
         return this;
      }

      public ds.d a(cg $$0) {
         this.b = $$0;
         return this;
      }

      public ds.d a(bx.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public ds.d a(aku $$0, boolean $$1) {
         this.e.put($$0, new ds.b($$1));
         return this;
      }

      public ds.d a(aku $$0, Map<String, Boolean> $$1) {
         this.e.put($$0, new ds.a(new Object2BooleanOpenHashMap($$1)));
         return this;
      }

      public ds.d a(ci $$0) {
         this.g = Optional.of($$0);
         return this;
      }

      public ds b() {
         return new ds(this.a, this.b, this.c.build(), this.d, this.e, this.f, this.g);
      }
   }

   static record e<T>(awi<T> b, jr<T> c, dk.d d, Supplier<awg<T>> e) {
      public static final Codec<ds.e<?>> a = mb.v.q().dispatch(ds.e::a, ds.e::a);

      public e(awi<T> $$0, jr<T> $$1, dk.d $$2) {
         this($$0, $$1, $$2, Suppliers.memoize(() -> $$0.b($$1.a())));
      }

      private static <T> MapCodec<ds.e<T>> a(awi<T> $$0) {
         return RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group($$0.b().r().fieldOf("stat").forGetter(ds.e::b), dk.d.d.optionalFieldOf("value", dk.d.c).forGetter(ds.e::c))
                  .apply($$1, ($$1x, $$2) -> new ds.e<>($$0, $$1x, $$2))
         );
      }

      public boolean a(awk $$0) {
         return this.d.d($$0.a(this.e.get()));
      }

      public awi<T> a() {
         return this.b;
      }

      public jr<T> b() {
         return this.c;
      }

      public dk.d c() {
         return this.d;
      }

      public Supplier<awg<T>> d() {
         return this.e;
      }
   }
}
