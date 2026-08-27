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

public record cs(cm.d d, Optional<cwy> e, List<cs.e<?>> f, Object2BooleanMap<ajh> g, Map<ajh, cs.c> h, Optional<br> i) implements bs {
   public static final int b = 100;
   public static final MapCodec<cs> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               awe.a(cm.d.d, "level", cm.d.c).forGetter(cs::b),
               cwy.f.optionalFieldOf("gamemode").forGetter(cs::c),
               awe.a(cs.e.a.listOf(), "stats", List.of()).forGetter(cs::d),
               awe.a(awe.d(ajh.a), "recipes", Object2BooleanMaps.emptyMap()).forGetter(cs::e),
               awe.a(Codec.unboundedMap(ajh.a, cs.c.b), "advancements", Map.of()).forGetter(cs::f),
               awe.a(br.a, "looking_at").forGetter(cs::g)
            )
            .apply($$0, cs::new)
   );

   @Override
   public boolean a(box $$0, apf $$1, @Nullable ept $$2) {
      if (!($$0 instanceof apg $$3)) {
         return false;
      } else if (!this.d.d($$3.cm)) {
         return false;
      } else if (this.e.isPresent() && this.e.get() != $$3.f.b()) {
         return false;
      } else {
         auj $$5 = $$3.H();

         for (cs.e<?> $$6 : this.f) {
            if (!$$6.a($$5)) {
               return false;
            }
         }

         aub $$7 = $$3.I();
         ObjectIterator var13 = this.g.object2BooleanEntrySet().iterator();

         while (var13.hasNext()) {
            Entry<ajh> $$8 = (Entry<ajh>)var13.next();
            if ($$7.b((ajh)$$8.getKey()) != $$8.getBooleanValue()) {
               return false;
            }
         }

         if (!this.h.isEmpty()) {
            ajp $$9 = $$3.Q();
            ajt $$10 = $$3.cL().aE();

            for (java.util.Map.Entry<ajh, cs.c> $$11 : this.h.entrySet()) {
               af $$12 = $$10.a($$11.getKey());
               if ($$12 == null || !$$11.getValue().test($$9.b($$12))) {
                  return false;
               }
            }
         }

         if (this.i.isPresent()) {
            ept $$13 = $$3.bu();
            ept $$14 = $$3.f(1.0F);
            ept $$15 = $$13.b($$14.c * 100.0, $$14.d * 100.0, $$14.e * 100.0);
            epq $$16 = cjo.a($$3.dM(), $$3, $$13, $$15, new epo($$13, $$15).g(1.0), $$0x -> !$$0x.N_(), 0.0F);
            if ($$16 == null || $$16.c() != epr.a.c) {
               return false;
            }

            box $$17 = $$16.a();
            if (!this.i.get().a($$3, $$17) || !$$3.E($$17)) {
               return false;
            }
         }

         return true;
      }
   }

   @Override
   public bs.a a() {
      return bs.b.d;
   }

   public cm.d b() {
      return this.d;
   }

   public Optional<cwy> c() {
      return this.e;
   }

   public List<cs.e<?>> d() {
      return this.f;
   }

   public Object2BooleanMap<ajh> e() {
      return this.g;
   }

   public Map<ajh, cs.c> f() {
      return this.h;
   }

   public Optional<br> g() {
      return this.i;
   }

   static record a(Object2BooleanMap<String> c) implements cs.c {
      public static final Codec<cs.a> a = awe.d(Codec.STRING).xmap(cs.a::new, cs.a::a);

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

   static record b(boolean c) implements cs.c {
      public static final Codec<cs.b> a = Codec.BOOL.xmap(cs.b::new, cs.b::a);

      public boolean a(ah $$0) {
         return $$0.a() == this.c;
      }

      public boolean a() {
         return this.c;
      }
   }

   interface c extends Predicate<ah> {
      Codec<cs.c> b = Codec.either(cs.b.a, cs.a.a).xmap($$0 -> (cs.c)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof cs.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof cs.a $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });
   }

   public static class d {
      private cm.d a = cm.d.c;
      private Optional<cwy> b = Optional.empty();
      private final Builder<cs.e<?>> c = ImmutableList.builder();
      private final Object2BooleanMap<ajh> d = new Object2BooleanOpenHashMap();
      private final Map<ajh, cs.c> e = Maps.newHashMap();
      private Optional<br> f = Optional.empty();

      public static cs.d a() {
         return new cs.d();
      }

      public cs.d a(cm.d $$0) {
         this.a = $$0;
         return this;
      }

      public <T> cs.d a(auh<T> $$0, il.c<T> $$1, cm.d $$2) {
         this.c.add(new cs.e<>($$0, $$1, $$2));
         return this;
      }

      public cs.d a(ajh $$0, boolean $$1) {
         this.d.put($$0, $$1);
         return this;
      }

      public cs.d a(cwy $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public cs.d a(br.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public cs.d b(ajh $$0, boolean $$1) {
         this.e.put($$0, new cs.b($$1));
         return this;
      }

      public cs.d a(ajh $$0, Map<String, Boolean> $$1) {
         this.e.put($$0, new cs.a(new Object2BooleanOpenHashMap($$1)));
         return this;
      }

      public cs b() {
         return new cs(this.a, this.b, this.c.build(), this.d, this.e, this.f);
      }
   }

   static record e<T>(auh<T> b, il<T> c, cm.d d, Supplier<auf<T>> e) {
      public static final Codec<cs.e<?>> a = ki.x.q().dispatch(cs.e::a, cs.e::a);

      public e(auh<T> $$0, il<T> $$1, cm.d $$2) {
         this($$0, $$1, $$2, Suppliers.memoize(() -> $$0.b($$1.a())));
      }

      private static <T> Codec<cs.e<T>> a(auh<T> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.b().r().fieldOf("stat").forGetter(cs.e::b), awe.a(cm.d.d, "value", cm.d.c).forGetter(cs.e::c))
                  .apply($$1, ($$1x, $$2) -> new cs.e<>($$0, $$1x, $$2))
         );
      }

      public boolean a(auj $$0) {
         return this.d.d($$0.a(this.e.get()));
      }

      public auh<T> a() {
         return this.b;
      }

      public il<T> b() {
         return this.c;
      }

      public cm.d c() {
         return this.d;
      }

      public Supplier<auf<T>> d() {
         return this.e;
      }
   }
}
