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

public record cz(ct.d d, Optional<daa> e, List<cz.e<?>> f, Object2BooleanMap<akh> g, Map<akh, cz.c> h, Optional<br> i) implements bs {
   public static final int b = 100;
   public static final MapCodec<cz> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               axh.a(ct.d.d, "level", ct.d.c).forGetter(cz::b),
               daa.f.optionalFieldOf("gamemode").forGetter(cz::c),
               axh.a(cz.e.a.listOf(), "stats", List.of()).forGetter(cz::d),
               axh.a(axh.d(akh.a), "recipes", Object2BooleanMaps.emptyMap()).forGetter(cz::e),
               axh.a(Codec.unboundedMap(akh.a, cz.c.b), "advancements", Map.of()).forGetter(cz::f),
               axh.a(br.a, "looking_at").forGetter(cz::g)
            )
            .apply($$0, cz::new)
   );

   @Override
   public boolean a(brh $$0, aqh $$1, @Nullable etp $$2) {
      if (!($$0 instanceof aqi $$3)) {
         return false;
      } else if (!this.d.d($$3.cp)) {
         return false;
      } else if (this.e.isPresent() && this.e.get() != $$3.f.b()) {
         return false;
      } else {
         avn $$5 = $$3.H();

         for (cz.e<?> $$6 : this.f) {
            if (!$$6.a($$5)) {
               return false;
            }
         }

         avf $$7 = $$3.I();
         ObjectIterator var13 = this.g.object2BooleanEntrySet().iterator();

         while (var13.hasNext()) {
            Entry<akh> $$8 = (Entry<akh>)var13.next();
            if ($$7.b((akh)$$8.getKey()) != $$8.getBooleanValue()) {
               return false;
            }
         }

         if (!this.h.isEmpty()) {
            akp $$9 = $$3.Q();
            aku $$10 = $$3.cM().aE();

            for (java.util.Map.Entry<akh, cz.c> $$11 : this.h.entrySet()) {
               af $$12 = $$10.a($$11.getKey());
               if ($$12 == null || !$$11.getValue().test($$9.b($$12))) {
                  return false;
               }
            }
         }

         if (this.i.isPresent()) {
            etp $$13 = $$3.bv();
            etp $$14 = $$3.f(1.0F);
            etp $$15 = $$13.b($$14.c * 100.0, $$14.d * 100.0, $$14.e * 100.0);
            etm $$16 = cmb.a($$3.dN(), $$3, $$13, $$15, new etk($$13, $$15).g(1.0), $$0x -> !$$0x.N_(), 0.0F);
            if ($$16 == null || $$16.c() != etn.a.c) {
               return false;
            }

            brh $$17 = $$16.a();
            if (!this.i.get().a($$3, $$17) || !$$3.E($$17)) {
               return false;
            }
         }

         return true;
      }
   }

   @Override
   public MapCodec<cz> a() {
      return bt.c;
   }

   public ct.d b() {
      return this.d;
   }

   public Optional<daa> c() {
      return this.e;
   }

   public List<cz.e<?>> d() {
      return this.f;
   }

   public Object2BooleanMap<akh> e() {
      return this.g;
   }

   public Map<akh, cz.c> f() {
      return this.h;
   }

   public Optional<br> g() {
      return this.i;
   }

   static record a(Object2BooleanMap<String> c) implements cz.c {
      public static final Codec<cz.a> a = axh.d(Codec.STRING).xmap(cz.a::new, cz.a::a);

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

   static record b(boolean c) implements cz.c {
      public static final Codec<cz.b> a = Codec.BOOL.xmap(cz.b::new, cz.b::a);

      public boolean a(ah $$0) {
         return $$0.a() == this.c;
      }

      public boolean a() {
         return this.c;
      }
   }

   interface c extends Predicate<ah> {
      Codec<cz.c> b = Codec.either(cz.b.a, cz.a.a).xmap($$0 -> (cz.c)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof cz.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof cz.a $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });
   }

   public static class d {
      private ct.d a = ct.d.c;
      private Optional<daa> b = Optional.empty();
      private final Builder<cz.e<?>> c = ImmutableList.builder();
      private final Object2BooleanMap<akh> d = new Object2BooleanOpenHashMap();
      private final Map<akh, cz.c> e = Maps.newHashMap();
      private Optional<br> f = Optional.empty();

      public static cz.d a() {
         return new cz.d();
      }

      public cz.d a(ct.d $$0) {
         this.a = $$0;
         return this;
      }

      public <T> cz.d a(avl<T> $$0, iw.c<T> $$1, ct.d $$2) {
         this.c.add(new cz.e<>($$0, $$1, $$2));
         return this;
      }

      public cz.d a(akh $$0, boolean $$1) {
         this.d.put($$0, $$1);
         return this;
      }

      public cz.d a(daa $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public cz.d a(br.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public cz.d b(akh $$0, boolean $$1) {
         this.e.put($$0, new cz.b($$1));
         return this;
      }

      public cz.d a(akh $$0, Map<String, Boolean> $$1) {
         this.e.put($$0, new cz.a(new Object2BooleanOpenHashMap($$1)));
         return this;
      }

      public cz b() {
         return new cz(this.a, this.b, this.c.build(), this.d, this.e, this.f);
      }
   }

   static record e<T>(avl<T> b, iw<T> c, ct.d d, Supplier<avj<T>> e) {
      public static final Codec<cz.e<?>> a = ld.x.q().dispatch(cz.e::a, cz.e::a);

      public e(avl<T> $$0, iw<T> $$1, ct.d $$2) {
         this($$0, $$1, $$2, Suppliers.memoize(() -> $$0.b($$1.a())));
      }

      private static <T> Codec<cz.e<T>> a(avl<T> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.b().r().fieldOf("stat").forGetter(cz.e::b), axh.a(ct.d.d, "value", ct.d.c).forGetter(cz.e::c))
                  .apply($$1, ($$1x, $$2) -> new cz.e<>($$0, $$1x, $$2))
         );
      }

      public boolean a(avn $$0) {
         return this.d.d($$0.a(this.e.get()));
      }

      public avl<T> a() {
         return this.b;
      }

      public iw<T> b() {
         return this.c;
      }

      public ct.d c() {
         return this.d;
      }

      public Supplier<avj<T>> d() {
         return this.e;
      }
   }
}
