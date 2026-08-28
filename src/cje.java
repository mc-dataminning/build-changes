public class cje extends cjn {
   private static final int b = 2400;
   private int c;

   public cje(bsj<? extends cje> $$0, dcd $$1) {
      super($$0, $$1);
      this.bP = 3;
   }

   @Override
   protected void z() {
      this.bU.a(1, new bzq(this));
      this.bU.a(1, new bzl(this, this.dP()));
      this.bU.a(2, new cag(this, 1.0, false));
      this.bU.a(3, new cbj(this, 1.0));
      this.bU.a(7, new cae(this, cmh.class, 8.0F));
      this.bU.a(8, new car(this));
      this.bV.a(1, new cbo(this).a());
      this.bV.a(2, new cbp<>(this, cmh.class, true));
   }

   public static buf.a s() {
      return cjn.gt().a(bug.s, 8.0).a(bug.v, 0.25).a(bug.c, 2.0);
   }

   @Override
   protected bsd.b bb() {
      return bsd.b.c;
   }

   @Override
   protected ave v() {
      return avf.ip;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.ir;
   }

   @Override
   protected ave o_() {
      return avf.iq;
   }

   @Override
   protected void b(ja $$0, dsh $$1) {
      this.a(avf.is, 0.15F, 1.0F);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.c = $$0.h("Lifetime");
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Lifetime", this.c);
   }

   @Override
   public void l() {
      this.aY = this.dF();
      super.l();
   }

   @Override
   public void p(float $$0) {
      this.s($$0);
      super.p($$0);
   }

   @Override
   public void n_() {
      super.n_();
      if (this.dP().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dP().a(lj.ac, this.d(0.5), this.dx(), this.g(0.5), (this.ah.j() - 0.5) * 2.0, -this.ah.j(), (this.ah.j() - 0.5) * 2.0);
         }
      } else {
         if (!this.fS()) {
            this.c++;
         }

         if (this.c >= 2400) {
            this.ao();
         }
      }
   }

   public static boolean b(bsj<cje> $$0, dce $$1, btc $$2, ja $$3, aym $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cmh $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }
}
