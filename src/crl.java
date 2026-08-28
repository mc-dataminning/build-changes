import java.util.UUID;
import javax.annotation.Nullable;

public class crl extends cri {
   private long a = 0L;

   public crl(bwb<? extends crl> $$0, dhp $$1) {
      super($$0, $$1);
   }

   public crl(dhp $$0, bwr $$1, cxy $$2) {
      super(bwb.Q, $$1, $$0, $$2);
   }

   @Override
   protected cxu g() {
      return cyc.tg;
   }

   @Override
   protected void c(UUID $$0) {
      this.j();
      super.c($$0);
      this.m();
   }

   @Override
   public void c(@Nullable bvs $$0) {
      this.j();
      super.c($$0);
      this.m();
   }

   private void j() {
      if (this.q() instanceof aro $$0) {
         $$0.b(this);
      }
   }

   private void m() {
      if (this.q() instanceof aro $$0) {
         $$0.a(this);
      }
   }

   @Nullable
   @Override
   protected bvs b(UUID $$0) {
      if (this.dV() instanceof arn $$1) {
         bvs $$3 = super.b($$0);
         if ($$3 != null) {
            return $$3;
         } else {
            for (arn $$4 : $$1.p().L()) {
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
   protected void a(fcr $$0) {
      super.a($$0);
      $$0.a().a(this.dW().b(this, this.q()), 0.0F);
   }

   @Override
   protected void a(fcs $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dV().a(lv.af, this.dA(), this.dC() + this.ae.j() * 2.0, this.dG(), this.ae.k(), 0.0, this.ae.k());
      }

      if (this.dV() instanceof arn $$2 && !this.dQ()) {
         bvs $$4 = this.q();
         if ($$4 != null && a($$4, $$2)) {
            fcu $$5 = this.bB();
            if ($$4 instanceof aro $$6) {
               if ($$6.f.c()) {
                  if (this.ae.i() < 0.05F && $$2.O().c(dhl.e)) {
                     cna $$7 = bwb.O.a($$2, bwa.k);
                     if ($$7 != null) {
                        $$7.b($$4.dA(), $$4.dC(), $$4.dG(), $$4.dL(), $$4.dN());
                        $$2.b($$7);
                     }
                  }

                  if (this.aD()) {
                     $$4.aB();
                  }

                  aro $$8 = $$6.a(new evt($$2, $$5, fcu.c, 0.0F, 0.0F, bxf.a(bxf.k, bxf.l), evt.a));
                  if ($$8 != null) {
                     $$8.k();
                     $$8.gO();
                     $$8.a($$6.y(), this.dW().m(), 5.0F);
                  }

                  this.a($$2, $$5);
               }
            } else {
               bvs $$9 = $$4.b(new evt($$2, $$5, $$4.dy(), $$4.dL(), $$4.dN(), evt.a));
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

   private static boolean a(bvs $$0, dhp $$1) {
      if ($$0.dV().aj() == $$1.aj()) {
         return !($$0 instanceof bwr $$2) ? $$0.bK() : $$2.bK() && !$$2.fQ();
      } else {
         return $$0.n(true);
      }
   }

   @Override
   public void h() {
      int $$0;
      int $$1;
      bvs $$2;
      label30: {
         $$0 = kl.b(this.dt().a());
         $$1 = kl.b(this.dt().c());
         $$2 = this.q();
         if ($$2 instanceof aro $$3 && !$$2.bK() && $$3.y().O().c(dhl.Z)) {
            this.at();
            break label30;
         }

         super.h();
      }

      if (this.bK()) {
         jj $$4 = jj.a((kc)this.dt());
         if ((--this.a <= 0L || $$0 != kl.a($$4.u()) || $$1 != kl.a($$4.w())) && $$2 instanceof aro $$5) {
            this.a = $$5.c(this);
         }
      }
   }

   private void a(dhp $$0, fcu $$1) {
      $$0.a(null, $$1.d, $$1.e, $$1.f, awk.vf, awl.h);
   }

   @Nullable
   @Override
   public bvs b(evt $$0) {
      bvs $$1 = super.b($$0);
      if ($$1 != null) {
         $$1.g(jj.a((kc)$$1.dt()));
      }

      return $$1;
   }

   @Override
   public boolean a(dhp $$0, dhp $$1) {
      return $$0.aj() == dhp.k && $$1.aj() == dhp.i && this.q() instanceof aro $$2 ? super.a($$0, $$1) && $$2.i : super.a($$0, $$1);
   }

   @Override
   protected void a(dym $$0) {
      super.a($$0);
      if ($$0.a(dkw.lh) && this.q() instanceof aro $$1) {
         $$1.a($$0);
      }
   }

   @Override
   public void b(bvs.e $$0) {
      if ($$0 != bvs.e.d) {
         this.j();
      }

      super.b($$0);
   }
}
