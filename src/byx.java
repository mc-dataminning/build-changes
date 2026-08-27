import java.util.List;

public class byx extends byv {
   public static final float e = 4.0F;

   public byx(bfn<? extends byx> $$0, cmm $$1) {
      super($$0, $$1);
   }

   public byx(cmm $$0, bfz $$1, double $$2, double $$3, double $$4) {
      super(bfn.x, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(eeg $$0) {
      super.a($$0);
      if ($$0.c() != eeg.a.c || !this.d(((eef)$$0).a())) {
         if (!this.dI().B) {
            List<bfz> $$1 = this.dI().a(bfz.class, this.cE().c(4.0, 2.0, 4.0));
            bfg $$2 = new bfg(this.dI(), this.dn(), this.dp(), this.dt());
            bfj $$3 = this.v();
            if ($$3 instanceof bfz) {
               $$2.a((bfz)$$3);
            }

            $$2.a(iv.i);
            $$2.a(3.0F);
            $$2.b(600);
            $$2.c((7.0F - $$2.h()) / (float)$$2.m());
            $$2.a(new bfa(bfc.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bfz $$4 : $$1) {
                  double $$5 = this.f($$4);
                  if ($$5 < 16.0) {
                     $$2.e($$4.dn(), $$4.dp(), $$4.dt());
                     break;
                  }
               }
            }

            this.dI().c(2006, this.di(), this.aQ() ? -1 : 1);
            this.dI().b($$2);
            this.ai();
         }
      }
   }

   @Override
   public boolean bo() {
      return false;
   }

   @Override
   public boolean a(ben $$0, float $$1) {
      return false;
   }

   @Override
   protected it k() {
      return iv.i;
   }

   @Override
   protected boolean aa_() {
      return false;
   }
}
