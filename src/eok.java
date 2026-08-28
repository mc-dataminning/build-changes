import javax.annotation.Nullable;

public class eok extends eox {
   private final boolean l;
   private float m;
   private float n;

   public eok(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(dcq $$0, bta $$1) {
      super.a($$0, $$1);
      $$1.a(eos.j, 0.0F);
      this.m = $$1.a(eos.c);
      $$1.a(eos.c, 6.0F);
      this.n = $$1.a(eos.k);
      $$1.a(eos.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(eos.c, this.m);
      this.b.a(eos.k, this.n);
      super.b();
   }

   @Override
   public eon a() {
      return !this.b.be() ? super.a() : this.c(new ja(aye.a(this.b.cK().a), aye.a(this.b.cK().b + 0.5), aye.a(this.b.cK().c)));
   }

   @Override
   public eow a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1 + 0.5, $$2);
   }

   @Override
   public int a(eon[] $$0, eon $$1) {
      int $$2 = super.a($$0, $$1);
      eos $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
      eos $$4 = this.b($$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != eos.w) {
         $$5 = aye.d(Math.max(1.0F, this.b.dJ()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new ja($$1.a, $$1.b, $$1.c));
      eon $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, jf.b, $$4);
      eon $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, jf.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != eos.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         eon $$11 = $$0[$$10];
         if ($$11.l == eos.j && this.l && $$11.b < this.b.dP().z_() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable eon $$0, eon $$1) {
      return this.a($$0, $$1) && $$0.l == eos.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public eos a(eou $$0, int $$1, int $$2, int $$3) {
      eos $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == eos.j) {
         ja.a $$5 = new ja.a();

         for (jf $$6 : jf.values()) {
            $$5.d($$1, $$2, $$3).c($$6);
            eos $$7 = $$0.a($$5.u(), $$5.v(), $$5.w());
            if ($$7 == eos.a) {
               return eos.k;
            }
         }

         return eos.j;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }
}
