import javax.annotation.Nullable;

public class ehf extends ehq {
   private final boolean l;
   private float m;
   private float n;

   public ehf(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(cwe $$0, bok $$1) {
      super.a($$0, $$1);
      $$1.a(ehh.j, 0.0F);
      this.m = $$1.a(ehh.c);
      $$1.a(ehh.c, 6.0F);
      this.n = $$1.a(ehh.k);
      $$1.a(ehh.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(ehh.c, this.m);
      this.b.a(ehh.k, this.n);
      super.b();
   }

   @Override
   public ehj a() {
      return !this.b.aZ() ? super.a() : this.c(new hz(awi.a(this.b.cH().a), awi.a(this.b.cH().b + 0.5), awi.a(this.b.cH().c)));
   }

   @Override
   public ehp a(double $$0, double $$1, double $$2) {
      return this.a(this.b(awi.a($$0), awi.a($$1 + 0.5), awi.a($$2)));
   }

   @Override
   public int a(ehj[] $$0, ehj $$1) {
      int $$2 = super.a($$0, $$1);
      ehh $$3 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      ehh $$4 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != ehh.w) {
         $$5 = awi.d(Math.max(1.0F, this.b.dG()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new hz($$1.a, $$1.b, $$1.c));
      ehj $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, ie.b, $$4);
      ehj $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, ie.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != ehh.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         ehj $$11 = $$0[$$10];
         if ($$11.l == ehh.j && this.l && $$11.b < this.b.dM().A_() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable ehj $$0, ehj $$1) {
      return this.a($$0, $$1) && $$0.l == ehh.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public ehh a(cux $$0, int $$1, int $$2, int $$3) {
      hz.a $$4 = new hz.a();
      ehh $$5 = b($$0, $$4.d($$1, $$2, $$3));
      if ($$5 == ehh.j) {
         for (ie $$6 : ie.values()) {
            ehh $$7 = b($$0, $$4.d($$1, $$2, $$3).c($$6));
            if ($$7 == ehh.a) {
               return ehh.k;
            }
         }

         return ehh.j;
      } else {
         return a($$0, $$4);
      }
   }
}
