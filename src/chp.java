import javax.annotation.Nullable;

public class chp extends chc {
   private boolean b;
   @Nullable
   private eps c;
   @Nullable
   private ewu d;

   public chp(cha $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (!this.b && this.c != null) {
         ir $$0 = this.a.dU().a(dyu.a.f, ebz.a(this.a.r()));
         if (!$$0.a(this.a.ds(), 10.0)) {
            this.a.gv().a(chq.a);
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
      ewu $$1 = this.a.F(1.0F);
      int $$2 = this.a.r(-$$1.c * 40.0, 105.0, -$$1.e * 40.0);
      if (this.a.gw() != null && this.a.gw().e() > 0) {
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
            jv $$0 = this.c.g();
            this.c.a();

            double $$1;
            do {
               $$1 = (double)((float)$$0.v() + this.a.et().i() * 20.0F);
            } while ($$1 < (double)$$0.v());

            this.d = new ewu((double)$$0.u(), $$1, (double)$$0.w());
         }
      }
   }

   @Nullable
   @Override
   public ewu g() {
      return this.d;
   }

   @Override
   public chq<chp> i() {
      return chq.e;
   }
}
