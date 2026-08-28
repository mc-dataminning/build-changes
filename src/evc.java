import javax.annotation.Nullable;

public class evc extends evp {
   private final boolean a;
   private float m;
   private float n;

   public evc(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void a(dic $$0, bwt $$1) {
      super.a($$0, $$1);
      $$1.a(evk.j, 0.0F);
      this.m = $$1.a(evk.c);
      $$1.a(evk.c, 6.0F);
      this.n = $$1.a(evk.k);
      $$1.a(evk.k, 4.0F);
   }

   @Override
   public void b() {
      this.c.a(evk.c, this.m);
      this.c.a(evk.k, this.n);
      super.b();
   }

   @Override
   public evf a() {
      return !this.c.bj() ? super.a() : this.c(new jj(azk.a(this.c.cR().a), azk.a(this.c.cR().b + 0.5), azk.a(this.c.cR().c)));
   }

   @Override
   public evo a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1 + 0.5, $$2);
   }

   @Override
   public int a(evf[] $$0, evf $$1) {
      int $$2 = super.a($$0, $$1);
      evk $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
      evk $$4 = this.b($$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.c.a($$3) >= 0.0F && $$4 != evk.w) {
         $$5 = azk.d(Math.max(1.0F, this.c.dP()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new jj($$1.a, $$1.b, $$1.c));
      evf $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, jo.b, $$4);
      evf $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, jo.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != evk.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         evf $$11 = $$0[$$10];
         if ($$11.l == evk.j && this.a && $$11.b < this.c.dV().P() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable evf $$0, evf $$1) {
      return this.a($$0, $$1) && $$0.l == evk.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public evk a(evm $$0, int $$1, int $$2, int $$3) {
      evk $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == evk.j) {
         jj.a $$5 = new jj.a();

         for (jo $$6 : jo.values()) {
            $$5.d($$1, $$2, $$3).c($$6);
            evk $$7 = $$0.a($$5.u(), $$5.v(), $$5.w());
            if ($$7 == evk.a) {
               return evk.k;
            }
         }

         return evk.j;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }
}
