public class ctg extends cvx implements csm, ctf {
   private static final float f = 0.11F;

   public ctg(dex.d $$0) {
      super($$0, hb.a, r_, false, 0.1);
      this.k(this.C.b().a(d, Integer.valueOf(0)).a(s_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(art $$0) {
      return 1;
   }

   @Override
   protected boolean g(dey $$0) {
      return $$0.i();
   }

   @Override
   protected csk a() {
      return csl.rv;
   }

   @Override
   protected dey a(dey $$0, dey $$1) {
      return $$1.a(s_, $$0.c(s_));
   }

   @Override
   protected dey a(dey $$0, art $$1) {
      return super.a($$0, $$1).a(s_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   public ciw a(coq $$0, gv $$1, dey $$2) {
      return new ciw(ciz.vw);
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      return ctf.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      super.a($$0);
      $$0.a(s_);
   }

   @Override
   public boolean a(cpn $$0, gv $$1, dey $$2) {
      return !$$2.c(s_);
   }

   @Override
   public boolean a(cpk $$0, art $$1, gv $$2, dey $$3) {
      return true;
   }

   @Override
   public void a(aki $$0, art $$1, gv $$2, dey $$3) {
      $$0.a($$2, $$3.a(s_, Boolean.valueOf(true)), 2);
   }
}
