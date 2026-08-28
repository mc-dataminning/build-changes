import javax.annotation.Nullable;

public class clj extends ckw {
   private boolean b;
   @Nullable
   private eul c;
   @Nullable
   private fby d;

   public clj(cku $$0) {
      super($$0);
   }

   @Override
   public void a(ash $$0) {
      if (!this.b && this.c != null) {
         jh $$1 = $$0.a(edq.a.f, egv.a(this.a.m()));
         if (!$$1.a(this.a.du(), 10.0)) {
            this.a.gk().a(clk.a);
         }
      } else {
         this.b = false;
         this.i();
      }
   }

   @Override
   public void c() {
      this.b = true;
      this.c = null;
      this.d = null;
   }

   private void i() {
      int $$0 = this.a.t();
      fby $$1 = this.a.J(1.0F);
      int $$2 = this.a.q(-$$1.d * 40.0, 105.0, -$$1.f * 40.0);
      if (this.a.gl() != null && this.a.gl().e() > 0) {
         $$2 %= 12;
         if ($$2 < 0) {
            $$2 += 12;
         }
      } else {
         $$2 -= 12;
         $$2 &= 7;
         $$2 += 12;
      }

      this.c = this.a.a($$0, $$2, null);
      this.j();
   }

   private void j() {
      if (this.c != null) {
         this.c.a();
         if (!this.c.c()) {
            kl $$0 = this.c.g();
            this.c.a();

            double $$1;
            do {
               $$1 = (double)((float)$$0.v() + this.a.dZ().i() * 20.0F);
            } while ($$1 < (double)$$0.v());

            this.d = new fby((double)$$0.u(), $$1, (double)$$0.w());
         }
      }
   }

   @Nullable
   @Override
   public fby f() {
      return this.d;
   }

   @Override
   public clk<clj> h() {
      return clk.e;
   }
}
