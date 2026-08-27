import javax.annotation.Nullable;

public class efa extends efl {
   private final boolean l;
   private float m;
   private float n;

   public efa(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(cuc $$0, bmn $$1) {
      super.a($$0, $$1);
      $$1.a(efc.j, 0.0F);
      this.m = $$1.a(efc.c);
      $$1.a(efc.c, 6.0F);
      this.n = $$1.a(efc.k);
      $$1.a(efc.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(efc.c, this.m);
      this.b.a(efc.k, this.n);
      super.b();
   }

   @Override
   public efe a() {
      return !this.b.aZ() ? super.a() : this.c(new hx(auo.a(this.b.cH().a), auo.a(this.b.cH().b + 0.5), auo.a(this.b.cH().c)));
   }

   @Override
   public efk a(double $$0, double $$1, double $$2) {
      return this.a(this.b(auo.a($$0), auo.a($$1 + 0.5), auo.a($$2)));
   }

   @Override
   public int a(efe[] $$0, efe $$1) {
      int $$2 = super.a($$0, $$1);
      efc $$3 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      efc $$4 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != efc.w) {
         $$5 = auo.d(Math.max(1.0F, this.b.dG()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new hx($$1.a, $$1.b, $$1.c));
      efe $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, ic.b, $$4);
      efe $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, ic.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != efc.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         efe $$11 = $$0[$$10];
         if ($$11.l == efc.j && this.l && $$11.b < this.b.dM().A_() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable efe $$0, efe $$1) {
      return this.a($$0, $$1) && $$0.l == efc.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public efc a(csv $$0, int $$1, int $$2, int $$3) {
      hx.a $$4 = new hx.a();
      efc $$5 = b($$0, $$4.d($$1, $$2, $$3));
      if ($$5 == efc.j) {
         for (ic $$6 : ic.values()) {
            efc $$7 = b($$0, $$4.d($$1, $$2, $$3).c($$6));
            if ($$7 == efc.a) {
               return efc.k;
            }
         }

         return efc.j;
      } else {
         return a($$0, $$4);
      }
   }
}
