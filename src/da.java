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

public record da(cu.d d, Optional<dbx> e, List<da.e<?>> f, Object2BooleanMap<akt> g, Map<akt, da.c> h, Optional<bs> i) implements bt {
   public static final int b = 100;
   public static final MapCodec<da> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               axu.a(cu.d.d, "level", cu.d.c).forGetter(da::b),
               dbx.f.optionalFieldOf("gamemode").forGetter(da::c),
               axu.a(da.e.a.listOf(), "stats", List.of()).forGetter(da::d),
               axu.a(axu.d(akt.a), "recipes", Object2BooleanMaps.emptyMap()).forGetter(da::e),
               axu.a(Codec.unboundedMap(akt.a, da.c.b), "advancements", Map.of()).forGetter(da::f),
               axu.a(bs.a, "looking_at").forGetter(da::g)
            )
            .apply($$0, da::new)
   );

   @Override
   public boolean a(brv $$0, aqt $$1, @Nullable ewu $$2) {
      if (!($$0 instanceof aqu $$3)) {
         return false;
      } else if (!this.d.d($$3.cE)) {
         return false;
      } else if (this.e.isPresent() && this.e.get() != $$3.f.b()) {
         return false;
      } else {
         awa $$5 = $$3.J();

         for (da.e<?> $$6 : this.f) {
            if (!$$6.a($$5)) {
               return false;
            }
         }

         avs $$7 = $$3.K();
         ObjectIterator var13 = this.g.object2BooleanEntrySet().iterator();

         while (var13.hasNext()) {
            Entry<akt> $$8 = (Entry<akt>)var13.next();
            if ($$7.b((akt)$$8.getKey()) != $$8.getBooleanValue()) {
               return false;
            }
         }

         if (!this.h.isEmpty()) {
            alb $$9 = $$3.S();
            alg $$10 = $$3.cT().aE();

            for (java.util.Map.Entry<akt, da.c> $$11 : this.h.entrySet()) {
               ag $$12 = $$10.a($$11.getKey());
               if ($$12 == null || !$$11.getValue().test($$9.b($$12))) {
                  return false;
               }
            }
         }

         if (this.i.isPresent()) {
            ewu $$13 = $$3.bC();
            ewu $$14 = $$3.f(1.0F);
            ewu $$15 = $$13.b($$14.c * 100.0, $$14.d * 100.0, $$14.e * 100.0);
            ewr $$16 = cmu.a($$3.dU(), $$3, $$13, $$15, new ewp($$13, $$15).g(1.0), $$0x -> !$$0x.O_(), 0.0F);
            if ($$16 == null || $$16.c() != ews.a.c) {
               return false;
            }

            brv $$17 = $$16.a();
            if (!this.i.get().a($$3, $$17) || !$$3.E($$17)) {
               return false;
            }
         }

         return true;
      }
   }

   @Override
   public MapCodec<da> a() {
      return bu.c;
   }

   public cu.d b() {
      return this.d;
   }

   public Optional<dbx> c() {
      return this.e;
   }

   public List<da.e<?>> d() {
      return this.f;
   }

   public Object2BooleanMap<akt> e() {
      return this.g;
   }

   public Map<akt, da.c> f() {
      return this.h;
   }

   public Optional<bs> g() {
      return this.i;
   }

   static record a(Object2BooleanMap<String> c) implements da.c {
      public static final Codec<da.a> a = axu.d(Codec.STRING).xmap(da.a::new, da.a::a);

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

   static record b(boolean c) implements da.c {
      public static final Codec<da.b> a = Codec.BOOL.xmap(da.b::new, da.b::a);

      public boolean a(ai $$0) {
         return $$0.a() == this.c;
      }

      public boolean a() {
         return this.c;
      }
   }

   interface c extends Predicate<ai> {
      Codec<da.c> b = Codec.either(da.b.a, da.a.a).xmap($$0 -> (da.c)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof da.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof da.a $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });
   }

   public static class d {
      private cu.d a = cu.d.c;
      private Optional<dbx> b = Optional.empty();
      private final Builder<da.e<?>> c = ImmutableList.builder();
      private final Object2BooleanMap<akt> d = new Object2BooleanOpenHashMap();
      private final Map<akt, da.c> e = Maps.newHashMap();
      private Optional<bs> f = Optional.empty();

      public static da.d a() {
         return new da.d();
      }

      public da.d a(cu.d $$0) {
         this.a = $$0;
         return this;
      }

      public <T> da.d a(avy<T> $$0, ja.c<T> $$1, cu.d $$2) {
         this.c.add(new da.e<>($$0, $$1, $$2));
         return this;
      }

      public da.d a(akt $$0, boolean $$1) {
         this.d.put($$0, $$1);
         return this;
      }

      public da.d a(dbx $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public da.d a(bs.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public da.d b(akt $$0, boolean $$1) {
         this.e.put($$0, new da.b($$1));
         return this;
      }

      public da.d a(akt $$0, Map<String, Boolean> $$1) {
         this.e.put($$0, new da.a(new Object2BooleanOpenHashMap($$1)));
         return this;
      }

      public da b() {
         return new da(this.a, this.b, this.c.build(), this.d, this.e, this.f);
      }
   }

   static record e<T>(avy<T> b, ja<T> c, cu.d d, Supplier<avw<T>> e) {
      public static final Codec<da.e<?>> a = lh.x.q().dispatch(da.e::a, da.e::a);

      public e(avy<T> $$0, ja<T> $$1, cu.d $$2) {
         this($$0, $$1, $$2, Suppliers.memoize(() -> $$0.b($$1.a())));
      }

      private static <T> Codec<da.e<T>> a(avy<T> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.b().r().fieldOf("stat").forGetter(da.e::b), axu.a(cu.d.d, "value", cu.d.c).forGetter(da.e::c))
                  .apply($$1, ($$1x, $$2) -> new da.e<>($$0, $$1x, $$2))
         );
      }

      public boolean a(awa $$0) {
         return this.d.d($$0.a(this.e.get()));
      }

      public avy<T> a() {
         return this.b;
      }

      public ja<T> b() {
         return this.c;
      }

      public cu.d c() {
         return this.d;
      }

      public Supplier<avw<T>> d() {
         return this.e;
      }
   }
}
