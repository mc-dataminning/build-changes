import com.google.common.collect.ImmutableMap;

public class bzh extends bza<ckw> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bzh() {
      super(ImmutableMap.of(cgl.n, cgm.b), 100);
   }

   protected boolean a(arq $$0, ckw $$1) {
      return $$1.at() == bxv.a;
   }

   protected boolean a(arq $$0, ckw $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(arq $$0, ckw $$1, long $$2) {
      if (!$$1.bk()) {
         $$1.b(bxv.i);
         this.e = 0;
      }
   }

   protected void c(arq $$0, ckw $$1, long $$2) {
      $$1.b(bxv.a);
   }

   protected void d(arq $$0, ckw $$1, long $$2) {
      this.e++;
   }
}
