import javax.annotation.Nullable;

public class ema extends emn {
   private final boolean l;
   private float m;
   private float n;

   public ema(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(dah $$0, brg $$1) {
      super.a($$0, $$1);
      $$1.a(emi.j, 0.0F);
      this.m = $$1.a(emi.c);
      $$1.a(emi.c, 6.0F);
      this.n = $$1.a(emi.k);
      $$1.a(emi.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(emi.c, this.m);
      this.b.a(emi.k, this.n);
      super.b();
   }

   @Override
   public emd a() {
      return !this.b.bc() ? super.a() : this.c(new im(axw.a(this.b.cI().a), axw.a(this.b.cI().b + 0.5), axw.a(this.b.cI().c)));
   }

   @Override
   public emm a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1 + 0.5, $$2);
   }

   @Override
   public int a(emd[] $$0, emd $$1) {
      int $$2 = super.a($$0, $$1);
      emi $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
      emi $$4 = this.b($$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != emi.w) {
         $$5 = axw.d(Math.max(1.0F, this.b.dH()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new im($$1.a, $$1.b, $$1.c));
      emd $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, ir.b, $$4);
      emd $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, ir.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != emi.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         emd $$11 = $$0[$$10];
         if ($$11.l == emi.j && this.l && $$11.b < this.b.dN().z_() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable emd $$0, emd $$1) {
      return this.a($$0, $$1) && $$0.l == emi.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public emi a(emk $$0, int $$1, int $$2, int $$3) {
      emi $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == emi.j) {
         im.a $$5 = new im.a();

         for (ir $$6 : ir.values()) {
            $$5.d($$1, $$2, $$3).c($$6);
            emi $$7 = $$0.a($$5.u(), $$5.v(), $$5.w());
            if ($$7 == emi.a) {
               return emi.k;
            }
         }

         return emi.j;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }
}
