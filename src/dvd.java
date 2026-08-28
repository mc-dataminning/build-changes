import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import javax.annotation.Nullable;

public class dvd extends dkh {
   public static final MapCodec<dvd> b = b(dvd::new);
   public static final dwh<dwl> c = dvz.bg;
   public static final dwa d = dvz.x;
   public static final float e = 4.0F;
   protected static final fah f = die.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fah g = die.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final fah h = die.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final fah i = die.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final fah j = die.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fah k = die.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final fah o = die.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final fah G = die.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final fah H = die.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final fah I = die.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final fah J = die.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final fah K = die.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final fah L = die.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final fah M = die.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final fah N = die.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final fah O = die.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final fah P = die.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final fah Q = die.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final fah[] R = a(true);
   private static final fah[] S = a(false);

   @Override
   protected MapCodec<dvd> a() {
      return b;
   }

   private static fah[] a(boolean $$0) {
      return Arrays.stream(jm.values()).map($$1 -> a($$1, $$0)).toArray(fah[]::new);
   }

   private static fah a(jm $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return fae.a(k, $$1 ? M : G);
         case b:
            return fae.a(j, $$1 ? L : o);
         case c:
            return fae.a(i, $$1 ? O : I);
         case d:
            return fae.a(h, $$1 ? N : H);
         case e:
            return fae.a(g, $$1 ? Q : K);
         case f:
            return fae.a(f, $$1 ? P : J);
      }
   }

   public dvd(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jm.c).b(c, dwl.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dvj $$0) {
      return true;
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return ($$0.c(d) ? R : S)[$$0.c(a).ordinal()];
   }

   private boolean a(dvj $$0, dvj $$1) {
      die $$2 = $$0.c(c) == dwl.a ? dig.by : dig.br;
      return $$1.a($$2) && $$1.c(dvc.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dvj a(dfb $$0, jh $$1, dvj $$2, com $$3) {
      if (!$$0.C && $$3.gl().d) {
         jh $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         jh $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? dig.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      dvj $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dig.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, die $$3, @Nullable ess $$4, boolean $$5) {
      if ($$0.a((dfe)$$1, $$2)) {
         $$1.b($$2.a($$0.c(a).g()), $$3, eso.a($$4, $$0.c(a).g()));
      }
   }

   @Override
   public cwb a(dfe $$0, jh $$1, dvj $$2) {
      return new cwb($$2.c(c) == dwl.b ? dig.br : dig.by);
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }
}
