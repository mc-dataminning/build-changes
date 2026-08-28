import java.util.UUID;
import javax.annotation.Nullable;

public class coy extends cov {
   public coy(btv<? extends coy> $$0, deg $$1) {
      super($$0, $$1);
   }

   public coy(deg $$0, buk $$1, cvp $$2) {
      super(btv.G, $$1, $$0, $$2);
   }

   @Override
   protected cvk o() {
      return cvt.sg;
   }

   @Nullable
   @Override
   protected bto b(UUID $$0) {
      if (this.dS() instanceof arh $$1) {
         bto $$3 = super.b($$0);
         if ($$3 != null) {
            return $$3;
         } else {
            for (arh $$4 : $$1.o().L()) {
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
   protected void a(eyp $$0) {
      super.a($$0);
      $$0.a().a(this.dT().b(this, this.s()), 0.0F);
   }

   @Override
   protected void a(eyq $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dS().a(ln.ac, this.dx(), this.dz() + this.af.j() * 2.0, this.dD(), this.af.k(), 0.0, this.af.k());
      }

      if (this.dS() instanceof arh $$2 && !this.dN()) {
         bto $$4 = this.s();
         if ($$4 != null && a($$4, $$2)) {
            if ($$4.bW()) {
               $$4.am();
            }

            if ($$4 instanceof ari $$5) {
               if ($$5.c.c()) {
                  if (this.af.i() < 0.05F && $$2.ac().b(dec.e)) {
                     ckr $$6 = btv.I.a($$2, btu.k);
                     if ($$6 != null) {
                        $$6.b($$4.dx(), $$4.dz(), $$4.dD(), $$4.dI(), $$4.dK());
                        $$2.b($$6);
                     }
                  }

                  cnu $$7 = $$5.a(new ern($$2, this.dq(), $$4.dv(), $$4.dI(), $$4.dK(), ern.a));
                  if ($$7 != null) {
                     $$7.n();
                     $$7.gG();
                     $$7.a(this.dT().m(), 5.0F);
                  }

                  this.a($$2, this.dq());
               }
            } else {
               bto $$8 = $$4.b(new ern($$2, this.dq(), $$4.dv(), $$4.dI(), $$4.dK(), ern.a));
               if ($$8 != null) {
                  $$8.n();
               }

               this.a($$2, this.dq());
            }

            this.as();
            return;
         }

         this.as();
         return;
      }
   }

   private static boolean a(bto $$0, deg $$1) {
      if ($$0.dS().ag() == $$1.ag()) {
         return !($$0 instanceof buk $$2) ? $$0.bI() : $$2.bI() && !$$2.fM();
      } else {
         return $$0.o(true);
      }
   }

   @Override
   public void l() {
      bto $$0 = this.s();
      if ($$0 instanceof ari && !$$0.bI() && this.dS().ac().b(dec.Y)) {
         this.as();
      } else {
         super.l();
      }
   }

   private void a(deg $$0, eys $$1) {
      $$0.a(null, $$1.d, $$1.e, $$1.f, awe.uw, awf.h);
   }

   @Override
   public boolean a(deg $$0, deg $$1) {
      return $$0.ag() == deg.j && $$1.ag() == deg.h && this.s() instanceof ari $$2 ? super.a($$0, $$1) && $$2.f : super.a($$0, $$1);
   }

   @Override
   protected void a(duo $$0) {
      super.a($$0);
      if ($$0.a(dhl.kF) && this.s() instanceof ari $$1) {
         $$1.a($$0);
      }
   }
}
