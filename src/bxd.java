import com.google.common.collect.ImmutableMap;

public class bxd extends bma<bxb> {
   public bxd() {
      super(ImmutableMap.of(btk.M, btl.a, btk.y, btl.a), 200);
   }

   protected boolean a(alq $$0, bxb $$1) {
      return $$1.ba();
   }

   protected boolean a(alq $$0, bxb $$1, long $$2) {
      return $$1.ba() && $$1.dN().a(btk.M);
   }

   protected void b(alq $$0, bxb $$1, long $$2) {
      blj<bxb> $$3 = $$1.dN();
      $$3.b(btk.m);
      $$3.b(btk.n);
      $$1.b(new bjg(bji.j, 200, 0));
   }
}
