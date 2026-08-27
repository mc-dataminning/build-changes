import javax.annotation.Nullable;

public class epn extends eqa {
   private final boolean l;
   private float m;
   private float n;

   public epn(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(dcn $$0, bsq $$1) {
      super.a($$0, $$1);
      $$1.a(epv.j, 0.0F);
      this.m = $$1.a(epv.c);
      $$1.a(epv.c, 6.0F);
      this.n = $$1.a(epv.k);
      $$1.a(epv.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(epv.c, this.m);
      this.b.a(epv.k, this.n);
      super.b();
   }

   @Override
   public epq a() {
      return !this.b.bi() ? super.a() : this.c(new ir(aym.a(this.b.cP().a), aym.a(this.b.cP().b + 0.5), aym.a(this.b.cP().c)));
   }

   @Override
   public epz a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1 + 0.5, $$2);
   }

   @Override
   public int a(epq[] $$0, epq $$1) {
      int $$2 = super.a($$0, $$1);
      epv $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
      epv $$4 = this.b($$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != epv.w) {
         $$5 = aym.d(Math.max(1.0F, this.b.dO()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new ir($$1.a, $$1.b, $$1.c));
      epq $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, iw.b, $$4);
      epq $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, iw.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != epv.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         epq $$11 = $$0[$$10];
         if ($$11.l == epv.j && this.l && $$11.b < this.b.dU().A_() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable epq $$0, epq $$1) {
      return this.a($$0, $$1) && $$0.l == epv.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public epv a(epx $$0, int $$1, int $$2, int $$3) {
      epv $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == epv.j) {
         ir.a $$5 = new ir.a();

         for (iw $$6 : iw.values()) {
            $$5.d($$1, $$2, $$3).d($$6);
            epv $$7 = $$0.a($$5.u(), $$5.v(), $$5.w());
            if ($$7 == epv.a) {
               return epv.k;
            }
         }

         return epv.j;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }
}
