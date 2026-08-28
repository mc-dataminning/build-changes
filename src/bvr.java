import com.google.common.collect.ImmutableMap;

public class bvr extends bvk<chb> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bvr() {
      super(ImmutableMap.of(ccv.m, ccw.b), 100);
   }

   protected boolean a(arf $$0, chb $$1) {
      return $$1.ar() == bud.a;
   }

   protected boolean a(arf $$0, chb $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(arf $$0, chb $$1, long $$2) {
      if (!$$1.bi()) {
         $$1.b(bud.i);
         this.e = 0;
      }
   }

   protected void c(arf $$0, chb $$1, long $$2) {
      $$1.b(bud.a);
   }

   protected void d(arf $$0, chb $$1, long $$2) {
      this.e++;
   }
}
