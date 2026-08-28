import javax.annotation.Nullable;

public class cht extends chp {
   private static final cds b = cds.a().d();
   @Nullable
   private eov c;
   @Nullable
   private ewf d;
   private boolean e;

   public cht(chn $$0) {
      super($$0);
   }

   @Override
   public cid<cht> i() {
      return cid.a;
   }

   @Override
   public void c() {
      double $$0 = this.d == null ? 0.0 : this.d.c(this.a.dv(), this.a.dx(), this.a.dB());
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
   public ewf g() {
      return this.d;
   }

   private void j() {
      if (this.c != null && this.c.c()) {
         ja $$0 = this.a.dQ().a(dyf.a.f, new ja(ebj.a(this.a.s())));
         int $$1 = this.a.gm() == null ? 0 : this.a.gm().e();
         if (this.a.dT().a($$1 + 3) == 0) {
            this.a.gl().a(cid.c);
            return;
         }

         cmk $$2 = this.a.dQ().a(b, this.a, (double)$$0.u(), (double)$$0.v(), (double)$$0.w());
         double $$3;
         if ($$2 != null) {
            $$3 = $$0.b($$2.do()) / 512.0;
         } else {
            $$3 = 64.0;
         }

         if ($$2 != null && (this.a.dT().a((int)($$3 + 2.0)) == 0 || this.a.dT().a($$1 + 2) == 0)) {
            this.a($$2);
            return;
         }
      }

      if (this.c == null || this.c.c()) {
         int $$5 = this.a.y();
         int $$6 = $$5;
         if (this.a.dT().a(8) == 0) {
            this.e = !this.e;
            $$6 = $$5 + 6;
         }

         if (this.e) {
            $$6++;
         } else {
            $$6--;
         }

         if (this.a.gm() != null && this.a.gm().e() >= 0) {
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

   private void a(cmk $$0) {
      this.a.gl().a(cid.b);
      this.a.gl().b(cid.b).a($$0);
   }

   private void k() {
      if (this.c != null && !this.c.c()) {
         ke $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.dT().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new ewf($$1, $$3, $$2);
      }
   }

   @Override
   public void a(chm $$0, ja $$1, bqz $$2, @Nullable cmk $$3) {
      if ($$3 != null && this.a.c($$3)) {
         this.a($$3);
      }
   }
}
