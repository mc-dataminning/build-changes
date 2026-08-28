import com.google.common.collect.ImmutableMap;

public class bza extends byt<ckr> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bza() {
      super(ImmutableMap.of(cge.n, cgf.b), 100);
   }

   protected boolean a(arq $$0, ckr $$1) {
      return $$1.aw() == bxo.a;
   }

   protected boolean a(arq $$0, ckr $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(arq $$0, ckr $$1, long $$2) {
      if (!$$1.bm()) {
         $$1.b(bxo.i);
         this.e = 0;
      }
   }

   protected void c(arq $$0, ckr $$1, long $$2) {
      $$1.b(bxo.a);
   }

   protected void d(arq $$0, ckr $$1, long $$2) {
      this.e++;
   }
}
