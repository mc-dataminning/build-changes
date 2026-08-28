import java.util.UUID;
import javax.annotation.Nullable;

public class cqa extends cpx {
   private long a = 0L;

   public cqa(bus<? extends cqa> $$0, dgi $$1) {
      super($$0, $$1);
   }

   public cqa(dgi $$0, bvh $$1, cwp $$2) {
      super(bus.Q, $$1, $$0, $$2);
   }

   @Override
   protected cwl m() {
      return cwt.tc;
   }

   @Override
   protected void c(UUID $$0) {
      this.s();
      super.c($$0);
      this.t();
   }

   @Override
   public void c(@Nullable bul $$0) {
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
   protected bul b(UUID $$0) {
      if (this.dV() instanceof ard $$1) {
         bul $$3 = super.b($$0);
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
   protected void a(fax $$0) {
      super.a($$0);
      $$0.a().a(this.dW().b(this, this.p()), 0.0F);
   }

   @Override
   protected void a(fay $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dV().a(lt.ae, this.dA(), this.dC() + this.ae.j() * 2.0, this.dG(), this.ae.k(), 0.0, this.ae.k());
      }

      if (this.dV() instanceof ard $$2 && !this.dQ()) {
         bul $$4 = this.p();
         if ($$4 != null && a($$4, $$2)) {
            if ($$4.bZ()) {
               $$4.ao();
            }

            fba $$5 = this.bC();
            if ($$4 instanceof are $$6) {
               if ($$6.f.c()) {
                  if (this.ae.i() < 0.05F && $$2.O().b(dge.e)) {
                     clp $$7 = bus.O.a($$2, bur.k);
                     if ($$7 != null) {
                        $$7.b($$4.dA(), $$4.dC(), $$4.dG(), $$4.dL(), $$4.dN());
                        $$2.b($$7);
                     }
                  }

                  if (this.aD()) {
                     $$4.aB();
                  }

                  are $$8 = $$6.a(new etz($$2, $$5, fba.c, 0.0F, 0.0F, bvv.a(bvv.k, bvv.l), etz.a));
                  if ($$8 != null) {
                     $$8.k();
                     $$8.gP();
                     $$8.a($$6.y(), this.dW().m(), 5.0F);
                  }

                  this.a($$2, $$5);
               }
            } else {
               bul $$9 = $$4.b(new etz($$2, $$5, $$4.dy(), $$4.dL(), $$4.dN(), etz.a));
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

   private static boolean a(bul $$0, dgi $$1) {
      if ($$0.dV().ai() == $$1.ai()) {
         return !($$0 instanceof bvh $$2) ? $$0.bL() : $$2.bL() && !$$2.fR();
      } else {
         return $$0.o(true);
      }
   }

   @Override
   public void h() {
      int $$0;
      int $$1;
      bul $$2;
      label30: {
         $$0 = kk.b(this.dt().a());
         $$1 = kk.b(this.dt().c());
         $$2 = this.p();
         if ($$2 instanceof are $$3 && !$$2.bL() && $$3.y().O().b(dge.Z)) {
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

   private void a(dgi $$0, fba $$1) {
      $$0.a(null, $$1.d, $$1.e, $$1.f, awa.uV, awb.h);
   }

   @Nullable
   @Override
   public bul b(etz $$0) {
      bul $$1 = super.b($$0);
      if ($$1 != null) {
         $$1.f(ji.a((kb)$$1.dt()));
      }

      return $$1;
   }

   @Override
   public boolean a(dgi $$0, dgi $$1) {
      return $$0.ai() == dgi.k && $$1.ai() == dgi.i && this.p() instanceof are $$2 ? super.a($$0, $$1) && $$2.i : super.a($$0, $$1);
   }

   @Override
   protected void a(dwx $$0) {
      super.a($$0);
      if ($$0.a(djo.lh) && this.p() instanceof are $$1) {
         $$1.a($$0);
      }
   }

   @Override
   public void b(bul.d $$0) {
      if ($$0 != bul.d.d) {
         this.s();
      }

      super.b($$0);
   }
}
