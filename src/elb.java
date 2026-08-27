import javax.annotation.Nullable;

public class elb extends elo {
   private final boolean l;
   private float m;
   private float n;

   public elb(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(czk $$0, bqq $$1) {
      super.a($$0, $$1);
      $$1.a(elj.j, 0.0F);
      this.m = $$1.a(elj.c);
      $$1.a(elj.c, 6.0F);
      this.n = $$1.a(elj.k);
      $$1.a(elj.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(elj.c, this.m);
      this.b.a(elj.k, this.n);
      super.b();
   }

   @Override
   public ele a() {
      return !this.b.bc() ? super.a() : this.c(new ib(axk.a(this.b.cH().a), axk.a(this.b.cH().b + 0.5), axk.a(this.b.cH().c)));
   }

   @Override
   public eln a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1 + 0.5, $$2);
   }

   @Override
   public int a(ele[] $$0, ele $$1) {
      int $$2 = super.a($$0, $$1);
      elj $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
      elj $$4 = this.b($$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != elj.w) {
         $$5 = axk.d(Math.max(1.0F, this.b.dG()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new ib($$1.a, $$1.b, $$1.c));
      ele $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, ih.b, $$4);
      ele $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, ih.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != elj.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         ele $$11 = $$0[$$10];
         if ($$11.l == elj.j && this.l && $$11.b < this.b.dM().z_() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable ele $$0, ele $$1) {
      return this.a($$0, $$1) && $$0.l == elj.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public elj a(ell $$0, int $$1, int $$2, int $$3) {
      elj $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == elj.j) {
         ib.a $$5 = new ib.a();

         for (ih $$6 : ih.values()) {
            $$5.d($$1, $$2, $$3).c($$6);
            elj $$7 = $$0.a($$5.u(), $$5.v(), $$5.w());
            if ($$7 == elj.a) {
               return elj.k;
            }
         }

         return elj.j;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }
}
