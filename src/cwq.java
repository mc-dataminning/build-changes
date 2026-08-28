import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;

public record cwq(Optional<ji<cwo>> d, Optional<Integer> e, List<bsc> f) {
   public static final cwq a = new cwq(Optional.empty(), Optional.empty(), List.of());
   private static final xp g = xp.c("effect.none").a(n.h);
   private static final int h = -524040;
   private static final int i = -13083194;
   private static final Codec<cwq> j = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               lp.i.r().optionalFieldOf("potion").forGetter(cwq::e),
               Codec.INT.optionalFieldOf("custom_color").forGetter(cwq::f),
               bsc.d.listOf().optionalFieldOf("custom_effects", List.of()).forGetter(cwq::d)
            )
            .apply($$0, cwq::new)
   );
   public static final Codec<cwq> b = Codec.withAlternative(j, lp.i.r(), cwq::new);
   public static final zn<xa, cwq> c = zn.a(zl.b(lq.Y).a(zl::a), cwq::e, zl.f.a(zl::a), cwq::f, bsc.e.a(zl.a()), cwq::d, cwq::new);

   public cwq(ji<cwo> $$0) {
      this(Optional.of($$0), Optional.empty(), List.of());
   }

   public static cup a(cuk $$0, ji<cwo> $$1) {
      cup $$2 = new cup($$0);
      $$2.b(km.G, new cwq($$1));
      return $$2;
   }

   public boolean a(ji<cwo> $$0) {
      return this.d.isPresent() && this.d.get().a($$0) && this.f.isEmpty();
   }

   public Iterable<bsc> a() {
      if (this.d.isEmpty()) {
         return this.f;
      } else {
         return (Iterable<bsc>)(this.f.isEmpty() ? this.d.get().a().a() : Iterables.concat(this.d.get().a().a(), this.f));
      }
   }

   public void a(Consumer<bsc> $$0) {
      if (this.d.isPresent()) {
         for (bsc $$1 : this.d.get().a().a()) {
            $$0.accept(new bsc($$1));
         }
      }

      for (bsc $$2 : this.f) {
         $$0.accept(new bsc($$2));
      }
   }

   public cwq b(ji<cwo> $$0) {
      return new cwq(Optional.of($$0), this.e, this.f);
   }

   public cwq a(bsc $$0) {
      return new cwq(this.d, this.e, ac.a(this.f, $$0));
   }

   public int b() {
      return this.e.isPresent() ? this.e.get() : a(this.a());
   }

   public static int c(ji<cwo> $$0) {
      return a($$0.a().a());
   }

   public static int a(Iterable<bsc> $$0) {
      return b($$0).orElse(-13083194);
   }

   public static OptionalInt b(Iterable<bsc> $$0) {
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (bsc $$5 : $$0) {
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

   public List<bsc> d() {
      return Lists.transform(this.f, bsc::new);
   }

   public void a(Consumer<xp> $$0, float $$1, float $$2) {
      a(this.a(), $$0, $$1, $$2);
   }

   public static void a(Iterable<bsc> $$0, Consumer<xp> $$1, float $$2, float $$3) {
      List<Pair<ji<bus>, buv>> $$4 = Lists.newArrayList();
      boolean $$5 = true;

      for (bsc $$6 : $$0) {
         $$5 = false;
         yd $$7 = xp.c($$6.i());
         ji<bsa> $$8 = $$6.c();
         $$8.a().a($$6.e(), ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
         if ($$6.e() > 0) {
            $$7 = xp.a("potion.withAmplifier", $$7, xp.c("potion.potency." + $$6.e()));
         }

         if (!$$6.a(20)) {
            $$7 = xp.a("potion.withDuration", $$7, bsd.a($$6, $$2, $$3));
         }

         $$1.accept($$7.a($$8.a().f().a()));
      }

      if ($$5) {
         $$1.accept(g);
      }

      if (!$$4.isEmpty()) {
         $$1.accept(xo.a);
         $$1.accept(xp.c("potion.whenDrank").a(n.f));

         for (Pair<ji<bus>, buv> $$9 : $$4) {
            buv $$10 = (buv)$$9.getSecond();
            double $$11 = $$10.d();
            double $$13;
            if ($$10.e() != buv.a.b && $$10.e() != buv.a.c) {
               $$13 = $$10.d();
            } else {
               $$13 = $$10.d() * 100.0;
            }

            if ($$11 > 0.0) {
               $$1.accept(xp.a("attribute.modifier.plus." + $$10.e().a(), cxk.d.format($$13), xp.c(((bus)((ji)$$9.getFirst()).a()).c())).a(n.j));
            } else if ($$11 < 0.0) {
               $$13 *= -1.0;
               $$1.accept(xp.a("attribute.modifier.take." + $$10.e().a(), cxk.d.format($$13), xp.c(((bus)((ji)$$9.getFirst()).a()).c())).a(n.m));
            }
         }
      }
   }

   public Optional<ji<cwo>> e() {
      return this.d;
   }

   public Optional<Integer> f() {
      return this.e;
   }
}
