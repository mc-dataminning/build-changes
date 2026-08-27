import com.google.common.collect.ImmutableMap;

public class cbf extends bpw<cbd> {
   public cbf() {
      super(ImmutableMap.of(bxh.N, bxi.a, bxh.y, bxi.a), 200);
   }

   protected boolean a(aov $$0, cbd $$1) {
      return $$1.bc();
   }

   protected boolean a(aov $$0, cbd $$1, long $$2) {
      return $$1.bc() && $$1.dO().a(bxh.N);
   }

   protected void b(aov $$0, cbd $$1, long $$2) {
      bpf<cbd> $$3 = $$1.dO();
      $$3.b(bxh.m);
      $$3.b(bxh.n);
      $$1.b(new bnb(bnd.j, 200, 0));
   }
}
