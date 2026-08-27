import javax.annotation.Nullable;

public class elk extends elx {
   private final boolean l;
   private float m;
   private float n;

   public elk(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(czt $$0, bqv $$1) {
      super.a($$0, $$1);
      $$1.a(els.j, 0.0F);
      this.m = $$1.a(els.c);
      $$1.a(els.c, 6.0F);
      this.n = $$1.a(els.k);
      $$1.a(els.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(els.c, this.m);
      this.b.a(els.k, this.n);
      super.b();
   }

   @Override
   public eln a() {
      return !this.b.bc() ? super.a() : this.c(new id(axm.a(this.b.cH().a), axm.a(this.b.cH().b + 0.5), axm.a(this.b.cH().c)));
   }

   @Override
   public elw a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1 + 0.5, $$2);
   }

   @Override
   public int a(eln[] $$0, eln $$1) {
      int $$2 = super.a($$0, $$1);
      els $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
      els $$4 = this.b($$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != els.w) {
         $$5 = axm.d(Math.max(1.0F, this.b.dG()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new id($$1.a, $$1.b, $$1.c));
      eln $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, ij.b, $$4);
      eln $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, ij.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != els.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         eln $$11 = $$0[$$10];
         if ($$11.l == els.j && this.l && $$11.b < this.b.dM().z_() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable eln $$0, eln $$1) {
      return this.a($$0, $$1) && $$0.l == els.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public els a(elu $$0, int $$1, int $$2, int $$3) {
      els $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == els.j) {
         id.a $$5 = new id.a();

         for (ij $$6 : ij.values()) {
            $$5.d($$1, $$2, $$3).c($$6);
            els $$7 = $$0.a($$5.u(), $$5.v(), $$5.w());
            if ($$7 == els.a) {
               return els.k;
            }
         }

         return els.j;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }
}
