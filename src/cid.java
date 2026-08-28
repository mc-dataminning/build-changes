import javax.annotation.Nullable;

public class cid extends chq {
   private boolean b;
   @Nullable
   private eox c;
   @Nullable
   private ewh d;

   public cid(cho $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (!this.b && this.c != null) {
         ja $$0 = this.a.dR().a(dyg.a.f, ebk.a(this.a.s()));
         if (!$$0.a(this.a.dp(), 10.0)) {
            this.a.gk().a(cie.a);
         }
      } else {
         this.b = false;
         this.j();
      }
   }

   @Override
   public void d() {
      this.b = true;
      this.c = null;
      this.d = null;
   }

   private void j() {
      int $$0 = this.a.x();
      ewh $$1 = this.a.G(1.0F);
      int $$2 = this.a.r(-$$1.c * 40.0, 105.0, -$$1.e * 40.0);
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
      this.k();
   }

   private void k() {
      if (this.c != null) {
         this.c.a();
         if (!this.c.c()) {
            ke $$0 = this.c.g();
            this.c.a();

            double $$1;
            do {
               $$1 = (double)((float)$$0.v() + this.a.dU().i() * 20.0F);
            } while ($$1 < (double)$$0.v());

            this.d = new ewh((double)$$0.u(), $$1, (double)$$0.w());
         }
      }
   }

   @Nullable
   @Override
   public ewh g() {
      return this.d;
   }

   @Override
   public cie<cid> i() {
      return cie.e;
   }
}
