import com.google.common.collect.ImmutableMap;

public class bzo extends bof<bzm> {
   public bzo() {
      super(ImmutableMap.of(bvq.N, bvr.a, bvq.y, bvr.a), 200);
   }

   protected boolean a(ane $$0, bzm $$1) {
      return $$1.bc();
   }

   protected boolean a(ane $$0, bzm $$1, long $$2) {
      return $$1.bc() && $$1.dN().a(bvq.N);
   }

   protected void b(ane $$0, bzm $$1, long $$2) {
      bno<bzm> $$3 = $$1.dN();
      $$3.b(bvq.m);
      $$3.b(bvq.n);
      $$1.b(new blj(bll.j, 200, 0));
   }
}
