import javax.annotation.Nullable;

public class cgr extends cgn {
   private static final ccq b = ccq.a().d();
   @Nullable
   private emo c;
   @Nullable
   private etp d;
   private boolean e;

   public cgr(cgl $$0) {
      super($$0);
   }

   @Override
   public chb<cgr> i() {
      return chb.a;
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
   public etp g() {
      return this.d;
   }

   private void j() {
      if (this.c != null && this.c.c()) {
         in $$0 = this.a.dN().a(dvz.a.f, new in(dzc.a(this.a.r())));
         int $$1 = this.a.gn() == null ? 0 : this.a.gn().e();
         if (this.a.ej().a($$1 + 3) == 0) {
            this.a.gm().a(chb.c);
            return;
         }

         clh $$2 = this.a.dN().a(b, this.a, (double)$$0.u(), (double)$$0.v(), (double)$$0.w());
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

   private void a(clh $$0) {
      this.a.gm().a(chb.b);
      this.a.gm().b(chb.b).a($$0);
   }

   private void k() {
      if (this.c != null && !this.c.c()) {
         jr $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.ej().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new etp($$1, $$3, $$2);
      }
   }

   @Override
   public void a(cgk $$0, in $$1, bqf $$2, @Nullable clh $$3) {
      if ($$3 != null && this.a.c($$3)) {
         this.a($$3);
      }
   }
}
