import javax.annotation.Nullable;

public class exj extends exw {
   private final boolean a;
   private float m;
   private float n;

   public exj(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void a(djz $$0, bxl $$1) {
      super.a($$0, $$1);
      $$1.a(exr.j, 0.0F);
      this.m = $$1.a(exr.c);
      $$1.a(exr.c, 6.0F);
      this.n = $$1.a(exr.k);
      $$1.a(exr.k, 4.0F);
   }

   @Override
   public void b() {
      this.c.a(exr.c, this.m);
      this.c.a(exr.k, this.n);
      super.b();
   }

   @Override
   public exm a() {
      return !this.c.bh() ? super.a() : this.c(new iv(azm.a(this.c.cQ().a), azm.a(this.c.cQ().b + 0.5), azm.a(this.c.cQ().c)));
   }

   @Override
   public exv a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1 + 0.5, $$2);
   }

   @Override
   public int a(exm[] $$0, exm $$1) {
      int $$2 = super.a($$0, $$1);
      exr $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
      exr $$4 = this.b($$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.c.a($$3) >= 0.0F && $$4 != exr.w) {
         $$5 = azm.d(Math.max(1.0F, this.c.dO()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new iv($$1.a, $$1.b, $$1.c));
      exm $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, jb.b, $$4);
      exm $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, jb.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != exr.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         exm $$11 = $$0[$$10];
         if ($$11.l == exr.j && this.a && $$11.b < this.c.dU().P() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable exm $$0, exm $$1) {
      return this.a($$0, $$1) && $$0.l == exr.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public exr a(ext $$0, int $$1, int $$2, int $$3) {
      exr $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == exr.j) {
         iv.a $$5 = new iv.a();

         for (jb $$6 : jb.values()) {
            $$5.d($$1, $$2, $$3).c($$6);
            exr $$7 = $$0.a($$5.u(), $$5.v(), $$5.w());
            if ($$7 == exr.a) {
               return exr.k;
            }
         }

         return exr.j;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }
}
