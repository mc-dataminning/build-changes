import java.util.UUID;
import javax.annotation.Nullable;

public class cqv extends cqs {
   private long a = 0L;

   public cqv(bvm<? extends cqv> $$0, dha $$1) {
      super($$0, $$1);
   }

   public cqv(dha $$0, bwb $$1, cxk $$2) {
      super(bvm.R, $$1, $$0, $$2);
   }

   @Override
   protected cxg m() {
      return cxo.sT;
   }

   @Override
   protected void c(UUID $$0) {
      this.s();
      super.c($$0);
      this.t();
   }

   @Override
   public void c(@Nullable bvf $$0) {
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
   protected bvf b(UUID $$0) {
      if (this.dV() instanceof ash $$1) {
         bvf $$3 = super.b($$0);
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
   protected void a(fbp $$0) {
      super.a($$0);
      $$0.a().a(this.dW().b(this, this.p()), 0.0F);
   }

   @Override
   protected void a(fbq $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dV().a(ls.ad, this.dA(), this.dC() + this.ae.j() * 2.0, this.dG(), this.ae.k(), 0.0, this.ae.k());
      }

      if (this.dV() instanceof ash $$2 && !this.dQ()) {
         bvf $$4 = this.p();
         if ($$4 != null && a($$4, $$2)) {
            if ($$4.bZ()) {
               $$4.ao();
            }

            fbs $$8;
            if (this.dy().h() > 0.0) {
               fbn $$5 = $$4.cR();
               fbs $$6 = new fbs($$5.b(), $$5.c(), $$5.d()).c(0.5000099999997474);
               fbs $$7 = new fbs(Math.signum(this.dy().d), Math.signum(this.dy().e), Math.signum(this.dy().f));
               $$8 = $$7.h($$6).b(0.0, $$5.c() * 0.5, 0.0);
            } else {
               $$8 = fbs.c;
            }

            fbs $$10 = this.dt().d($$8);
            if ($$4 instanceof asi $$11) {
               if ($$11.f.c()) {
                  if (this.ae.i() < 0.05F && $$2.N().b(dgw.e)) {
                     cmj $$12 = bvm.P.a($$2, bvl.k);
                     if ($$12 != null) {
                        $$12.b($$4.dA(), $$4.dC(), $$4.dG(), $$4.dL(), $$4.dN());
                        $$2.b($$12);
                     }
                  }

                  asi $$13 = $$11.a(new eup($$2, $$10, fbs.c, 0.0F, 0.0F, bwp.a(bwp.k, bwp.l), eup.a));
                  if ($$13 != null) {
                     $$13.k();
                     $$13.gL();
                     $$13.a($$11.y(), this.dW().m(), 5.0F);
                  }

                  this.a($$2, $$10);
               }
            } else {
               bvf $$14 = $$4.b(new eup($$2, $$10, $$4.dy(), $$4.dL(), $$4.dN(), eup.a));
               if ($$14 != null) {
                  $$14.k();
               }

               this.a($$2, $$10);
            }

            this.at();
            return;
         }

         this.at();
         return;
      }
   }

   private static boolean a(bvf $$0, dha $$1) {
      if ($$0.dV().ah() == $$1.ah()) {
         return !($$0 instanceof bwb $$2) ? $$0.bL() : $$2.bL() && !$$2.fP();
      } else {
         return $$0.o(true);
      }
   }

   @Override
   public void h() {
      int $$0;
      int $$1;
      bvf $$2;
      label30: {
         $$0 = kj.b(this.dt().a());
         $$1 = kj.b(this.dt().c());
         $$2 = this.p();
         if ($$2 instanceof asi $$3 && !$$2.bL() && $$3.y().N().b(dgw.Y)) {
            this.at();
            break label30;
         }

         super.h();
      }

      if (this.bL()) {
         jh $$4 = jh.a((ka)this.dt());
         if ((--this.a <= 0L || $$0 != kj.a($$4.u()) || $$1 != kj.a($$4.w())) && $$2 instanceof asi $$5) {
            this.a = $$5.c(this);
         }
      }
   }

   private void a(dha $$0, fbs $$1) {
      $$0.a(null, $$1.d, $$1.e, $$1.f, axf.uO, axg.h);
   }

   @Nullable
   @Override
   public bvf b(eup $$0) {
      bvf $$1 = super.b($$0);
      if ($$1 != null) {
         $$1.f(jh.a((ka)$$1.dt()));
      }

      return $$1;
   }

   @Override
   public boolean a(dha $$0, dha $$1) {
      return $$0.ah() == dha.k && $$1.ah() == dha.i && this.p() instanceof asi $$2 ? super.a($$0, $$1) && $$2.i : super.a($$0, $$1);
   }

   @Override
   protected void a(dxn $$0) {
      super.a($$0);
      if ($$0.a(dkg.la) && this.p() instanceof asi $$1) {
         $$1.a($$0);
      }
   }

   @Override
   public void b(bvf.c $$0) {
      if ($$0 != bvf.c.d) {
         this.s();
      }

      super.b($$0);
   }
}
