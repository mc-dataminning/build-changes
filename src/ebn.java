import javax.annotation.Nullable;

public class ebn extends eby {
   private final boolean l;
   private float m;
   private float n;

   public ebn(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(crm $$0, bkl $$1) {
      super.a($$0, $$1);
      $$1.a(ebp.j, 0.0F);
      this.m = $$1.a(ebp.c);
      $$1.a(ebp.c, 6.0F);
      this.n = $$1.a(ebp.k);
      $$1.a(ebp.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(ebp.c, this.m);
      this.b.a(ebp.k, this.n);
      super.b();
   }

   @Override
   public ebr a() {
      return !this.b.aX() ? super.a() : this.c(new ht(asy.a(this.b.cG().a), asy.a(this.b.cG().b + 0.5), asy.a(this.b.cG().c)));
   }

   @Override
   public ebx a(double $$0, double $$1, double $$2) {
      return this.a(this.b(asy.a($$0), asy.a($$1 + 0.5), asy.a($$2)));
   }

   @Override
   public int a(ebr[] $$0, ebr $$1) {
      int $$2 = super.a($$0, $$1);
      ebp $$3 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      ebp $$4 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != ebp.w) {
         $$5 = asy.d(Math.max(1.0F, this.b.dF()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new ht($$1.a, $$1.b, $$1.c));
      ebr $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, hx.b, $$4);
      ebr $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, hx.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != ebp.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         ebr $$11 = $$0[$$10];
         if ($$11.l == ebp.j && this.l && $$11.b < this.b.dL().z_() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable ebr $$0, ebr $$1) {
      return this.a($$0, $$1) && $$0.l == ebp.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public ebp a(cqf $$0, int $$1, int $$2, int $$3) {
      ht.a $$4 = new ht.a();
      ebp $$5 = b($$0, $$4.d($$1, $$2, $$3));
      if ($$5 == ebp.j) {
         for (hx $$6 : hx.values()) {
            ebp $$7 = b($$0, $$4.d($$1, $$2, $$3).c($$6));
            if ($$7 == ebp.a) {
               return ebp.k;
            }
         }

         return ebp.j;
      } else {
         return a($$0, $$4);
      }
   }
}
