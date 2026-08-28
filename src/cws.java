import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;

public record cws(Optional<ji<cwq>> d, Optional<Integer> e, List<bse> f) {
   public static final cws a = new cws(Optional.empty(), Optional.empty(), List.of());
   private static final xp g = xp.c("effect.none").a(n.h);
   private static final int h = -524040;
   private static final int i = -13083194;
   private static final Codec<cws> j = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               lp.i.r().optionalFieldOf("potion").forGetter(cws::e),
               Codec.INT.optionalFieldOf("custom_color").forGetter(cws::f),
               bse.d.listOf().optionalFieldOf("custom_effects", List.of()).forGetter(cws::d)
            )
            .apply($$0, cws::new)
   );
   public static final Codec<cws> b = Codec.withAlternative(j, lp.i.r(), cws::new);
   public static final zn<xa, cws> c = zn.a(zl.b(lq.Y).a(zl::a), cws::e, zl.f.a(zl::a), cws::f, bse.e.a(zl.a()), cws::d, cws::new);

   public cws(ji<cwq> $$0) {
      this(Optional.of($$0), Optional.empty(), List.of());
   }

   public static cur a(cum $$0, ji<cwq> $$1) {
      cur $$2 = new cur($$0);
      $$2.b(km.G, new cws($$1));
      return $$2;
   }

   public boolean a(ji<cwq> $$0) {
      return this.d.isPresent() && this.d.get().a($$0) && this.f.isEmpty();
   }

   public Iterable<bse> a() {
      if (this.d.isEmpty()) {
         return this.f;
      } else {
         return (Iterable<bse>)(this.f.isEmpty() ? this.d.get().a().a() : Iterables.concat(this.d.get().a().a(), this.f));
      }
   }

   public void a(Consumer<bse> $$0) {
      if (this.d.isPresent()) {
         for (bse $$1 : this.d.get().a().a()) {
            $$0.accept(new bse($$1));
         }
      }

      for (bse $$2 : this.f) {
         $$0.accept(new bse($$2));
      }
   }

   public cws b(ji<cwq> $$0) {
      return new cws(Optional.of($$0), this.e, this.f);
   }

   public cws a(bse $$0) {
      return new cws(this.d, this.e, ac.a(this.f, $$0));
   }

   public int b() {
      return this.e.isPresent() ? this.e.get() : a(this.a());
   }

   public static int c(ji<cwq> $$0) {
      return a($$0.a().a());
   }

   public static int a(Iterable<bse> $$0) {
      return b($$0).orElse(-13083194);
   }

   public static OptionalInt b(Iterable<bse> $$0) {
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (bse $$5 : $$0) {
         if ($$5.g()) {
            int $$6 = $$5.c().a().g();
            int $$7 = $$5.e() + 1;
            $$1 += $$7 * ayj.b.b($$6);
            $$2 += $$7 * ayj.b.c($$6);
            $$3 += $$7 * ayj.b.d($$6);
            $$4 += $$7;
         }
      }

      return $$4 == 0 ? OptionalInt.empty() : OptionalInt.of(ayj.b.a($$1 / $$4, $$2 / $$4, $$3 / $$4));
   }

   public boolean c() {
      return !this.f.isEmpty() ? true : this.d.isPresent() && !this.d.get().a().a().isEmpty();
   }

   public List<bse> d() {
      return Lists.transform(this.f, bse::new);
   }

   public void a(Consumer<xp> $$0, float $$1, float $$2) {
      a(this.a(), $$0, $$1, $$2);
   }

   public static void a(Iterable<bse> $$0, Consumer<xp> $$1, float $$2, float $$3) {
      List<Pair<ji<buu>, bux>> $$4 = Lists.newArrayList();
      boolean $$5 = true;

      for (bse $$6 : $$0) {
         $$5 = false;
         yd $$7 = xp.c($$6.i());
         ji<bsc> $$8 = $$6.c();
         $$8.a().a($$6.e(), ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
         if ($$6.e() > 0) {
            $$7 = xp.a("potion.withAmplifier", $$7, xp.c("potion.potency." + $$6.e()));
         }

         if (!$$6.a(20)) {
            $$7 = xp.a("potion.withDuration", $$7, bsf.a($$6, $$2, $$3));
         }

         $$1.accept($$7.a($$8.a().f().a()));
      }

      if ($$5) {
         $$1.accept(g);
      }

      if (!$$4.isEmpty()) {
         $$1.accept(xo.a);
         $$1.accept(xp.c("potion.whenDrank").a(n.f));

         for (Pair<ji<buu>, bux> $$9 : $$4) {
            bux $$10 = (bux)$$9.getSecond();
            double $$11 = $$10.d();
            double $$13;
            if ($$10.e() != bux.a.b && $$10.e() != bux.a.c) {
               $$13 = $$10.d();
            } else {
               $$13 = $$10.d() * 100.0;
            }

            if ($$11 > 0.0) {
               $$1.accept(xp.a("attribute.modifier.plus." + $$10.e().a(), cxm.d.format($$13), xp.c(((buu)((ji)$$9.getFirst()).a()).c())).a(n.j));
            } else if ($$11 < 0.0) {
               $$13 *= -1.0;
               $$1.accept(xp.a("attribute.modifier.take." + $$10.e().a(), cxm.d.format($$13), xp.c(((buu)((ji)$$9.getFirst()).a()).c())).a(n.m));
            }
         }
      }
   }

   public Optional<ji<cwq>> e() {
      return this.d;
   }

   public Optional<Integer> f() {
      return this.e;
   }
}
