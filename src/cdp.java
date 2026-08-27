import com.google.common.collect.ImmutableMap;

public class cdp extends bsg<cdn> {
   public cdp() {
      super(ImmutableMap.of(bzr.N, bzs.a, bzr.y, bzs.a), 200);
   }

   protected boolean a(aps $$0, cdn $$1) {
      return $$1.bf();
   }

   protected boolean a(aps $$0, cdn $$1, long $$2) {
      return $$1.bf() && $$1.dP().a(bzr.N);
   }

   protected void b(aps $$0, cdn $$1, long $$2) {
      brp<cdn> $$3 = $$1.dP();
      $$3.b(bzr.m);
      $$3.b(bzr.n);
      $$1.b(new bph(bpj.j, 200, 0));
   }
}
