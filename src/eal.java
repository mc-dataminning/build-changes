import javax.annotation.Nullable;

public class eal extends eaw {
   private final boolean l;
   private float m;
   private float n;

   public eal(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(cpy $$0, bja $$1) {
      super.a($$0, $$1);
      $$1.a(ean.j, 0.0F);
      this.m = $$1.a(ean.c);
      $$1.a(ean.c, 6.0F);
      this.n = $$1.a(ean.k);
      $$1.a(ean.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(ean.c, this.m);
      this.b.a(ean.k, this.n);
      super.b();
   }

   @Override
   public eap a() {
      return !this.b.aX() ? super.a() : this.c(new gu(arp.a(this.b.cG().a), arp.a(this.b.cG().b + 0.5), arp.a(this.b.cG().c)));
   }

   @Override
   public eav a(double $$0, double $$1, double $$2) {
      return this.a(this.b(arp.a($$0), arp.a($$1 + 0.5), arp.a($$2)));
   }

   @Override
   public int a(eap[] $$0, eap $$1) {
      int $$2 = super.a($$0, $$1);
      ean $$3 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      ean $$4 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != ean.w) {
         $$5 = arp.d(Math.max(1.0F, this.b.dE()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new gu($$1.a, $$1.b, $$1.c));
      eap $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, ha.b, $$4);
      eap $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, ha.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != ean.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         eap $$11 = $$0[$$10];
         if ($$11.l == ean.j && this.l && $$11.b < this.b.dK().t_() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable eap $$0, eap $$1) {
      return this.a($$0, $$1) && $$0.l == ean.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public ean a(cor $$0, int $$1, int $$2, int $$3) {
      gu.a $$4 = new gu.a();
      ean $$5 = b($$0, $$4.d($$1, $$2, $$3));
      if ($$5 == ean.j) {
         for (ha $$6 : ha.values()) {
            ean $$7 = b($$0, $$4.d($$1, $$2, $$3).c($$6));
            if ($$7 == ean.a) {
               return ean.k;
            }
         }

         return ean.j;
      } else {
         return a($$0, $$4);
      }
   }
}
