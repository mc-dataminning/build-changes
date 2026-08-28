import javax.annotation.Nullable;

public class cka extends cju {
   private static final cfv b = cfv.a().d();
   @Nullable
   private esc c;
   @Nullable
   private ezr d;

   public cka(cjs $$0) {
      super($$0);
   }

   @Override
   public cki<cka> i() {
      return cki.c;
   }

   @Override
   public void d() {
      this.c = null;
      this.d = null;
   }

   @Override
   public void c() {
      double $$0 = this.d == null ? 0.0 : this.d.c(this.a.dD(), this.a.dF(), this.a.dJ());
      if ($$0 < 100.0 || $$0 > 22500.0 || this.a.Q || this.a.R) {
         this.j();
      }
   }

   @Nullable
   @Override
   public ezr g() {
      return this.d;
   }

   private void j() {
      if (this.c == null || this.c.c()) {
         int $$0 = this.a.y();
         jh $$1 = this.a.dY().a(ebj.a.f, eeo.a(this.a.q()));
         cor $$2 = this.a.dY().a(b, this.a, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
         int $$4;
         if ($$2 != null) {
            ezr $$3 = new ezr($$2.dD(), 0.0, $$2.dJ()).d();
            $$4 = this.a.q(-$$3.d * 40.0, 105.0, -$$3.f * 40.0);
         } else {
            $$4 = this.a.q(40.0, (double)$$1.v(), 0.0);
         }

         esa $$6 = new esa($$1.u(), $$1.v(), $$1.w());
         this.c = this.a.a($$0, $$4, $$6);
         if (this.c != null) {
            this.c.a();
         }
      }

      this.k();
      if (this.c != null && this.c.c()) {
         this.a.gs().a(cki.d);
      }
   }

   private void k() {
      if (this.c != null && !this.c.c()) {
         kl $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.eb().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new ezr($$1, $$3, $$2);
      }
   }
}
