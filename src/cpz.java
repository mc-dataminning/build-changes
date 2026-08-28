import java.util.UUID;
import javax.annotation.Nullable;

public class cpz extends cpw {
   private long a = 0L;

   public cpz(bur<? extends cpz> $$0, dgh $$1) {
      super($$0, $$1);
   }

   public cpz(dgh $$0, bvg $$1, cwo $$2) {
      super(bur.Q, $$1, $$0, $$2);
   }

   @Override
   protected cwk m() {
      return cws.tc;
   }

   @Override
   protected void c(UUID $$0) {
      this.s();
      super.c($$0);
      this.t();
   }

   @Override
   public void c(@Nullable buk $$0) {
      this.s();
      super.c($$0);
      this.t();
   }

   private void s() {
      if (this.p() instanceof are $$0) {
         $$0.b(this);
      }
   }

   private void t() {
      if (this.p() instanceof are $$0) {
         $$0.a(this);
      }
   }

   @Nullable
   @Override
   protected buk b(UUID $$0) {
      if (this.dV() instanceof ard $$1) {
         buk $$3 = super.b($$0);
         if ($$3 != null) {
            return $$3;
         } else {
            for (ard $$4 : $$1.p().L()) {
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
   protected void a(faw $$0) {
      super.a($$0);
      $$0.a().a(this.dW().b(this, this.p()), 0.0F);
   }

   @Override
   protected void a(fax $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dV().a(lt.ae, this.dA(), this.dC() + this.ae.j() * 2.0, this.dG(), this.ae.k(), 0.0, this.ae.k());
      }

      if (this.dV() instanceof ard $$2 && !this.dQ()) {
         buk $$4 = this.p();
         if ($$4 != null && a($$4, $$2)) {
            if ($$4.bZ()) {
               $$4.ao();
            }

            faz $$5 = this.bC();
            if ($$4 instanceof are $$6) {
               if ($$6.f.c()) {
                  if (this.ae.i() < 0.05F && $$2.O().b(dgd.e)) {
                     clo $$7 = bur.O.a($$2, buq.k);
                     if ($$7 != null) {
                        $$7.b($$4.dA(), $$4.dC(), $$4.dG(), $$4.dL(), $$4.dN());
                        $$2.b($$7);
                     }
                  }

                  if (this.aD()) {
                     $$4.aB();
                  }

                  are $$8 = $$6.a(new ety($$2, $$5, faz.c, 0.0F, 0.0F, bvu.a(bvu.k, bvu.l), ety.a));
                  if ($$8 != null) {
                     $$8.k();
                     $$8.gP();
                     $$8.a($$6.y(), this.dW().m(), 5.0F);
                  }

                  this.a($$2, $$5);
               }
            } else {
               buk $$9 = $$4.b(new ety($$2, $$5, $$4.dy(), $$4.dL(), $$4.dN(), ety.a));
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

   private static boolean a(buk $$0, dgh $$1) {
      if ($$0.dV().ai() == $$1.ai()) {
         return !($$0 instanceof bvg $$2) ? $$0.bL() : $$2.bL() && !$$2.fR();
      } else {
         return $$0.o(true);
      }
   }

   @Override
   public void h() {
      int $$0;
      int $$1;
      buk $$2;
      label30: {
         $$0 = kk.b(this.dt().a());
         $$1 = kk.b(this.dt().c());
         $$2 = this.p();
         if ($$2 instanceof are $$3 && !$$2.bL() && $$3.y().O().b(dgd.Z)) {
            this.at();
            break label30;
         }

         super.h();
      }

      if (this.bL()) {
         ji $$4 = ji.a((kb)this.dt());
         if ((--this.a <= 0L || $$0 != kk.a($$4.u()) || $$1 != kk.a($$4.w())) && $$2 instanceof are $$5) {
            this.a = $$5.c(this);
         }
      }
   }

   private void a(dgh $$0, faz $$1) {
      $$0.a(null, $$1.d, $$1.e, $$1.f, awa.uV, awb.h);
   }

   @Nullable
   @Override
   public buk b(ety $$0) {
      buk $$1 = super.b($$0);
      if ($$1 != null) {
         $$1.f(ji.a((kb)$$1.dt()));
      }

      return $$1;
   }

   @Override
   public boolean a(dgh $$0, dgh $$1) {
      return $$0.ai() == dgh.k && $$1.ai() == dgh.i && this.p() instanceof are $$2 ? super.a($$0, $$1) && $$2.i : super.a($$0, $$1);
   }

   @Override
   protected void a(dww $$0) {
      super.a($$0);
      if ($$0.a(djn.lh) && this.p() instanceof are $$1) {
         $$1.a($$0);
      }
   }

   @Override
   public void b(buk.d $$0) {
      if ($$0 != buk.d.d) {
         this.s();
      }

      super.b($$0);
   }
}
