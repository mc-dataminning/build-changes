import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eph extends epc {
   public static final float e = 0.44444445F;

   @Override
   public epd d() {
      return epf.d;
   }

   @Override
   public epd e() {
      return epf.e;
   }

   @Override
   public cuc a() {
      return cuk.rX;
   }

   @Override
   public void a(dca $$0, ir $$1, epe $$2, ayt $$3) {
      ir $$4 = $$1.c();
      if ($$0.a_($$4).i() && !$$0.a_($$4).i($$0, $$4)) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(lb.W, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, avo.oh, avq.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), avo.of, avq.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void b(dca $$0, ir $$1, epe $$2, ayt $$3) {
      if ($$0.ab().b(dbw.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            ir $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.p($$5)) {
                  return;
               }

               dtc $$7 = $$0.a_($$5);
               if ($$7.i()) {
                  if (this.a((dcd)$$0, $$5)) {
                     $$0.b($$5, deo.a($$0, $$5));
                     return;
                  }
               } else if ($$7.d()) {
                  return;
               }
            }
         } else {
            for (int $$8 = 0; $$8 < 3; $$8++) {
               ir $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
               if (!$$0.p($$9)) {
                  return;
               }

               if ($$0.u($$9.c()) && this.b($$0, $$9)) {
                  $$0.b($$9.c(), deo.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(dcd $$0, ir $$1) {
      for (iw $$2 : iw.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(dcd $$0, ir $$1) {
      return $$1.v() >= $$0.J_() && $$1.v() < $$0.am() && !$$0.B($$1) ? false : $$0.a_($$1).j();
   }

   @Nullable
   @Override
   public kz h() {
      return lb.i;
   }

   @Override
   protected void a(dcb $$0, ir $$1, dtc $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(dcd $$0) {
      return $$0.E_().i() ? 4 : 2;
   }

   @Override
   public dtc b(epe $$0) {
      return dfe.am.n().a(djw.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(epd $$0) {
      return $$0 == epf.e || $$0 == epf.d;
   }

   @Override
   public int c(dcd $$0) {
      return $$0.E_().i() ? 1 : 2;
   }

   @Override
   public boolean a(epe $$0, dbg $$1, ir $$2, epd $$3, iw $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(awj.a);
   }

   @Override
   public int a(dcd $$0) {
      return $$0.E_().i() ? 10 : 30;
   }

   @Override
   public int a(dca $$0, ir $$1, epe $$2, epe $$3) {
      int $$4 = this.a((dcd)$$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a((dbg)$$0, $$1) > $$2.a((dbg)$$0, $$1) && $$0.F_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(dcb $$0, ir $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(dca $$0) {
      return $$0.ab().b(dbw.W);
   }

   @Override
   protected void a(dcb $$0, ir $$1, dtc $$2, iw $$3, epe $$4) {
      if ($$3 == iw.a) {
         epe $$5 = $$0.b_($$1);
         if (this.a(awj.b) && $$5.a(awj.a)) {
            if ($$2.b() instanceof djw) {
               $$0.a($$1, dfe.b.n(), 3);
            }

            this.a($$0, $$1);
            return;
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean i() {
      return true;
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<avn> j() {
      return Optional.of(avo.dq);
   }

   public static class a extends eph {
      @Override
      protected void a(dtd.a<epd, epe> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(epe $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(epe $$0) {
         return false;
      }
   }

   public static class b extends eph {
      @Override
      public int d(epe $$0) {
         return 8;
      }

      @Override
      public boolean c(epe $$0) {
         return true;
      }
   }
}
