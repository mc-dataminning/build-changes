import com.google.common.collect.ImmutableMap;

public class bmw extends bmp<bxy> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bmw() {
      super(ImmutableMap.of(btz.m, bua.b), 100);
   }

   protected boolean a(ama $$0, bxy $$1) {
      return $$1.an() == blk.a;
   }

   protected boolean a(ama $$0, bxy $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(ama $$0, bxy $$1, long $$2) {
      if (!$$1.bb()) {
         $$1.b(blk.i);
         this.e = 0;
      }
   }

   protected void c(ama $$0, bxy $$1, long $$2) {
      $$1.b(blk.a);
   }

   protected void d(ama $$0, bxy $$1, long $$2) {
      this.e++;
   }
}
