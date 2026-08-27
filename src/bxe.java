import javax.annotation.Nullable;

public class bxe extends bxa {
   private static final btj b = btj.a().d();
   @Nullable
   private eaq c;
   @Nullable
   private ehf d;
   private boolean e;

   public bxe(bwy $$0) {
      super($$0);
   }

   @Override
   public bxo<bxe> i() {
      return bxo.a;
   }

   @Override
   public void c() {
      double $$0 = this.d == null ? 0.0 : this.d.c(this.a.dp(), this.a.dr(), this.a.dv());
      if ($$0 < 100.0 || $$0 > 22500.0 || this.a.P || this.a.Q) {
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
   public ehf g() {
      return this.d;
   }

   private void j() {
      if (this.c != null && this.c.c()) {
         gv $$0 = this.a.dK().a(dkh.a.f, new gv(dnk.a(this.a.p())));
         int $$1 = this.a.fX() == null ? 0 : this.a.fX().e();
         if (this.a.ee().a($$1 + 3) == 0) {
            this.a.fW().a(bxo.c);
            return;
         }

         cbl $$2 = this.a.dK().a(b, this.a, (double)$$0.u(), (double)$$0.v(), (double)$$0.w());
         double $$3;
         if ($$2 != null) {
            $$3 = $$0.b($$2.di()) / 512.0;
         } else {
            $$3 = 64.0;
         }

         if ($$2 != null && (this.a.ee().a((int)($$3 + 2.0)) == 0 || this.a.ee().a($$1 + 2) == 0)) {
            this.a($$2);
            return;
         }
      }

      if (this.c == null || this.c.c()) {
         int $$5 = this.a.t();
         int $$6 = $$5;
         if (this.a.ee().a(8) == 0) {
            this.e = !this.e;
            $$6 = $$5 + 6;
         }

         if (this.e) {
            $$6++;
         } else {
            $$6--;
         }

         if (this.a.fX() != null && this.a.fX().e() >= 0) {
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

   private void a(cbl $$0) {
      this.a.fW().a(bxo.b);
      this.a.fW().b(bxo.b).a($$0);
   }

   private void k() {
      if (this.c != null && !this.c.c()) {
         ia $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.ee().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new ehf($$1, $$3, $$2);
      }
   }

   @Override
   public void a(bwx $$0, gv $$1, bhe $$2, @Nullable cbl $$3) {
      if ($$3 != null && this.a.c($$3)) {
         this.a($$3);
      }
   }
}
