import java.util.UUID;
import javax.annotation.Nullable;

public class cot extends coq {
   public cot(btq<? extends cot> $$0, dds $$1) {
      super($$0, $$1);
   }

   public cot(dds $$0, buf $$1, cvl $$2) {
      super(btq.G, $$1, $$0, $$2);
   }

   @Override
   protected cvg o() {
      return cvo.sg;
   }

   @Nullable
   @Override
   protected btj b(UUID $$0) {
      if (this.dS() instanceof arg $$1) {
         btj $$3 = super.b($$0);
         if ($$3 != null) {
            return $$3;
         } else {
            for (arg $$4 : $$1.o().L()) {
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
   protected void a(eyb $$0) {
      super.a($$0);
      $$0.a().a(this.dT().b(this, this.s()), 0.0F);
   }

   @Override
   protected void a(eyc $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dS().a(ln.ac, this.dx(), this.dz() + this.af.j() * 2.0, this.dD(), this.af.k(), 0.0, this.af.k());
      }

      if (this.dS() instanceof arg $$2 && !this.dN()) {
         btj $$4 = this.s();
         if ($$4 != null && a($$4, $$2)) {
            if ($$4.bW()) {
               $$4.am();
            }

            if ($$4 instanceof arh $$5) {
               if ($$5.c.c()) {
                  if (this.af.i() < 0.05F && $$2.ac().b(ddo.e)) {
                     ckm $$6 = btq.I.a($$2, btp.k);
                     if ($$6 != null) {
                        $$6.b($$4.dx(), $$4.dz(), $$4.dD(), $$4.dI(), $$4.dK());
                        $$2.b($$6);
                     }
                  }

                  cnp $$7 = $$5.a(new eqz($$2, this.dq(), $$4.dv(), $$4.dI(), $$4.dK(), eqz.a));
                  if ($$7 != null) {
                     $$7.n();
                     $$7.gG();
                     $$7.a(this.dT().m(), 5.0F);
                  }

                  this.a($$2, this.dq());
               }
            } else {
               btj $$8 = $$4.b(new eqz($$2, this.dq(), $$4.dv(), $$4.dI(), $$4.dK(), eqz.a));
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

   private static boolean a(btj $$0, dds $$1) {
      if ($$0.dS().ag() == $$1.ag()) {
         return !($$0 instanceof buf $$2) ? $$0.bI() : $$2.bI() && !$$2.fL();
      } else {
         return $$0.o(true);
      }
   }

   @Override
   public void l() {
      btj $$0 = this.s();
      if ($$0 instanceof arh && !$$0.bI() && this.dS().ac().b(ddo.Y)) {
         this.as();
      } else {
         super.l();
      }
   }

   private void a(dds $$0, eye $$1) {
      $$0.a(null, $$1.d, $$1.e, $$1.f, awd.uw, awe.h);
   }

   @Override
   public boolean a(dds $$0, dds $$1) {
      return $$0.ag() == dds.j && $$1.ag() == dds.h && this.s() instanceof arh $$2 ? super.a($$0, $$1) && $$2.f : super.a($$0, $$1);
   }

   @Override
   protected void a(dua $$0) {
      super.a($$0);
      if ($$0.a(dgx.kF) && this.s() instanceof arh $$1) {
         $$1.a($$0);
      }
   }
}
