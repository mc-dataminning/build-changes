import javax.annotation.Nullable;

public class eos extends epf {
   private final boolean l;
   private float m;
   private float n;

   public eos(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(dct $$0, bte $$1) {
      super.a($$0, $$1);
      $$1.a(epa.j, 0.0F);
      this.m = $$1.a(epa.c);
      $$1.a(epa.c, 6.0F);
      this.n = $$1.a(epa.k);
      $$1.a(epa.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(epa.c, this.m);
      this.b.a(epa.k, this.n);
      super.b();
   }

   @Override
   public eov a() {
      return !this.b.bg() ? super.a() : this.c(new ja(ayg.a(this.b.cM().a), ayg.a(this.b.cM().b + 0.5), ayg.a(this.b.cM().c)));
   }

   @Override
   public epe a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1 + 0.5, $$2);
   }

   @Override
   public int a(eov[] $$0, eov $$1) {
      int $$2 = super.a($$0, $$1);
      epa $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
      epa $$4 = this.b($$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != epa.w) {
         $$5 = ayg.d(Math.max(1.0F, this.b.dL()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new ja($$1.a, $$1.b, $$1.c));
      eov $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, jf.b, $$4);
      eov $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, jf.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != epa.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         eov $$11 = $$0[$$10];
         if ($$11.l == epa.j && this.l && $$11.b < this.b.dR().z_() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable eov $$0, eov $$1) {
      return this.a($$0, $$1) && $$0.l == epa.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public epa a(epc $$0, int $$1, int $$2, int $$3) {
      epa $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == epa.j) {
         ja.a $$5 = new ja.a();

         for (jf $$6 : jf.values()) {
            $$5.d($$1, $$2, $$3).c($$6);
            epa $$7 = $$0.a($$5.u(), $$5.v(), $$5.w());
            if ($$7 == epa.a) {
               return epa.k;
            }
         }

         return epa.j;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }
}
