import javax.annotation.Nullable;

public class buj extends bud {
   private static final bqm b = bqm.a().d();
   @Nullable
   private dxt c;
   @Nullable
   private eei d;

   public buj(bub $$0) {
      super($$0);
   }

   @Override
   public bur<buj> i() {
      return bur.c;
   }

   @Override
   public void d() {
      this.c = null;
      this.d = null;
   }

   @Override
   public void c() {
      double $$0 = this.d == null ? 0.0 : this.d.c(this.a.dn(), this.a.dp(), this.a.dt());
      if ($$0 < 100.0 || $$0 > 22500.0 || this.a.O || this.a.P) {
         this.j();
      }
   }

   @Nullable
   @Override
   public eei g() {
      return this.d;
   }

   private void j() {
      if (this.c == null || this.c.c()) {
         int $$0 = this.a.w();
         gu $$1 = this.a.dI().a(dhk.a.f, dkn.a(this.a.q()));
         byo $$2 = this.a.dI().a(b, this.a, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
         int $$4;
         if ($$2 != null) {
            eei $$3 = new eei($$2.dn(), 0.0, $$2.dt()).d();
            $$4 = this.a.r(-$$3.c * 40.0, 105.0, -$$3.e * 40.0);
         } else {
            $$4 = this.a.r(40.0, (double)$$1.v(), 0.0);
         }

         dxr $$6 = new dxr($$1.u(), $$1.v(), $$1.w());
         this.c = this.a.a($$0, $$4, $$6);
         if (this.c != null) {
            this.c.a();
         }
      }

      this.k();
      if (this.c != null && this.c.c()) {
         this.a.fW().a(bur.d);
      }
   }

   private void k() {
      if (this.c != null && !this.c.c()) {
         hz $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.ec().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new eei($$1, $$3, $$2);
      }
   }
}
