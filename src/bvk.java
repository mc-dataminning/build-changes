import com.google.common.collect.ImmutableMap;

public class bvk extends buj<bss> {
   public static final int c = 100;
   private final bph d;
   private final avh e;

   public bvk(bph $$0, avh $$1) {
      super(ImmutableMap.of(cbu.n, cbv.c, cbu.T, cbv.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(aqn $$0, bss $$1, long $$2) {
      return !$$1.aE();
   }

   protected void b(aqn $$0, bss $$1, long $$2) {
      $$1.q(true);
      $$1.b(btc.g);
   }

   protected void c(aqn $$0, bss $$1, long $$2) {
      if ($$1.aE()) {
         $$1.g($$1.ds().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, avj.g, 2.0F, 1.0F);
      }

      $$1.q(false);
      $$1.b(btc.a);
      $$1.dS().b(cbu.T);
      $$1.dS().a(cbu.S, this.d.a($$0.z));
   }
}
