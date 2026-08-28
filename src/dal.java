import javax.annotation.Nullable;

public class dal extends cxh {
   public dal(cyz.a $$0) {
      super($$0);
   }

   @Override
   public crk a(dja $$0, czd $$1, bxe $$2, @Nullable czd $$3) {
      return new csd($$0, $$2, $$1.c(1), $$3);
   }

   @Override
   public crx a(dja $$0, jo $$1, czd $$2, ja $$3) {
      csd $$4 = new csd($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1), null);
      $$4.b = crk.a.b;
      return $$4;
   }
}
