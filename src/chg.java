import javax.annotation.Nullable;

public class chg extends chc {
   private static final cdf b = cdf.a().d();
   @Nullable
   private eni c;
   @Nullable
   private euk d;
   private boolean e;

   public chg(cha $$0) {
      super($$0);
   }

   @Override
   public chq<chg> i() {
      return chq.a;
   }

   @Override
   public void c() {
      double $$0 = this.d == null ? 0.0 : this.d.c(this.a.du(), this.a.dw(), this.a.dA());
      if ($$0 < 100.0 || $$0 > 22500.0 || this.a.Q || this.a.R) {
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
   public euk g() {
      return this.d;
   }

   private void j() {
      if (this.c != null && this.c.c()) {
         io $$0 = this.a.dP().a(dwt.a.f, new io(dzw.a(this.a.s())));
         int $$1 = this.a.gn() == null ? 0 : this.a.gn().e();
         if (this.a.el().a($$1 + 3) == 0) {
            this.a.gm().a(chq.c);
            return;
         }

         clw $$2 = this.a.dP().a(b, this.a, (double)$$0.u(), (double)$$0.v(), (double)$$0.w());
         double $$3;
         if ($$2 != null) {
            $$3 = $$0.b($$2.dn()) / 512.0;
         } else {
            $$3 = 64.0;
         }

         if ($$2 != null && (this.a.el().a((int)($$3 + 2.0)) == 0 || this.a.el().a($$1 + 2) == 0)) {
            this.a($$2);
            return;
         }
      }

      if (this.c == null || this.c.c()) {
         int $$5 = this.a.y();
         int $$6 = $$5;
         if (this.a.el().a(8) == 0) {
            this.e = !this.e;
            $$6 = $$5 + 6;
         }

         if (this.e) {
            $$6++;
         } else {
            $$6--;
         }

         if (this.a.gn() != null && this.a.gn().e() >= 0) {
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

   private void a(clw $$0) {
      this.a.gm().a(chq.b);
      this.a.gm().b(chq.b).a($$0);
   }

   private void k() {
      if (this.c != null && !this.c.c()) {
         js $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.el().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new euk($$1, $$3, $$2);
      }
   }

   @Override
   public void a(cgz $$0, io $$1, bqn $$2, @Nullable clw $$3) {
      if ($$3 != null && this.a.c($$3)) {
         this.a($$3);
      }
   }
}
