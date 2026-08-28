import com.google.common.collect.ImmutableMap;

public class bwe extends bvx<chp> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bwe() {
      super(ImmutableMap.of(cdi.m, cdj.b), 100);
   }

   protected boolean a(arg $$0, chp $$1) {
      return $$1.av() == bur.a;
   }

   protected boolean a(arg $$0, chp $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(arg $$0, chp $$1, long $$2) {
      if (!$$1.bm()) {
         $$1.b(bur.i);
         this.e = 0;
      }
   }

   protected void c(arg $$0, chp $$1, long $$2) {
      $$1.b(bur.a);
   }

   protected void d(arg $$0, chp $$1, long $$2) {
      this.e++;
   }
}
