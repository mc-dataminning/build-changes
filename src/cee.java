public class cee extends cen {
   private static final int b = 2400;
   private int c;

   public cee(bnu<? extends cee> $$0, cvn $$1) {
      super($$0, $$1);
      this.bJ = 3;
   }

   @Override
   protected void B() {
      this.bO.a(1, new buv(this));
      this.bO.a(1, new buq(this, this.dM()));
      this.bO.a(2, new bvl(this, 1.0, false));
      this.bO.a(3, new bwo(this, 1.0));
      this.bO.a(7, new bvj(this, chh.class, 8.0F));
      this.bO.a(8, new bvw(this));
      this.bP.a(1, new bwt(this).a());
      this.bP.a(2, new bwu<>(this, chh.class, true));
   }

   public static bpk.a u() {
      return cen.gm().a(bpl.n, 8.0).a(bpl.o, 0.25).a(bpl.c, 2.0);
   }

   @Override
   protected bno.b aW() {
      return bno.b.c;
   }

   @Override
   protected atj y() {
      return atk.ia;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.ic;
   }

   @Override
   protected atj n_() {
      return atk.ib;
   }

   @Override
   protected void b(hz $$0, dlf $$1) {
      this.a(atk.id, 0.15F, 1.0F);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.c = $$0.h("Lifetime");
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("Lifetime", this.c);
   }

   @Override
   public void l() {
      this.aU = this.dC();
      super.l();
   }

   @Override
   public void o(float $$0) {
      this.r($$0);
      super.o($$0);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.dM().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dM().a(jz.Z, this.d(0.5), this.du(), this.g(0.5), (this.af.j() - 0.5) * 2.0, -this.af.j(), (this.af.j() - 0.5) * 2.0);
         }
      } else {
         if (!this.fN()) {
            this.c++;
         }

         if (this.c >= 2400) {
            this.am();
         }
      }
   }

   public static boolean b(bnu<cee> $$0, cvo $$1, bok $$2, hz $$3, awo $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         chh $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }
}
