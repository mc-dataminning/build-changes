import javax.annotation.Nullable;

public class cil extends cbh {
   private final cik a;

   public cil(cik $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.dS().a(this.a.dx(), this.a.dz(), this.a.dD(), 10.0);
   }

   @Override
   public void a() {
      arh $$0 = (arh)this.a.dS();
      brn $$1 = $$0.d_(this.a.ds());
      this.a.x(false);
      this.a.y(true);
      this.a.c_(0);
      buj $$2 = btv.am.a($$0, btu.k);
      if ($$2 != null) {
         $$2.e(this.a.dx(), this.a.dz(), this.a.dD());
         $$2.a(true);
         $$0.b($$2);
         cli $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               cie $$5 = this.a($$1);
               if ($$5 != null) {
                  cli $$6 = this.a($$1, $$5);
                  if ($$6 != null) {
                     $$6.n($$5);
                     $$5.j(this.a.dV().a(0.0, 1.1485), 0.0, this.a.dV().a(0.0, 1.1485));
                     $$0.a_($$5);
                  }
               }
            }
         }
      }
   }

   @Nullable
   private cie a(brn $$0) {
      cik $$1 = btv.aO.a(this.a.dS(), btu.k);
      if ($$1 != null) {
         $$1.a((arh)this.a.dS(), $$0, btu.k, null);
         $$1.a_(this.a.dx(), this.a.dz(), this.a.dD());
         $$1.ak = 60;
         $$1.fW();
         $$1.y(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private cli a(brn $$0, cie $$1) {
      cli $$2 = btv.aN.a($$1.dS(), btu.k);
      if ($$2 != null) {
         $$2.a((arh)$$1.dS(), $$0, btu.k, null);
         $$2.a_($$1.dx(), $$1.dz(), $$1.dD());
         $$2.ak = 60;
         $$2.fW();
         if ($$2.a(btw.f).f()) {
            $$2.a(btw.f, new cvp(cvt.pH));
         }

         this.a($$2, btw.a, $$0);
         this.a($$2, btw.f, $$0);
      }

      return $$2;
   }

   private void a(cli $$0, btw $$1, brn $$2) {
      cvp $$3 = $$0.a($$1);
      $$3.b(kr.k, dbq.a);
      dbm.a($$3, $$0.dS().F_(), dcy.a, $$2, $$0.dV());
      $$0.a($$1, $$3);
   }
}
