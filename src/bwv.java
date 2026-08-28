import com.google.common.collect.ImmutableMap;

public class bwv extends bwo<cig> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bwv() {
      super(ImmutableMap.of(cdz.m, cea.b), 100);
   }

   protected boolean a(arm $$0, cig $$1) {
      return $$1.ax() == bvh.a;
   }

   protected boolean a(arm $$0, cig $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(arm $$0, cig $$1, long $$2) {
      if (!$$1.bo()) {
         $$1.b(bvh.i);
         this.e = 0;
      }
   }

   protected void c(arm $$0, cig $$1, long $$2) {
      $$1.b(bvh.a);
   }

   protected void d(arm $$0, cig $$1, long $$2) {
      this.e++;
   }
}
