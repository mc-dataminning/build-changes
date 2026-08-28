import java.util.UUID;
import javax.annotation.Nullable;

public class cpb extends coy {
   public cpb(bty<? extends cpb> $$0, dej $$1) {
      super($$0, $$1);
   }

   public cpb(dej $$0, bun $$1, cvs $$2) {
      super(bty.G, $$1, $$0, $$2);
   }

   @Override
   protected cvn o() {
      return cvw.sg;
   }

   @Nullable
   @Override
   protected btr b(UUID $$0) {
      if (this.dS() instanceof arj $$1) {
         btr $$3 = super.b($$0);
         if ($$3 != null) {
            return $$3;
         } else {
            for (arj $$4 : $$1.o().L()) {
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
   protected void a(eyt $$0) {
      super.a($$0);
      $$0.a().a(this.dT().b(this, this.s()), 0.0F);
   }

   @Override
   protected void a(eyu $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dS().a(lo.ac, this.dx(), this.dz() + this.af.j() * 2.0, this.dD(), this.af.k(), 0.0, this.af.k());
      }

      if (this.dS() instanceof arj $$2 && !this.dN()) {
         btr $$4 = this.s();
         if ($$4 != null && a($$4, $$2)) {
            if ($$4.bW()) {
               $$4.am();
            }

            if ($$4 instanceof ark $$5) {
               if ($$5.c.c()) {
                  if (this.af.i() < 0.05F && $$2.ac().b(def.e)) {
                     cku $$6 = bty.I.a($$2, btx.k);
                     if ($$6 != null) {
                        $$6.b($$4.dx(), $$4.dz(), $$4.dD(), $$4.dI(), $$4.dK());
                        $$2.b($$6);
                     }
                  }

                  cnx $$7 = $$5.a(new err($$2, this.dq(), $$4.dv(), $$4.dI(), $$4.dK(), err.a));
                  if ($$7 != null) {
                     $$7.n();
                     $$7.gH();
                     $$7.a(this.dT().m(), 5.0F);
                  }

                  this.a($$2, this.dq());
               }
            } else {
               btr $$8 = $$4.b(new err($$2, this.dq(), $$4.dv(), $$4.dI(), $$4.dK(), err.a));
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

   private static boolean a(btr $$0, dej $$1) {
      if ($$0.dS().ag() == $$1.ag()) {
         return !($$0 instanceof bun $$2) ? $$0.bI() : $$2.bI() && !$$2.fN();
      } else {
         return $$0.o(true);
      }
   }

   @Override
   public void l() {
      btr $$0 = this.s();
      if ($$0 instanceof ark && !$$0.bI() && this.dS().ac().b(def.Y)) {
         this.as();
      } else {
         super.l();
      }
   }

   private void a(dej $$0, eyw $$1) {
      $$0.a(null, $$1.d, $$1.e, $$1.f, awg.uw, awh.h);
   }

   @Override
   public boolean a(dej $$0, dej $$1) {
      return $$0.ag() == dej.j && $$1.ag() == dej.h && this.s() instanceof ark $$2 ? super.a($$0, $$1) && $$2.f : super.a($$0, $$1);
   }

   @Override
   protected void a(dus $$0) {
      super.a($$0);
      if ($$0.a(dho.kF) && this.s() instanceof ark $$1) {
         $$1.a($$0);
      }
   }
}
