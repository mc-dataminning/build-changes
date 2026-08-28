import javax.annotation.Nullable;

public class clb extends ckv {
   private static final cgw b = cgw.a().d();
   @Nullable
   private euk c;
   @Nullable
   private fbx d;

   public clb(ckt $$0) {
      super($$0);
   }

   @Override
   public clj<clb> h() {
      return clj.c;
   }

   @Override
   public void c() {
      this.c = null;
      this.d = null;
   }

   @Override
   public void a(ash $$0) {
      double $$1 = this.d == null ? 0.0 : this.d.c(this.a.dB(), this.a.dD(), this.a.dH());
      if ($$1 < 100.0 || $$1 > 22500.0 || this.a.P || this.a.Q) {
         this.b($$0);
      }
   }

   @Nullable
   @Override
   public fbx f() {
      return this.d;
   }

   private void b(ash $$0) {
      if (this.c == null || this.c.c()) {
         int $$1 = this.a.t();
         jh $$2 = $$0.a(edp.a.f, egu.a(this.a.m()));
         cpw $$3 = $$0.a(b, this.a, (double)$$2.u(), (double)$$2.v(), (double)$$2.w());
         int $$5;
         if ($$3 != null) {
            fbx $$4 = new fbx($$3.dB(), 0.0, $$3.dH()).d();
            $$5 = this.a.q(-$$4.d * 40.0, 105.0, -$$4.f * 40.0);
         } else {
            $$5 = this.a.q(40.0, (double)$$2.v(), 0.0);
         }

         eui $$7 = new eui($$2.u(), $$2.v(), $$2.w());
         this.c = this.a.a($$1, $$5, $$7);
         if (this.c != null) {
            this.c.a();
         }
      }

      this.i();
      if (this.c != null && this.c.c()) {
         this.a.gk().a(clj.d);
      }
   }

   private void i() {
      if (this.c != null && !this.c.c()) {
         kl $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.dZ().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new fbx($$1, $$3, $$2);
      }
   }
}
