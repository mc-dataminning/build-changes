import com.google.common.collect.ImmutableMap;

public class bzh extends boc<bzf> {
   public bzh() {
      super(ImmutableMap.of(bvn.M, bvo.a, bvn.y, bvo.a), 200);
   }

   protected boolean a(and $$0, bzf $$1) {
      return $$1.bc();
   }

   protected boolean a(and $$0, bzf $$1, long $$2) {
      return $$1.bc() && $$1.dO().a(bvn.M);
   }

   protected void b(and $$0, bzf $$1, long $$2) {
      bnl<bzf> $$3 = $$1.dO();
      $$3.b(bvn.m);
      $$3.b(bvn.n);
      $$1.b(new bli(blk.j, 200, 0));
   }
}
