import com.google.common.collect.ImmutableMap;

public class cdw extends bsl<cdu> {
   public cdw() {
      super(ImmutableMap.of(bzw.N, bzx.a, bzw.y, bzx.a), 200);
   }

   protected boolean a(apu $$0, cdu $$1) {
      return $$1.bf();
   }

   protected boolean a(apu $$0, cdu $$1, long $$2) {
      return $$1.bf() && $$1.dP().a(bzw.N);
   }

   protected void b(apu $$0, cdu $$1, long $$2) {
      bru<cdu> $$3 = $$1.dP();
      $$3.b(bzw.m);
      $$3.b(bzw.n);
      $$1.b(new bpm(bpo.j, 200, 0));
   }
}
