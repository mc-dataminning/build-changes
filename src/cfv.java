import javax.annotation.Nullable;

public class cfv extends cfr {
   private static final cbu b = cbu.a().d();
   @Nullable
   private emf c;
   @Nullable
   private etf d;
   private boolean e;

   public cfv(cfp $$0) {
      super($$0);
   }

   @Override
   public cgf<cfv> i() {
      return cgf.a;
   }

   @Override
   public void c() {
      double $$0 = this.d == null ? 0.0 : this.d.c(this.a.ds(), this.a.du(), this.a.dy());
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
   public etf g() {
      return this.d;
   }

   private void j() {
      if (this.c != null && this.c.c()) {
         im $$0 = this.a.dN().a(dvq.a.f, new im(dyt.a(this.a.r())));
         int $$1 = this.a.gn() == null ? 0 : this.a.gn().e();
         if (this.a.ej().a($$1 + 3) == 0) {
            this.a.gm().a(cgf.c);
            return;
         }

         ckl $$2 = this.a.dN().a(b, this.a, (double)$$0.u(), (double)$$0.v(), (double)$$0.w());
         double $$3;
         if ($$2 != null) {
            $$3 = $$0.b($$2.dl()) / 512.0;
         } else {
            $$3 = 64.0;
         }

         if ($$2 != null && (this.a.ej().a((int)($$3 + 2.0)) == 0 || this.a.ej().a($$1 + 2) == 0)) {
            this.a($$2);
            return;
         }
      }

      if (this.c == null || this.c.c()) {
         int $$5 = this.a.y();
         int $$6 = $$5;
         if (this.a.ej().a(8) == 0) {
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

   private void a(ckl $$0) {
      this.a.gm().a(cgf.b);
      this.a.gm().b(cgf.b).a($$0);
   }

   private void k() {
      if (this.c != null && !this.c.c()) {
         jq $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.ej().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new etf($$1, $$3, $$2);
      }
   }

   @Override
   public void a(cfo $$0, im $$1, bpj $$2, @Nullable ckl $$3) {
      if ($$3 != null && this.a.c($$3)) {
         this.a($$3);
      }
   }
}
