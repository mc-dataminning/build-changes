public enum fsq {
   a(new fsq.b(fsq.a.f, fsq.a.e, fsq.a.a), new fsq.b(fsq.a.f, fsq.a.e, fsq.a.d), new fsq.b(fsq.a.c, fsq.a.e, fsq.a.d), new fsq.b(fsq.a.c, fsq.a.e, fsq.a.a)),
   b(new fsq.b(fsq.a.f, fsq.a.b, fsq.a.d), new fsq.b(fsq.a.f, fsq.a.b, fsq.a.a), new fsq.b(fsq.a.c, fsq.a.b, fsq.a.a), new fsq.b(fsq.a.c, fsq.a.b, fsq.a.d)),
   c(new fsq.b(fsq.a.c, fsq.a.b, fsq.a.d), new fsq.b(fsq.a.c, fsq.a.e, fsq.a.d), new fsq.b(fsq.a.f, fsq.a.e, fsq.a.d), new fsq.b(fsq.a.f, fsq.a.b, fsq.a.d)),
   d(new fsq.b(fsq.a.f, fsq.a.b, fsq.a.a), new fsq.b(fsq.a.f, fsq.a.e, fsq.a.a), new fsq.b(fsq.a.c, fsq.a.e, fsq.a.a), new fsq.b(fsq.a.c, fsq.a.b, fsq.a.a)),
   e(new fsq.b(fsq.a.f, fsq.a.b, fsq.a.d), new fsq.b(fsq.a.f, fsq.a.e, fsq.a.d), new fsq.b(fsq.a.f, fsq.a.e, fsq.a.a), new fsq.b(fsq.a.f, fsq.a.b, fsq.a.a)),
   f(new fsq.b(fsq.a.c, fsq.a.b, fsq.a.a), new fsq.b(fsq.a.c, fsq.a.e, fsq.a.a), new fsq.b(fsq.a.c, fsq.a.e, fsq.a.d), new fsq.b(fsq.a.c, fsq.a.b, fsq.a.d));

   private static final fsq[] g = ac.a(new fsq[6], $$0 -> {
      $$0[fsq.a.e] = a;
      $$0[fsq.a.b] = b;
      $$0[fsq.a.d] = c;
      $$0[fsq.a.a] = d;
      $$0[fsq.a.f] = e;
      $$0[fsq.a.c] = f;
   });
   private final fsq.b[] h;

   public static fsq a(ic $$0) {
      return g[$$0.d()];
   }

   private fsq(fsq.b... $$0) {
      this.h = $$0;
   }

   public fsq.b a(int $$0) {
      return this.h[$$0];
   }

   public static final class a {
      public static final int a = ic.d.d();
      public static final int b = ic.b.d();
      public static final int c = ic.f.d();
      public static final int d = ic.c.d();
      public static final int e = ic.a.d();
      public static final int f = ic.e.d();
   }

   public static class b {
      public final int a;
      public final int b;
      public final int c;

      b(int $$0, int $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
