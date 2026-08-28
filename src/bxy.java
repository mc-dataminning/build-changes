import com.google.common.collect.ImmutableMap;

public class bxy extends bxr<cjm> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bxy() {
      super(ImmutableMap.of(cfc.m, cfd.b), 100);
   }

   protected boolean a(ard $$0, cjm $$1) {
      return $$1.aw() == bwk.a;
   }

   protected boolean a(ard $$0, cjm $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(ard $$0, cjm $$1, long $$2) {
      if (!$$1.bl()) {
         $$1.b(bwk.i);
         this.e = 0;
      }
   }

   protected void c(ard $$0, cjm $$1, long $$2) {
      $$1.b(bwk.a);
   }

   protected void d(ard $$0, cjm $$1, long $$2) {
      this.e++;
   }
}
