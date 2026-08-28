import javax.annotation.Nullable;

public class cig extends cbc {
   private final cif a;

   public cig(cif $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.dS().a(this.a.dx(), this.a.dz(), this.a.dD(), 10.0);
   }

   @Override
   public void a() {
      arg $$0 = (arg)this.a.dS();
      bri $$1 = $$0.d_(this.a.ds());
      this.a.x(false);
      this.a.y(true);
      this.a.c_(0);
      bue $$2 = btq.am.a($$0, btp.k);
      if ($$2 != null) {
         $$2.e(this.a.dx(), this.a.dz(), this.a.dD());
         $$2.a(true);
         $$0.b($$2);
         cld $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               chz $$5 = this.a($$1);
               if ($$5 != null) {
                  cld $$6 = this.a($$1, $$5);
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
   private chz a(bri $$0) {
      cif $$1 = btq.aO.a(this.a.dS(), btp.k);
      if ($$1 != null) {
         $$1.a((arg)this.a.dS(), $$0, btp.k, null);
         $$1.a_(this.a.dx(), this.a.dz(), this.a.dD());
         $$1.ak = 60;
         $$1.fV();
         $$1.y(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private cld a(bri $$0, chz $$1) {
      cld $$2 = btq.aN.a($$1.dS(), btp.k);
      if ($$2 != null) {
         $$2.a((arg)$$1.dS(), $$0, btp.k, null);
         $$2.a_($$1.dx(), $$1.dz(), $$1.dD());
         $$2.ak = 60;
         $$2.fV();
         if ($$2.a(btr.f).f()) {
            $$2.a(btr.f, new cvl(cvo.pH));
         }

         this.a($$2, btr.a, $$0);
         this.a($$2, btr.f, $$0);
      }

      return $$2;
   }

   private void a(cld $$0, btr $$1, bri $$2) {
      cvl $$3 = $$0.a($$1);
      $$3.b(kr.k, dbc.a);
      day.a($$3, $$0.dS().F_(), dck.a, $$2, $$0.dV());
      $$0.a($$1, $$3);
   }
}
