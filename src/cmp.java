import javax.annotation.Nullable;

public class cmp extends cmj {
   private static final chy b = chy.a().d();
   @Nullable
   private exj c;
   @Nullable
   private fex d;

   public cmp(cmh $$0) {
      super($$0);
   }

   @Override
   public cmx<cmp> h() {
      return cmx.c;
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
   public fex f() {
      return this.d;
   }

   private void b(arq $$0) {
      if (this.c == null || this.c.c()) {
         int $$1 = this.a.n();
         iv $$2 = $$0.a(egn.a.f, ejs.a(this.a.j()));
         crj $$3 = $$0.a(b, this.a, (double)$$2.u(), (double)$$2.v(), (double)$$2.w());
         int $$5;
         if ($$3 != null) {
            fex $$4 = new fex($$3.dz(), 0.0, $$3.dF()).d();
            $$5 = this.a.q(-$$4.d * 40.0, 105.0, -$$4.f * 40.0);
         } else {
            $$5 = this.a.q(40.0, (double)$$2.v(), 0.0);
         }

         exh $$7 = new exh($$2.u(), $$2.v(), $$2.w());
         this.c = this.a.a($$1, $$5, $$7);
         if (this.c != null) {
            this.c.a();
         }
      }

      this.i();
      if (this.c != null && this.c.c()) {
         this.a.t().a(cmx.d);
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

         this.d = new fex($$1, $$3, $$2);
      }
   }
}
