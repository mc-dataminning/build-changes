import com.google.common.collect.ImmutableMap;

public class bwe extends bvd<btm> {
   public static final int c = 100;
   private final bqa d;
   private final avv e;

   public bwe(bqa $$0, avv $$1) {
      super(ImmutableMap.of(cco.n, ccp.c, cco.T, ccp.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(arb $$0, btm $$1, long $$2) {
      return !$$1.aE();
   }

   protected void b(arb $$0, btm $$1, long $$2) {
      $$1.q(true);
      $$1.b(btw.g);
   }

   protected void c(arb $$0, btm $$1, long $$2) {
      if ($$1.aE()) {
         $$1.h($$1.ds().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, avx.g, 2.0F, 1.0F);
      }

      $$1.q(false);
      $$1.b(btw.a);
      $$1.dS().b(cco.T);
      $$1.dS().a(cco.S, this.d.a($$0.z));
   }
}
