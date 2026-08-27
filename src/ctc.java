import javax.annotation.Nullable;

public class ctc extends csk {
   private static final te a = te.c("container.cartography_table");

   protected ctc(dex.d $$0) {
      super($$0);
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      if ($$1.B) {
         return bgo.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(ape.aw);
         return bgo.b;
      }
   }

   @Nullable
   @Override
   public bgr b(dey $$0, cpk $$1, gv $$2) {
      return new bgw(($$2x, $$3, $$4) -> new cei($$2x, $$3, cen.a($$1, $$2)), a);
   }
}
