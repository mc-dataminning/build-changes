import com.google.common.collect.ImmutableMap;

public class bvr extends bko<bvp> {
   public bvr() {
      super(ImmutableMap.of(bry.M, brz.a, bry.y, brz.a), 200);
   }

   protected boolean a(aki $$0, bvp $$1) {
      return $$1.ba();
   }

   protected boolean a(aki $$0, bvp $$1, long $$2) {
      return $$1.ba() && $$1.dM().a(bry.M);
   }

   protected void b(aki $$0, bvp $$1, long $$2) {
      bjx<bvp> $$3 = $$1.dM();
      $$3.b(bry.m);
      $$3.b(bry.n);
      $$1.b(new bht(bhv.j, 200, 0));
   }
}
