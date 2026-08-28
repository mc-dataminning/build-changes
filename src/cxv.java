import javax.annotation.Nullable;

public class cxv extends cyd {
   public cxv(djn $$0, djn $$1, cwm.a $$2) {
      super($$0, $$1, jn.a, $$2);
   }

   public cxv(cwm.a $$0, djn $$1, djn $$2, jn $$3) {
      super($$1, $$2, $$3, $$0);
   }

   @Override
   protected boolean a(ji $$0, dgj $$1, @Nullable coy $$2, cwq $$3, dwy $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.C && !$$5 && $$2 != null && $$1.c_($$0) instanceof dvn $$6 && $$1.a_($$0).b() instanceof dqs $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
