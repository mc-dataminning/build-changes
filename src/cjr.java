import javax.annotation.Nullable;

public class cjr extends cjl {
   private static final cfm b = cfm.a().d();
   @Nullable
   private ers c;
   @Nullable
   private ezh d;

   public cjr(cjj $$0) {
      super($$0);
   }

   @Override
   public cjz<cjr> i() {
      return cjz.c;
   }

   @Override
   public void d() {
      this.c = null;
      this.d = null;
   }

   @Override
   public void c() {
      double $$0 = this.d == null ? 0.0 : this.d.c(this.a.dC(), this.a.dE(), this.a.dI());
      if ($$0 < 100.0 || $$0 > 22500.0 || this.a.Q || this.a.R) {
         this.j();
      }
   }

   @Nullable
   @Override
   public ezh g() {
      return this.d;
   }

   private void j() {
      if (this.c == null || this.c.c()) {
         int $$0 = this.a.y();
         jg $$1 = this.a.dX().a(eaz.a.f, eee.a(this.a.q()));
         coh $$2 = this.a.dX().a(b, this.a, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
         int $$4;
         if ($$2 != null) {
            ezh $$3 = new ezh($$2.dC(), 0.0, $$2.dI()).d();
            $$4 = this.a.q(-$$3.d * 40.0, 105.0, -$$3.f * 40.0);
         } else {
            $$4 = this.a.q(40.0, (double)$$1.v(), 0.0);
         }

         erq $$6 = new erq($$1.u(), $$1.v(), $$1.w());
         this.c = this.a.a($$0, $$4, $$6);
         if (this.c != null) {
            this.c.a();
         }
      }

      this.k();
      if (this.c != null && this.c.c()) {
         this.a.gs().a(cjz.d);
      }
   }

   private void k() {
      if (this.c != null && !this.c.c()) {
         kk $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.ea().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new ezh($$1, $$3, $$2);
      }
   }
}
