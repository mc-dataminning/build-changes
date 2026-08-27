import javax.annotation.Nullable;

public class cnc extends cmz {
   public cnc(bsb<? extends cnc> $$0, dca $$1) {
      super($$0, $$1);
   }

   public cnc(dca $$0, bso $$1) {
      super(bsb.I, $$1, $$0);
   }

   @Override
   protected cuc r() {
      return cuk.tC;
   }

   @Override
   protected void a(ewr $$0) {
      super.a($$0);
      $$0.a().a(this.dX().b(this, this.t()), 0.0F);
   }

   @Override
   protected void a(ews $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dU().a(lb.aa, this.dz(), this.dB() + this.al.j() * 2.0, this.dF(), this.al.k(), 0.0, this.al.k());
      }

      if (!this.dU().C && !this.dP()) {
         brv $$2 = this.t();
         if ($$2 instanceof aqu $$3) {
            if ($$3.d.c() && $$3.dU() == this.dU() && !$$3.fU()) {
               if (this.al.i() < 0.05F && this.dU().ab().b(dbw.e)) {
                  cit $$4 = bsb.K.a(this.dU());
                  if ($$4 != null) {
                     $$4.b($$2.dz(), $$2.dB(), $$2.dF(), $$2.dK(), $$2.dM());
                     this.dU().b($$4);
                  }
               }

               if ($$2.bW()) {
                  $$3.a(this.dz(), this.dB(), this.dF());
               } else {
                  $$2.c(this.dz(), this.dB(), this.dF());
               }

               $$2.n();
               $$2.a(this.dX().l(), 5.0F);
               this.dU().a(null, this.dz(), this.dB(), this.dF(), avo.uQ, avq.h);
            }
         } else if ($$2 != null) {
            $$2.c(this.dz(), this.dB(), this.dF());
            $$2.n();
         }

         this.ao();
      }
   }

   @Override
   public void l() {
      brv $$0 = this.t();
      if ($$0 instanceof aqu && !$$0.bI() && this.dU().ab().b(dbw.Z)) {
         this.ao();
      } else {
         super.l();
      }
   }

   @Nullable
   @Override
   public brv b(aqt $$0, boolean $$1) {
      brv $$2 = this.t();
      if ($$2 != null && $$2.dU().af() != $$0.af()) {
         this.c(null);
      }

      return super.b($$0, $$1);
   }
}
