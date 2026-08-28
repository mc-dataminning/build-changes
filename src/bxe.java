import com.google.common.collect.ImmutableMap;

public class bxe extends bwx<cip> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bxe() {
      super(ImmutableMap.of(cei.m, cej.b), 100);
   }

   protected boolean a(arq $$0, cip $$1) {
      return $$1.ay() == bvq.a;
   }

   protected boolean a(arq $$0, cip $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(arq $$0, cip $$1, long $$2) {
      if (!$$1.bp()) {
         $$1.b(bvq.i);
         this.e = 0;
      }
   }

   protected void c(arq $$0, cip $$1, long $$2) {
      $$1.b(bvq.a);
   }

   protected void d(arq $$0, cip $$1, long $$2) {
      this.e++;
   }
}
