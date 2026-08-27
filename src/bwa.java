import com.google.common.collect.ImmutableMap;

public class bwa extends bkx<bvy> {
   public bwa() {
      super(ImmutableMap.of(bsh.M, bsi.a, bsh.y, bsi.a), 200);
   }

   protected boolean a(akq $$0, bvy $$1) {
      return $$1.ba();
   }

   protected boolean a(akq $$0, bvy $$1, long $$2) {
      return $$1.ba() && $$1.dN().a(bsh.M);
   }

   protected void b(akq $$0, bvy $$1, long $$2) {
      bkg<bvy> $$3 = $$1.dN();
      $$3.b(bsh.m);
      $$3.b(bsh.n);
      $$1.b(new bid(bif.j, 200, 0));
   }
}
