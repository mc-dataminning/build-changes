public class cor extends cpn implements cpp {
   protected static final float a = 4.0F;
   protected static final efb b = cpn.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   public cor(dca.d $$0) {
      super($$0);
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      eei $$4 = $$0.n($$1, $$2);
      return b.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public void b(dcb $$0, aif $$1, gu $$2, apf $$3) {
      if ($$3.a(3) == 0 && $$1.t($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   public boolean a(dcb $$0, cmp $$1, gu $$2) {
      return $$1.a_($$2.d()).a(amw.as);
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      if (!$$0.a($$3, $$4)) {
         return cpo.a.n();
      } else {
         if ($$1 == ha.b && $$2.a(cpo.mZ)) {
            $$3.a($$4, cpo.mZ.n(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cfz a(cls $$0, gu $$1, dcb $$2) {
      return new cfz(cgc.dv);
   }

   @Override
   public boolean a(cmp $$0, gu $$1, dcb $$2, boolean $$3) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cmm $$0, apf $$1, gu $$2, dcb $$3) {
      return true;
   }

   @Override
   public void a(aif $$0, apf $$1, gu $$2, dcb $$3) {
      this.a($$0, $$2);
   }

   @Override
   public float a(dcb $$0, byo $$1, cls $$2, gu $$3) {
      return $$1.eO().d() instanceof chk ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(cmm $$0, gu $$1) {
      $$0.a($$1.c(), cpo.mZ.n().a(cos.h, dcn.b), 3);
   }
}
