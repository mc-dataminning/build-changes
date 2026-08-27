import com.google.common.collect.ImmutableMap;

public class brn extends brg<ccv> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public brn() {
      super(ImmutableMap.of(byr.m, bys.b), 100);
   }

   protected boolean a(apf $$0, ccv $$1) {
      return $$1.ap() == bpz.a;
   }

   protected boolean a(apf $$0, ccv $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(apf $$0, ccv $$1, long $$2) {
      if (!$$1.bg()) {
         $$1.b(bpz.i);
         this.e = 0;
      }
   }

   protected void c(apf $$0, ccv $$1, long $$2) {
      $$1.b(bpz.a);
   }

   protected void d(apf $$0, ccv $$1, long $$2) {
      this.e++;
   }
}
