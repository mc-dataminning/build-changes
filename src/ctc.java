import java.util.UUID;
import javax.annotation.Nullable;

public class ctc extends csz {
   private long a = 0L;

   public ctc(bxc<? extends ctc> $$0, djx $$1) {
      super($$0, $$1);
   }

   public ctc(djx $$0, bxu $$1, czy $$2) {
      super(bxc.R, $$1, $$0, $$2);
   }

   @Override
   protected czu g() {
      return dac.tn;
   }

   @Override
   protected void c(@Nullable UUID $$0) {
      this.j();
      super.c($$0);
      this.m();
   }

   @Override
   public void c(@Nullable bwt $$0) {
      this.j();
      super.c($$0);
      this.m();
   }

   private void j() {
      if (this.q() instanceof art $$0) {
         $$0.b(this);
      }
   }

   private void m() {
      if (this.q() instanceof art $$0) {
         $$0.a(this);
      }
   }

   @Nullable
   @Override
   protected bwt b(UUID $$0) {
      if (this.dV() instanceof ars $$1) {
         bwt $$3 = super.b($$0);
         if ($$3 != null) {
            return $$3;
         } else {
            for (ars $$4 : $$1.p().L()) {
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
   protected void a(ffn $$0) {
      super.a($$0);
      $$0.a().a(this.dW().b(this, this.q()), 0.0F);
   }

   @Override
   protected void a(ffo $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dV().a(ly.af, this.dA(), this.dC() + this.ae.j() * 2.0, this.dG(), this.ae.k(), 0.0, this.ae.k());
      }

      if (this.dV() instanceof ars $$2 && !this.dQ()) {
         bwt $$4 = this.q();
         if ($$4 != null && a($$4, $$2)) {
            ffq $$5 = this.bA();
            if ($$4 instanceof art $$6) {
               if ($$6.f.c()) {
                  if (this.ae.i() < 0.05F && $$2.O().c(djt.f)) {
                     coq $$7 = bxc.P.a($$2, bxb.k);
                     if ($$7 != null) {
                        $$7.b($$4.dA(), $$4.dC(), $$4.dG(), $$4.dL(), $$4.dN());
                        $$2.b($$7);
                     }
                  }

                  if (this.aA()) {
                     $$4.ay();
                  }

                  art $$8 = $$6.a(new eyo($$2, $$5, ffq.c, 0.0F, 0.0F, byi.a(byi.k, byi.l), eyo.a));
                  if ($$8 != null) {
                     $$8.k();
                     $$8.gP();
                     $$8.a($$6.y(), this.dW().m(), 5.0F);
                  }

                  this.a($$2, $$5);
               }
            } else {
               bwt $$9 = $$4.b(new eyo($$2, $$5, $$4.dy(), $$4.dL(), $$4.dN(), eyo.a));
               if ($$9 != null) {
                  $$9.k();
               }

               this.a($$2, $$5);
            }

            this.aq();
            return;
         }

         this.aq();
         return;
      }
   }

   private static boolean a(bwt $$0, djx $$1) {
      if ($$0.dV().aj() == $$1.aj()) {
         return !($$0 instanceof bxu $$2) ? $$0.bJ() : $$2.bJ() && !$$2.fR();
      } else {
         return $$0.n(true);
      }
   }

   @Override
   public void h() {
      int $$0;
      int $$1;
      bwt $$2;
      label30: {
         $$0 = jy.b(this.dt().a());
         $$1 = jy.b(this.dt().c());
         $$2 = this.q();
         if ($$2 instanceof art $$3 && !$$2.bJ() && $$3.y().O().c(djt.aa)) {
            this.aq();
            break label30;
         }

         super.h();
      }

      if (this.bJ()) {
         iv $$4 = iv.a((jp)this.dt());
         if ((--this.a <= 0L || $$0 != jy.a($$4.u()) || $$1 != jy.a($$4.w())) && $$2 instanceof art $$5) {
            this.a = $$5.c(this);
         }
      }
   }

   private void a(djx $$0, ffq $$1) {
      $$0.a(null, $$1.d, $$1.e, $$1.f, awp.vj, awq.h);
   }

   @Nullable
   @Override
   public bwt b(eyo $$0) {
      bwt $$1 = super.b($$0);
      if ($$1 != null) {
         $$1.f(iv.a((jp)$$1.dt()));
      }

      return $$1;
   }

   @Override
   public boolean a(djx $$0, djx $$1) {
      return $$0.aj() == djx.k && $$1.aj() == djx.i && this.q() instanceof art $$2 ? super.a($$0, $$1) && $$2.i : super.a($$0, $$1);
   }

   @Override
   protected void a(ebe $$0) {
      super.a($$0);
      if ($$0.a(dne.ll) && this.q() instanceof art $$1) {
         $$1.a($$0);
      }
   }

   @Override
   public void b(bwt.d $$0) {
      if ($$0 != bwt.d.d) {
         this.j();
      }

      super.b($$0);
   }

   @Override
   public void a(boolean $$0, iv $$1) {
      bwt.a(this, $$0, $$1);
   }

   @Override
   public void l(boolean $$0) {
      bwt.b(this, $$0);
   }
}
