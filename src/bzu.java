import javax.annotation.Nullable;

public class bzu extends bzo {
   private static final bvx b = bvx.a().d();
   @Nullable
   private edm c;
   @Nullable
   private ejz d;

   public bzu(bzm $$0) {
      super($$0);
   }

   @Override
   public cac<bzu> i() {
      return cac.c;
   }

   @Override
   public void d() {
      this.c = null;
      this.d = null;
   }

   @Override
   public void c() {
      double $$0 = this.d == null ? 0.0 : this.d.c(this.a.ds(), this.a.du(), this.a.dy());
      if ($$0 < 100.0 || $$0 > 22500.0 || this.a.P || this.a.Q) {
         this.j();
      }
   }

   @Nullable
   @Override
   public ejz g() {
      return this.d;
   }

   private void j() {
      if (this.c == null || this.c.c()) {
         int $$0 = this.a.A();
         hx $$1 = this.a.dN().a(dmw.a.f, dpz.a(this.a.u()));
         cdz $$2 = this.a.dN().a(b, this.a, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
         int $$4;
         if ($$2 != null) {
            ejz $$3 = new ejz($$2.ds(), 0.0, $$2.dy()).d();
            $$4 = this.a.r(-$$3.c * 40.0, 105.0, -$$3.e * 40.0);
         } else {
            $$4 = this.a.r(40.0, (double)$$1.v(), 0.0);
         }

         edk $$6 = new edk($$1.u(), $$1.v(), $$1.w());
         this.c = this.a.a($$0, $$4, $$6);
         if (this.c != null) {
            this.c.a();
         }
      }

      this.k();
      if (this.c != null && this.c.c()) {
         this.a.gc().a(cac.d);
      }
   }

   private void k() {
      if (this.c != null && !this.c.c()) {
         ja $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.eh().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new ejz($$1, $$3, $$2);
      }
   }
}
