import com.google.common.collect.ImmutableMap;

public class but extends bts<bsc> {
   public static final int c = 100;
   private final box d;
   private final avb e;

   public but(box $$0, avb $$1) {
      super(ImmutableMap.of(cbd.n, cbe.c, cbd.T, cbe.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(aqh $$0, bsc $$1, long $$2) {
      return !$$1.aC();
   }

   protected void b(aqh $$0, bsc $$1, long $$2) {
      $$1.q(true);
      $$1.b(bsl.g);
   }

   protected void c(aqh $$0, bsc $$1, long $$2) {
      if ($$1.aC()) {
         $$1.g($$1.dq().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, avd.g, 2.0F, 1.0F);
      }

      $$1.q(false);
      $$1.b(bsl.a);
      $$1.dQ().b(cbd.T);
      $$1.dQ().a(cbd.S, this.d.a($$0.z));
   }
}
