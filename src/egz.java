import java.util.Optional;
import javax.annotation.Nullable;

public abstract class egz extends egu {
   public static final float e = 0.44444445F;

   @Override
   public egv d() {
      return egx.d;
   }

   @Override
   public egv e() {
      return egx.e;
   }

   @Override
   public coy a() {
      return cpg.qz;
   }

   @Override
   public void a(cvr $$0, hz $$1, egw $$2, awp $$3) {
      hz $$4 = $$1.c();
      if ($$0.a_($$4).i() && !$$0.a_($$4).i($$0, $$4)) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(jz.V, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, atl.nt, atm.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), atl.nr, atm.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void b(cvr $$0, hz $$1, egw $$2, awp $$3) {
      if ($$0.Z().b(cvn.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            hz $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.p($$5)) {
                  return;
               }

               dlj $$7 = $$0.a_($$5);
               if ($$7.i()) {
                  if (this.a((cvu)$$0, $$5)) {
                     $$0.b($$5, cyf.a($$0, $$5));
                     return;
                  }
               } else if ($$7.d()) {
                  return;
               }
            }
         } else {
            for (int $$8 = 0; $$8 < 3; $$8++) {
               hz $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
               if (!$$0.p($$9)) {
                  return;
               }

               if ($$0.u($$9.c()) && this.b($$0, $$9)) {
                  $$0.b($$9.c(), cyf.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(cvu $$0, hz $$1) {
      for (ie $$2 : ie.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(cvu $$0, hz $$1) {
      return $$1.v() >= $$0.J_() && $$1.v() < $$0.ak() && !$$0.B($$1) ? false : $$0.a_($$1).j();
   }

   @Nullable
   @Override
   public jx h() {
      return jz.j;
   }

   @Override
   protected void a(cvs $$0, hz $$1, dlj $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(cvu $$0) {
      return $$0.E_().i() ? 4 : 2;
   }

   @Override
   public dlj b(egw $$0) {
      return cyu.H.o().a(ddh.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(egv $$0) {
      return $$0 == egx.e || $$0 == egx.d;
   }

   @Override
   public int c(cvu $$0) {
      return $$0.E_().i() ? 1 : 2;
   }

   @Override
   public boolean a(egw $$0, cux $$1, hz $$2, egv $$3, ie $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(auf.a);
   }

   @Override
   public int a(cvu $$0) {
      return $$0.E_().i() ? 10 : 30;
   }

   @Override
   public int a(cvr $$0, hz $$1, egw $$2, egw $$3) {
      int $$4 = this.a((cvu)$$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a((cux)$$0, $$1) > $$2.a((cux)$$0, $$1) && $$0.F_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(cvs $$0, hz $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(cvr $$0) {
      return $$0.Z().b(cvn.V);
   }

   @Override
   protected void a(cvs $$0, hz $$1, dlj $$2, ie $$3, egw $$4) {
      if ($$3 == ie.a) {
         egw $$5 = $$0.b_($$1);
         if (this.a(auf.b) && $$5.a(auf.a)) {
            if ($$2.b() instanceof ddh) {
               $$0.a($$1, cyu.b.o(), 3);
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
   public Optional<atk> j() {
      return Optional.of(atl.dd);
   }

   public static class a extends egz {
      @Override
      protected void a(dlk.a<egv, egw> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(egw $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(egw $$0) {
         return false;
      }
   }

   public static class b extends egz {
      @Override
      public int d(egw $$0) {
         return 8;
      }

      @Override
      public boolean c(egw $$0) {
         return true;
      }
   }
}
