import java.util.UUID;
import javax.annotation.Nullable;

public class cqz extends cqw {
   private long a = 0L;

   public cqz(bvq<? extends cqz> $$0, dhh $$1) {
      super($$0, $$1);
   }

   public cqz(dhh $$0, bwf $$1, cxo $$2) {
      super(bvq.R, $$1, $$0, $$2);
   }

   @Override
   protected cxk m() {
      return cxs.sT;
   }

   @Override
   protected void c(UUID $$0) {
      this.s();
      super.c($$0);
      this.t();
   }

   @Override
   public void c(@Nullable bvj $$0) {
      this.s();
      super.c($$0);
      this.t();
   }

   private void s() {
      if (this.p() instanceof asi $$0) {
         $$0.b(this);
      }
   }

   private void t() {
      if (this.p() instanceof asi $$0) {
         $$0.a(this);
      }
   }

   @Nullable
   @Override
   protected bvj b(UUID $$0) {
      if (this.dW() instanceof ash $$1) {
         bvj $$3 = super.b($$0);
         if ($$3 != null) {
            return $$3;
         } else {
            for (ash $$4 : $$1.p().L()) {
               if ($$4 != $$1) {
                  $$3 = $$4.a($$0);
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
      $$0.a().a(this.dX().b(this, this.p()), 0.0F);
   }

   @Override
   protected void a(fbv $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dW().a(ls.ad, this.dB(), this.dD() + this.ae.j() * 2.0, this.dH(), this.ae.k(), 0.0, this.ae.k());
      }

      if (this.dW() instanceof ash $$2 && !this.dR()) {
         bvj $$4 = this.p();
         if ($$4 != null && a($$4, $$2)) {
            if ($$4.bZ()) {
               $$4.ao();
            }

            fbx $$5 = this.bC();
            if ($$4 instanceof asi $$6) {
               if ($$6.f.c()) {
                  if (this.ae.i() < 0.05F && $$2.N().b(dhd.e)) {
                     cmn $$7 = bvq.P.a($$2, bvp.k);
                     if ($$7 != null) {
                        $$7.b($$4.dB(), $$4.dD(), $$4.dH(), $$4.dM(), $$4.dO());
                        $$2.b($$7);
                     }
                  }

                  if (this.aD()) {
                     $$4.aB();
                  }

                  asi $$8 = $$6.a(new euw($$2, $$5, fbx.c, 0.0F, 0.0F, bwt.a(bwt.k, bwt.l), euw.a));
                  if ($$8 != null) {
                     $$8.k();
                     $$8.gN();
                     $$8.a($$6.y(), this.dX().m(), 5.0F);
                  }

                  this.a($$2, $$5);
               }
            } else {
               bvj $$9 = $$4.b(new euw($$2, $$5, $$4.dz(), $$4.dM(), $$4.dO(), euw.a));
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

   private static boolean a(bvj $$0, dhh $$1) {
      if ($$0.dW().ah() == $$1.ah()) {
         return !($$0 instanceof bwf $$2) ? $$0.bL() : $$2.bL() && !$$2.fR();
      } else {
         return $$0.o(true);
      }
   }

   @Override
   public void h() {
      int $$0;
      int $$1;
      bvj $$2;
      label30: {
         $$0 = kj.b(this.du().a());
         $$1 = kj.b(this.du().c());
         $$2 = this.p();
         if ($$2 instanceof asi $$3 && !$$2.bL() && $$3.y().N().b(dhd.Z)) {
            this.at();
            break label30;
         }

         super.h();
      }

      if (this.bL()) {
         jh $$4 = jh.a((ka)this.du());
         if ((--this.a <= 0L || $$0 != kj.a($$4.u()) || $$1 != kj.a($$4.w())) && $$2 instanceof asi $$5) {
            this.a = $$5.c(this);
         }
      }
   }

   private void a(dhh $$0, fbx $$1) {
      $$0.a(null, $$1.d, $$1.e, $$1.f, axf.uP, axg.h);
   }

   @Nullable
   @Override
   public bvj b(euw $$0) {
      bvj $$1 = super.b($$0);
      if ($$1 != null) {
         $$1.f(jh.a((ka)$$1.du()));
      }

      return $$1;
   }

   @Override
   public boolean a(dhh $$0, dhh $$1) {
      return $$0.ah() == dhh.k && $$1.ah() == dhh.i && this.p() instanceof asi $$2 ? super.a($$0, $$1) && $$2.i : super.a($$0, $$1);
   }

   @Override
   protected void a(dxu $$0) {
      super.a($$0);
      if ($$0.a(dkn.la) && this.p() instanceof asi $$1) {
         $$1.a($$0);
      }
   }

   @Override
   public void b(bvj.d $$0) {
      if ($$0 != bvj.d.d) {
         this.s();
      }

      super.b($$0);
   }
}
