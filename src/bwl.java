import com.google.common.collect.ImmutableMap;

public class bwl extends bvk<btt> {
   public static final int c = 100;
   private final bqh d;
   private final avz e;

   public bwl(bqh $$0, avz $$1) {
      super(ImmutableMap.of(ccv.n, ccw.c, ccv.T, ccw.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(arf $$0, btt $$1, long $$2) {
      return !$$1.aE();
   }

   protected void b(arf $$0, btt $$1, long $$2) {
      $$1.q(true);
      $$1.b(bud.g);
   }

   protected void c(arf $$0, btt $$1, long $$2) {
      if ($$1.aE()) {
         $$1.h($$1.ds().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, awb.g, 2.0F, 1.0F);
      }

      $$1.q(false);
      $$1.b(bud.a);
      $$1.dS().b(ccv.T);
      $$1.dS().a(ccv.S, this.d.a($$0.z));
   }
}
