import javax.annotation.Nullable;

public class cgt extends cgn {
   private static final ccq b = ccq.a().d();
   @Nullable
   private emo c;
   @Nullable
   private etp d;

   public cgt(cgl $$0) {
      super($$0);
   }

   @Override
   public chb<cgt> i() {
      return chb.c;
   }

   @Override
   public void d() {
      this.c = null;
      this.d = null;
   }

   @Override
   public void c() {
      double $$0 = this.d == null ? 0.0 : this.d.c(this.a.ds(), this.a.du(), this.a.dy());
      if ($$0 < 100.0 || $$0 > 22500.0 || this.a.Q || this.a.R) {
         this.j();
      }
   }

   @Nullable
   @Override
   public etp g() {
      return this.d;
   }

   private void j() {
      if (this.c == null || this.c.c()) {
         int $$0 = this.a.y();
         in $$1 = this.a.dN().a(dvz.a.f, dzc.a(this.a.r()));
         clh $$2 = this.a.dN().a(b, this.a, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
         int $$4;
         if ($$2 != null) {
            etp $$3 = new etp($$2.ds(), 0.0, $$2.dy()).d();
            $$4 = this.a.r(-$$3.c * 40.0, 105.0, -$$3.e * 40.0);
         } else {
            $$4 = this.a.r(40.0, (double)$$1.v(), 0.0);
         }

         emm $$6 = new emm($$1.u(), $$1.v(), $$1.w());
         this.c = this.a.a($$0, $$4, $$6);
         if (this.c != null) {
            this.c.a();
         }
      }

      this.k();
      if (this.c != null && this.c.c()) {
         this.a.gm().a(chb.d);
      }
   }

   private void k() {
      if (this.c != null && !this.c.c()) {
         jr $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.ej().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new etp($$1, $$3, $$2);
      }
   }
}
