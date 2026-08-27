import com.google.common.collect.ImmutableMap;

public class cbj extends bqa<cbh> {
   public cbj() {
      super(ImmutableMap.of(bxl.N, bxm.a, bxl.y, bxm.a), 200);
   }

   protected boolean a(aow $$0, cbh $$1) {
      return $$1.bc();
   }

   protected boolean a(aow $$0, cbh $$1, long $$2) {
      return $$1.bc() && $$1.dO().a(bxl.N);
   }

   protected void b(aow $$0, cbh $$1, long $$2) {
      bpj<cbh> $$3 = $$1.dO();
      $$3.b(bxl.m);
      $$3.b(bxl.n);
      $$1.b(new bnd(bnf.j, 200, 0));
   }
}
