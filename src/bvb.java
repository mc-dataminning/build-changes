import com.google.common.collect.ImmutableMap;

public class bvb extends buu<cgl> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bvb() {
      super(ImmutableMap.of(ccf.m, ccg.b), 100);
   }

   protected boolean a(aqm $$0, cgl $$1) {
      return $$1.as() == btn.a;
   }

   protected boolean a(aqm $$0, cgl $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(aqm $$0, cgl $$1, long $$2) {
      if (!$$1.bj()) {
         $$1.b(btn.i);
         this.e = 0;
      }
   }

   protected void c(aqm $$0, cgl $$1, long $$2) {
      $$1.b(btn.a);
   }

   protected void d(aqm $$0, cgl $$1, long $$2) {
      this.e++;
   }
}
