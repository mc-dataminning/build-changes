import java.util.UUID;
import javax.annotation.Nullable;

public class cra extends cqx {
   private long a = 0L;

   public cra(bvr<? extends cra> $$0, dhi $$1) {
      super($$0, $$1);
   }

   public cra(dhi $$0, bwg $$1, cxp $$2) {
      super(bvr.R, $$1, $$0, $$2);
   }

   @Override
   protected cxl m() {
      return cxt.sT;
   }

   @Override
   protected void c(UUID $$0) {
      this.s();
      super.c($$0);
      this.t();
   }

   @Override
   public void c(@Nullable bvk $$0) {
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
   protected bvk b(UUID $$0) {
      if (this.dW() instanceof ash $$1) {
         bvk $$3 = super.b($$0);
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
   protected void a(fbv $$0) {
      super.a($$0);
      $$0.a().a(this.dX().b(this, this.p()), 0.0F);
   }

   @Override
   protected void a(fbw $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dW().a(ls.ad, this.dB(), this.dD() + this.ae.j() * 2.0, this.dH(), this.ae.k(), 0.0, this.ae.k());
      }

      if (this.dW() instanceof ash $$2 && !this.dR()) {
         bvk $$4 = this.p();
         if ($$4 != null && a($$4, $$2)) {
            if ($$4.bZ()) {
               $$4.ao();
            }

            fby $$5 = this.bC();
            if ($$4 instanceof asi $$6) {
               if ($$6.f.c()) {
                  if (this.ae.i() < 0.05F && $$2.N().b(dhe.e)) {
                     cmo $$7 = bvr.P.a($$2, bvq.k);
                     if ($$7 != null) {
                        $$7.b($$4.dB(), $$4.dD(), $$4.dH(), $$4.dM(), $$4.dO());
                        $$2.b($$7);
                     }
                  }

                  if (this.aD()) {
                     $$4.aB();
                  }

                  asi $$8 = $$6.a(new eux($$2, $$5, fby.c, 0.0F, 0.0F, bwu.a(bwu.k, bwu.l), eux.a));
                  if ($$8 != null) {
                     $$8.k();
                     $$8.gN();
                     $$8.a($$6.y(), this.dX().m(), 5.0F);
                  }

                  this.a($$2, $$5);
               }
            } else {
               bvk $$9 = $$4.b(new eux($$2, $$5, $$4.dz(), $$4.dM(), $$4.dO(), eux.a));
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

   private static boolean a(bvk $$0, dhi $$1) {
      if ($$0.dW().ah() == $$1.ah()) {
         return !($$0 instanceof bwg $$2) ? $$0.bL() : $$2.bL() && !$$2.fR();
      } else {
         return $$0.o(true);
      }
   }

   @Override
   public void h() {
      int $$0;
      int $$1;
      bvk $$2;
      label30: {
         $$0 = kj.b(this.du().a());
         $$1 = kj.b(this.du().c());
         $$2 = this.p();
         if ($$2 instanceof asi $$3 && !$$2.bL() && $$3.y().N().b(dhe.Z)) {
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

   private void a(dhi $$0, fby $$1) {
      $$0.a(null, $$1.d, $$1.e, $$1.f, axf.uP, axg.h);
   }

   @Nullable
   @Override
   public bvk b(eux $$0) {
      bvk $$1 = super.b($$0);
      if ($$1 != null) {
         $$1.f(jh.a((ka)$$1.du()));
      }

      return $$1;
   }

   @Override
   public boolean a(dhi $$0, dhi $$1) {
      return $$0.ah() == dhi.k && $$1.ah() == dhi.i && this.p() instanceof asi $$2 ? super.a($$0, $$1) && $$2.i : super.a($$0, $$1);
   }

   @Override
   protected void a(dxv $$0) {
      super.a($$0);
      if ($$0.a(dko.la) && this.p() instanceof asi $$1) {
         $$1.a($$0);
      }
   }

   @Override
   public void b(bvk.d $$0) {
      if ($$0 != bvk.d.d) {
         this.s();
      }

      super.b($$0);
   }
}
