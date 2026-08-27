import javax.annotation.Nullable;

public class dbb extends csk {
   public static final int a = 2;
   public static final int b = 1;
   public static final int c = 4;
   private static final ehy f = csk.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final ehy g = csk.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final dfy d = dfo.aE;
   public static final dfy e = dfo.aD;

   public dbb(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(d, Integer.valueOf(0)).a(e, Integer.valueOf(1)));
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, big $$3) {
      if (!$$3.bS()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cpk $$0, dey $$1, gv $$2, big $$3, float $$4) {
      if (!($$3 instanceof bzs)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(cpk $$0, dey $$1, gv $$2, big $$3, int $$4) {
      if (this.a($$0, $$3)) {
         if (!$$0.B && $$0.z.a($$4) == 0 && $$1.a(csl.mf)) {
            this.a($$0, $$2, $$1);
         }
      }
   }

   private void a(cpk $$0, gv $$1, dey $$2) {
      $$0.a(null, $$1, aou.yg, aov.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      int $$3 = $$2.c(e);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.a(e, Integer.valueOf($$3 - 1)), 2);
         $$0.a(dji.f, $$1, dji.a.a($$2));
         $$0.c(2001, $$1, csk.i($$2));
      }
   }

   @Override
   public void b(dey $$0, aki $$1, gv $$2, art $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(d);
         if ($$4 < 2) {
            $$1.a(null, $$2, aou.yh, aov.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.a(d, Integer.valueOf($$4 + 1)), 2);
         } else {
            $$1.a(null, $$2, aou.yi, aov.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);

            for (int $$5 = 0; $$5 < $$0.c(e); $$5++) {
               $$1.c(2001, $$2, csk.i($$0));
               bvj $$6 = bik.bd.a((cpk)$$1);
               if ($$6 != null) {
                  $$6.c_(-24000);
                  $$6.i($$2);
                  $$6.b((double)$$2.u() + 0.3 + (double)$$5 * 0.2, (double)$$2.v(), (double)$$2.w() + 0.3, 0.0F, 0.0F);
                  $$1.b($$6);
               }
            }
         }
      }
   }

   public static boolean a(coq $$0, gv $$1) {
      return b($$0, $$1.d());
   }

   public static boolean b(coq $$0, gv $$1) {
      return $$0.a_($$1).a(apj.H);
   }

   @Override
   public void b(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.B) {
         $$1.c(2005, $$2, 0);
      }
   }

   private boolean a(cpk $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.z.a(500) == 0;
   }

   @Override
   public void a(cpk $$0, cbl $$1, gv $$2, dey $$3, @Nullable dck $$4, ciw $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   public boolean a(dey $$0, cle $$1) {
      return !$$1.h() && $$1.n().a(this.k()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dey a(cle $$0) {
      dey $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : super.a($$0);
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return $$0.c(e) > 1 ? g : f;
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(d, e);
   }

   private boolean a(cpk $$0, big $$1) {
      if ($$1 instanceof bvj || $$1 instanceof bud) {
         return false;
      } else {
         return !($$1 instanceof biw) ? false : $$1 instanceof cbl || $$0.X().b(cpg.c);
      }
   }
}
