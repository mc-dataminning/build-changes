import com.google.common.collect.ImmutableMap;

public class cif extends bwt<cid> {
   public cif() {
      super(ImmutableMap.of(cee.N, cef.a, cee.y, cef.a), 200);
   }

   protected boolean a(arn $$0, cid $$1) {
      return $$1.bn();
   }

   protected boolean a(arn $$0, cid $$1, long $$2) {
      return $$1.bn() && $$1.ed().a(cee.N);
   }

   protected void b(arn $$0, cid $$1, long $$2) {
      bwc<cid> $$3 = $$1.ed();
      $$3.b(cee.m);
      $$3.b(cee.n);
      $$1.a(new btj(btl.j, 200, 0));
   }
}
