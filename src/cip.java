import javax.annotation.Nullable;

public class cip extends cic {
   private boolean b;
   @Nullable
   private eps c;
   @Nullable
   private exc d;

   public cip(cia $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (!this.b && this.c != null) {
         jd $$0 = this.a.dO().a(dyy.a.f, ecd.a(this.a.s()));
         if (!$$0.a(this.a.dm(), 10.0)) {
            this.a.gh().a(ciq.a);
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
      exc $$1 = this.a.H(1.0F);
      int $$2 = this.a.q(-$$1.c * 40.0, 105.0, -$$1.e * 40.0);
      if (this.a.gi() != null && this.a.gi().e() > 0) {
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
            kh $$0 = this.c.g();
            this.c.a();

            double $$1;
            do {
               $$1 = (double)((float)$$0.v() + this.a.dR().i() * 20.0F);
            } while ($$1 < (double)$$0.v());

            this.d = new exc((double)$$0.u(), $$1, (double)$$0.w());
         }
      }
   }

   @Nullable
   @Override
   public exc g() {
      return this.d;
   }

   @Override
   public ciq<cip> i() {
      return ciq.e;
   }
}
