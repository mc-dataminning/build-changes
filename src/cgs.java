import com.google.common.collect.ImmutableMap;

public class cgs extends bvh<cgq> {
   public cgs() {
      super(ImmutableMap.of(ccs.N, cct.a, ccs.y, cct.a), 200);
   }

   protected boolean a(aqu $$0, cgq $$1) {
      return $$1.bi();
   }

   protected boolean a(aqu $$0, cgq $$1, long $$2) {
      return $$1.bi() && $$1.dT().a(ccs.N);
   }

   protected void b(aqu $$0, cgq $$1, long $$2) {
      buq<cgq> $$3 = $$1.dT();
      $$3.b(ccs.m);
      $$3.b(ccs.n);
      $$1.b(new brz(bsb.j, 200, 0));
   }
}
