import javax.annotation.Nullable;

public class cji extends cjc {
   private static final cfd b = cfd.a().d();
   @Nullable
   private erh c;
   @Nullable
   private eyw d;

   public cji(cja $$0) {
      super($$0);
   }

   @Override
   public cjq<cji> i() {
      return cjq.c;
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
   public eyw g() {
      return this.d;
   }

   private void j() {
      if (this.c == null || this.c.c()) {
         int $$0 = this.a.y();
         jf $$1 = this.a.dS().a(eao.a.f, edt.a(this.a.q()));
         cnx $$2 = this.a.dS().a(b, this.a, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
         int $$4;
         if ($$2 != null) {
            eyw $$3 = new eyw($$2.dx(), 0.0, $$2.dD()).d();
            $$4 = this.a.q(-$$3.d * 40.0, 105.0, -$$3.f * 40.0);
         } else {
            $$4 = this.a.q(40.0, (double)$$1.v(), 0.0);
         }

         erf $$6 = new erf($$1.u(), $$1.v(), $$1.w());
         this.c = this.a.a($$0, $$4, $$6);
         if (this.c != null) {
            this.c.a();
         }
      }

      this.k();
      if (this.c != null && this.c.c()) {
         this.a.gl().a(cjq.d);
      }
   }

   private void k() {
      if (this.c != null && !this.c.c()) {
         kj $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.dV().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new eyw($$1, $$3, $$2);
      }
   }
}
