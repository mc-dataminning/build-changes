import javax.annotation.Nullable;

public class cvg extends cvo {
   public cvg(cty.a $$0, dfi $$1, dfi $$2) {
      super($$1, $$2, $$0, jf.a);
   }

   public cvg(cty.a $$0, dfi $$1, dfi $$2, jf $$3) {
      super($$1, $$2, $$0, $$3);
   }

   @Override
   protected boolean a(ja $$0, dcg $$1, @Nullable cml $$2, cud $$3, dsl $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.B && !$$5 && $$2 != null && $$1.c_($$0) instanceof drb $$6 && $$1.a_($$0).b() instanceof dmi $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
