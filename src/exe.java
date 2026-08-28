import javax.annotation.Nullable;

public class exe extends exr {
   private final boolean a;
   private float m;
   private float n;

   public exe(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void a(dju $$0, bxl $$1) {
      super.a($$0, $$1);
      $$1.a(exm.j, 0.0F);
      this.m = $$1.a(exm.c);
      $$1.a(exm.c, 6.0F);
      this.n = $$1.a(exm.k);
      $$1.a(exm.k, 4.0F);
   }

   @Override
   public void b() {
      this.c.a(exm.c, this.m);
      this.c.a(exm.k, this.n);
      super.b();
   }

   @Override
   public exh a() {
      return !this.c.bh() ? super.a() : this.c(new iv(azm.a(this.c.cQ().a), azm.a(this.c.cQ().b + 0.5), azm.a(this.c.cQ().c)));
   }

   @Override
   public exq a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1 + 0.5, $$2);
   }

   @Override
   public int a(exh[] $$0, exh $$1) {
      int $$2 = super.a($$0, $$1);
      exm $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
      exm $$4 = this.b($$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.c.a($$3) >= 0.0F && $$4 != exm.w) {
         $$5 = azm.d(Math.max(1.0F, this.c.dO()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new iv($$1.a, $$1.b, $$1.c));
      exh $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, jb.b, $$4);
      exh $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, jb.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != exm.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         exh $$11 = $$0[$$10];
         if ($$11.l == exm.j && this.a && $$11.b < this.c.dU().P() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable exh $$0, exh $$1) {
      return this.a($$0, $$1) && $$0.l == exm.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public exm a(exo $$0, int $$1, int $$2, int $$3) {
      exm $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == exm.j) {
         iv.a $$5 = new iv.a();

         for (jb $$6 : jb.values()) {
            $$5.d($$1, $$2, $$3).c($$6);
            exm $$7 = $$0.a($$5.u(), $$5.v(), $$5.w());
            if ($$7 == exm.a) {
               return exm.k;
            }
         }

         return exm.j;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }
}
