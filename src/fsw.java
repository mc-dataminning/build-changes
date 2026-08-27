public enum fsw {
   a(new fsw.b(fsw.a.f, fsw.a.e, fsw.a.a), new fsw.b(fsw.a.f, fsw.a.e, fsw.a.d), new fsw.b(fsw.a.c, fsw.a.e, fsw.a.d), new fsw.b(fsw.a.c, fsw.a.e, fsw.a.a)),
   b(new fsw.b(fsw.a.f, fsw.a.b, fsw.a.d), new fsw.b(fsw.a.f, fsw.a.b, fsw.a.a), new fsw.b(fsw.a.c, fsw.a.b, fsw.a.a), new fsw.b(fsw.a.c, fsw.a.b, fsw.a.d)),
   c(new fsw.b(fsw.a.c, fsw.a.b, fsw.a.d), new fsw.b(fsw.a.c, fsw.a.e, fsw.a.d), new fsw.b(fsw.a.f, fsw.a.e, fsw.a.d), new fsw.b(fsw.a.f, fsw.a.b, fsw.a.d)),
   d(new fsw.b(fsw.a.f, fsw.a.b, fsw.a.a), new fsw.b(fsw.a.f, fsw.a.e, fsw.a.a), new fsw.b(fsw.a.c, fsw.a.e, fsw.a.a), new fsw.b(fsw.a.c, fsw.a.b, fsw.a.a)),
   e(new fsw.b(fsw.a.f, fsw.a.b, fsw.a.d), new fsw.b(fsw.a.f, fsw.a.e, fsw.a.d), new fsw.b(fsw.a.f, fsw.a.e, fsw.a.a), new fsw.b(fsw.a.f, fsw.a.b, fsw.a.a)),
   f(new fsw.b(fsw.a.c, fsw.a.b, fsw.a.a), new fsw.b(fsw.a.c, fsw.a.e, fsw.a.a), new fsw.b(fsw.a.c, fsw.a.e, fsw.a.d), new fsw.b(fsw.a.c, fsw.a.b, fsw.a.d));

   private static final fsw[] g = ac.a(new fsw[6], $$0 -> {
      $$0[fsw.a.e] = a;
      $$0[fsw.a.b] = b;
      $$0[fsw.a.d] = c;
      $$0[fsw.a.a] = d;
      $$0[fsw.a.f] = e;
      $$0[fsw.a.c] = f;
   });
   private final fsw.b[] h;

   public static fsw a(ic $$0) {
      return g[$$0.d()];
   }

   private fsw(fsw.b... $$0) {
      this.h = $$0;
   }

   public fsw.b a(int $$0) {
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
