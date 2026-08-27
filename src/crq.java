public class crq extends csm implements cso {
   protected static final float a = 4.0F;
   protected static final ehx b = csm.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   public crq(dez.d $$0) {
      super($$0);
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      ehe $$4 = $$0.n($$1, $$2);
      return b.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public void b(dfa $$0, akk $$1, gu $$2, aru $$3) {
      if ($$3.a(3) == 0 && $$1.t($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      return $$1.a_($$2.d()).a(apl.at);
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if (!$$0.a($$3, $$4)) {
         return csn.a.n();
      } else {
         if ($$1 == ha.b && $$2.a(csn.mZ)) {
            $$3.a($$4, csn.mZ.n(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public ciy a(cos $$0, gu $$1, dfa $$2) {
      return new ciy(cjb.dv);
   }

   @Override
   public boolean a(cpp $$0, gu $$1, dfa $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cpm $$0, aru $$1, gu $$2, dfa $$3) {
      return true;
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dfa $$3) {
      this.a($$0, $$2);
   }

   @Override
   public float a(dfa $$0, cbn $$1, cos $$2, gu $$3) {
      return $$1.eR().d() instanceof ckj ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(cpm $$0, gu $$1) {
      $$0.a($$1.c(), csn.mZ.n().a(crr.h, dfm.b), 3);
   }
}
