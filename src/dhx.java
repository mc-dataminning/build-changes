import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class dhx extends dlz implements dkw {
   public static final MapCodec<dhx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cuy.q.fieldOf("color").forGetter(dhx::b), t()).apply($$0, dhx::new));
   public static final dwh<dvw> b = dvz.bb;
   public static final dwa c = dvz.t;
   protected static final int d = 9;
   protected static final fah e = die.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final fah f = die.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final fah g = die.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final fah h = die.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final fah i = die.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final fah j = fae.a(e, f, h);
   protected static final fah k = fae.a(e, g, i);
   protected static final fah l = fae.a(e, f, g);
   protected static final fah m = fae.a(e, h, i);
   private final cuy o;

   @Override
   public MapCodec<dhx> a() {
      return a;
   }

   public dhx(cuy $$0, dvi.d $$1) {
      super($$1);
      this.o = $$0;
      this.l(this.F.b().b(b, dvw.b).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static jm a(deg $$0, jh $$1) {
      dvj $$2 = $$0.a_($$1);
      return $$2.b() instanceof dhx ? $$2.c(aF) : null;
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      if ($$1.C) {
         return bsd.b;
      } else {
         if ($$0.c(b) != dvw.a) {
            $$2 = $$2.a($$0.c(aF));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bsd.c;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            jh $$5 = $$2.a($$0.c(aF).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            ezn $$6 = $$2.b();
            $$1.a(null, $$1.ai().a($$6), null, $$6, 5.0F, true, dfb.a.b);
            return bsd.b;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(xi.c("block.minecraft.bed.occupied"), true);
            }

            return bsd.b;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bsd.b;
         }
      }
   }

   public static boolean a(dfb $$0) {
      return $$0.D_().l();
   }

   private boolean a(dfb $$0, jh $$1) {
      List<cny> $$2 = $$0.a(cny.class, new ezi($$1), bva::fT);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fU();
         return true;
      }
   }

   @Override
   public void a(dfb $$0, dvj $$1, jh $$2, bue $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(deg $$0, bue $$1) {
      if ($$1.cg()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bue $$0) {
      ezn $$1 = $$0.dA();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof bva ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * 0.66F * $$2, $$1.f);
      }
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$1 == a($$0.c(b), $$0.c(aF))) {
         return $$2.a(this) && $$2.c(b) != $$0.c(b) ? $$0.b(c, $$2.c(c)) : dig.a.m();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static jm a(dvw $$0, jm $$1) {
      return $$0 == dvw.b ? $$1 : $$1.g();
   }

   @Override
   public dvj a(dfb $$0, jh $$1, dvj $$2, com $$3) {
      if (!$$0.C && $$3.f()) {
         dvw $$4 = $$2.c(b);
         if ($$4 == dvw.b) {
            jh $$5 = $$1.a(a($$4, $$2.c(aF)));
            dvj $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dvw.a) {
               $$0.a($$5, dig.a.m(), 35);
               $$0.a($$3, 2001, $$5, die.j($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dvj a(czs $$0) {
      jm $$1 = $$0.g();
      jh $$2 = $$0.a();
      jh $$3 = $$2.a($$1);
      dfb $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.C_().a($$3) ? this.m().b(aF, $$1) : null;
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      jm $$4 = h($$0).g();
      switch ($$4) {
         case c:
            return j;
         case d:
            return k;
         case e:
            return l;
         default:
            return m;
      }
   }

   public static jm h(dvj $$0) {
      jm $$1 = $$0.c(aF);
      return $$0.c(b) == dvw.a ? $$1.g() : $$1;
   }

   public static dkl.a i(dvj $$0) {
      dvw $$1 = $$0.c(b);
      return $$1 == dvw.a ? dkl.a.b : dkl.a.c;
   }

   private static boolean b(deg $$0, jh $$1) {
      return $$0.a_($$1.e()).b() instanceof dhx;
   }

   public static Optional<ezn> a(bul<?> $$0, dek $$1, jh $$2, jm $$3, float $$4) {
      jm $$5 = $$3.h();
      jm $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<ezn> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<ezn> a(bul<?> $$0, dek $$1, jh $$2, jm $$3, jm $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<ezn> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         jh $$7 = $$2.e();
         Optional<ezn> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<ezn> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<ezn> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<ezn> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<ezn> a(bul<?> $$0, dek $$1, jh $$2, int[][] $$3, boolean $$4) {
      jh.a $$5 = new jh.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         ezn $$7 = cqp.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected dok a_(dvj $$0) {
      return dok.b;
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(aF, b, c);
   }

   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new dsi($$0, $$1, this.o);
   }

   @Override
   public void a(dfb $$0, jh $$1, dvj $$2, @Nullable bva $$3, cwb $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.C) {
         jh $$5 = $$1.a($$2.c(aF));
         $$0.a($$5, $$2.b(b, dvw.a), 3);
         $$0.b($$1, dig.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cuy b() {
      return this.o;
   }

   @Override
   protected long a(dvj $$0, jh $$1) {
      jh $$2 = $$1.a($$0.c(aF), $$0.c(b) == dvw.a ? 0 : 1);
      return azk.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }

   private static int[][] a(jm $$0, jm $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(jm $$0, jm $$1) {
      return new int[][]{
         {$$1.j(), $$1.l()},
         {$$1.j() - $$0.j(), $$1.l() - $$0.l()},
         {$$1.j() - $$0.j() * 2, $$1.l() - $$0.l() * 2},
         {-$$0.j() * 2, -$$0.l() * 2},
         {-$$1.j() - $$0.j() * 2, -$$1.l() - $$0.l() * 2},
         {-$$1.j() - $$0.j(), -$$1.l() - $$0.l()},
         {-$$1.j(), -$$1.l()},
         {-$$1.j() + $$0.j(), -$$1.l() + $$0.l()},
         {$$0.j(), $$0.l()},
         {$$1.j() + $$0.j(), $$1.l() + $$0.l()}
      };
   }

   private static int[][] a(jm $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
