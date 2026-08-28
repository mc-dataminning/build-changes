import javax.annotation.Nullable;

public class cix extends cbt {
   private final ciw a;

   public cix(ciw $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.dX().a(this.a.dC(), this.a.dE(), this.a.dI(), 10.0);
   }

   @Override
   public void a() {
      arm $$0 = (arm)this.a.dX();
      brw $$1 = $$0.d_(this.a.dx());
      this.a.x(false);
      this.a.y(true);
      this.a.c_(0);
      buu $$2 = bug.am.a($$0, buf.k);
      if ($$2 != null) {
         $$2.e(this.a.dC(), this.a.dE(), this.a.dI());
         $$2.a(true);
         $$0.b($$2);
         clu $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               ciq $$5 = this.a($$1);
               if ($$5 != null) {
                  clu $$6 = this.a($$1, $$5);
                  if ($$6 != null) {
                     $$6.n($$5);
                     $$5.j(this.a.ea().a(0.0, 1.1485), 0.0, this.a.ea().a(0.0, 1.1485));
                     $$0.a_($$5);
                  }
               }
            }
         }
      }
   }

   @Nullable
   private ciq a(brw $$0) {
      ciw $$1 = bug.aO.a(this.a.dX(), buf.k);
      if ($$1 != null) {
         $$1.a((arm)this.a.dX(), $$0, buf.k, null);
         $$1.a_(this.a.dC(), this.a.dE(), this.a.dI());
         $$1.ak = 60;
         $$1.gb();
         $$1.y(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private clu a(brw $$0, ciq $$1) {
      clu $$2 = bug.aN.a($$1.dX(), buf.k);
      if ($$2 != null) {
         $$2.a((arm)$$1.dX(), $$0, buf.k, null);
         $$2.a_($$1.dC(), $$1.dE(), $$1.dI());
         $$2.ak = 60;
         $$2.gb();
         if ($$2.a(buh.f).f()) {
            $$2.a(buh.f, new cvx(cwb.pH));
         }

         this.a($$2, buh.a, $$0);
         this.a($$2, buh.f, $$0);
      }

      return $$2;
   }

   private void a(clu $$0, buh $$1, brw $$2) {
      cvx $$3 = $$0.a($$1);
      $$3.b(kt.l, dbs.a);
      dbo.a($$3, $$0.dX().H_(), dda.a, $$2, $$0.ea());
      $$0.a($$1, $$3);
   }
}
