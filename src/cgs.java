import com.google.common.collect.ImmutableMap;

public class cgs extends bvh<cgq> {
   public cgs() {
      super(ImmutableMap.of(ccs.N, cct.a, ccs.y, cct.a), 200);
   }

   protected boolean a(are $$0, cgq $$1) {
      return $$1.bh();
   }

   protected boolean a(are $$0, cgq $$1, long $$2) {
      return $$1.bh() && $$1.dS().a(ccs.N);
   }

   protected void b(are $$0, cgq $$1, long $$2) {
      buq<cgq> $$3 = $$1.dS();
      $$3.b(ccs.m);
      $$3.b(ccs.n);
      $$1.b(new bsb(bsd.j, 200, 0));
   }
}
