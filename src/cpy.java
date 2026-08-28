import java.util.UUID;
import javax.annotation.Nullable;

public class cpy extends cpv {
   private long a = 0L;

   public cpy(buq<? extends cpy> $$0, dgg $$1) {
      super($$0, $$1);
   }

   public cpy(dgg $$0, bvf $$1, cwn $$2) {
      super(buq.Q, $$1, $$0, $$2);
   }

   @Override
   protected cwj m() {
      return cwr.tc;
   }

   @Override
   protected void c(UUID $$0) {
      this.s();
      super.c($$0);
      this.t();
   }

   @Override
   public void c(@Nullable buj $$0) {
      this.s();
      super.c($$0);
      this.t();
   }

   private void s() {
      if (this.p() instanceof ard $$0) {
         $$0.b(this);
      }
   }

   private void t() {
      if (this.p() instanceof ard $$0) {
         $$0.a(this);
      }
   }

   @Nullable
   @Override
   protected buj b(UUID $$0) {
      if (this.dW() instanceof arc $$1) {
         buj $$3 = super.b($$0);
         if ($$3 != null) {
            return $$3;
         } else {
            for (arc $$4 : $$1.p().L()) {
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
   protected void a(fav $$0) {
      super.a($$0);
      $$0.a().a(this.dX().b(this, this.p()), 0.0F);
   }

   @Override
   protected void a(faw $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dW().a(lt.ae, this.dB(), this.dD() + this.ae.j() * 2.0, this.dH(), this.ae.k(), 0.0, this.ae.k());
      }

      if (this.dW() instanceof arc $$2 && !this.dR()) {
         buj $$4 = this.p();
         if ($$4 != null && a($$4, $$2)) {
            if ($$4.bZ()) {
               $$4.ao();
            }

            fay $$5 = this.bC();
            if ($$4 instanceof ard $$6) {
               if ($$6.f.c()) {
                  if (this.ae.i() < 0.05F && $$2.O().b(dgc.e)) {
                     cln $$7 = buq.O.a($$2, bup.k);
                     if ($$7 != null) {
                        $$7.b($$4.dB(), $$4.dD(), $$4.dH(), $$4.dM(), $$4.dO());
                        $$2.b($$7);
                     }
                  }

                  if (this.aD()) {
                     $$4.aB();
                  }

                  ard $$8 = $$6.a(new etx($$2, $$5, fay.c, 0.0F, 0.0F, bvt.a(bvt.k, bvt.l), etx.a));
                  if ($$8 != null) {
                     $$8.k();
                     $$8.gP();
                     $$8.a($$6.y(), this.dX().m(), 5.0F);
                  }

                  this.a($$2, $$5);
               }
            } else {
               buj $$9 = $$4.b(new etx($$2, $$5, $$4.dz(), $$4.dM(), $$4.dO(), etx.a));
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

   private static boolean a(buj $$0, dgg $$1) {
      if ($$0.dW().ai() == $$1.ai()) {
         return !($$0 instanceof bvf $$2) ? $$0.bL() : $$2.bL() && !$$2.fR();
      } else {
         return $$0.o(true);
      }
   }

   @Override
   public void h() {
      int $$0;
      int $$1;
      buj $$2;
      label30: {
         $$0 = kk.b(this.du().a());
         $$1 = kk.b(this.du().c());
         $$2 = this.p();
         if ($$2 instanceof ard $$3 && !$$2.bL() && $$3.y().O().b(dgc.Z)) {
            this.at();
            break label30;
         }

         super.h();
      }

      if (this.bL()) {
         ji $$4 = ji.a((kb)this.du());
         if ((--this.a <= 0L || $$0 != kk.a($$4.u()) || $$1 != kk.a($$4.w())) && $$2 instanceof ard $$5) {
            this.a = $$5.c(this);
         }
      }
   }

   private void a(dgg $$0, fay $$1) {
      $$0.a(null, $$1.d, $$1.e, $$1.f, avz.uV, awa.h);
   }

   @Nullable
   @Override
   public buj b(etx $$0) {
      buj $$1 = super.b($$0);
      if ($$1 != null) {
         $$1.f(ji.a((kb)$$1.du()));
      }

      return $$1;
   }

   @Override
   public boolean a(dgg $$0, dgg $$1) {
      return $$0.ai() == dgg.k && $$1.ai() == dgg.i && this.p() instanceof ard $$2 ? super.a($$0, $$1) && $$2.i : super.a($$0, $$1);
   }

   @Override
   protected void a(dwv $$0) {
      super.a($$0);
      if ($$0.a(djm.lh) && this.p() instanceof ard $$1) {
         $$1.a($$0);
      }
   }

   @Override
   public void b(buj.d $$0) {
      if ($$0 != buj.d.d) {
         this.s();
      }

      super.b($$0);
   }
}
