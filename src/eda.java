import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eda extends ecv {
   public static final float e = 0.44444445F;

   @Override
   public ecw d() {
      return ecy.d;
   }

   @Override
   public ecw e() {
      return ecy.e;
   }

   @Override
   public clj a() {
      return clr.qx;
   }

   @Override
   public void a(csf $$0, hx $$1, ecx $$2, atw $$3) {
      hx $$4 = $$1.c();
      if ($$0.a_($$4).i() && !$$0.a_($$4).i($$0, $$4)) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(jw.T, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, aqv.mJ, aqw.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), aqv.mH, aqw.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void b(csf $$0, hx $$1, ecx $$2, atw $$3) {
      if ($$0.Y().b(csb.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            hx $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.o($$5)) {
                  return;
               }

               dhn $$7 = $$0.a_($$5);
               if ($$7.i()) {
                  if (this.a((csi)$$0, $$5)) {
                     $$0.b($$5, cus.a($$0, $$5));
                     return;
                  }
               } else if ($$7.d()) {
                  return;
               }
            }
         } else {
            for (int $$8 = 0; $$8 < 3; $$8++) {
               hx $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
               if (!$$0.o($$9)) {
                  return;
               }

               if ($$0.t($$9.c()) && this.b($$0, $$9)) {
                  $$0.b($$9.c(), cus.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(csi $$0, hx $$1) {
      for (ib $$2 : ib.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(csi $$0, hx $$1) {
      return $$1.v() >= $$0.J_() && $$1.v() < $$0.ak() && !$$0.A($$1) ? false : $$0.a_($$1).j();
   }

   @Nullable
   @Override
   public ju h() {
      return jw.j;
   }

   @Override
   protected void a(csg $$0, hx $$1, dhn $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(csi $$0) {
      return $$0.E_().i() ? 4 : 2;
   }

   @Override
   public dhn b(ecx $$0) {
      return cvh.H.o().a(czu.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(ecw $$0) {
      return $$0 == ecy.e || $$0 == ecy.d;
   }

   @Override
   public int c(csi $$0) {
      return $$0.E_().i() ? 1 : 2;
   }

   @Override
   public boolean a(ecx $$0, crl $$1, hx $$2, ecw $$3, ib $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(arp.a);
   }

   @Override
   public int a(csi $$0) {
      return $$0.E_().i() ? 10 : 30;
   }

   @Override
   public int a(csf $$0, hx $$1, ecx $$2, ecx $$3) {
      int $$4 = this.a((csi)$$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a((crl)$$0, $$1) > $$2.a((crl)$$0, $$1) && $$0.F_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(csg $$0, hx $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(csf $$0) {
      return $$0.Y().b(csb.V);
   }

   @Override
   protected void a(csg $$0, hx $$1, dhn $$2, ib $$3, ecx $$4) {
      if ($$3 == ib.a) {
         ecx $$5 = $$0.b_($$1);
         if (this.a(arp.b) && $$5.a(arp.a)) {
            if ($$2.b() instanceof czu) {
               $$0.a($$1, cvh.b.o(), 3);
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
   public Optional<aqu> j() {
      return Optional.of(aqv.cE);
   }

   public static class a extends eda {
      @Override
      protected void a(dho.a<ecw, ecx> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(ecx $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(ecx $$0) {
         return false;
      }
   }

   public static class b extends eda {
      @Override
      public int d(ecx $$0) {
         return 8;
      }

      @Override
      public boolean c(ecx $$0) {
         return true;
      }
   }
}
