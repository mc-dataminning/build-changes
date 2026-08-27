import javax.annotation.Nullable;

public class caq extends cak {
   private static final bwt b = bwt.a().d();
   @Nullable
   private eez c;
   @Nullable
   private elm d;

   public caq(cai $$0) {
      super($$0);
   }

   @Override
   public cay<caq> i() {
      return cay.c;
   }

   @Override
   public void d() {
      this.c = null;
      this.d = null;
   }

   @Override
   public void c() {
      double $$0 = this.d == null ? 0.0 : this.d.c(this.a.dr(), this.a.dt(), this.a.dx());
      if ($$0 < 100.0 || $$0 > 22500.0 || this.a.P || this.a.Q) {
         this.j();
      }
   }

   @Nullable
   @Override
   public elm g() {
      return this.d;
   }

   private void j() {
      if (this.c == null || this.c.c()) {
         int $$0 = this.a.A();
         hx $$1 = this.a.dM().a(doj.a.f, drm.a(this.a.u()));
         cfb $$2 = this.a.dM().a(b, this.a, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
         int $$4;
         if ($$2 != null) {
            elm $$3 = new elm($$2.dr(), 0.0, $$2.dx()).d();
            $$4 = this.a.r(-$$3.c * 40.0, 105.0, -$$3.e * 40.0);
         } else {
            $$4 = this.a.r(40.0, (double)$$1.v(), 0.0);
         }

         eex $$6 = new eex($$1.u(), $$1.v(), $$1.w());
         this.c = this.a.a($$0, $$4, $$6);
         if (this.c != null) {
            this.c.a();
         }
      }

      this.k();
      if (this.c != null && this.c.c()) {
         this.a.gb().a(cay.d);
      }
   }

   private void k() {
      if (this.c != null && !this.c.c()) {
         jb $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.eg().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new elm($$1, $$3, $$2);
      }
   }
}
