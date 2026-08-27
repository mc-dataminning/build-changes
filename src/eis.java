import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eis extends ein {
   public static final float e = 0.44444445F;

   @Override
   public eio d() {
      return eiq.d;
   }

   @Override
   public eio e() {
      return eiq.e;
   }

   @Override
   public cqh a() {
      return cqp.qz;
   }

   @Override
   public void a(cxb $$0, ib $$1, eip $$2, axd $$3) {
      ib $$4 = $$1.c();
      if ($$0.a_($$4).i() && !$$0.a_($$4).i($$0, $$4)) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(kc.W, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, aty.nA, atz.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), aty.ny, atz.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void b(cxb $$0, ib $$1, eip $$2, axd $$3) {
      if ($$0.Z().b(cwx.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            ib $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.p($$5)) {
                  return;
               }

               dnb $$7 = $$0.a_($$5);
               if ($$7.i()) {
                  if (this.a((cxe)$$0, $$5)) {
                     $$0.b($$5, czp.a($$0, $$5));
                     return;
                  }
               } else if ($$7.d()) {
                  return;
               }
            }
         } else {
            for (int $$8 = 0; $$8 < 3; $$8++) {
               ib $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
               if (!$$0.p($$9)) {
                  return;
               }

               if ($$0.u($$9.c()) && this.b($$0, $$9)) {
                  $$0.b($$9.c(), czp.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(cxe $$0, ib $$1) {
      for (ih $$2 : ih.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(cxe $$0, ib $$1) {
      return $$1.v() >= $$0.I_() && $$1.v() < $$0.ak() && !$$0.B($$1) ? false : $$0.a_($$1).j();
   }

   @Nullable
   @Override
   public ka h() {
      return kc.j;
   }

   @Override
   protected void a(cxc $$0, ib $$1, dnb $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(cxe $$0) {
      return $$0.D_().i() ? 4 : 2;
   }

   @Override
   public dnb b(eip $$0) {
      return dae.H.o().a(der.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(eio $$0) {
      return $$0 == eiq.e || $$0 == eiq.d;
   }

   @Override
   public int c(cxe $$0) {
      return $$0.D_().i() ? 1 : 2;
   }

   @Override
   public boolean a(eip $$0, cwh $$1, ib $$2, eio $$3, ih $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(aus.a);
   }

   @Override
   public int a(cxe $$0) {
      return $$0.D_().i() ? 10 : 30;
   }

   @Override
   public int a(cxb $$0, ib $$1, eip $$2, eip $$3) {
      int $$4 = this.a((cxe)$$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a((cwh)$$0, $$1) > $$2.a((cwh)$$0, $$1) && $$0.E_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(cxc $$0, ib $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(cxb $$0) {
      return $$0.Z().b(cwx.V);
   }

   @Override
   protected void a(cxc $$0, ib $$1, dnb $$2, ih $$3, eip $$4) {
      if ($$3 == ih.a) {
         eip $$5 = $$0.b_($$1);
         if (this.a(aus.b) && $$5.a(aus.a)) {
            if ($$2.b() instanceof der) {
               $$0.a($$1, dae.b.o(), 3);
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
   public Optional<atx> j() {
      return Optional.of(aty.dk);
   }

   public static class a extends eis {
      @Override
      protected void a(dnc.a<eio, eip> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(eip $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(eip $$0) {
         return false;
      }
   }

   public static class b extends eis {
      @Override
      public int d(eip $$0) {
         return 8;
      }

      @Override
      public boolean c(eip $$0) {
         return true;
      }
   }
}
