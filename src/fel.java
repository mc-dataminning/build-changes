public class fel {
   private static final int a = 60;
   private static final int b = 10;
   private static final int c = 30;
   private static final int d = 10;
   private static final long e = 60000L;
   private static final long f = 600000L;
   private final fln g;
   private final flj h;
   private int i;
   private long j;

   public fel(fln $$0, flj $$1) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$0.h().c();
   }

   public int a() {
      flf $$0 = this.g.i().c();
      if (this.h.aO().j()) {
         return 10;
      } else {
         if ($$0 == flf.b) {
            long $$1 = af.c() - this.j;
            if ($$1 > 600000L) {
               return 10;
            }

            if ($$1 > 60000L) {
               return Math.min(this.i, 30);
            }
         }

         return this.h.s != null || this.h.z == null && this.h.aM() == null ? this.i : 60;
      }
   }

   public void a(int $$0) {
      this.i = $$0;
   }

   public void b() {
      this.j = af.c();
   }
}
