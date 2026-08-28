import com.google.common.collect.ImmutableMap;

public class bxx extends bxq<cji> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bxx() {
      super(ImmutableMap.of(cfb.m, cfc.b), 100);
   }

   protected boolean a(arx $$0, cji $$1) {
      return $$1.aw() == bwj.a;
   }

   protected boolean a(arx $$0, cji $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(arx $$0, cji $$1, long $$2) {
      if (!$$1.bn()) {
         $$1.b(bwj.i);
         this.e = 0;
      }
   }

   protected void c(arx $$0, cji $$1, long $$2) {
      $$1.b(bwj.a);
   }

   protected void d(arx $$0, cji $$1, long $$2) {
      this.e++;
   }
}
