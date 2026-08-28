import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class dfp extends djs implements dio {
   public static final MapCodec<dfp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ctg.q.fieldOf("color").forGetter(dfp::b), u()).apply($$0, dfp::new));
   public static final dty<dtn> b = dtq.bb;
   public static final dtr c = dtq.t;
   protected static final int d = 9;
   protected static final exp e = dfw.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final exp f = dfw.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final exp g = dfw.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final exp h = dfw.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final exp i = dfw.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final exp j = exm.a(e, f, h);
   protected static final exp k = exm.a(e, g, i);
   protected static final exp l = exm.a(e, f, g);
   protected static final exp m = exm.a(e, h, i);
   private final ctg o;

   @Override
   public MapCodec<dfp> a() {
      return a;
   }

   public dfp(ctg $$0, dsz.d $$1) {
      super($$1);
      this.o = $$0;
      this.k(this.E.b().a(b, dtn.b).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static ji a(dca $$0, jd $$1) {
      dta $$2 = $$0.a_($$1);
      return $$2.b() instanceof dfp ? $$2.c(aE) : null;
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      if ($$1.B) {
         return bqq.c;
      } else {
         if ($$0.c(b) != dtn.a) {
            $$2 = $$2.a($$0.c(aE));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bqq.c;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            jd $$5 = $$2.a($$0.c(aE).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            eww $$6 = $$2.b();
            $$1.a(null, $$1.aj().a($$6), null, $$6, 5.0F, true, dcu.a.b);
            return bqq.a;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(wy.c("block.minecraft.bed.occupied"), true);
            }

            return bqq.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bqq.a;
         }
      }
   }

   public static boolean a(dcu $$0) {
      return $$0.D_().l();
   }

   private boolean a(dcu $$0, jd $$1) {
      List<cmi> $$2 = $$0.a(cmi.class, new ewr($$1), btl::fI);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fJ();
         return true;
      }
   }

   @Override
   public void a(dcu $$0, dta $$1, jd $$2, bsq $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(dca $$0, bsq $$1) {
      if ($$1.bY()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bsq $$0) {
      eww $$1 = $$0.dt();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof btl ? 1.0 : 0.8;
         $$0.n($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$1 == a($$0.c(b), $$0.c(aE))) {
         return $$2.a(this) && $$2.c(b) != $$0.c(b) ? $$0.a(c, $$2.c(c)) : dfy.a.o();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static ji a(dtn $$0, ji $$1) {
      return $$0 == dtn.b ? $$1 : $$1.g();
   }

   @Override
   public dta a(dcu $$0, jd $$1, dta $$2, cmv $$3) {
      if (!$$0.B && $$3.f()) {
         dtn $$4 = $$2.c(b);
         if ($$4 == dtn.b) {
            jd $$5 = $$1.a(a($$4, $$2.c(aE)));
            dta $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dtn.a) {
               $$0.a($$5, dfy.a.o(), 35);
               $$0.a($$3, 2001, $$5, dfw.i($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dta a(cyb $$0) {
      ji $$1 = $$0.g();
      jd $$2 = $$0.a();
      jd $$3 = $$2.a($$1);
      dcu $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.C_().a($$3) ? this.o().a(aE, $$1) : null;
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      ji $$4 = g($$0).g();
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

   public static ji g(dta $$0) {
      ji $$1 = $$0.c(aE);
      return $$0.c(b) == dtn.a ? $$1.g() : $$1;
   }

   public static did.a h(dta $$0) {
      dtn $$1 = $$0.c(b);
      return $$1 == dtn.a ? did.a.b : did.a.c;
   }

   private static boolean b(dca $$0, jd $$1) {
      return $$0.a_($$1.d()).b() instanceof dfp;
   }

   public static Optional<eww> a(bsw<?> $$0, dce $$1, jd $$2, ji $$3, float $$4) {
      ji $$5 = $$3.h();
      ji $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<eww> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<eww> a(bsw<?> $$0, dce $$1, jd $$2, ji $$3, ji $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<eww> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         jd $$7 = $$2.d();
         Optional<eww> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<eww> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<eww> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<eww> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<eww> a(bsw<?> $$0, dce $$1, jd $$2, int[][] $$3, boolean $$4) {
      jd.a $$5 = new jd.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         eww $$7 = cow.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected dmd a_(dta $$0) {
      return dmd.b;
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(aE, b, c);
   }

   @Override
   public dqf a(jd $$0, dta $$1) {
      return new dqb($$0, $$1, this.o);
   }

   @Override
   public void a(dcu $$0, jd $$1, dta $$2, @Nullable btl $$3, cuo $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         jd $$5 = $$1.a($$2.c(aE));
         $$0.a($$5, $$2.a(b, dtn.a), 3);
         $$0.b($$1, dfy.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public ctg b() {
      return this.o;
   }

   @Override
   protected long a(dta $$0, jd $$1) {
      jd $$2 = $$1.a($$0.c(aE), $$0.c(b) == dtn.a ? 0 : 1);
      return ayn.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }

   private static int[][] a(ji $$0, ji $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(ji $$0, ji $$1) {
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

   private static int[][] a(ji $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
