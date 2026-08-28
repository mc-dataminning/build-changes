import com.google.common.collect.ImmutableMap;

public class bwi extends bvh<btp> {
   public static final int c = 100;
   private final bqc d;
   private final avo e;

   public bwi(bqc $$0, avo $$1) {
      super(ImmutableMap.of(ccs.n, cct.c, ccs.T, cct.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(aqu $$0, btp $$1, long $$2) {
      return !$$1.aF();
   }

   protected void b(aqu $$0, btp $$1, long $$2) {
      $$1.r(true);
      $$1.b(bua.g);
   }

   protected void c(aqu $$0, btp $$1, long $$2) {
      if ($$1.aF()) {
         $$1.i($$1.dr().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, avq.g, 2.0F, 1.0F);
      }

      $$1.r(false);
      $$1.b(bua.a);
      $$1.dT().b(ccs.T);
      $$1.dT().a(ccs.S, this.d.a($$0.z));
   }
}
