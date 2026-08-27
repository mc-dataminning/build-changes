public class ctg extends crf {
   private static final float c = 0.05F;
   private static final float d = 0.1F;

   public ctg(dez.d $$0) {
      super($$0, ib.a);
   }

   @Override
   public boolean d(dfa $$0) {
      return false;
   }

   protected static boolean a(cpm $$0, cqk.c $$1) {
      if ($$1 == cqk.c.b) {
         return $$0.y_().i() < 0.05F;
      } else {
         return $$1 == cqk.c.c ? $$0.y_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, cqk.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == cqk.c.b) {
            $$1.b($$2, csn.fu.n());
            $$1.a(null, djk.c, $$2);
         } else if ($$3 == cqk.c.c) {
            $$1.b($$2, csn.fw.n());
            $$1.a(null, djk.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(eac $$0) {
      return true;
   }

   @Override
   protected void a(dfa $$0, cpm $$1, gu $$2, eac $$3) {
      if ($$3 == eae.c) {
         dfa $$4 = csn.fu.n();
         $$1.b($$2, $$4);
         $$1.a(djk.c, $$2, djk.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == eae.e) {
         dfa $$5 = csn.fv.n();
         $$1.b($$2, $$5);
         $$1.a(djk.c, $$2, djk.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
