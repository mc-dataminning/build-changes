public class fht {
   private static final int a = 60;
   private static final int b = 10;
   private static final int c = 30;
   private static final int d = 10;
   private static final long e = 60000L;
   private static final long f = 600000L;
   private final fow g;
   private final fos h;
   private int i;
   private long j;

   public fht(fow $$0, fos $$1) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$0.h().c();
   }

   public int a() {
      return switch (this.b()) {
         case a -> this.i;
         case b -> 10;
         case c -> 10;
         case d -> Math.min(this.i, 30);
         case e -> 60;
      };
   }

   public fht.a b() {
      fon $$0 = this.g.i().c();
      if (this.h.aO().j()) {
         return fht.a.b;
      } else {
         if ($$0 == fon.b) {
            long $$1 = af.c() - this.j;
            if ($$1 > 600000L) {
               return fht.a.c;
            }

            if ($$1 > 60000L) {
               return fht.a.d;
            }
         }

         return this.h.s != null || this.h.z == null && this.h.aM() == null ? fht.a.a : fht.a.e;
      }
   }

   public boolean c() {
      fht.a $$0 = this.b();
      return $$0 == fht.a.b || $$0 == fht.a.c;
   }

   public void a(int $$0) {
      this.i = $$0;
   }

   public void d() {
      this.j = af.c();
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }
}
