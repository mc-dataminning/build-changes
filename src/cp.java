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

public record cp(cj.d d, Optional<cpj> e, List<cp.e<?>> f, Object2BooleanMap<aer> g, Map<aer, cp.c> h, Optional<bo> i) implements bp {
   public static final int b = 100;
   public static final MapCodec<cp> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               aqy.a(cj.d.d, "level", cj.d.c).forGetter(cp::b),
               cpj.f.optionalFieldOf("gamemode").forGetter(cp::c),
               aqy.a(cp.e.a.listOf(), "stats", List.of()).forGetter(cp::d),
               aqy.a(aqy.d(aer.a), "recipes", Object2BooleanMaps.emptyMap()).forGetter(cp::e),
               aqy.a(Codec.unboundedMap(aer.a, cp.c.b), "advancements", Map.of()).forGetter(cp::f),
               aqy.a(bo.a, "looking_at").forGetter(cp::g)
            )
            .apply($$0, cp::new)
   );

   @Override
   public boolean a(bii $$0, akk $$1, @Nullable ehe $$2) {
      if (!($$0 instanceof akl $$3)) {
         return false;
      } else if (!this.d.d($$3.cd)) {
         return false;
      } else if (this.e.isPresent() && this.e.get() != $$3.e.b()) {
         return false;
      } else {
         aph $$5 = $$3.E();

         for (cp.e<?> $$6 : this.f) {
            if (!$$6.a($$5)) {
               return false;
            }
         }

         aoz $$7 = $$3.F();
         ObjectIterator var13 = this.g.object2BooleanEntrySet().iterator();

         while (var13.hasNext()) {
            Entry<aer> $$8 = (Entry<aer>)var13.next();
            if ($$7.b((aer)$$8.getKey()) != $$8.getBooleanValue()) {
               return false;
            }
         }

         if (!this.h.isEmpty()) {
            aez $$9 = $$3.N();
            afd $$10 = $$3.cK().az();

            for (java.util.Map.Entry<aer, cp.c> $$11 : this.h.entrySet()) {
               ae $$12 = $$10.a($$11.getKey());
               if ($$12 == null || !$$11.getValue().test($$9.b($$12))) {
                  return false;
               }
            }
         }

         if (this.i.isPresent()) {
            ehe $$13 = $$3.bp();
            ehe $$14 = $$3.f(1.0F);
            ehe $$15 = $$13.b($$14.c * 100.0, $$14.d * 100.0, $$14.e * 100.0);
            ehb $$16 = ccg.a($$3.dK(), $$3, $$13, $$15, new egz($$13, $$15).g(1.0), $$0x -> !$$0x.G_(), 0.0F);
            if ($$16 == null || $$16.c() != ehc.a.c) {
               return false;
            }

            bii $$17 = $$16.a();
            if (!this.i.get().a($$3, $$17) || !$$3.E($$17)) {
               return false;
            }
         }

         return true;
      }
   }

   @Override
   public bp.a a() {
      return bp.b.d;
   }

   public cj.d b() {
      return this.d;
   }

   public Optional<cpj> c() {
      return this.e;
   }

   public List<cp.e<?>> d() {
      return this.f;
   }

   public Object2BooleanMap<aer> e() {
      return this.g;
   }

   public Map<aer, cp.c> f() {
      return this.h;
   }

   public Optional<bo> g() {
      return this.i;
   }

   static record a(Object2BooleanMap<String> c) implements cp.c {
      public static final Codec<cp.a> a = aqy.d(Codec.STRING).xmap(cp.a::new, cp.a::a);

      public boolean a(ag $$0) {
         ObjectIterator var2 = this.c.object2BooleanEntrySet().iterator();

         while (var2.hasNext()) {
            Entry<String> $$1 = (Entry<String>)var2.next();
            ak $$2 = $$0.c((String)$$1.getKey());
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

   static record b(boolean c) implements cp.c {
      public static final Codec<cp.b> a = Codec.BOOL.xmap(cp.b::new, cp.b::a);

      public boolean a(ag $$0) {
         return $$0.a() == this.c;
      }

      public boolean a() {
         return this.c;
      }
   }

   interface c extends Predicate<ag> {
      Codec<cp.c> b = Codec.either(cp.b.a, cp.a.a).xmap($$0 -> (cp.c)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof cp.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof cp.a $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });
   }

   public static class d {
      private cj.d a = cj.d.c;
      private Optional<cpj> b = Optional.empty();
      private final Builder<cp.e<?>> c = ImmutableList.builder();
      private final Object2BooleanMap<aer> d = new Object2BooleanOpenHashMap();
      private final Map<aer, cp.c> e = Maps.newHashMap();
      private Optional<bo> f = Optional.empty();

      public static cp.d a() {
         return new cp.d();
      }

      public cp.d a(cj.d $$0) {
         this.a = $$0;
         return this;
      }

      public <T> cp.d a(apf<T> $$0, he.c<T> $$1, cj.d $$2) {
         this.c.add(new cp.e<>($$0, $$1, $$2));
         return this;
      }

      public cp.d a(aer $$0, boolean $$1) {
         this.d.put($$0, $$1);
         return this;
      }

      public cp.d a(cpj $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public cp.d a(Optional<bo> $$0) {
         this.f = $$0;
         return this;
      }

      public cp.d b(aer $$0, boolean $$1) {
         this.e.put($$0, new cp.b($$1));
         return this;
      }

      public cp.d a(aer $$0, Map<String, Boolean> $$1) {
         this.e.put($$0, new cp.a(new Object2BooleanOpenHashMap($$1)));
         return this;
      }

      public cp b() {
         return new cp(this.a, this.b, this.c.build(), this.d, this.e, this.f);
      }
   }

   static record e<T>(apf<T> b, he<T> c, cj.d d, Supplier<apd<T>> e) {
      public static final Codec<cp.e<?>> a = jb.y.q().dispatch(cp.e::a, cp.e::a);

      public e(apf<T> $$0, he<T> $$1, cj.d $$2) {
         this($$0, $$1, $$2, Suppliers.memoize(() -> $$0.b($$1.a())));
      }

      private static <T> Codec<cp.e<T>> a(apf<T> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.a().r().fieldOf("stat").forGetter(cp.e::b), aqy.a(cj.d.d, "value", cj.d.c).forGetter(cp.e::c))
                  .apply($$1, ($$1x, $$2) -> new cp.e<>($$0, $$1x, $$2))
         );
      }

      public boolean a(aph $$0) {
         return this.d.d($$0.a(this.e.get()));
      }

      public apf<T> a() {
         return this.b;
      }

      public he<T> b() {
         return this.c;
      }

      public cj.d c() {
         return this.d;
      }

      public Supplier<apd<T>> d() {
         return this.e;
      }
   }
}
