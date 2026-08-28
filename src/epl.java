import javax.annotation.Nullable;

public class epl extends epy {
   private final boolean l;
   private float m;
   private float n;

   public epl(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(ddj $$0, btp $$1) {
      super.a($$0, $$1);
      $$1.a(ept.j, 0.0F);
      this.m = $$1.a(ept.c);
      $$1.a(ept.c, 6.0F);
      this.n = $$1.a(ept.k);
      $$1.a(ept.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(ept.c, this.m);
      this.b.a(ept.k, this.n);
      super.b();
   }

   @Override
   public epo a() {
      return !this.b.bf() ? super.a() : this.c(new jd(ayo.a(this.b.cL().a), ayo.a(this.b.cL().b + 0.5), ayo.a(this.b.cL().c)));
   }

   @Override
   public epx a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1 + 0.5, $$2);
   }

   @Override
   public int a(epo[] $$0, epo $$1) {
      int $$2 = super.a($$0, $$1);
      ept $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
      ept $$4 = this.b($$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != ept.w) {
         $$5 = ayo.d(Math.max(1.0F, this.b.dJ()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new jd($$1.a, $$1.b, $$1.c));
      epo $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, ji.b, $$4);
      epo $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, ji.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != ept.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         epo $$11 = $$0[$$10];
         if ($$11.l == ept.j && this.l && $$11.b < this.b.dP().z_() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable epo $$0, epo $$1) {
      return this.a($$0, $$1) && $$0.l == ept.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public ept a(epv $$0, int $$1, int $$2, int $$3) {
      ept $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == ept.j) {
         jd.a $$5 = new jd.a();

         for (ji $$6 : ji.values()) {
            $$5.d($$1, $$2, $$3).c($$6);
            ept $$7 = $$0.a($$5.u(), $$5.v(), $$5.w());
            if ($$7 == ept.a) {
               return ept.k;
            }
         }

         return ept.j;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }
}
