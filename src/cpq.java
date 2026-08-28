import java.util.UUID;
import javax.annotation.Nullable;

public class cpq extends cpn {
   private long b = 0L;

   public cpq(bul<? extends cpq> $$0, dfb $$1) {
      super($$0, $$1);
   }

   public cpq(dfb $$0, bva $$1, cwb $$2) {
      super(bul.G, $$1, $$0, $$2);
   }

   @Override
   protected cvx o() {
      return cwf.sg;
   }

   @Override
   protected void c(UUID $$0) {
      this.q();
      super.c($$0);
      this.t();
   }

   @Override
   public void c(@Nullable bue $$0) {
      this.q();
      super.c($$0);
      this.t();
   }

   private void q() {
      if (this.s() instanceof aro $$1) {
         $$1.b(this);
      }
   }

   private void t() {
      if (this.s() instanceof aro $$1) {
         $$1.a(this);
      }
   }

   @Nullable
   @Override
   protected bue b(UUID $$0) {
      if (this.dX() instanceof arn $$1) {
         bue $$3 = super.b($$0);
         if ($$3 != null) {
            return $$3;
         } else {
            for (arn $$4 : $$1.o().L()) {
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
   protected void a(ezk $$0) {
      super.a($$0);
      $$0.a().a(this.dY().b(this, this.s()), 0.0F);
   }

   @Override
   protected void a(ezl $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dX().a(lr.ac, this.dC(), this.dE() + this.af.j() * 2.0, this.dI(), this.af.k(), 0.0, this.af.k());
      }

      if (this.dX() instanceof arn $$2 && !this.dS()) {
         bue $$4 = this.s();
         if ($$4 != null && a($$4, $$2)) {
            if ($$4.ca()) {
               $$4.ap();
            }

            ezn $$8;
            if (this.dA().h() > 0.0) {
               ezi $$5 = $$4.cS();
               ezn $$6 = new ezn($$5.b(), $$5.c(), $$5.d()).c(0.5000099999997474);
               ezn $$7 = new ezn(Math.signum(this.dA().d), Math.signum(this.dA().e), Math.signum(this.dA().f));
               $$8 = $$7.h($$6).b(0.0, $$5.c() * 0.5, 0.0);
            } else {
               $$8 = ezn.c;
            }

            ezn $$10 = this.dv().d($$8);
            if ($$4 instanceof aro $$11) {
               if ($$11.g.c()) {
                  if (this.af.i() < 0.05F && $$2.ac().b(dex.e)) {
                     cli $$12 = bul.I.a($$2, buk.k);
                     if ($$12 != null) {
                        $$12.b($$4.dC(), $$4.dE(), $$4.dI(), $$4.dN(), $$4.dP());
                        $$2.b($$12);
                     }
                  }

                  com $$13 = $$11.a(new esi($$2, $$10, ezn.c, 0.0F, 0.0F, bvo.a(bvo.k, bvo.l), esi.a));
                  if ($$13 != null) {
                     $$13.n();
                     $$13.gO();
                     $$13.a(this.dY().m(), 5.0F);
                  }

                  this.a($$2, $$10);
               }
            } else {
               bue $$14 = $$4.b(new esi($$2, $$10, $$4.dA(), $$4.dN(), $$4.dP(), esi.a));
               if ($$14 != null) {
                  $$14.n();
               }

               this.a($$2, $$10);
            }

            this.av();
            return;
         }

         this.av();
         return;
      }
   }

   private static boolean a(bue $$0, dfb $$1) {
      if ($$0.dX().ag() == $$1.ag()) {
         return !($$0 instanceof bva $$2) ? $$0.bM() : $$2.bM() && !$$2.fT();
      } else {
         return $$0.o(true);
      }
   }

   @Override
   public void l() {
      int $$0 = kj.b(this.dv().a());
      int $$1 = kj.b(this.dv().c());
      bue $$2 = this.s();
      if ($$2 instanceof aro && !$$2.bM() && this.dX().ac().b(dex.Y)) {
         this.av();
      } else {
         super.l();
      }

      jh $$3 = jh.a((ka)this.dv());
      if ((--this.b <= 0L || $$0 != kj.a($$3.u()) || $$1 != kj.a($$3.w())) && $$2 instanceof aro $$4) {
         this.b = $$4.c(this);
      }
   }

   private void a(dfb $$0, ezn $$1) {
      $$0.a(null, $$1.d, $$1.e, $$1.f, awl.uu, awm.h);
   }

   @Nullable
   @Override
   public bue b(esi $$0) {
      bue $$1 = super.b($$0);
      if ($$1 != null) {
         $$1.f(jh.a((ka)$$1.dv()));
      }

      return $$1;
   }

   @Override
   public boolean a(dfb $$0, dfb $$1) {
      return $$0.ag() == dfb.k && $$1.ag() == dfb.i && this.s() instanceof aro $$2 ? super.a($$0, $$1) && $$2.j : super.a($$0, $$1);
   }

   @Override
   protected void a(dvj $$0) {
      super.a($$0);
      if ($$0.a(dig.kF) && this.s() instanceof aro $$1) {
         $$1.a($$0);
      }
   }

   @Override
   public void a(bue.c $$0) {
      if ($$0 != bue.c.d) {
         this.q();
      }

      super.a($$0);
   }
}
