import javax.annotation.Nullable;

public class cbd extends caq {
   private boolean b;
   @Nullable
   private efg c;
   @Nullable
   private elt d;

   public cbd(cao $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (!this.b && this.c != null) {
         hx $$0 = this.a.dM().a(doq.a.f, drt.a(this.a.u()));
         if (!$$0.a(this.a.dk(), 10.0)) {
            this.a.gb().a(cbe.a);
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
      int $$0 = this.a.A();
      elt $$1 = this.a.D(1.0F);
      int $$2 = this.a.r(-$$1.c * 40.0, 105.0, -$$1.e * 40.0);
      if (this.a.gc() != null && this.a.gc().e() > 0) {
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
            jb $$0 = this.c.g();
            this.c.a();

            double $$1;
            do {
               $$1 = (double)((float)$$0.v() + this.a.eg().i() * 20.0F);
            } while ($$1 < (double)$$0.v());

            this.d = new elt((double)$$0.u(), $$1, (double)$$0.w());
         }
      }
   }

   @Nullable
   @Override
   public elt g() {
      return this.d;
   }

   @Override
   public cbe<cbd> i() {
      return cbe.e;
   }
}
