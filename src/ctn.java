import javax.annotation.Nullable;

public class ctn extends csc {
   public ctn(dfi $$0, cty.a $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   protected dsl c(cxn $$0) {
      cml $$1 = $$0.o();
      return $$1 != null && !$$1.gx() ? null : super.c($$0);
   }
}
