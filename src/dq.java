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

public record dq(di.d d, ce e, List<dq.e<?>> f, Object2BooleanMap<alh> g, Map<alh, dq.c> h, Optional<bv> i, Optional<cg> j) implements bw {
   public static final int b = 100;
   public static final MapCodec<dq> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               di.d.d.optionalFieldOf("level", di.d.c).forGetter(dq::b),
               ce.c.optionalFieldOf("gamemode", ce.a).forGetter(dq::c),
               dq.e.a.listOf().optionalFieldOf("stats", List.of()).forGetter(dq::d),
               ays.e(alh.a).optionalFieldOf("recipes", Object2BooleanMaps.emptyMap()).forGetter(dq::e),
               Codec.unboundedMap(alh.a, dq.c.b).optionalFieldOf("advancements", Map.of()).forGetter(dq::f),
               bv.a.optionalFieldOf("looking_at").forGetter(dq::g),
               cg.a.optionalFieldOf("input").forGetter(dq::h)
            )
            .apply($$0, dq::new)
   );

   @Override
   public boolean a(btz $$0, arm $$1, @Nullable ezh $$2) {
      if (!($$0 instanceof arn $$3)) {
         return false;
      } else if (!this.d.d($$3.cn)) {
         return false;
      } else if (!this.e.a($$3.f.b())) {
         return false;
      } else {
         awv $$5 = $$3.J();

         for (dq.e<?> $$6 : this.f) {
            if (!$$6.a($$5)) {
               return false;
            }
         }

         awn $$7 = $$3.K();
         ObjectIterator var13 = this.g.object2BooleanEntrySet().iterator();

         while (var13.hasNext()) {
            Entry<alh> $$8 = (Entry<alh>)var13.next();
            if ($$7.b((alh)$$8.getKey()) != $$8.getBooleanValue()) {
               return false;
            }
         }

         if (!this.h.isEmpty()) {
            alp $$9 = $$3.T();
            alu $$10 = $$3.cW().aD();

            for (java.util.Map.Entry<alh, dq.c> $$11 : this.h.entrySet()) {
               ag $$12 = $$10.a($$11.getKey());
               if ($$12 == null || !$$11.getValue().test($$9.b($$12))) {
                  return false;
               }
            }
         }

         if (this.i.isPresent()) {
            ezh $$13 = $$3.bG();
            ezh $$14 = $$3.g(1.0F);
            ezh $$15 = $$13.b($$14.d * 100.0, $$14.e * 100.0, $$14.f * 100.0);
            eze $$16 = cpd.a($$3.dX(), $$3, $$13, $$15, new ezc($$13, $$15).g(1.0), $$0x -> !$$0x.R_(), 0.0F);
            if ($$16 == null || $$16.d() != ezf.a.c) {
               return false;
            }

            btz $$17 = $$16.a();
            if (!this.i.get().a($$3, $$17) || !$$3.G($$17)) {
               return false;
            }
         }

         return !this.j.isPresent() || this.j.get().a($$3.aj());
      }
   }

   @Override
   public MapCodec<dq> a() {
      return bx.c;
   }

   public di.d b() {
      return this.d;
   }

   public ce c() {
      return this.e;
   }

   public List<dq.e<?>> d() {
      return this.f;
   }

   public Object2BooleanMap<alh> e() {
      return this.g;
   }

   public Map<alh, dq.c> f() {
      return this.h;
   }

   public Optional<bv> g() {
      return this.i;
   }

   public Optional<cg> h() {
      return this.j;
   }

   static record a(Object2BooleanMap<String> c) implements dq.c {
      public static final Codec<dq.a> a = ays.e(Codec.STRING).xmap(dq.a::new, dq.a::a);

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

   static record b(boolean c) implements dq.c {
      public static final Codec<dq.b> a = Codec.BOOL.xmap(dq.b::new, dq.b::a);

      public boolean a(ai $$0) {
         return $$0.a() == this.c;
      }

      public boolean a() {
         return this.c;
      }
   }

   interface c extends Predicate<ai> {
      Codec<dq.c> b = Codec.either(dq.b.a, dq.a.a).xmap(Either::unwrap, $$0 -> {
         if ($$0 instanceof dq.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof dq.a $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });
   }

   public static class d {
      private di.d a = di.d.c;
      private ce b = ce.a;
      private final Builder<dq.e<?>> c = ImmutableList.builder();
      private final Object2BooleanMap<alh> d = new Object2BooleanOpenHashMap();
      private final Map<alh, dq.c> e = Maps.newHashMap();
      private Optional<bv> f = Optional.empty();
      private Optional<cg> g = Optional.empty();

      public static dq.d a() {
         return new dq.d();
      }

      public dq.d a(di.d $$0) {
         this.a = $$0;
         return this;
      }

      public <T> dq.d a(awt<T> $$0, jp.c<T> $$1, di.d $$2) {
         this.c.add(new dq.e<>($$0, $$1, $$2));
         return this;
      }

      public dq.d a(alh $$0, boolean $$1) {
         this.d.put($$0, $$1);
         return this;
      }

      public dq.d a(ce $$0) {
         this.b = $$0;
         return this;
      }

      public dq.d a(bv.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public dq.d b(alh $$0, boolean $$1) {
         this.e.put($$0, new dq.b($$1));
         return this;
      }

      public dq.d a(alh $$0, Map<String, Boolean> $$1) {
         this.e.put($$0, new dq.a(new Object2BooleanOpenHashMap($$1)));
         return this;
      }

      public dq.d a(cg $$0) {
         this.g = Optional.of($$0);
         return this;
      }

      public dq b() {
         return new dq(this.a, this.b, this.c.build(), this.d, this.e, this.f, this.g);
      }
   }

   static record e<T>(awt<T> b, jp<T> c, di.d d, Supplier<awr<T>> e) {
      public static final Codec<dq.e<?>> a = lx.v.q().dispatch(dq.e::a, dq.e::a);

      public e(awt<T> $$0, jp<T> $$1, di.d $$2) {
         this($$0, $$1, $$2, Suppliers.memoize(() -> $$0.b($$1.a())));
      }

      private static <T> MapCodec<dq.e<T>> a(awt<T> $$0) {
         return RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group($$0.b().r().fieldOf("stat").forGetter(dq.e::b), di.d.d.optionalFieldOf("value", di.d.c).forGetter(dq.e::c))
                  .apply($$1, ($$1x, $$2) -> new dq.e<>($$0, $$1x, $$2))
         );
      }

      public boolean a(awv $$0) {
         return this.d.d($$0.a(this.e.get()));
      }

      public awt<T> a() {
         return this.b;
      }

      public jp<T> b() {
         return this.c;
      }

      public di.d c() {
         return this.d;
      }

      public Supplier<awr<T>> d() {
         return this.e;
      }
   }
}
