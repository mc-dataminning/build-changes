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

public record cy(cs.d d, Optional<czr> e, List<cy.e<?>> f, Object2BooleanMap<akf> g, Map<akf, cy.c> h, Optional<br> i) implements bs {
   public static final int b = 100;
   public static final MapCodec<cy> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               axe.a(cs.d.d, "level", cs.d.c).forGetter(cy::b),
               czr.f.optionalFieldOf("gamemode").forGetter(cy::c),
               axe.a(cy.e.a.listOf(), "stats", List.of()).forGetter(cy::d),
               axe.a(axe.d(akf.a), "recipes", Object2BooleanMaps.emptyMap()).forGetter(cy::e),
               axe.a(Codec.unboundedMap(akf.a, cy.c.b), "advancements", Map.of()).forGetter(cy::f),
               axe.a(br.a, "looking_at").forGetter(cy::g)
            )
            .apply($$0, cy::new)
   );

   @Override
   public boolean a(bql $$0, aqe $$1, @Nullable etf $$2) {
      if (!($$0 instanceof aqf $$3)) {
         return false;
      } else if (!this.d.d($$3.cp)) {
         return false;
      } else if (this.e.isPresent() && this.e.get() != $$3.f.b()) {
         return false;
      } else {
         avk $$5 = $$3.H();

         for (cy.e<?> $$6 : this.f) {
            if (!$$6.a($$5)) {
               return false;
            }
         }

         avc $$7 = $$3.I();
         ObjectIterator var13 = this.g.object2BooleanEntrySet().iterator();

         while (var13.hasNext()) {
            Entry<akf> $$8 = (Entry<akf>)var13.next();
            if ($$7.b((akf)$$8.getKey()) != $$8.getBooleanValue()) {
               return false;
            }
         }

         if (!this.h.isEmpty()) {
            akn $$9 = $$3.Q();
            akr $$10 = $$3.cM().aE();

            for (java.util.Map.Entry<akf, cy.c> $$11 : this.h.entrySet()) {
               af $$12 = $$10.a($$11.getKey());
               if ($$12 == null || !$$11.getValue().test($$9.b($$12))) {
                  return false;
               }
            }
         }

         if (this.i.isPresent()) {
            etf $$13 = $$3.bv();
            etf $$14 = $$3.f(1.0F);
            etf $$15 = $$13.b($$14.c * 100.0, $$14.d * 100.0, $$14.e * 100.0);
            etc $$16 = clf.a($$3.dN(), $$3, $$13, $$15, new eta($$13, $$15).g(1.0), $$0x -> !$$0x.N_(), 0.0F);
            if ($$16 == null || $$16.c() != etd.a.c) {
               return false;
            }

            bql $$17 = $$16.a();
            if (!this.i.get().a($$3, $$17) || !$$3.E($$17)) {
               return false;
            }
         }

         return true;
      }
   }

   @Override
   public MapCodec<cy> a() {
      return bt.c;
   }

   public cs.d b() {
      return this.d;
   }

   public Optional<czr> c() {
      return this.e;
   }

   public List<cy.e<?>> d() {
      return this.f;
   }

   public Object2BooleanMap<akf> e() {
      return this.g;
   }

   public Map<akf, cy.c> f() {
      return this.h;
   }

   public Optional<br> g() {
      return this.i;
   }

   static record a(Object2BooleanMap<String> c) implements cy.c {
      public static final Codec<cy.a> a = axe.d(Codec.STRING).xmap(cy.a::new, cy.a::a);

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

   static record b(boolean c) implements cy.c {
      public static final Codec<cy.b> a = Codec.BOOL.xmap(cy.b::new, cy.b::a);

      public boolean a(ah $$0) {
         return $$0.a() == this.c;
      }

      public boolean a() {
         return this.c;
      }
   }

   interface c extends Predicate<ah> {
      Codec<cy.c> b = Codec.either(cy.b.a, cy.a.a).xmap($$0 -> (cy.c)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof cy.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof cy.a $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });
   }

   public static class d {
      private cs.d a = cs.d.c;
      private Optional<czr> b = Optional.empty();
      private final Builder<cy.e<?>> c = ImmutableList.builder();
      private final Object2BooleanMap<akf> d = new Object2BooleanOpenHashMap();
      private final Map<akf, cy.c> e = Maps.newHashMap();
      private Optional<br> f = Optional.empty();

      public static cy.d a() {
         return new cy.d();
      }

      public cy.d a(cs.d $$0) {
         this.a = $$0;
         return this;
      }

      public <T> cy.d a(avi<T> $$0, iv.c<T> $$1, cs.d $$2) {
         this.c.add(new cy.e<>($$0, $$1, $$2));
         return this;
      }

      public cy.d a(akf $$0, boolean $$1) {
         this.d.put($$0, $$1);
         return this;
      }

      public cy.d a(czr $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public cy.d a(br.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public cy.d b(akf $$0, boolean $$1) {
         this.e.put($$0, new cy.b($$1));
         return this;
      }

      public cy.d a(akf $$0, Map<String, Boolean> $$1) {
         this.e.put($$0, new cy.a(new Object2BooleanOpenHashMap($$1)));
         return this;
      }

      public cy b() {
         return new cy(this.a, this.b, this.c.build(), this.d, this.e, this.f);
      }
   }

   static record e<T>(avi<T> b, iv<T> c, cs.d d, Supplier<avg<T>> e) {
      public static final Codec<cy.e<?>> a = lc.x.q().dispatch(cy.e::a, cy.e::a);

      public e(avi<T> $$0, iv<T> $$1, cs.d $$2) {
         this($$0, $$1, $$2, Suppliers.memoize(() -> $$0.b($$1.a())));
      }

      private static <T> Codec<cy.e<T>> a(avi<T> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.b().r().fieldOf("stat").forGetter(cy.e::b), axe.a(cs.d.d, "value", cs.d.c).forGetter(cy.e::c))
                  .apply($$1, ($$1x, $$2) -> new cy.e<>($$0, $$1x, $$2))
         );
      }

      public boolean a(avk $$0) {
         return this.d.d($$0.a(this.e.get()));
      }

      public avi<T> a() {
         return this.b;
      }

      public iv<T> b() {
         return this.c;
      }

      public cs.d c() {
         return this.d;
      }

      public Supplier<avg<T>> d() {
         return this.e;
      }
   }
}
