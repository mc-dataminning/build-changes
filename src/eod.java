import javax.annotation.Nullable;

public class eod extends eoq {
   private final boolean l;
   private float m;
   private float n;

   public eod(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(dck $$0, btq $$1) {
      super.a($$0, $$1);
      $$1.a(eol.j, 0.0F);
      this.m = $$1.a(eol.c);
      $$1.a(eol.c, 6.0F);
      this.n = $$1.a(eol.k);
      $$1.a(eol.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(eol.c, this.m);
      this.b.a(eol.k, this.n);
      super.b();
   }

   @Override
   public eog a() {
      return !this.b.be() ? super.a() : this.c(new iz(ayy.a(this.b.cK().a), ayy.a(this.b.cK().b + 0.5), ayy.a(this.b.cK().c)));
   }

   @Override
   public eop a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1 + 0.5, $$2);
   }

   @Override
   public int a(eog[] $$0, eog $$1) {
      int $$2 = super.a($$0, $$1);
      eol $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
      eol $$4 = this.b($$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != eol.w) {
         $$5 = ayy.d(Math.max(1.0F, this.b.dJ()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new iz($$1.a, $$1.b, $$1.c));
      eog $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, je.b, $$4);
      eog $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, je.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != eol.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         eog $$11 = $$0[$$10];
         if ($$11.l == eol.j && this.l && $$11.b < this.b.dP().z_() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable eog $$0, eog $$1) {
      return this.a($$0, $$1) && $$0.l == eol.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public eol a(eon $$0, int $$1, int $$2, int $$3) {
      eol $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == eol.j) {
         iz.a $$5 = new iz.a();

         for (je $$6 : je.values()) {
            $$5.d($$1, $$2, $$3).c($$6);
            eol $$7 = $$0.a($$5.u(), $$5.v(), $$5.w());
            if ($$7 == eol.a) {
               return eol.k;
            }
         }

         return eol.j;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }
}
