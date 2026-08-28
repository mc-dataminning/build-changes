import com.google.common.collect.ImmutableMap;

public class bvm extends bvf<cgw> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bvm() {
      super(ImmutableMap.of(ccq.m, ccr.b), 100);
   }

   protected boolean a(aqt $$0, cgw $$1) {
      return $$1.at() == bty.a;
   }

   protected boolean a(aqt $$0, cgw $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(aqt $$0, cgw $$1, long $$2) {
      if (!$$1.bj()) {
         $$1.b(bty.i);
         this.e = 0;
      }
   }

   protected void c(aqt $$0, cgw $$1, long $$2) {
      $$1.b(bty.a);
   }

   protected void d(aqt $$0, cgw $$1, long $$2) {
      this.e++;
   }
}
