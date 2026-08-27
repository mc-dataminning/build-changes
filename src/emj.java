import javax.annotation.Nullable;

public class emj extends emw {
   private final boolean l;
   private float m;
   private float n;

   public emj(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(daq $$0, bsc $$1) {
      super.a($$0, $$1);
      $$1.a(emr.j, 0.0F);
      this.m = $$1.a(emr.c);
      $$1.a(emr.c, 6.0F);
      this.n = $$1.a(emr.k);
      $$1.a(emr.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(emr.c, this.m);
      this.b.a(emr.k, this.n);
      super.b();
   }

   @Override
   public emm a() {
      return !this.b.bc() ? super.a() : this.c(new in(axz.a(this.b.cI().a), axz.a(this.b.cI().b + 0.5), axz.a(this.b.cI().c)));
   }

   @Override
   public emv a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1 + 0.5, $$2);
   }

   @Override
   public int a(emm[] $$0, emm $$1) {
      int $$2 = super.a($$0, $$1);
      emr $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
      emr $$4 = this.b($$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != emr.w) {
         $$5 = axz.d(Math.max(1.0F, this.b.dH()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new in($$1.a, $$1.b, $$1.c));
      emm $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, is.b, $$4);
      emm $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, is.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != emr.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         emm $$11 = $$0[$$10];
         if ($$11.l == emr.j && this.l && $$11.b < this.b.dN().z_() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable emm $$0, emm $$1) {
      return this.a($$0, $$1) && $$0.l == emr.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public emr a(emt $$0, int $$1, int $$2, int $$3) {
      emr $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == emr.j) {
         in.a $$5 = new in.a();

         for (is $$6 : is.values()) {
            $$5.d($$1, $$2, $$3).c($$6);
            emr $$7 = $$0.a($$5.u(), $$5.v(), $$5.w());
            if ($$7 == emr.a) {
               return emr.k;
            }
         }

         return emr.j;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }
}
