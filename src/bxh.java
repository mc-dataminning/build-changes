import javax.annotation.Nullable;

public class bxh extends bxb {
   private static final btk b = btk.a().d();
   @Nullable
   private ear c;
   @Nullable
   private ehd d;

   public bxh(bwz $$0) {
      super($$0);
   }

   @Override
   public bxp<bxh> i() {
      return bxp.c;
   }

   @Override
   public void d() {
      this.c = null;
      this.d = null;
   }

   @Override
   public void c() {
      double $$0 = this.d == null ? 0.0 : this.d.c(this.a.dp(), this.a.dr(), this.a.dv());
      if ($$0 < 100.0 || $$0 > 22500.0 || this.a.P || this.a.Q) {
         this.j();
      }
   }

   @Nullable
   @Override
   public ehd g() {
      return this.d;
   }

   private void j() {
      if (this.c == null || this.c.c()) {
         int $$0 = this.a.t();
         gu $$1 = this.a.dK().a(dki.a.f, dnl.a(this.a.p()));
         cbm $$2 = this.a.dK().a(b, this.a, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
         int $$4;
         if ($$2 != null) {
            ehd $$3 = new ehd($$2.dp(), 0.0, $$2.dv()).d();
            $$4 = this.a.r(-$$3.c * 40.0, 105.0, -$$3.e * 40.0);
         } else {
            $$4 = this.a.r(40.0, (double)$$1.v(), 0.0);
         }

         eap $$6 = new eap($$1.u(), $$1.v(), $$1.w());
         this.c = this.a.a($$0, $$4, $$6);
         if (this.c != null) {
            this.c.a();
         }
      }

      this.k();
      if (this.c != null && this.c.c()) {
         this.a.fX().a(bxp.d);
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
            $$3 = (double)((float)$$0.v() + this.a.ee().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new ehd($$1, $$3, $$2);
      }
   }
}
