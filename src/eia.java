import javax.annotation.Nullable;

public class eia extends eil {
   private final boolean l;
   private float m;
   private float n;

   public eia(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(cwr $$0, boz $$1) {
      super.a($$0, $$1);
      $$1.a(eic.j, 0.0F);
      this.m = $$1.a(eic.c);
      $$1.a(eic.c, 6.0F);
      this.n = $$1.a(eic.k);
      $$1.a(eic.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(eic.c, this.m);
      this.b.a(eic.k, this.n);
      super.b();
   }

   @Override
   public eie a() {
      return !this.b.aZ() ? super.a() : this.c(new ib(awm.a(this.b.cE().a), awm.a(this.b.cE().b + 0.5), awm.a(this.b.cE().c)));
   }

   @Override
   public eik a(double $$0, double $$1, double $$2) {
      return this.a(this.b(awm.a($$0), awm.a($$1 + 0.5), awm.a($$2)));
   }

   @Override
   public int a(eie[] $$0, eie $$1) {
      int $$2 = super.a($$0, $$1);
      eic $$3 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      eic $$4 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != eic.w) {
         $$5 = awm.d(Math.max(1.0F, this.b.dD()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new ib($$1.a, $$1.b, $$1.c));
      eie $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, ih.b, $$4);
      eie $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, ih.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != eic.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         eie $$11 = $$0[$$10];
         if ($$11.l == eic.j && this.l && $$11.b < this.b.dJ().A_() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable eie $$0, eie $$1) {
      return this.a($$0, $$1) && $$0.l == eic.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public eic a(cvk $$0, int $$1, int $$2, int $$3) {
      ib.a $$4 = new ib.a();
      eic $$5 = b($$0, $$4.d($$1, $$2, $$3));
      if ($$5 == eic.j) {
         for (ih $$6 : ih.values()) {
            eic $$7 = b($$0, $$4.d($$1, $$2, $$3).c($$6));
            if ($$7 == eic.a) {
               return eic.k;
            }
         }

         return eic.j;
      } else {
         return a($$0, $$4);
      }
   }
}
