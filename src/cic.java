import javax.annotation.Nullable;

public class cic extends chp {
   private boolean b;
   @Nullable
   private eov c;
   @Nullable
   private ewf d;

   public cic(chn $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (!this.b && this.c != null) {
         ja $$0 = this.a.dQ().a(dyf.a.f, ebj.a(this.a.s()));
         if (!$$0.a(this.a.do(), 10.0)) {
            this.a.gl().a(cid.a);
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
      int $$0 = this.a.y();
      ewf $$1 = this.a.G(1.0F);
      int $$2 = this.a.r(-$$1.c * 40.0, 105.0, -$$1.e * 40.0);
      if (this.a.gm() != null && this.a.gm().e() > 0) {
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
               $$1 = (double)((float)$$0.v() + this.a.dT().i() * 20.0F);
            } while ($$1 < (double)$$0.v());

            this.d = new ewf((double)$$0.u(), $$1, (double)$$0.w());
         }
      }
   }

   @Nullable
   @Override
   public ewf g() {
      return this.d;
   }

   @Override
   public cid<cic> i() {
      return cid.e;
   }
}
