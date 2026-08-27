import javax.annotation.Nullable;

public class egy extends ehj {
   private final boolean l;
   private float m;
   private float n;

   public egy(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(cwa $$0, boi $$1) {
      super.a($$0, $$1);
      $$1.a(eha.j, 0.0F);
      this.m = $$1.a(eha.c);
      $$1.a(eha.c, 6.0F);
      this.n = $$1.a(eha.k);
      $$1.a(eha.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(eha.c, this.m);
      this.b.a(eha.k, this.n);
      super.b();
   }

   @Override
   public ehc a() {
      return !this.b.aZ() ? super.a() : this.c(new hz(awh.a(this.b.cH().a), awh.a(this.b.cH().b + 0.5), awh.a(this.b.cH().c)));
   }

   @Override
   public ehi a(double $$0, double $$1, double $$2) {
      return this.a(this.b(awh.a($$0), awh.a($$1 + 0.5), awh.a($$2)));
   }

   @Override
   public int a(ehc[] $$0, ehc $$1) {
      int $$2 = super.a($$0, $$1);
      eha $$3 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      eha $$4 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != eha.w) {
         $$5 = awh.d(Math.max(1.0F, this.b.dG()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new hz($$1.a, $$1.b, $$1.c));
      ehc $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, ie.b, $$4);
      ehc $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, ie.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != eha.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         ehc $$11 = $$0[$$10];
         if ($$11.l == eha.j && this.l && $$11.b < this.b.dM().A_() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable ehc $$0, ehc $$1) {
      return this.a($$0, $$1) && $$0.l == eha.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public eha a(cut $$0, int $$1, int $$2, int $$3) {
      hz.a $$4 = new hz.a();
      eha $$5 = b($$0, $$4.d($$1, $$2, $$3));
      if ($$5 == eha.j) {
         for (ie $$6 : ie.values()) {
            eha $$7 = b($$0, $$4.d($$1, $$2, $$3).c($$6));
            if ($$7 == eha.a) {
               return eha.k;
            }
         }

         return eha.j;
      } else {
         return a($$0, $$4);
      }
   }
}
