import javax.annotation.Nullable;

public class bze {
   @Nullable
   public static enz a(boq $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = bzd.a($$0, $$1);
      return bzg.a($$0, () -> {
         hz $$9 = bzg.a($$0.eh(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            hz $$10 = bzf.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = bzg.a($$10, $$0.eh().a($$6 - $$7 + 1) + $$7, $$0.dM().ak(), $$1xx -> bzd.c($$0, $$1xx));
               return !bzd.a($$0, $$10) && !bzd.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}
