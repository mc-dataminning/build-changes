import com.google.common.collect.ImmutableMap;

public class ccp extends brg<ccn> {
   public ccp() {
      super(ImmutableMap.of(byr.N, bys.a, byr.y, bys.a), 200);
   }

   protected boolean a(apf $$0, ccn $$1) {
      return $$1.bf();
   }

   protected boolean a(apf $$0, ccn $$1, long $$2) {
      return $$1.bf() && $$1.dP().a(byr.N);
   }

   protected void b(apf $$0, ccn $$1, long $$2) {
      bqp<ccn> $$3 = $$1.dP();
      $$3.b(byr.m);
      $$3.b(byr.n);
      $$1.b(new boj(bol.j, 200, 0));
   }
}
