import javax.annotation.Nullable;

public class cio extends cbk {
   private final cin a;

   public cio(cin $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.dS().a(this.a.dx(), this.a.dz(), this.a.dD(), 10.0);
   }

   @Override
   public void a() {
      arj $$0 = (arj)this.a.dS();
      brq $$1 = $$0.d_(this.a.ds());
      this.a.x(false);
      this.a.y(true);
      this.a.c_(0);
      bum $$2 = bty.am.a($$0, btx.k);
      if ($$2 != null) {
         $$2.e(this.a.dx(), this.a.dz(), this.a.dD());
         $$2.a(true);
         $$0.b($$2);
         cll $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               cih $$5 = this.a($$1);
               if ($$5 != null) {
                  cll $$6 = this.a($$1, $$5);
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
   private cih a(brq $$0) {
      cin $$1 = bty.aO.a(this.a.dS(), btx.k);
      if ($$1 != null) {
         $$1.a((arj)this.a.dS(), $$0, btx.k, null);
         $$1.a_(this.a.dx(), this.a.dz(), this.a.dD());
         $$1.ak = 60;
         $$1.fW();
         $$1.y(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private cll a(brq $$0, cih $$1) {
      cll $$2 = bty.aN.a($$1.dS(), btx.k);
      if ($$2 != null) {
         $$2.a((arj)$$1.dS(), $$0, btx.k, null);
         $$2.a_($$1.dx(), $$1.dz(), $$1.dD());
         $$2.ak = 60;
         $$2.fW();
         if ($$2.a(btz.f).f()) {
            $$2.a(btz.f, new cvs(cvw.pH));
         }

         this.a($$2, btz.a, $$0);
         this.a($$2, btz.f, $$0);
      }

      return $$2;
   }

   private void a(cll $$0, btz $$1, brq $$2) {
      cvs $$3 = $$0.a($$1);
      $$3.b(ks.k, dbt.a);
      dbp.a($$3, $$0.dS().G_(), ddb.a, $$2, $$0.dV());
      $$0.a($$1, $$3);
   }
}
