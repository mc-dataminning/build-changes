import com.google.common.collect.ImmutableMap;

public class bvt extends bkq<bvr> {
   public bvt() {
      super(ImmutableMap.of(bsa.M, bsb.a, bsa.y, bsb.a), 200);
   }

   protected boolean a(akk $$0, bvr $$1) {
      return $$1.ba();
   }

   protected boolean a(akk $$0, bvr $$1, long $$2) {
      return $$1.ba() && $$1.dM().a(bsa.M);
   }

   protected void b(akk $$0, bvr $$1, long $$2) {
      bjz<bvr> $$3 = $$1.dM();
      $$3.b(bsa.m);
      $$3.b(bsa.n);
      $$1.b(new bhv(bhx.j, 200, 0));
   }
}
