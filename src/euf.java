import javax.annotation.Nullable;

public class euf extends eus {
   private final boolean a;
   private float m;
   private float n;

   public euf(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void a(dhm $$0, bwa $$1) {
      super.a($$0, $$1);
      $$1.a(eun.j, 0.0F);
      this.m = $$1.a(eun.c);
      $$1.a(eun.c, 6.0F);
      this.n = $$1.a(eun.k);
      $$1.a(eun.k, 4.0F);
   }

   @Override
   public void b() {
      this.c.a(eun.c, this.m);
      this.c.a(eun.k, this.n);
      super.b();
   }

   @Override
   public eui a() {
      return !this.c.bj() ? super.a() : this.c(new ji(ayz.a(this.c.cQ().a), ayz.a(this.c.cQ().b + 0.5), ayz.a(this.c.cQ().c)));
   }

   @Override
   public eur a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1 + 0.5, $$2);
   }

   @Override
   public int a(eui[] $$0, eui $$1) {
      int $$2 = super.a($$0, $$1);
      eun $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
      eun $$4 = this.b($$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.c.a($$3) >= 0.0F && $$4 != eun.w) {
         $$5 = ayz.d(Math.max(1.0F, this.c.dO()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new ji($$1.a, $$1.b, $$1.c));
      eui $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, jn.b, $$4);
      eui $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, jn.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != eun.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         eui $$11 = $$0[$$10];
         if ($$11.l == eun.j && this.a && $$11.b < this.c.dU().P() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable eui $$0, eui $$1) {
      return this.a($$0, $$1) && $$0.l == eun.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public eun a(eup $$0, int $$1, int $$2, int $$3) {
      eun $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == eun.j) {
         ji.a $$5 = new ji.a();

         for (jn $$6 : jn.values()) {
            $$5.d($$1, $$2, $$3).c($$6);
            eun $$7 = $$0.a($$5.u(), $$5.v(), $$5.w());
            if ($$7 == eun.a) {
               return eun.k;
            }
         }

         return eun.j;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }
}
