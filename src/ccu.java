import javax.annotation.Nullable;

public class ccu {
   @Nullable
   public static etp a(bsi $$0, int $$1, int $$2) {
      boolean $$3 = ccv.a($$0, $$1);
      return ccy.a($$0, () -> {
         in $$4 = ccy.a($$0.ej(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static etp a(bsi $$0, int $$1, int $$2, etp $$3, double $$4) {
      etp $$5 = $$3.a($$0.ds(), $$0.du(), $$0.dy());
      boolean $$6 = ccv.a($$0, $$1);
      return ccy.a($$0, () -> {
         in $$6x = ccy.a($$0.ej(), $$1, $$2, 0, $$5.c, $$5.e, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static etp a(bsi $$0, int $$1, int $$2, etp $$3) {
      etp $$4 = $$0.dl().d($$3);
      boolean $$5 = ccv.a($$0, $$1);
      return ccy.a($$0, () -> {
         in $$5x = ccy.a($$0.ej(), $$1, $$2, 0, $$4.c, $$4.e, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static in a(bsi $$0, int $$1, boolean $$2, in $$3) {
      in $$4 = ccy.a($$0, $$1, $$0.ej(), $$3);
      return !ccv.a($$4, $$0) && !ccv.a($$2, $$0, $$4) && !ccv.a($$0.K(), $$4) && !ccv.b($$0, $$4) ? $$4 : null;
   }
}
