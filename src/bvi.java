import com.google.common.collect.ImmutableMap;

public class bvi extends buh<bsq> {
   public static final int c = 100;
   private final bpf d;
   private final avg e;

   public bvi(bpf $$0, avg $$1) {
      super(ImmutableMap.of(cbs.n, cbt.c, cbs.T, cbt.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(aqm $$0, bsq $$1, long $$2) {
      return !$$1.aE();
   }

   protected void b(aqm $$0, bsq $$1, long $$2) {
      $$1.q(true);
      $$1.b(bta.g);
   }

   protected void c(aqm $$0, bsq $$1, long $$2) {
      if ($$1.aE()) {
         $$1.g($$1.ds().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, avi.g, 2.0F, 1.0F);
      }

      $$1.q(false);
      $$1.b(bta.a);
      $$1.dS().b(cbs.T);
      $$1.dS().a(cbs.S, this.d.a($$0.z));
   }
}
