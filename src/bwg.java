import com.google.common.collect.ImmutableMap;

public class bwg extends bld<bwe> {
   public bwg() {
      super(ImmutableMap.of(bsn.M, bso.a, bsn.y, bso.a), 200);
   }

   protected boolean a(akt $$0, bwe $$1) {
      return $$1.ba();
   }

   protected boolean a(akt $$0, bwe $$1, long $$2) {
      return $$1.ba() && $$1.dN().a(bsn.M);
   }

   protected void b(akt $$0, bwe $$1, long $$2) {
      bkm<bwe> $$3 = $$1.dN();
      $$3.b(bsn.m);
      $$3.b(bsn.n);
      $$1.b(new bij(bil.j, 200, 0));
   }
}
