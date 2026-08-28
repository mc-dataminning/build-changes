public class fhh {
   private static final int a = 60;
   private static final int b = 10;
   private static final int c = 30;
   private static final int d = 10;
   private static final long e = 60000L;
   private static final long f = 600000L;
   private final foj g;
   private final fof h;
   private int i;
   private long j;

   public fhh(foj $$0, fof $$1) {
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

   public fhh.a b() {
      fob $$0 = this.g.i().c();
      if (this.h.aO().j()) {
         return fhh.a.b;
      } else {
         if ($$0 == fob.b) {
            long $$1 = af.c() - this.j;
            if ($$1 > 600000L) {
               return fhh.a.c;
            }

            if ($$1 > 60000L) {
               return fhh.a.d;
            }
         }

         return this.h.s != null || this.h.z == null && this.h.aM() == null ? fhh.a.a : fhh.a.e;
      }
   }

   public boolean c() {
      fhh.a $$0 = this.b();
      return $$0 == fhh.a.b || $$0 == fhh.a.c;
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
