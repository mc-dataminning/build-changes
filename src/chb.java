import javax.annotation.Nullable;

public class chb {
   @Nullable
   public static fby a(bwo $$0, int $$1, int $$2) {
      boolean $$3 = chc.a($$0, $$1);
      return chf.a($$0, () -> {
         jh $$4 = chf.a($$0.dZ(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static fby a(bwo $$0, int $$1, int $$2, fby $$3, double $$4) {
      fby $$5 = $$3.a($$0.dB(), $$0.dD(), $$0.dH());
      boolean $$6 = chc.a($$0, $$1);
      return chf.a($$0, () -> {
         jh $$6x = chf.a($$0.dZ(), $$1, $$2, 0, $$5.d, $$5.f, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static fby a(bwo $$0, int $$1, int $$2, fby $$3) {
      fby $$4 = $$0.du().d($$3);
      boolean $$5 = chc.a($$0, $$1);
      return chf.a($$0, () -> {
         jh $$5x = chf.a($$0.dZ(), $$1, $$2, 0, $$4.d, $$4.f, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static jh a(bwo $$0, int $$1, boolean $$2, jh $$3) {
      jh $$4 = chf.a($$0, $$1, $$0.dZ(), $$3);
      return !chc.a($$4, $$0) && !chc.a($$2, $$0, $$4) && !chc.a($$0.L(), $$4) && !chc.b($$0, $$4) ? $$4 : null;
   }
}
