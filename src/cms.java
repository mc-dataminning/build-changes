import javax.annotation.Nullable;

public class cms extends cmm {
   private static final chy b = chy.a().d();
   @Nullable
   private exo c;
   @Nullable
   private ffc d;

   public cms(cmk $$0) {
      super($$0);
   }

   @Override
   public cna<cms> h() {
      return cna.c;
   }

   @Override
   public void c() {
      this.c = null;
      this.d = null;
   }

   @Override
   public void a(arq $$0) {
      double $$1 = this.d == null ? 0.0 : this.d.c(this.a.dz(), this.a.dB(), this.a.dF());
      if ($$1 < 100.0 || $$1 > 22500.0 || this.a.P || this.a.Q) {
         this.b($$0);
      }
   }

   @Nullable
   @Override
   public ffc f() {
      return this.d;
   }

   private void b(arq $$0) {
      if (this.c == null || this.c.c()) {
         int $$1 = this.a.n();
         iv $$2 = $$0.a(egs.a.f, ejx.a(this.a.j()));
         crm $$3 = $$0.a(b, this.a, (double)$$2.u(), (double)$$2.v(), (double)$$2.w());
         int $$5;
         if ($$3 != null) {
            ffc $$4 = new ffc($$3.dz(), 0.0, $$3.dF()).d();
            $$5 = this.a.q(-$$4.d * 40.0, 105.0, -$$4.f * 40.0);
         } else {
            $$5 = this.a.q(40.0, (double)$$2.v(), 0.0);
         }

         exm $$7 = new exm($$2.u(), $$2.v(), $$2.w());
         this.c = this.a.a($$1, $$5, $$7);
         if (this.c != null) {
            this.c.a();
         }
      }

      this.i();
      if (this.c != null && this.c.c()) {
         this.a.t().a(cna.d);
      }
   }

   private void i() {
      if (this.c != null && !this.c.c()) {
         ka $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.dX().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new ffc($$1, $$3, $$2);
      }
   }
}
