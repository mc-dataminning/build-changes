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

public record cz(ct.d d, Optional<daw> e, List<cz.e<?>> f, Object2BooleanMap<akn> g, Map<akn, cz.c> h, Optional<br> i) implements bs {
   public static final int b = 100;
   public static final MapCodec<cz> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ct.d.d.optionalFieldOf("level", ct.d.c).forGetter(cz::b),
               daw.f.optionalFieldOf("gamemode").forGetter(cz::c),
               cz.e.a.listOf().optionalFieldOf("stats", List.of()).forGetter(cz::d),
               axn.d(akn.a).optionalFieldOf("recipes", Object2BooleanMaps.emptyMap()).forGetter(cz::e),
               Codec.unboundedMap(akn.a, cz.c.b).optionalFieldOf("advancements", Map.of()).forGetter(cz::f),
               br.a.optionalFieldOf("looking_at").forGetter(cz::g)
            )
            .apply($$0, cz::new)
   );

   @Override
   public boolean a(brw $$0, aqn $$1, @Nullable eum $$2) {
      if (!($$0 instanceof aqo $$3)) {
         return false;
      } else if (!this.d.d($$3.co)) {
         return false;
      } else if (this.e.isPresent() && this.e.get() != $$3.e.b()) {
         return false;
      } else {
         avt $$5 = $$3.H();

         for (cz.e<?> $$6 : this.f) {
            if (!$$6.a($$5)) {
               return false;
            }
         }

         avl $$7 = $$3.I();
         ObjectIterator var13 = this.g.object2BooleanEntrySet().iterator();

         while (var13.hasNext()) {
            Entry<akn> $$8 = (Entry<akn>)var13.next();
            if ($$7.b((akn)$$8.getKey()) != $$8.getBooleanValue()) {
               return false;
            }
         }

         if (!this.h.isEmpty()) {
            akv $$9 = $$3.Q();
            ala $$10 = $$3.cO().aE();

            for (java.util.Map.Entry<akn, cz.c> $$11 : this.h.entrySet()) {
               af $$12 = $$10.a($$11.getKey());
               if ($$12 == null || !$$11.getValue().test($$9.b($$12))) {
                  return false;
               }
            }
         }

         if (this.i.isPresent()) {
            eum $$13 = $$3.bx();
            eum $$14 = $$3.f(1.0F);
            eum $$15 = $$13.b($$14.c * 100.0, $$14.d * 100.0, $$14.e * 100.0);
            euj $$16 = cms.a($$3.dP(), $$3, $$13, $$15, new euh($$13, $$15).g(1.0), $$0x -> !$$0x.N_(), 0.0F);
            if ($$16 == null || $$16.c() != euk.a.c) {
               return false;
            }

            brw $$17 = $$16.a();
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

   public Optional<daw> c() {
      return this.e;
   }

   public List<cz.e<?>> d() {
      return this.f;
   }

   public Object2BooleanMap<akn> e() {
      return this.g;
   }

   public Map<akn, cz.c> f() {
      return this.h;
   }

   public Optional<br> g() {
      return this.i;
   }

   static record a(Object2BooleanMap<String> c) implements cz.c {
      public static final Codec<cz.a> a = axn.d(Codec.STRING).xmap(cz.a::new, cz.a::a);

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
      Codec<cz.c> b = Codec.either(cz.b.a, cz.a.a).xmap(Either::unwrap, $$0 -> {
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
      private Optional<daw> b = Optional.empty();
      private final Builder<cz.e<?>> c = ImmutableList.builder();
      private final Object2BooleanMap<akn> d = new Object2BooleanOpenHashMap();
      private final Map<akn, cz.c> e = Maps.newHashMap();
      private Optional<br> f = Optional.empty();

      public static cz.d a() {
         return new cz.d();
      }

      public cz.d a(ct.d $$0) {
         this.a = $$0;
         return this;
      }

      public <T> cz.d a(avr<T> $$0, ix.c<T> $$1, ct.d $$2) {
         this.c.add(new cz.e<>($$0, $$1, $$2));
         return this;
      }

      public cz.d a(akn $$0, boolean $$1) {
         this.d.put($$0, $$1);
         return this;
      }

      public cz.d a(daw $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public cz.d a(br.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public cz.d b(akn $$0, boolean $$1) {
         this.e.put($$0, new cz.b($$1));
         return this;
      }

      public cz.d a(akn $$0, Map<String, Boolean> $$1) {
         this.e.put($$0, new cz.a(new Object2BooleanOpenHashMap($$1)));
         return this;
      }

      public cz b() {
         return new cz(this.a, this.b, this.c.build(), this.d, this.e, this.f);
      }
   }

   static record e<T>(avr<T> b, ix<T> c, ct.d d, Supplier<avp<T>> e) {
      public static final Codec<cz.e<?>> a = le.x.q().dispatch(cz.e::a, cz.e::a);

      public e(avr<T> $$0, ix<T> $$1, ct.d $$2) {
         this($$0, $$1, $$2, Suppliers.memoize(() -> $$0.b($$1.a())));
      }

      private static <T> MapCodec<cz.e<T>> a(avr<T> $$0) {
         return RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group($$0.b().r().fieldOf("stat").forGetter(cz.e::b), ct.d.d.optionalFieldOf("value", ct.d.c).forGetter(cz.e::c))
                  .apply($$1, ($$1x, $$2) -> new cz.e<>($$0, $$1x, $$2))
         );
      }

      public boolean a(avt $$0) {
         return this.d.d($$0.a(this.e.get()));
      }

      public avr<T> a() {
         return this.b;
      }

      public ix<T> b() {
         return this.c;
      }

      public ct.d c() {
         return this.d;
      }

      public Supplier<avp<T>> d() {
         return this.e;
      }
   }
}
