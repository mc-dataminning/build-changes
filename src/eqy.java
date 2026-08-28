import javax.annotation.Nullable;

public class eqy extends erl {
   private final boolean l;
   private float m;
   private float n;

   public eqy(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(det $$0, bum $$1) {
      super.a($$0, $$1);
      $$1.a(erg.j, 0.0F);
      this.m = $$1.a(erg.c);
      $$1.a(erg.c, 6.0F);
      this.n = $$1.a(erg.k);
      $$1.a(erg.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(erg.c, this.m);
      this.b.a(erg.k, this.n);
      super.b();
   }

   @Override
   public erb a() {
      return !this.b.bi() ? super.a() : this.c(new je(azd.a(this.b.cO().a), azd.a(this.b.cO().b + 0.5), azd.a(this.b.cO().c)));
   }

   @Override
   public erk a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1 + 0.5, $$2);
   }

   @Override
   public int a(erb[] $$0, erb $$1) {
      int $$2 = super.a($$0, $$1);
      erg $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
      erg $$4 = this.b($$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != erg.w) {
         $$5 = azd.d(Math.max(1.0F, this.b.dM()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new je($$1.a, $$1.b, $$1.c));
      erb $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, jj.b, $$4);
      erb $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, jj.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != erg.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         erb $$11 = $$0[$$10];
         if ($$11.l == erg.j && this.l && $$11.b < this.b.dS().N() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable erb $$0, erb $$1) {
      return this.a($$0, $$1) && $$0.l == erg.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public erg a(eri $$0, int $$1, int $$2, int $$3) {
      erg $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == erg.j) {
         je.a $$5 = new je.a();

         for (jj $$6 : jj.values()) {
            $$5.d($$1, $$2, $$3).c($$6);
            erg $$7 = $$0.a($$5.u(), $$5.v(), $$5.w());
            if ($$7 == erg.a) {
               return erg.k;
            }
         }

         return erg.j;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }
}
