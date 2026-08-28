public class fka {
   private static final int a = 60;
   private static final int b = 10;
   private static final int c = 30;
   private static final int d = 10;
   private static final long e = 60000L;
   private static final long f = 600000L;
   private final frj g;
   private final frf h;
   private int i;
   private long j;

   public fka(frj $$0, frf $$1) {
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

   public fka.a b() {
      frb $$0 = this.g.i().c();
      if (this.h.aO().j()) {
         return fka.a.b;
      } else {
         if ($$0 == frb.b) {
            long $$1 = ag.c() - this.j;
            if ($$1 > 600000L) {
               return fka.a.c;
            }

            if ($$1 > 60000L) {
               return fka.a.d;
            }
         }

         return this.h.s != null || this.h.z == null && this.h.aM() == null ? fka.a.a : fka.a.e;
      }
   }

   public boolean c() {
      fka.a $$0 = this.b();
      return $$0 == fka.a.b || $$0 == fka.a.c;
   }

   public void a(int $$0) {
      this.i = $$0;
   }

   public void d() {
      this.j = ag.c();
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }
}
