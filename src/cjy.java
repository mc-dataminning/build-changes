import javax.annotation.Nullable;

public class cjy extends ckh {
   public cjy(cit.a $$0, csm $$1, csm $$2) {
      super($$1, $$2, $$0, ha.a);
   }

   public cjy(cit.a $$0, csm $$1, csm $$2, ha $$3) {
      super($$1, $$2, $$0, $$3);
   }

   @Override
   protected boolean a(gu $$0, cpm $$1, @Nullable cbn $$2, ciy $$3, dfa $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.B && !$$5 && $$2 != null && $$1.c_($$0) instanceof ddu $$6 && $$1.a_($$0).b() instanceof czm $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
