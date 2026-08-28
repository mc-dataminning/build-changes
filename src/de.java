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

public record de(cx.d d, ci e, List<de.e<?>> f, Object2BooleanMap<alq<dfb<?>>> g, Map<alr, de.c> h, Optional<bz> i, Optional<ck> j) implements ca {
   public static final int b = 100;
   public static final MapCodec<de> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               cx.d.d.optionalFieldOf("level", cx.d.c).forGetter(de::b),
               ci.c.optionalFieldOf("gamemode", ci.a).forGetter(de::c),
               de.e.a.listOf().optionalFieldOf("stats", List.of()).forGetter(de::d),
               azg.f(dfb.b).optionalFieldOf("recipes", Object2BooleanMaps.emptyMap()).forGetter(de::e),
               Codec.unboundedMap(alr.a, de.c.b).optionalFieldOf("advancements", Map.of()).forGetter(de::f),
               bz.a.optionalFieldOf("looking_at").forGetter(de::g),
               ck.a.optionalFieldOf("input").forGetter(de::h)
            )
            .apply($$0, de::new)
   );

   @Override
   public boolean a(bxe $$0, asb $$1, @Nullable fgc $$2) {
      if (!($$0 instanceof asc $$3)) {
         return false;
      } else if (!this.d.d($$3.cf)) {
         return false;
      } else if (!this.e.a($$3.a())) {
         return false;
      } else {
         axj $$5 = $$3.H();

         for (de.e<?> $$6 : this.f) {
            if (!$$6.a($$5)) {
               return false;
            }
         }

         axd $$7 = $$3.I();
         ObjectIterator var13 = this.g.object2BooleanEntrySet().iterator();

         while (var13.hasNext()) {
            Entry<alq<dfb<?>>> $$8 = (Entry<alq<dfb<?>>>)var13.next();
            if ($$7.b((alq<dfb<?>>)$$8.getKey()) != $$8.getBooleanValue()) {
               return false;
            }
         }

         if (!this.h.isEmpty()) {
            alz $$9 = $$3.R();
            ame $$10 = $$3.cV().aD();

            for (java.util.Map.Entry<alr, de.c> $$11 : this.h.entrySet()) {
               aj $$12 = $$10.a($$11.getKey());
               if ($$12 == null || !$$11.getValue().test($$9.b($$12))) {
                  return false;
               }
            }
         }

         if (this.i.isPresent()) {
            fgc $$13 = $$3.bD();
            fgc $$14 = $$3.h(1.0F);
            fgc $$15 = $$13.b($$14.d * 100.0, $$14.e * 100.0, $$14.f * 100.0);
            ffz $$16 = ctf.a($$3.dV(), $$3, $$13, $$15, new ffx($$13, $$15).g(1.0), $$0x -> !$$0x.ak(), 0.0F);
            if ($$16 == null || $$16.d() != fga.a.c) {
               return false;
            }

            bxe $$17 = $$16.a();
            if (!this.i.get().a($$3, $$17) || !$$3.E($$17)) {
               return false;
            }
         }

         return !this.j.isPresent() || this.j.get().a($$3.ae());
      }
   }

   @Override
   public MapCodec<de> a() {
      return cb.c;
   }

   public cx.d b() {
      return this.d;
   }

   public ci c() {
      return this.e;
   }

   public List<de.e<?>> d() {
      return this.f;
   }

   public Object2BooleanMap<alq<dfb<?>>> e() {
      return this.g;
   }

   public Map<alr, de.c> f() {
      return this.h;
   }

   public Optional<bz> g() {
      return this.i;
   }

   public Optional<ck> h() {
      return this.j;
   }

   static record a(Object2BooleanMap<String> c) implements de.c {
      public static final Codec<de.a> a = azg.f(Codec.STRING).xmap(de.a::new, de.a::a);

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

   static record b(boolean c) implements de.c {
      public static final Codec<de.b> a = Codec.BOOL.xmap(de.b::new, de.b::a);

      public boolean a(al $$0) {
         return $$0.a() == this.c;
      }

      public boolean a() {
         return this.c;
      }
   }

   interface c extends Predicate<al> {
      Codec<de.c> b = Codec.either(de.b.a, de.a.a).xmap(Either::unwrap, $$0 -> {
         if ($$0 instanceof de.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof de.a $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });
   }

   public static class d {
      private cx.d a = cx.d.c;
      private ci b = ci.a;
      private final Builder<de.e<?>> c = ImmutableList.builder();
      private final Object2BooleanMap<alq<dfb<?>>> d = new Object2BooleanOpenHashMap();
      private final Map<alr, de.c> e = Maps.newHashMap();
      private Optional<bz> f = Optional.empty();
      private Optional<ck> g = Optional.empty();

      public static de.d a() {
         return new de.d();
      }

      public de.d a(cx.d $$0) {
         this.a = $$0;
         return this;
      }

      public <T> de.d a(axh<T> $$0, jg.c<T> $$1, cx.d $$2) {
         this.c.add(new de.e<>($$0, $$1, $$2));
         return this;
      }

      public de.d a(alq<dfb<?>> $$0, boolean $$1) {
         this.d.put($$0, $$1);
         return this;
      }

      public de.d a(ci $$0) {
         this.b = $$0;
         return this;
      }

      public de.d a(bz.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public de.d a(alr $$0, boolean $$1) {
         this.e.put($$0, new de.b($$1));
         return this;
      }

      public de.d a(alr $$0, Map<String, Boolean> $$1) {
         this.e.put($$0, new de.a(new Object2BooleanOpenHashMap($$1)));
         return this;
      }

      public de.d a(ck $$0) {
         this.g = Optional.of($$0);
         return this;
      }

      public de b() {
         return new de(this.a, this.b, this.c.build(), this.d, this.e, this.f, this.g);
      }
   }

   static record e<T>(axh<T> b, jg<T> c, cx.d d, Supplier<axf<T>> e) {
      public static final Codec<de.e<?>> a = mh.v.q().dispatch(de.e::a, de.e::a);

      public e(axh<T> $$0, jg<T> $$1, cx.d $$2) {
         this($$0, $$1, $$2, Suppliers.memoize(() -> $$0.b($$1.a())));
      }

      private static <T> MapCodec<de.e<T>> a(axh<T> $$0) {
         return RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group($$0.b().r().fieldOf("stat").forGetter(de.e::b), cx.d.d.optionalFieldOf("value", cx.d.c).forGetter(de.e::c))
                  .apply($$1, ($$1x, $$2) -> new de.e<>($$0, $$1x, $$2))
         );
      }

      public boolean a(axj $$0) {
         return this.d.d($$0.a(this.e.get()));
      }

      public axh<T> a() {
         return this.b;
      }

      public jg<T> b() {
         return this.c;
      }

      public cx.d c() {
         return this.d;
      }

      public Supplier<axf<T>> d() {
         return this.e;
      }
   }
}
