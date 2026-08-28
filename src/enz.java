import javax.annotation.Nullable;

public class enz extends eom {
   private final boolean l;
   private float m;
   private float n;

   public enz(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(dcg $$0, btm $$1) {
      super.a($$0, $$1);
      $$1.a(eoh.j, 0.0F);
      this.m = $$1.a(eoh.c);
      $$1.a(eoh.c, 6.0F);
      this.n = $$1.a(eoh.k);
      $$1.a(eoh.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(eoh.c, this.m);
      this.b.a(eoh.k, this.n);
      super.b();
   }

   @Override
   public eoc a() {
      return !this.b.be() ? super.a() : this.c(new iz(ayu.a(this.b.cK().a), ayu.a(this.b.cK().b + 0.5), ayu.a(this.b.cK().c)));
   }

   @Override
   public eol a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1 + 0.5, $$2);
   }

   @Override
   public int a(eoc[] $$0, eoc $$1) {
      int $$2 = super.a($$0, $$1);
      eoh $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
      eoh $$4 = this.b($$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != eoh.w) {
         $$5 = ayu.d(Math.max(1.0F, this.b.dJ()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new iz($$1.a, $$1.b, $$1.c));
      eoc $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, je.b, $$4);
      eoc $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, je.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != eoh.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         eoc $$11 = $$0[$$10];
         if ($$11.l == eoh.j && this.l && $$11.b < this.b.dP().z_() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable eoc $$0, eoc $$1) {
      return this.a($$0, $$1) && $$0.l == eoh.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public eoh a(eoj $$0, int $$1, int $$2, int $$3) {
      eoh $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == eoh.j) {
         iz.a $$5 = new iz.a();

         for (je $$6 : je.values()) {
            $$5.d($$1, $$2, $$3).c($$6);
            eoh $$7 = $$0.a($$5.u(), $$5.v(), $$5.w());
            if ($$7 == eoh.a) {
               return eoh.k;
            }
         }

         return eoh.j;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }
}
