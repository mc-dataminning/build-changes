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
      if (this.dV() instanceof ash $$1) {
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
      $$0.a().a(this.dW().b(this, this.p()), 0.0F);
   }

   @Override
   protected void a(fbv $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dV().a(ls.ad, this.dA(), this.dC() + this.ae.j() * 2.0, this.dG(), this.ae.k(), 0.0, this.ae.k());
      }

      if (this.dV() instanceof ash $$2 && !this.dQ()) {
         bvj $$4 = this.p();
         if ($$4 != null && a($$4, $$2)) {
            if ($$4.bZ()) {
               $$4.ao();
            }

            fbx $$8;
            if (this.dy().h() > 0.0) {
               fbs $$5 = $$4.cR();
               fbx $$6 = new fbx($$5.b(), $$5.c(), $$5.d()).c(0.5000099999997474);
               fbx $$7 = new fbx(Math.signum(this.dy().d), Math.signum(this.dy().e), Math.signum(this.dy().f));
               $$8 = $$7.h($$6).b(0.0, $$5.c() * 0.5, 0.0);
            } else {
               $$8 = fbx.c;
            }

            fbx $$10 = this.dt().d($$8);
            if ($$4 instanceof asi $$11) {
               if ($$11.f.c()) {
                  if (this.ae.i() < 0.05F && $$2.N().b(dhd.e)) {
                     cmn $$12 = bvq.P.a($$2, bvp.k);
                     if ($$12 != null) {
                        $$12.b($$4.dA(), $$4.dC(), $$4.dG(), $$4.dL(), $$4.dN());
                        $$2.b($$12);
                     }
                  }

                  asi $$13 = $$11.a(new euw($$2, $$10, fbx.c, 0.0F, 0.0F, bwt.a(bwt.k, bwt.l), euw.a));
                  if ($$13 != null) {
                     $$13.k();
                     $$13.gL();
                     $$13.a($$11.y(), this.dW().m(), 5.0F);
                  }

                  this.a($$2, $$10);
               }
            } else {
               bvj $$14 = $$4.b(new euw($$2, $$10, $$4.dy(), $$4.dL(), $$4.dN(), euw.a));
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

   private static boolean a(bvj $$0, dhh $$1) {
      if ($$0.dV().ah() == $$1.ah()) {
         return !($$0 instanceof bwf $$2) ? $$0.bL() : $$2.bL() && !$$2.fP();
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
         $$0 = kj.b(this.dt().a());
         $$1 = kj.b(this.dt().c());
         $$2 = this.p();
         if ($$2 instanceof asi $$3 && !$$2.bL() && $$3.y().N().b(dhd.Z)) {
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

   private void a(dhh $$0, fbx $$1) {
      $$0.a(null, $$1.d, $$1.e, $$1.f, axf.uP, axg.h);
   }

   @Nullable
   @Override
   public bvj b(euw $$0) {
      bvj $$1 = super.b($$0);
      if ($$1 != null) {
         $$1.f(jh.a((ka)$$1.dt()));
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
   public void b(bvj.c $$0) {
      if ($$0 != bvj.c.d) {
         this.s();
      }

      super.b($$0);
   }
}
