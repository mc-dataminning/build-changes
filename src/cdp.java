import java.util.Map;

public class cdp extends boc<cdl> {
   public cdp() {
      super(Map.of(bvn.o, bvo.a, bvn.aY, bvo.b, bvn.aZ, bvo.b, bvn.m, bvo.b, bvn.aU, bvo.b));
   }

   protected boolean a(and $$0, cdl $$1) {
      return $$1.bO() || $$1.aZ() || $$1.b(blk.y) != null;
   }

   protected boolean a(and $$0, cdl $$1, long $$2) {
      return false;
   }

   protected void b(and $$0, cdl $$1, long $$2) {
      $$1.dO().a(bvn.aU, avs.a, 60L);
   }
}
