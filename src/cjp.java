import javax.annotation.Nullable;

public class cjp extends cjc {
   private boolean b;
   @Nullable
   private erh c;
   @Nullable
   private eyw d;

   public cjp(cja $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (!this.b && this.c != null) {
         jf $$0 = this.a.dS().a(eao.a.f, edt.a(this.a.q()));
         if (!$$0.a(this.a.dq(), 10.0)) {
            this.a.gl().a(cjq.a);
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
      eyw $$1 = this.a.J(1.0F);
      int $$2 = this.a.q(-$$1.d * 40.0, 105.0, -$$1.f * 40.0);
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
            kj $$0 = this.c.g();
            this.c.a();

            double $$1;
            do {
               $$1 = (double)((float)$$0.v() + this.a.dV().i() * 20.0F);
            } while ($$1 < (double)$$0.v());

            this.d = new eyw((double)$$0.u(), $$1, (double)$$0.w());
         }
      }
   }

   @Nullable
   @Override
   public eyw g() {
      return this.d;
   }

   @Override
   public cjq<cjp> i() {
      return cjq.e;
   }
}
