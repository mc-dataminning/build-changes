import java.util.UUID;
import javax.annotation.Nullable;

public class cqu extends cqr {
   private long a = 0L;

   public cqu(bvi<? extends cqu> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public cqu(dgz $$0, bvy $$1, cxh $$2) {
      super(bvi.Q, $$1, $$0, $$2);
   }

   @Override
   protected cxd g() {
      return cxl.te;
   }

   @Override
   protected void c(UUID $$0) {
      this.j();
      super.c($$0);
      this.m();
   }

   @Override
   public void c(@Nullable bva $$0) {
      this.j();
      super.c($$0);
      this.m();
   }

   private void j() {
      if (this.q() instanceof are $$0) {
         $$0.b(this);
      }
   }

   private void m() {
      if (this.q() instanceof are $$0) {
         $$0.a(this);
      }
   }

   @Nullable
   @Override
   protected bva b(UUID $$0) {
      if (this.dU() instanceof ard $$1) {
         bva $$3 = super.b($$0);
         if ($$3 != null) {
            return $$3;
         } else {
            for (ard $$4 : $$1.p().L()) {
               if ($$4 != $$1) {
                  $$3 = $$4.b($$0);
                  if ($$3 != null) {
                     return $$3;
                  }
               }
            }

            return null;
         }
      } else {
         return null;
      }
   }

   @Override
   protected void a(fbu $$0) {
      super.a($$0);
      $$0.a().a(this.dV().b(this, this.q()), 0.0F);
   }

   @Override
   protected void a(fbv $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dU().a(lt.af, this.dz(), this.dB() + this.ae.j() * 2.0, this.dF(), this.ae.k(), 0.0, this.ae.k());
      }

      if (this.dU() instanceof ard $$2 && !this.dP()) {
         bva $$4 = this.q();
         if ($$4 != null && a($$4, $$2)) {
            fbx $$5 = this.bA();
            if ($$4 instanceof are $$6) {
               if ($$6.f.c()) {
                  if (this.ae.i() < 0.05F && $$2.O().b(dgv.e)) {
                     cmj $$7 = bvi.O.a($$2, bvh.k);
                     if ($$7 != null) {
                        $$7.b($$4.dz(), $$4.dB(), $$4.dF(), $$4.dK(), $$4.dM());
                        $$2.b($$7);
                     }
                  }

                  if (this.aD()) {
                     $$4.aB();
                  }

                  are $$8 = $$6.a(new euw($$2, $$5, fbx.c, 0.0F, 0.0F, bwm.a(bwm.k, bwm.l), euw.a));
                  if ($$8 != null) {
                     $$8.k();
                     $$8.gR();
                     $$8.a($$6.y(), this.dV().m(), 5.0F);
                  }

                  this.a($$2, $$5);
               }
            } else {
               bva $$9 = $$4.b(new euw($$2, $$5, $$4.dx(), $$4.dK(), $$4.dM(), euw.a));
               if ($$9 != null) {
                  $$9.k();
               }

               this.a($$2, $$5);
            }

            this.at();
            return;
         }

         this.at();
         return;
      }
   }

   private static boolean a(bva $$0, dgz $$1) {
      if ($$0.dU().aj() == $$1.aj()) {
         return !($$0 instanceof bvy $$2) ? $$0.bJ() : $$2.bJ() && !$$2.fT();
      } else {
         return $$0.n(true);
      }
   }

   @Override
   public void h() {
      int $$0;
      int $$1;
      bva $$2;
      label30: {
         $$0 = kk.b(this.ds().a());
         $$1 = kk.b(this.ds().c());
         $$2 = this.q();
         if ($$2 instanceof are $$3 && !$$2.bJ() && $$3.y().O().b(dgv.Z)) {
            this.at();
            break label30;
         }

         super.h();
      }

      if (this.bJ()) {
         ji $$4 = ji.a((kb)this.ds());
         if ((--this.a <= 0L || $$0 != kk.a($$4.u()) || $$1 != kk.a($$4.w())) && $$2 instanceof are $$5) {
            this.a = $$5.c(this);
         }
      }
   }

   private void a(dgz $$0, fbx $$1) {
      $$0.a(null, $$1.d, $$1.e, $$1.f, awa.vf, awb.h);
   }

   @Nullable
   @Override
   public bva b(euw $$0) {
      bva $$1 = super.b($$0);
      if ($$1 != null) {
         $$1.g(ji.a((kb)$$1.ds()));
      }

      return $$1;
   }

   @Override
   public boolean a(dgz $$0, dgz $$1) {
      return $$0.aj() == dgz.k && $$1.aj() == dgz.i && this.q() instanceof are $$2 ? super.a($$0, $$1) && $$2.i : super.a($$0, $$1);
   }

   @Override
   protected void a(dxq $$0) {
      super.a($$0);
      if ($$0.a(dkg.lh) && this.q() instanceof are $$1) {
         $$1.a($$0);
      }
   }

   @Override
   public void b(bva.d $$0) {
      if ($$0 != bva.d.d) {
         this.j();
      }

      super.b($$0);
   }
}
