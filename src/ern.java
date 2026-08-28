import javax.annotation.Nullable;

public class ern extends esa {
   private final boolean l;
   private float m;
   private float n;

   public ern(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(dfi $$0, bux $$1) {
      super.a($$0, $$1);
      $$1.a(erv.j, 0.0F);
      this.m = $$1.a(erv.c);
      $$1.a(erv.c, 6.0F);
      this.n = $$1.a(erv.k);
      $$1.a(erv.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(erv.c, this.m);
      this.b.a(erv.k, this.n);
      super.b();
   }

   @Override
   public erq a() {
      return !this.b.bk() ? super.a() : this.c(new jg(azj.a(this.b.cS().a), azj.a(this.b.cS().b + 0.5), azj.a(this.b.cS().c)));
   }

   @Override
   public erz a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1 + 0.5, $$2);
   }

   @Override
   public int a(erq[] $$0, erq $$1) {
      int $$2 = super.a($$0, $$1);
      erv $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
      erv $$4 = this.b($$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != erv.w) {
         $$5 = azj.d(Math.max(1.0F, this.b.dR()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new jg($$1.a, $$1.b, $$1.c));
      erq $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, jl.b, $$4);
      erq $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, jl.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != erv.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         erq $$11 = $$0[$$10];
         if ($$11.l == erv.j && this.l && $$11.b < this.b.dX().N() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable erq $$0, erq $$1) {
      return this.a($$0, $$1) && $$0.l == erv.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public erv a(erx $$0, int $$1, int $$2, int $$3) {
      erv $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == erv.j) {
         jg.a $$5 = new jg.a();

         for (jl $$6 : jl.values()) {
            $$5.d($$1, $$2, $$3).c($$6);
            erv $$7 = $$0.a($$5.u(), $$5.v(), $$5.w());
            if ($$7 == erv.a) {
               return erv.k;
            }
         }

         return erv.j;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }
}
