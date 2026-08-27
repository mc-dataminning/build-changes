import javax.annotation.Nullable;

public class cpz extends cqi {
   public cpz(cou.a $$0, cyo $$1, cyo $$2) {
      super($$1, $$2, $$0, ie.a);
   }

   public cpz(cou.a $$0, cyo $$1, cyo $$2, ie $$3) {
      super($$1, $$2, $$0, $$3);
   }

   @Override
   protected boolean a(hz $$0, cvn $$1, @Nullable chh $$2, coz $$3, dlf $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.B && !$$5 && $$2 != null && $$1.c_($$0) instanceof dkc $$6 && $$1.a_($$0).b() instanceof dfn $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
