import javax.annotation.Nullable;

public class ecp extends eda {
   private final boolean l;
   private float m;
   private float n;

   public ecp(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(csf $$0, bla $$1) {
      super.a($$0, $$1);
      $$1.a(ecr.j, 0.0F);
      this.m = $$1.a(ecr.c);
      $$1.a(ecr.c, 6.0F);
      this.n = $$1.a(ecr.k);
      $$1.a(ecr.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(ecr.c, this.m);
      this.b.a(ecr.k, this.n);
      super.b();
   }

   @Override
   public ect a() {
      return !this.b.aX() ? super.a() : this.c(new ht(ati.a(this.b.cG().a), ati.a(this.b.cG().b + 0.5), ati.a(this.b.cG().c)));
   }

   @Override
   public ecz a(double $$0, double $$1, double $$2) {
      return this.a(this.b(ati.a($$0), ati.a($$1 + 0.5), ati.a($$2)));
   }

   @Override
   public int a(ect[] $$0, ect $$1) {
      int $$2 = super.a($$0, $$1);
      ecr $$3 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      ecr $$4 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != ecr.w) {
         $$5 = ati.d(Math.max(1.0F, this.b.dF()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new ht($$1.a, $$1.b, $$1.c));
      ect $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, hx.b, $$4);
      ect $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, hx.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != ecr.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         ect $$11 = $$0[$$10];
         if ($$11.l == ecr.j && this.l && $$11.b < this.b.dL().z_() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable ect $$0, ect $$1) {
      return this.a($$0, $$1) && $$0.l == ecr.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public ecr a(cqy $$0, int $$1, int $$2, int $$3) {
      ht.a $$4 = new ht.a();
      ecr $$5 = b($$0, $$4.d($$1, $$2, $$3));
      if ($$5 == ecr.j) {
         for (hx $$6 : hx.values()) {
            ecr $$7 = b($$0, $$4.d($$1, $$2, $$3).c($$6));
            if ($$7 == ecr.a) {
               return ecr.k;
            }
         }

         return ecr.j;
      } else {
         return a($$0, $$4);
      }
   }
}
