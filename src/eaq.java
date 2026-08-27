import javax.annotation.Nullable;

public class eaq extends ebb {
   private final boolean l;
   private float m;
   private float n;

   public eaq(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(cqd $$0, bjd $$1) {
      super.a($$0, $$1);
      $$1.a(eas.j, 0.0F);
      this.m = $$1.a(eas.c);
      $$1.a(eas.c, 6.0F);
      this.n = $$1.a(eas.k);
      $$1.a(eas.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(eas.c, this.m);
      this.b.a(eas.k, this.n);
      super.b();
   }

   @Override
   public eau a() {
      return !this.b.aX() ? super.a() : this.c(new gw(ars.a(this.b.cG().a), ars.a(this.b.cG().b + 0.5), ars.a(this.b.cG().c)));
   }

   @Override
   public eba a(double $$0, double $$1, double $$2) {
      return this.a(this.b(ars.a($$0), ars.a($$1 + 0.5), ars.a($$2)));
   }

   @Override
   public int a(eau[] $$0, eau $$1) {
      int $$2 = super.a($$0, $$1);
      eas $$3 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      eas $$4 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != eas.w) {
         $$5 = ars.d(Math.max(1.0F, this.b.dE()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new gw($$1.a, $$1.b, $$1.c));
      eau $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, hc.b, $$4);
      eau $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, hc.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != eas.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         eau $$11 = $$0[$$10];
         if ($$11.l == eas.j && this.l && $$11.b < this.b.dK().t_() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable eau $$0, eau $$1) {
      return this.a($$0, $$1) && $$0.l == eas.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public eas a(cow $$0, int $$1, int $$2, int $$3) {
      gw.a $$4 = new gw.a();
      eas $$5 = b($$0, $$4.d($$1, $$2, $$3));
      if ($$5 == eas.j) {
         for (hc $$6 : hc.values()) {
            eas $$7 = b($$0, $$4.d($$1, $$2, $$3).c($$6));
            if ($$7 == eas.a) {
               return eas.k;
            }
         }

         return eas.j;
      } else {
         return a($$0, $$4);
      }
   }
}
