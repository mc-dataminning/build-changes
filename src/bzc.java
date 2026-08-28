import com.google.common.collect.ImmutableMap;

public class bzc extends byv<ckv> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bzc() {
      super(ImmutableMap.of(cgg.n, cgh.b), 100);
   }

   protected boolean a(arq $$0, ckv $$1) {
      return $$1.aw() == bxq.a;
   }

   protected boolean a(arq $$0, ckv $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(arq $$0, ckv $$1, long $$2) {
      if (!$$1.bm()) {
         $$1.b(bxq.i);
         this.e = 0;
      }
   }

   protected void c(arq $$0, ckv $$1, long $$2) {
      $$1.b(bxq.a);
   }

   protected void d(arq $$0, ckv $$1, long $$2) {
      this.e++;
   }
}
