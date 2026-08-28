import javax.annotation.Nullable;

public class chs extends chm {
   private static final cdp b = cdp.a().d();
   @Nullable
   private eop c;
   @Nullable
   private evz d;

   public chs(chk $$0) {
      super($$0);
   }

   @Override
   public cia<chs> i() {
      return cia.c;
   }

   @Override
   public void d() {
      this.c = null;
      this.d = null;
   }

   @Override
   public void c() {
      double $$0 = this.d == null ? 0.0 : this.d.c(this.a.du(), this.a.dw(), this.a.dA());
      if ($$0 < 100.0 || $$0 > 22500.0 || this.a.Q || this.a.R) {
         this.j();
      }
   }

   @Nullable
   @Override
   public evz g() {
      return this.d;
   }

   private void j() {
      if (this.c == null || this.c.c()) {
         int $$0 = this.a.y();
         ja $$1 = this.a.dP().a(dxz.a.f, ebd.a(this.a.s()));
         cmh $$2 = this.a.dP().a(b, this.a, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
         int $$4;
         if ($$2 != null) {
            evz $$3 = new evz($$2.du(), 0.0, $$2.dA()).d();
            $$4 = this.a.r(-$$3.c * 40.0, 105.0, -$$3.e * 40.0);
         } else {
            $$4 = this.a.r(40.0, (double)$$1.v(), 0.0);
         }

         eon $$6 = new eon($$1.u(), $$1.v(), $$1.w());
         this.c = this.a.a($$0, $$4, $$6);
         if (this.c != null) {
            this.c.a();
         }
      }

      this.k();
      if (this.c != null && this.c.c()) {
         this.a.gk().a(cia.d);
      }
   }

   private void k() {
      if (this.c != null && !this.c.c()) {
         ke $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.dS().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new evz($$1, $$3, $$2);
      }
   }
}
