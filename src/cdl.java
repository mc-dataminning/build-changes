import javax.annotation.Nullable;

public class cdl extends cdh {
   private static final bzn b = bzn.a().d();
   @Nullable
   private eig c;
   @Nullable
   private eov d;
   private boolean e;

   public cdl(cdf $$0) {
      super($$0);
   }

   @Override
   public cdv<cdl> i() {
      return cdv.a;
   }

   @Override
   public void c() {
      double $$0 = this.d == null ? 0.0 : this.d.c(this.a.do(), this.a.dq(), this.a.du());
      if ($$0 < 100.0 || $$0 > 22500.0 || this.a.O || this.a.P) {
         this.j();
      }
   }

   @Override
   public void d() {
      this.c = null;
      this.d = null;
   }

   @Nullable
   @Override
   public eov g() {
      return this.d;
   }

   private void j() {
      if (this.c != null && this.c.c()) {
         ib $$0 = this.a.dJ().a(drq.a.f, new ib(dut.a(this.a.u())));
         int $$1 = this.a.gj() == null ? 0 : this.a.gj().e();
         if (this.a.ef().a($$1 + 3) == 0) {
            this.a.gi().a(cdv.c);
            return;
         }

         cia $$2 = this.a.dJ().a(b, this.a, (double)$$0.u(), (double)$$0.v(), (double)$$0.w());
         double $$3;
         if ($$2 != null) {
            $$3 = $$0.b($$2.dh()) / 512.0;
         } else {
            $$3 = 64.0;
         }

         if ($$2 != null && (this.a.ef().a((int)($$3 + 2.0)) == 0 || this.a.ef().a($$1 + 2) == 0)) {
            this.a($$2);
            return;
         }
      }

      if (this.c == null || this.c.c()) {
         int $$5 = this.a.A();
         int $$6 = $$5;
         if (this.a.ef().a(8) == 0) {
            this.e = !this.e;
            $$6 = $$5 + 6;
         }

         if (this.e) {
            $$6++;
         } else {
            $$6--;
         }

         if (this.a.gj() != null && this.a.gj().e() >= 0) {
            $$6 %= 12;
            if ($$6 < 0) {
               $$6 += 12;
            }
         } else {
            $$6 -= 12;
            $$6 &= 7;
            $$6 += 12;
         }

         this.c = this.a.a($$5, $$6, null);
         if (this.c != null) {
            this.c.a();
         }
      }

      this.k();
   }

   private void a(cia $$0) {
      this.a.gi().a(cdv.b);
      this.a.gi().b(cdv.b).a($$0);
   }

   private void k() {
      if (this.c != null && !this.c.c()) {
         jf $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.ef().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new eov($$1, $$3, $$2);
      }
   }

   @Override
   public void a(cde $$0, ib $$1, bne $$2, @Nullable cia $$3) {
      if ($$3 != null && this.a.c($$3)) {
         this.a($$3);
      }
   }
}
