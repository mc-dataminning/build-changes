public class fjy {
   private static final int a = 60;
   private static final int b = 10;
   private static final int c = 30;
   private static final int d = 10;
   private static final long e = 60000L;
   private static final long f = 600000L;
   private final fqu g;
   private final fqq h;
   private int i;
   private long j;

   public fjy(fqu $$0, fqq $$1) {
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

   public fjy.a b() {
      fqm $$0 = this.g.i().c();
      if (this.h.aO().j()) {
         return fjy.a.b;
      } else {
         if ($$0 == fqm.b) {
            long $$1 = ag.c() - this.j;
            if ($$1 > 600000L) {
               return fjy.a.c;
            }

            if ($$1 > 60000L) {
               return fjy.a.d;
            }
         }

         return this.h.s != null || this.h.z == null && this.h.aM() == null ? fjy.a.a : fjy.a.e;
      }
   }

   public boolean c() {
      fjy.a $$0 = this.b();
      return $$0 == fjy.a.b || $$0 == fjy.a.c;
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
