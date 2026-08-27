import javax.annotation.Nullable;

public class bza {
   @Nullable
   public static enz a(boq $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = bzd.a($$0, $$1);
      return bzg.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static hz a(boq $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      hz $$8 = bzg.a($$0.eh(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         hz $$9 = bzg.a($$0, $$1, $$0.eh(), $$8);
         if (!bzd.a($$9, $$0) && !bzd.a($$7, $$0, $$9)) {
            $$9 = bzg.a($$9, $$0.dM().ak(), $$1x -> bzd.c($$0, $$1x));
            return bzd.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}
