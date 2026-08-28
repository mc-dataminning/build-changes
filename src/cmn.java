import javax.annotation.Nullable;

public class cmn extends cmj {
   private static final chy b = chy.a().d();
   @Nullable
   private exj c;
   @Nullable
   private fex d;
   private boolean e;

   public cmn(cmh $$0) {
      super($$0);
   }

   @Override
   public cmx<cmn> h() {
      return cmx.a;
   }

   @Override
   public void a(arq $$0) {
      double $$1 = this.d == null ? 0.0 : this.d.c(this.a.dz(), this.a.dB(), this.a.dF());
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
   public fex f() {
      return this.d;
   }

   private void b(arq $$0) {
      if (this.c != null && this.c.c()) {
         iv $$1 = $$0.a(egn.a.f, ejs.a(this.a.j()));
         int $$2 = this.a.x() == null ? 0 : this.a.x().e();
         if (this.a.dX().a($$2 + 3) == 0) {
            this.a.t().a(cmx.c);
            return;
         }

         crj $$3 = $$0.a(b, this.a, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
         double $$4;
         if ($$3 != null) {
            $$4 = $$1.b($$3.ds()) / 512.0;
         } else {
            $$4 = 64.0;
         }

         if ($$3 != null && (this.a.dX().a((int)($$4 + 2.0)) == 0 || this.a.dX().a($$2 + 2) == 0)) {
            this.a($$3);
            return;
         }
      }

      if (this.c == null || this.c.c()) {
         int $$6 = this.a.n();
         int $$7 = $$6;
         if (this.a.dX().a(8) == 0) {
            this.e = !this.e;
            $$7 = $$6 + 6;
         }

         if (this.e) {
            $$7++;
         } else {
            $$7--;
         }

         if (this.a.x() != null && this.a.x().e() >= 0) {
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

   private void a(crj $$0) {
      this.a.t().a(cmx.b);
      this.a.t().b(cmx.b).a($$0);
   }

   private void i() {
      if (this.c != null && !this.c.c()) {
         ka $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.dX().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new fex($$1, $$3, $$2);
      }
   }

   @Override
   public void a(cmg $$0, iv $$1, bux $$2, @Nullable crj $$3) {
      if ($$3 != null && this.a.c($$3)) {
         this.a($$3);
      }
   }
}
