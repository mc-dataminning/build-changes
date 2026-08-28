import javax.annotation.Nullable;

public class exx extends eyk {
   private final boolean a;
   private float m;
   private float n;

   public exx(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void a(dkk $$0, bxw $$1) {
      super.a($$0, $$1);
      $$1.a(eyf.j, 0.0F);
      this.m = $$1.a(eyf.c);
      $$1.a(eyf.c, 6.0F);
      this.n = $$1.a(eyf.k);
      $$1.a(eyf.k, 4.0F);
   }

   @Override
   public void b() {
      this.c.a(eyf.c, this.m);
      this.c.a(eyf.k, this.n);
      super.b();
   }

   @Override
   public eya a() {
      return !this.c.bi() ? super.a() : this.c(new iv(azo.a(this.c.cR().a), azo.a(this.c.cR().b + 0.5), azo.a(this.c.cR().c)));
   }

   @Override
   public eyj a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1 + 0.5, $$2);
   }

   @Override
   public int a(eya[] $$0, eya $$1) {
      int $$2 = super.a($$0, $$1);
      eyf $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
      eyf $$4 = this.b($$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.c.a($$3) >= 0.0F && $$4 != eyf.w) {
         $$5 = azo.d(Math.max(1.0F, this.c.dP()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new iv($$1.a, $$1.b, $$1.c));
      eya $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, jb.b, $$4);
      eya $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, jb.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != eyf.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         eya $$11 = $$0[$$10];
         if ($$11.l == eyf.j && this.a && $$11.b < this.c.dV().P() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable eya $$0, eya $$1) {
      return this.a($$0, $$1) && $$0.l == eyf.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public eyf a(eyh $$0, int $$1, int $$2, int $$3) {
      eyf $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == eyf.j) {
         iv.a $$5 = new iv.a();

         for (jb $$6 : jb.values()) {
            $$5.d($$1, $$2, $$3).c($$6);
            eyf $$7 = $$0.a($$5.u(), $$5.v(), $$5.w());
            if ($$7 == eyf.a) {
               return eyf.k;
            }
         }

         return eyf.j;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }
}
