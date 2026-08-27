import javax.annotation.Nullable;

public class chi extends chc {
   private static final cde b = cde.a().d();
   @Nullable
   private eps c;
   @Nullable
   private ewu d;

   public chi(cha $$0) {
      super($$0);
   }

   @Override
   public chq<chi> i() {
      return chq.c;
   }

   @Override
   public void d() {
      this.c = null;
      this.d = null;
   }

   @Override
   public void c() {
      double $$0 = this.d == null ? 0.0 : this.d.c(this.a.dz(), this.a.dB(), this.a.dF());
      if ($$0 < 100.0 || $$0 > 22500.0 || this.a.R || this.a.S) {
         this.j();
      }
   }

   @Nullable
   @Override
   public ewu g() {
      return this.d;
   }

   private void j() {
      if (this.c == null || this.c.c()) {
         int $$0 = this.a.x();
         ir $$1 = this.a.dU().a(dyu.a.f, ebz.a(this.a.r()));
         cly $$2 = this.a.dU().a(b, this.a, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
         int $$4;
         if ($$2 != null) {
            ewu $$3 = new ewu($$2.dz(), 0.0, $$2.dF()).d();
            $$4 = this.a.r(-$$3.c * 40.0, 105.0, -$$3.e * 40.0);
         } else {
            $$4 = this.a.r(40.0, (double)$$1.v(), 0.0);
         }

         epq $$6 = new epq($$1.u(), $$1.v(), $$1.w());
         this.c = this.a.a($$0, $$4, $$6);
         if (this.c != null) {
            this.c.a();
         }
      }

      this.k();
      if (this.c != null && this.c.c()) {
         this.a.gv().a(chq.d);
      }
   }

   private void k() {
      if (this.c != null && !this.c.c()) {
         jv $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.et().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new ewu($$1, $$3, $$2);
      }
   }
}
