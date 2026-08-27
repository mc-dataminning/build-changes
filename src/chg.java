import javax.annotation.Nullable;

public class chg extends chc {
   private static final cde b = cde.a().d();
   @Nullable
   private eps c;
   @Nullable
   private ewu d;
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
      double $$0 = this.d == null ? 0.0 : this.d.c(this.a.dz(), this.a.dB(), this.a.dF());
      if ($$0 < 100.0 || $$0 > 22500.0 || this.a.R || this.a.S) {
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
   public ewu g() {
      return this.d;
   }

   private void j() {
      if (this.c != null && this.c.c()) {
         ir $$0 = this.a.dU().a(dyu.a.f, new ir(ebz.a(this.a.r())));
         int $$1 = this.a.gw() == null ? 0 : this.a.gw().e();
         if (this.a.et().a($$1 + 3) == 0) {
            this.a.gv().a(chq.c);
            return;
         }

         cly $$2 = this.a.dU().a(b, this.a, (double)$$0.u(), (double)$$0.v(), (double)$$0.w());
         double $$3;
         if ($$2 != null) {
            $$3 = $$0.b($$2.ds()) / 512.0;
         } else {
            $$3 = 64.0;
         }

         if ($$2 != null && (this.a.et().a((int)($$3 + 2.0)) == 0 || this.a.et().a($$1 + 2) == 0)) {
            this.a($$2);
            return;
         }
      }

      if (this.c == null || this.c.c()) {
         int $$5 = this.a.x();
         int $$6 = $$5;
         if (this.a.et().a(8) == 0) {
            this.e = !this.e;
            $$6 = $$5 + 6;
         }

         if (this.e) {
            $$6++;
         } else {
            $$6--;
         }

         if (this.a.gw() != null && this.a.gw().e() >= 0) {
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

   private void a(cly $$0) {
      this.a.gv().a(chq.b);
      this.a.gv().b(chq.b).a($$0);
   }

   private void k() {
      if (this.c != null && !this.c.c()) {
         jv $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.et().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new ewu($$1, $$3, $$2);
      }
   }

   @Override
   public void a(cgz $$0, ir $$1, bqt $$2, @Nullable cly $$3) {
      if ($$3 != null && this.a.c($$3)) {
         this.a($$3);
      }
   }
}
