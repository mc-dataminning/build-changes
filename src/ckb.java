import javax.annotation.Nullable;

public class ckb extends cjx {
   private static final cfy b = cfy.a().d();
   @Nullable
   private esj c;
   @Nullable
   private ezy d;
   private boolean e;

   public ckb(cjv $$0) {
      super($$0);
   }

   @Override
   public ckl<ckb> h() {
      return ckl.a;
   }

   @Override
   public void a(arp $$0) {
      double $$1 = this.d == null ? 0.0 : this.d.c(this.a.dA(), this.a.dC(), this.a.dG());
      if ($$1 < 100.0 || $$1 > 22500.0 || this.a.P || this.a.Q) {
         this.b($$0);
      }
   }

   @Override
   public void c() {
      this.c = null;
      this.d = null;
   }

   @Nullable
   @Override
   public ezy f() {
      return this.d;
   }

   private void b(arp $$0) {
      if (this.c != null && this.c.c()) {
         jh $$1 = $$0.a(ebq.a.f, eev.a(this.a.n()));
         int $$2 = this.a.gk() == null ? 0 : this.a.gk().e();
         if (this.a.dY().a($$2 + 3) == 0) {
            this.a.gj().a(ckl.c);
            return;
         }

         cou $$3 = $$0.a(b, this.a, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
         double $$4;
         if ($$3 != null) {
            $$4 = $$1.b($$3.dt()) / 512.0;
         } else {
            $$4 = 64.0;
         }

         if ($$3 != null && (this.a.dY().a((int)($$4 + 2.0)) == 0 || this.a.dY().a($$2 + 2) == 0)) {
            this.a($$3);
            return;
         }
      }

      if (this.c == null || this.c.c()) {
         int $$6 = this.a.v();
         int $$7 = $$6;
         if (this.a.dY().a(8) == 0) {
            this.e = !this.e;
            $$7 = $$6 + 6;
         }

         if (this.e) {
            $$7++;
         } else {
            $$7--;
         }

         if (this.a.gk() != null && this.a.gk().e() >= 0) {
            $$7 %= 12;
            if ($$7 < 0) {
               $$7 += 12;
            }
         } else {
            $$7 -= 12;
            $$7 &= 7;
            $$7 += 12;
         }

         this.c = this.a.a($$6, $$7, null);
         if (this.c != null) {
            this.c.a();
         }
      }

      this.i();
   }

   private void a(cou $$0) {
      this.a.gj().a(ckl.b);
      this.a.gj().b(ckl.b).a($$0);
   }

   private void i() {
      if (this.c != null && !this.c.c()) {
         kl $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.dY().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new ezy($$1, $$3, $$2);
      }
   }

   @Override
   public void a(cju $$0, jh $$1, btb $$2, @Nullable cou $$3) {
      if ($$3 != null && this.a.c($$3)) {
         this.a($$3);
      }
   }
}
