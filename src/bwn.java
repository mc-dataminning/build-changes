import javax.annotation.Nullable;

public class bwn {
   @Nullable
   public static elb a(bme $$0, int $$1, int $$2) {
      boolean $$3 = bwo.a($$0, $$1);
      return bwr.a($$0, () -> {
         hv $$4 = bwr.a($$0.eg(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static elb a(bme $$0, int $$1, int $$2, elb $$3, double $$4) {
      elb $$5 = $$3.a($$0.dr(), $$0.dt(), $$0.dx());
      boolean $$6 = bwo.a($$0, $$1);
      return bwr.a($$0, () -> {
         hv $$6x = bwr.a($$0.eg(), $$1, $$2, 0, $$5.c, $$5.e, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static elb a(bme $$0, int $$1, int $$2, elb $$3) {
      elb $$4 = $$0.dk().d($$3);
      boolean $$5 = bwo.a($$0, $$1);
      return bwr.a($$0, () -> {
         hv $$5x = bwr.a($$0.eg(), $$1, $$2, 0, $$4.c, $$4.e, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static hv a(bme $$0, int $$1, boolean $$2, hv $$3) {
      hv $$4 = bwr.a($$0, $$1, $$0.eg(), $$3);
      return !bwo.a($$4, $$0) && !bwo.a($$2, $$0, $$4) && !bwo.a($$0.N(), $$4) && !bwo.b($$0, $$4) ? $$4 : null;
   }
}
