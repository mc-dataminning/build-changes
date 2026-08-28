public class fbv {
   private static final int a = 60;
   private static final int b = 10;
   private static final int c = 30;
   private static final int d = 10;
   private static final long e = 60000L;
   private static final long f = 600000L;
   private final fip g;
   private final fil h;
   private int i;
   private long j;

   public fbv(fip $$0, fil $$1) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$0.h().c();
   }

   public int a() {
      fih $$0 = this.g.i().c();
      if (this.h.aP().k()) {
         return 10;
      } else {
         if ($$0 == fih.b) {
            long $$1 = ad.c() - this.j;
            if ($$1 > 600000L) {
               return 10;
            }

            if ($$1 > 60000L) {
               return Math.min(this.i, 30);
            }
         }

         return this.h.s != null || this.h.z == null && this.h.aN() == null ? this.i : 60;
      }
   }

   public void a(int $$0) {
      this.i = $$0;
   }

   public void b() {
      this.j = ad.c();
   }
}
