import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;

public record cyl(Optional<jq<cyj>> d, Optional<Integer> e, List<btq> f, Optional<String> g) implements cyt {
   public static final cyl a = new cyl(Optional.empty(), Optional.empty(), List.of(), Optional.empty());
   private static final xj h = xj.c("effect.none").a(n.h);
   private static final int i = -13083194;
   private static final Codec<cyl> j = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cyj.a.optionalFieldOf("potion").forGetter(cyl::e),
               Codec.INT.optionalFieldOf("custom_color").forGetter(cyl::f),
               btq.d.listOf().optionalFieldOf("custom_effects", List.of()).forGetter(cyl::d),
               Codec.STRING.optionalFieldOf("custom_name").forGetter(cyl::g)
            )
            .apply($$0, cyl::new)
   );
   public static final Codec<cyl> b = Codec.withAlternative(j, cyj.a, cyl::new);
   public static final zh<wu, cyl> c = zh.a(cyj.b.a(zf::a), cyl::e, zf.g.a(zf::a), cyl::f, btq.e.a(zf.a()), cyl::d, zf.n.a(zf::a), cyl::g, cyl::new);

   public cyl(jq<cyj> $$0) {
      this(Optional.of($$0), Optional.empty(), List.of(), Optional.empty());
   }

   public static cwm a(cwi $$0, jq<cyj> $$1) {
      cwm $$2 = new cwm($$0);
      $$2.b(ku.Q, new cyl($$1));
      return $$2;
   }

   public boolean a(jq<cyj> $$0) {
      return this.d.isPresent() && this.d.get().a($$0) && this.f.isEmpty();
   }

   public Iterable<btq> a() {
      if (this.d.isEmpty()) {
         return this.f;
      } else {
         return (Iterable<btq>)(this.f.isEmpty() ? this.d.get().a().a() : Iterables.concat(this.d.get().a().a(), this.f));
      }
   }

   public void a(Consumer<btq> $$0) {
      if (this.d.isPresent()) {
         for (btq $$1 : this.d.get().a().a()) {
            $$0.accept(new btq($$1));
         }
      }

      for (btq $$2 : this.f) {
         $$0.accept(new btq($$2));
      }
   }

   public cyl b(jq<cyj> $$0) {
      return new cyl(Optional.of($$0), this.e, this.f, this.g);
   }

   public cyl a(btq $$0) {
      return new cyl(this.d, this.e, ae.a(this.f, $$0), this.g);
   }

   public int b() {
      return this.e.isPresent() ? this.e.get() : a(this.a());
   }

   public static int c(jq<cyj> $$0) {
      return a($$0.a().a());
   }

   public static int a(Iterable<btq> $$0) {
      return b($$0).orElse(-13083194);
   }

   public xj a(String $$0) {
      String $$1 = this.g.or(() -> this.d.map($$0x -> ((cyj)$$0x.a()).b())).orElse("empty");
      return xj.c($$0 + $$1);
   }

   public static OptionalInt b(Iterable<btq> $$0) {
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (btq $$5 : $$0) {
         if ($$5.g()) {
            int $$6 = $$5.c().a().g();
            int $$7 = $$5.e() + 1;
            $$1 += $$7 * axx.b($$6);
            $$2 += $$7 * axx.c($$6);
            $$3 += $$7 * axx.d($$6);
            $$4 += $$7;
         }
      }

      return $$4 == 0 ? OptionalInt.empty() : OptionalInt.of(axx.a($$1 / $$4, $$2 / $$4, $$3 / $$4));
   }

   public boolean c() {
      return !this.f.isEmpty() ? true : this.d.isPresent() && !this.d.get().a().a().isEmpty();
   }

   public List<btq> d() {
      return Lists.transform(this.f, btq::new);
   }

   public void a(Consumer<xj> $$0, float $$1, float $$2) {
      a(this.a(), $$0, $$1, $$2);
   }

   public void a(bvh $$0) {
      if ($$0.dV() instanceof arp $$1) {
         cou $$4 = $$0 instanceof cou $$3 ? $$3 : null;
         this.a((Consumer<btq>)($$3x -> {
            if ($$3x.c().a().a()) {
               $$3x.c().a().a($$1, $$4, $$4, $$0, $$3x.e(), 1.0);
            } else {
               $$0.a($$3x);
            }
         }));
      }
   }

   public static void a(Iterable<btq> $$0, Consumer<xj> $$1, float $$2, float $$3) {
      List<Pair<jq<bwk>, bwn>> $$4 = Lists.newArrayList();
      boolean $$5 = true;

      for (btq $$6 : $$0) {
         $$5 = false;
         xx $$7 = xj.c($$6.i());
         jq<bto> $$8 = $$6.c();
         $$8.a().a($$6.e(), ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
         if ($$6.e() > 0) {
            $$7 = xj.a("potion.withAmplifier", $$7, xj.c("potion.potency." + $$6.e()));
         }

         if (!$$6.a(20)) {
            $$7 = xj.a("potion.withDuration", $$7, btr.a($$6, $$2, $$3));
         }

         $$1.accept($$7.a($$8.a().f().a()));
      }

      if ($$5) {
         $$1.accept(h);
      }

      if (!$$4.isEmpty()) {
         $$1.accept(xi.a);
         $$1.accept(xj.c("potion.whenDrank").a(n.f));

         for (Pair<jq<bwk>, bwn> $$9 : $$4) {
            bwn $$10 = (bwn)$$9.getSecond();
            double $$11 = $$10.c();
            double $$13;
            if ($$10.d() != bwn.a.b && $$10.d() != bwn.a.c) {
               $$13 = $$10.c();
            } else {
               $$13 = $$10.c() * 100.0;
            }

            if ($$11 > 0.0) {
               $$1.accept(xj.a("attribute.modifier.plus." + $$10.d().a(), czd.d.format($$13), xj.c(((bwk)((jq)$$9.getFirst()).a()).c())).a(n.j));
            } else if ($$11 < 0.0) {
               $$13 *= -1.0;
               $$1.accept(xj.a("attribute.modifier.take." + $$10.d().a(), czd.d.format($$13), xj.c(((bwk)((jq)$$9.getFirst()).a()).c())).a(n.m));
            }
         }
      }
   }

   @Override
   public void a(dfm $$0, bvh $$1, cwm $$2, cys $$3) {
      this.a($$1);
   }

   public Optional<jq<cyj>> e() {
      return this.d;
   }

   public Optional<Integer> f() {
      return this.e;
   }
}
