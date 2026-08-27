import javax.annotation.Nullable;

public class cat extends cam {
   private static final boi bV = bol.v.n().a(0.5F).b(0.665F);

   public cat(bol<? extends cat> $$0, cwe $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bP.a(0, new bvo(this));
      this.bP.a(1, new bwn(this, 2.0));
      this.bP.a(2, new bvg(this, 1.0));
      this.bP.a(3, new bxc(this, 1.25, csp.a(cpt.pv), false));
      this.bP.a(4, new bvt(this, 1.25));
      this.bP.a(5, new bxh(this, 1.0));
      this.bP.a(6, new bwc(this, cia.class, 6.0F));
      this.bP.a(7, new bwp(this));
   }

   public static bqd.a u() {
      return boz.C().a(bqe.n, 10.0).a(bqe.o, 0.2F);
   }

   @Override
   protected ato y() {
      return atp.fO;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.fQ;
   }

   @Override
   protected ato n_() {
      return atp.fP;
   }

   @Override
   protected void b(ib $$0, dme $$1) {
      this.a(atp.fS, 0.15F, 1.0F);
   }

   @Override
   protected float eY() {
      return 0.4F;
   }

   @Override
   public bml b(cia $$0, bmk $$1) {
      cpq $$2 = $$0.b($$1);
      if ($$2.a(cpt.qx) && !this.o_()) {
         $$0.a(atp.fR, 1.0F, 1.0F);
         cpq $$3 = cps.a($$2, $$0, cpt.qD.an_());
         $$0.a($$1, $$3);
         return bml.a(this.dJ().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public cat b(apa $$0, boa $$1) {
      return bol.v.a((cwe)$$0);
   }

   @Override
   public boi e(bpi $$0) {
      return this.o_() ? bV : super.e($$0);
   }
}
