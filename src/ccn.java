public class ccn extends ccw {
   private static final int b = 2400;
   private int c;

   public ccn(bmc<? extends ccn> $$0, ctx $$1) {
      super($$0, $$1);
      this.bK = 3;
   }

   @Override
   protected void B() {
      this.bP.a(1, new bte(this));
      this.bP.a(1, new bsz(this, this.dL()));
      this.bP.a(2, new btu(this, 1.0, false));
      this.bP.a(3, new bux(this, 1.0));
      this.bP.a(7, new bts(this, cfq.class, 8.0F));
      this.bP.a(8, new buf(this));
      this.bQ.a(1, new bvc(this).a());
      this.bQ.a(2, new bvd<>(this, cfq.class, true));
   }

   public static bnt.a u() {
      return ccw.gl().a(bnu.n, 8.0).a(bnu.o, 0.25).a(bnu.c, 2.0);
   }

   @Override
   protected blw.b aW() {
      return blw.b.c;
   }

   @Override
   protected ars y() {
      return art.ia;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.ic;
   }

   @Override
   protected ars n_() {
      return art.ib;
   }

   @Override
   protected void b(hx $$0, djp $$1) {
      this.a(art.id, 0.15F, 1.0F);
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.c = $$0.h("Lifetime");
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("Lifetime", this.c);
   }

   @Override
   public void l() {
      this.aU = this.dB();
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
      if (this.dL().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dL().a(jx.Z, this.d(0.5), this.dt(), this.g(0.5), (this.ag.j() - 0.5) * 2.0, -this.ag.j(), (this.ag.j() - 0.5) * 2.0);
         }
      } else {
         if (!this.fM()) {
            this.c++;
         }

         if (this.c >= 2400) {
            this.am();
         }
      }
   }

   public static boolean b(bmc<ccn> $$0, cty $$1, bms $$2, hx $$3, auw $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cfq $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   @Override
   public bmt eS() {
      return bmt.c;
   }
}
