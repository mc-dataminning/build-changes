import javax.annotation.Nullable;

public class cja extends ciu {
   private static final cev b = cev.a().d();
   @Nullable
   private eqp c;
   @Nullable
   private eye d;

   public cja(cis $$0) {
      super($$0);
   }

   @Override
   public cji<cja> i() {
      return cji.c;
   }

   @Override
   public void d() {
      this.c = null;
      this.d = null;
   }

   @Override
   public void c() {
      double $$0 = this.d == null ? 0.0 : this.d.c(this.a.dx(), this.a.dz(), this.a.dD());
      if ($$0 < 100.0 || $$0 > 22500.0 || this.a.Q || this.a.R) {
         this.j();
      }
   }

   @Nullable
   @Override
   public eye g() {
      return this.d;
   }

   private void j() {
      if (this.c == null || this.c.c()) {
         int $$0 = this.a.y();
         je $$1 = this.a.dS().a(dzw.a.f, edb.a(this.a.q()));
         cnp $$2 = this.a.dS().a(b, this.a, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
         int $$4;
         if ($$2 != null) {
            eye $$3 = new eye($$2.dx(), 0.0, $$2.dD()).d();
            $$4 = this.a.q(-$$3.d * 40.0, 105.0, -$$3.f * 40.0);
         } else {
            $$4 = this.a.q(40.0, (double)$$1.v(), 0.0);
         }

         eqn $$6 = new eqn($$1.u(), $$1.v(), $$1.w());
         this.c = this.a.a($$0, $$4, $$6);
         if (this.c != null) {
            this.c.a();
         }
      }

      this.k();
      if (this.c != null && this.c.c()) {
         this.a.gl().a(cji.d);
      }
   }

   private void k() {
      if (this.c != null && !this.c.c()) {
         ki $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.dV().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new eye($$1, $$3, $$2);
      }
   }
}
