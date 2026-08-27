import java.util.Optional;
import javax.annotation.Nullable;

public abstract class egs extends egn {
   public static final float e = 0.44444445F;

   @Override
   public ego d() {
      return egq.d;
   }

   @Override
   public ego e() {
      return egq.e;
   }

   @Override
   public cou a() {
      return cpc.qz;
   }

   @Override
   public void a(cvn $$0, hz $$1, egp $$2, awo $$3) {
      hz $$4 = $$1.c();
      if ($$0.a_($$4).i() && !$$0.a_($$4).i($$0, $$4)) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(jz.V, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, atk.ns, atl.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), atk.nq, atl.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void b(cvn $$0, hz $$1, egp $$2, awo $$3) {
      if ($$0.Z().b(cvj.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            hz $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.p($$5)) {
                  return;
               }

               dlf $$7 = $$0.a_($$5);
               if ($$7.i()) {
                  if (this.a((cvq)$$0, $$5)) {
                     $$0.b($$5, cyb.a($$0, $$5));
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
                  $$0.b($$9.c(), cyb.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(cvq $$0, hz $$1) {
      for (ie $$2 : ie.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(cvq $$0, hz $$1) {
      return $$1.v() >= $$0.J_() && $$1.v() < $$0.al() && !$$0.B($$1) ? false : $$0.a_($$1).j();
   }

   @Nullable
   @Override
   public jx h() {
      return jz.j;
   }

   @Override
   protected void a(cvo $$0, hz $$1, dlf $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(cvq $$0) {
      return $$0.E_().i() ? 4 : 2;
   }

   @Override
   public dlf b(egp $$0) {
      return cyq.H.o().a(ddd.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(ego $$0) {
      return $$0 == egq.e || $$0 == egq.d;
   }

   @Override
   public int c(cvq $$0) {
      return $$0.E_().i() ? 1 : 2;
   }

   @Override
   public boolean a(egp $$0, cut $$1, hz $$2, ego $$3, ie $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(aue.a);
   }

   @Override
   public int a(cvq $$0) {
      return $$0.E_().i() ? 10 : 30;
   }

   @Override
   public int a(cvn $$0, hz $$1, egp $$2, egp $$3) {
      int $$4 = this.a((cvq)$$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a((cut)$$0, $$1) > $$2.a((cut)$$0, $$1) && $$0.F_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(cvo $$0, hz $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(cvn $$0) {
      return $$0.Z().b(cvj.V);
   }

   @Override
   protected void a(cvo $$0, hz $$1, dlf $$2, ie $$3, egp $$4) {
      if ($$3 == ie.a) {
         egp $$5 = $$0.b_($$1);
         if (this.a(aue.b) && $$5.a(aue.a)) {
            if ($$2.b() instanceof ddd) {
               $$0.a($$1, cyq.b.o(), 3);
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
   public Optional<atj> j() {
      return Optional.of(atk.dc);
   }

   public static class a extends egs {
      @Override
      protected void a(dlg.a<ego, egp> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(egp $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(egp $$0) {
         return false;
      }
   }

   public static class b extends egs {
      @Override
      public int d(egp $$0) {
         return 8;
      }

      @Override
      public boolean c(egp $$0) {
         return true;
      }
   }
}
