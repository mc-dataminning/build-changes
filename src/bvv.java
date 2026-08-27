import com.google.common.collect.ImmutableMap;

public class bvv extends bks<bvt> {
   public bvv() {
      super(ImmutableMap.of(bsc.M, bsd.a, bsc.y, bsd.a), 200);
   }

   protected boolean a(akn $$0, bvt $$1) {
      return $$1.ba();
   }

   protected boolean a(akn $$0, bvt $$1, long $$2) {
      return $$1.ba() && $$1.dM().a(bsc.M);
   }

   protected void b(akn $$0, bvt $$1, long $$2) {
      bkb<bvt> $$3 = $$1.dM();
      $$3.b(bsc.m);
      $$3.b(bsc.n);
      $$1.b(new bhy(bia.j, 200, 0));
   }
}
