import javax.annotation.Nullable;

public class cii extends cic {
   private static final cef b = cef.a().d();
   @Nullable
   private eps c;
   @Nullable
   private exc d;

   public cii(cia $$0) {
      super($$0);
   }

   @Override
   public ciq<cii> i() {
      return ciq.c;
   }

   @Override
   public void d() {
      this.c = null;
      this.d = null;
   }

   @Override
   public void c() {
      double $$0 = this.d == null ? 0.0 : this.d.c(this.a.dt(), this.a.dv(), this.a.dz());
      if ($$0 < 100.0 || $$0 > 22500.0 || this.a.Q || this.a.R) {
         this.j();
      }
   }

   @Nullable
   @Override
   public exc g() {
      return this.d;
   }

   private void j() {
      if (this.c == null || this.c.c()) {
         int $$0 = this.a.x();
         jd $$1 = this.a.dO().a(dyy.a.f, ecd.a(this.a.s()));
         cmx $$2 = this.a.dO().a(b, this.a, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
         int $$4;
         if ($$2 != null) {
            exc $$3 = new exc($$2.dt(), 0.0, $$2.dz()).d();
            $$4 = this.a.q(-$$3.c * 40.0, 105.0, -$$3.e * 40.0);
         } else {
            $$4 = this.a.q(40.0, (double)$$1.v(), 0.0);
         }

         epq $$6 = new epq($$1.u(), $$1.v(), $$1.w());
         this.c = this.a.a($$0, $$4, $$6);
         if (this.c != null) {
            this.c.a();
         }
      }

      this.k();
      if (this.c != null && this.c.c()) {
         this.a.gh().a(ciq.d);
      }
   }

   private void k() {
      if (this.c != null && !this.c.c()) {
         kh $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.dR().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new exc($$1, $$3, $$2);
      }
   }
}
