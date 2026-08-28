import java.util.UUID;
import javax.annotation.Nullable;

public class cqr extends cqo {
   private long a = 0L;

   public cqr(bvi<? extends cqr> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public cqr(dgz $$0, bvx $$1, cxg $$2) {
      super(bvi.R, $$1, $$0, $$2);
   }

   @Override
   protected cxc m() {
      return cxk.tc;
   }

   @Override
   protected void c(UUID $$0) {
      this.s();
      super.c($$0);
      this.t();
   }

   @Override
   public void c(@Nullable bvb $$0) {
      this.s();
      super.c($$0);
      this.t();
   }

   private void s() {
      if (this.p() instanceof ary $$0) {
         $$0.b(this);
      }
   }

   private void t() {
      if (this.p() instanceof ary $$0) {
         $$0.a(this);
      }
   }

   @Nullable
   @Override
   protected bvb b(UUID $$0) {
      if (this.dW() instanceof arx $$1) {
         bvb $$3 = super.b($$0);
         if ($$3 != null) {
            return $$3;
         } else {
            for (arx $$4 : $$1.p().L()) {
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
   protected void a(fbo $$0) {
      super.a($$0);
      $$0.a().a(this.dX().b(this, this.p()), 0.0F);
   }

   @Override
   protected void a(fbp $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dW().a(ls.ae, this.dB(), this.dD() + this.ae.j() * 2.0, this.dH(), this.ae.k(), 0.0, this.ae.k());
      }

      if (this.dW() instanceof arx $$2 && !this.dR()) {
         bvb $$4 = this.p();
         if ($$4 != null && a($$4, $$2)) {
            if ($$4.bZ()) {
               $$4.ao();
            }

            fbr $$5 = this.bC();
            if ($$4 instanceof ary $$6) {
               if ($$6.f.c()) {
                  if (this.ae.i() < 0.05F && $$2.O().b(dgv.e)) {
                     cmf $$7 = bvi.P.a($$2, bvh.k);
                     if ($$7 != null) {
                        $$7.b($$4.dB(), $$4.dD(), $$4.dH(), $$4.dM(), $$4.dO());
                        $$2.b($$7);
                     }
                  }

                  if (this.aD()) {
                     $$4.aB();
                  }

                  ary $$8 = $$6.a(new euq($$2, $$5, fbr.c, 0.0F, 0.0F, bwl.a(bwl.k, bwl.l), euq.a));
                  if ($$8 != null) {
                     $$8.k();
                     $$8.gN();
                     $$8.a($$6.y(), this.dX().m(), 5.0F);
                  }

                  this.a($$2, $$5);
               }
            } else {
               bvb $$9 = $$4.b(new euq($$2, $$5, $$4.dz(), $$4.dM(), $$4.dO(), euq.a));
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

   private static boolean a(bvb $$0, dgz $$1) {
      if ($$0.dW().ai() == $$1.ai()) {
         return !($$0 instanceof bvx $$2) ? $$0.bL() : $$2.bL() && !$$2.fR();
      } else {
         return $$0.o(true);
      }
   }

   @Override
   public void h() {
      int $$0;
      int $$1;
      bvb $$2;
      label30: {
         $$0 = kj.b(this.du().a());
         $$1 = kj.b(this.du().c());
         $$2 = this.p();
         if ($$2 instanceof ary $$3 && !$$2.bL() && $$3.y().O().b(dgv.Z)) {
            this.at();
            break label30;
         }

         super.h();
      }

      if (this.bL()) {
         jh $$4 = jh.a((ka)this.du());
         if ((--this.a <= 0L || $$0 != kj.a($$4.u()) || $$1 != kj.a($$4.w())) && $$2 instanceof ary $$5) {
            this.a = $$5.c(this);
         }
      }
   }

   private void a(dgz $$0, fbr $$1) {
      $$0.a(null, $$1.d, $$1.e, $$1.f, awv.uV, aww.h);
   }

   @Nullable
   @Override
   public bvb b(euq $$0) {
      bvb $$1 = super.b($$0);
      if ($$1 != null) {
         $$1.f(jh.a((ka)$$1.du()));
      }

      return $$1;
   }

   @Override
   public boolean a(dgz $$0, dgz $$1) {
      return $$0.ai() == dgz.k && $$1.ai() == dgz.i && this.p() instanceof ary $$2 ? super.a($$0, $$1) && $$2.i : super.a($$0, $$1);
   }

   @Override
   protected void a(dxo $$0) {
      super.a($$0);
      if ($$0.a(dkf.lh) && this.p() instanceof ary $$1) {
         $$1.a($$0);
      }
   }

   @Override
   public void b(bvb.d $$0) {
      if ($$0 != bvb.d.d) {
         this.s();
      }

      super.b($$0);
   }
}
