import java.util.Optional;
import javax.annotation.Nullable;

public abstract class elu extends elp {
   public static final float e = 0.44444445F;

   @Override
   public elq d() {
      return els.d;
   }

   @Override
   public elq e() {
      return els.e;
   }

   @Override
   public cry a() {
      return csg.qA;
   }

   @Override
   public void a(czu $$0, im $$1, elr $$2, ayd $$3) {
      im $$4 = $$1.c();
      if ($$0.a_($$4).i() && !$$0.a_($$4).i($$0, $$4)) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(kw.V, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, auz.nH, ava.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), auz.nF, ava.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void b(czu $$0, im $$1, elr $$2, ayd $$3) {
      if ($$0.aa().b(czq.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            im $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.p($$5)) {
                  return;
               }

               dpy $$7 = $$0.a_($$5);
               if ($$7.i()) {
                  if (this.a((czx)$$0, $$5)) {
                     $$0.b($$5, dci.a($$0, $$5));
                     return;
                  }
               } else if ($$7.d()) {
                  return;
               }
            }
         } else {
            for (int $$8 = 0; $$8 < 3; $$8++) {
               im $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
               if (!$$0.p($$9)) {
                  return;
               }

               if ($$0.u($$9.c()) && this.b($$0, $$9)) {
                  $$0.b($$9.c(), dci.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(czx $$0, im $$1) {
      for (ir $$2 : ir.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(czx $$0, im $$1) {
      return $$1.v() >= $$0.I_() && $$1.v() < $$0.al() && !$$0.B($$1) ? false : $$0.a_($$1).j();
   }

   @Nullable
   @Override
   public ku h() {
      return kw.i;
   }

   @Override
   protected void a(czv $$0, im $$1, dpy $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(czx $$0) {
      return $$0.D_().i() ? 4 : 2;
   }

   @Override
   public dpy b(elr $$0) {
      return dcx.H.n().a(dhl.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(elq $$0) {
      return $$0 == els.e || $$0 == els.d;
   }

   @Override
   public int c(czx $$0) {
      return $$0.D_().i() ? 1 : 2;
   }

   @Override
   public boolean a(elr $$0, cza $$1, im $$2, elq $$3, ir $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(avt.a);
   }

   @Override
   public int a(czx $$0) {
      return $$0.D_().i() ? 10 : 30;
   }

   @Override
   public int a(czu $$0, im $$1, elr $$2, elr $$3) {
      int $$4 = this.a((czx)$$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a((cza)$$0, $$1) > $$2.a((cza)$$0, $$1) && $$0.E_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(czv $$0, im $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(czu $$0) {
      return $$0.aa().b(czq.V);
   }

   @Override
   protected void a(czv $$0, im $$1, dpy $$2, ir $$3, elr $$4) {
      if ($$3 == ir.a) {
         elr $$5 = $$0.b_($$1);
         if (this.a(avt.b) && $$5.a(avt.a)) {
            if ($$2.b() instanceof dhl) {
               $$0.a($$1, dcx.b.n(), 3);
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
   public Optional<auy> j() {
      return Optional.of(auz.dl);
   }

   public static class a extends elu {
      @Override
      protected void a(dpz.a<elq, elr> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(elr $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(elr $$0) {
         return false;
      }
   }

   public static class b extends elu {
      @Override
      public int d(elr $$0) {
         return 8;
      }

      @Override
      public boolean c(elr $$0) {
         return true;
      }
   }
}
