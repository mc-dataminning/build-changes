import javax.annotation.Nullable;

public class eam extends eax {
   private final boolean l;
   private float m;
   private float n;

   public eam(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(cpz $$0, bja $$1) {
      super.a($$0, $$1);
      $$1.a(eao.j, 0.0F);
      this.m = $$1.a(eao.c);
      $$1.a(eao.c, 6.0F);
      this.n = $$1.a(eao.k);
      $$1.a(eao.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(eao.c, this.m);
      this.b.a(eao.k, this.n);
      super.b();
   }

   @Override
   public eaq a() {
      return !this.b.aX() ? super.a() : this.c(new gu(arp.a(this.b.cG().a), arp.a(this.b.cG().b + 0.5), arp.a(this.b.cG().c)));
   }

   @Override
   public eaw a(double $$0, double $$1, double $$2) {
      return this.a(this.b(arp.a($$0), arp.a($$1 + 0.5), arp.a($$2)));
   }

   @Override
   public int a(eaq[] $$0, eaq $$1) {
      int $$2 = super.a($$0, $$1);
      eao $$3 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      eao $$4 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != eao.w) {
         $$5 = arp.d(Math.max(1.0F, this.b.dE()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new gu($$1.a, $$1.b, $$1.c));
      eaq $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, ha.b, $$4);
      eaq $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, ha.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != eao.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         eaq $$11 = $$0[$$10];
         if ($$11.l == eao.j && this.l && $$11.b < this.b.dK().t_() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable eaq $$0, eaq $$1) {
      return this.a($$0, $$1) && $$0.l == eao.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public eao a(cos $$0, int $$1, int $$2, int $$3) {
      gu.a $$4 = new gu.a();
      eao $$5 = b($$0, $$4.d($$1, $$2, $$3));
      if ($$5 == eao.j) {
         for (ha $$6 : ha.values()) {
            eao $$7 = b($$0, $$4.d($$1, $$2, $$3).c($$6));
            if ($$7 == eao.a) {
               return eao.k;
            }
         }

         return eao.j;
      } else {
         return a($$0, $$4);
      }
   }
}
