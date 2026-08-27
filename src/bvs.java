import com.google.common.collect.ImmutableMap;

public class bvs extends bkp<bvq> {
   public bvs() {
      super(ImmutableMap.of(brz.M, bsa.a, brz.y, bsa.a), 200);
   }

   protected boolean a(akk $$0, bvq $$1) {
      return $$1.ba();
   }

   protected boolean a(akk $$0, bvq $$1, long $$2) {
      return $$1.ba() && $$1.dM().a(brz.M);
   }

   protected void b(akk $$0, bvq $$1, long $$2) {
      bjy<bvq> $$3 = $$1.dM();
      $$3.b(brz.m);
      $$3.b(brz.n);
      $$1.b(new bhv(bhx.j, 200, 0));
   }
}
