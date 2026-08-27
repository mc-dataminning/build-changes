import javax.annotation.Nullable;

public class enf extends ens {
   private final boolean l;
   private float m;
   private float n;

   public enf(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(dbm $$0, bss $$1) {
      super.a($$0, $$1);
      $$1.a(enn.j, 0.0F);
      this.m = $$1.a(enn.c);
      $$1.a(enn.c, 6.0F);
      this.n = $$1.a(enn.k);
      $$1.a(enn.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(enn.c, this.m);
      this.b.a(enn.k, this.n);
      super.b();
   }

   @Override
   public eni a() {
      return !this.b.be() ? super.a() : this.c(new io(ayf.a(this.b.cK().a), ayf.a(this.b.cK().b + 0.5), ayf.a(this.b.cK().c)));
   }

   @Override
   public enr a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1 + 0.5, $$2);
   }

   @Override
   public int a(eni[] $$0, eni $$1) {
      int $$2 = super.a($$0, $$1);
      enn $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
      enn $$4 = this.b($$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != enn.w) {
         $$5 = ayf.d(Math.max(1.0F, this.b.dJ()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new io($$1.a, $$1.b, $$1.c));
      eni $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, it.b, $$4);
      eni $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, it.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != enn.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         eni $$11 = $$0[$$10];
         if ($$11.l == enn.j && this.l && $$11.b < this.b.dP().z_() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable eni $$0, eni $$1) {
      return this.a($$0, $$1) && $$0.l == enn.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public enn a(enp $$0, int $$1, int $$2, int $$3) {
      enn $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == enn.j) {
         io.a $$5 = new io.a();

         for (it $$6 : it.values()) {
            $$5.d($$1, $$2, $$3).c($$6);
            enn $$7 = $$0.a($$5.u(), $$5.v(), $$5.w());
            if ($$7 == enn.a) {
               return enn.k;
            }
         }

         return enn.j;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }
}
