public class ctr extends cwi implements csx, ctq {
   private static final float f = 0.11F;

   public ctr(dfi.d $$0) {
      super($$0, ha.a, r_, false, 0.1);
      this.k(this.C.b().a(d, Integer.valueOf(0)).a(s_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(asc $$0) {
      return 1;
   }

   @Override
   protected boolean g(dfj $$0) {
      return $$0.i();
   }

   @Override
   protected csv a() {
      return csw.rv;
   }

   @Override
   protected dfj a(dfj $$0, dfj $$1) {
      return $$1.a(s_, $$0.c(s_));
   }

   @Override
   protected dfj a(dfj $$0, asc $$1) {
      return super.a($$0, $$1).a(s_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   public cjf a(cpb $$0, gw $$1, dfj $$2) {
      return new cjf(cji.vw);
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      return ctq.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      super.a($$0);
      $$0.a(s_);
   }

   @Override
   public boolean a(cpy $$0, gw $$1, dfj $$2) {
      return !$$2.c(s_);
   }

   @Override
   public boolean a(cpv $$0, asc $$1, gw $$2, dfj $$3) {
      return true;
   }

   @Override
   public void a(akq $$0, asc $$1, gw $$2, dfj $$3) {
      $$0.a($$2, $$3.a(s_, Boolean.valueOf(true)), 2);
   }
}
