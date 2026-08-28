import com.google.common.collect.ImmutableMap;

public class bwj extends bvi<btr> {
   public static final int c = 100;
   private final bqf d;
   private final avz e;

   public bwj(bqf $$0, avz $$1) {
      super(ImmutableMap.of(cct.n, ccu.c, cct.T, ccu.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(arf $$0, btr $$1, long $$2) {
      return !$$1.aE();
   }

   protected void b(arf $$0, btr $$1, long $$2) {
      $$1.q(true);
      $$1.b(bub.g);
   }

   protected void c(arf $$0, btr $$1, long $$2) {
      if ($$1.aE()) {
         $$1.h($$1.ds().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, awb.g, 2.0F, 1.0F);
      }

      $$1.q(false);
      $$1.b(bub.a);
      $$1.dS().b(cct.T);
      $$1.dS().a(cct.S, this.d.a($$0.z));
   }
}
