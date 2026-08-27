import javax.annotation.Nullable;

public class bzr {
   @Nullable
   public static eov a(bpf $$0, int $$1, int $$2) {
      boolean $$3 = bzs.a($$0, $$1);
      return bzv.a($$0, () -> {
         ib $$4 = bzv.a($$0.ef(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static eov a(bpf $$0, int $$1, int $$2, eov $$3, double $$4) {
      eov $$5 = $$3.a($$0.do(), $$0.dq(), $$0.du());
      boolean $$6 = bzs.a($$0, $$1);
      return bzv.a($$0, () -> {
         ib $$6x = bzv.a($$0.ef(), $$1, $$2, 0, $$5.c, $$5.e, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static eov a(bpf $$0, int $$1, int $$2, eov $$3) {
      eov $$4 = $$0.dh().d($$3);
      boolean $$5 = bzs.a($$0, $$1);
      return bzv.a($$0, () -> {
         ib $$5x = bzv.a($$0.ef(), $$1, $$2, 0, $$4.c, $$4.e, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static ib a(bpf $$0, int $$1, boolean $$2, ib $$3) {
      ib $$4 = bzv.a($$0, $$1, $$0.ef(), $$3);
      return !bzs.a($$4, $$0) && !bzs.a($$2, $$0, $$4) && !bzs.a($$0.N(), $$4) && !bzs.b($$0, $$4) ? $$4 : null;
   }
}
