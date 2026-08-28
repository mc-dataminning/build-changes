import com.google.common.collect.ImmutableMap;

public class bxh extends bxa<cis> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bxh() {
      super(ImmutableMap.of(cel.m, cem.b), 100);
   }

   protected boolean a(ard $$0, cis $$1) {
      return $$1.aw() == bvt.a;
   }

   protected boolean a(ard $$0, cis $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(ard $$0, cis $$1, long $$2) {
      if (!$$1.bn()) {
         $$1.b(bvt.i);
         this.e = 0;
      }
   }

   protected void c(ard $$0, cis $$1, long $$2) {
      $$1.b(bvt.a);
   }

   protected void d(ard $$0, cis $$1, long $$2) {
      this.e++;
   }
}
