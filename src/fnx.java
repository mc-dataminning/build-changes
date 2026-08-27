public enum fnx {
   a(new fnx.b(fnx.a.f, fnx.a.e, fnx.a.a), new fnx.b(fnx.a.f, fnx.a.e, fnx.a.d), new fnx.b(fnx.a.c, fnx.a.e, fnx.a.d), new fnx.b(fnx.a.c, fnx.a.e, fnx.a.a)),
   b(new fnx.b(fnx.a.f, fnx.a.b, fnx.a.d), new fnx.b(fnx.a.f, fnx.a.b, fnx.a.a), new fnx.b(fnx.a.c, fnx.a.b, fnx.a.a), new fnx.b(fnx.a.c, fnx.a.b, fnx.a.d)),
   c(new fnx.b(fnx.a.c, fnx.a.b, fnx.a.d), new fnx.b(fnx.a.c, fnx.a.e, fnx.a.d), new fnx.b(fnx.a.f, fnx.a.e, fnx.a.d), new fnx.b(fnx.a.f, fnx.a.b, fnx.a.d)),
   d(new fnx.b(fnx.a.f, fnx.a.b, fnx.a.a), new fnx.b(fnx.a.f, fnx.a.e, fnx.a.a), new fnx.b(fnx.a.c, fnx.a.e, fnx.a.a), new fnx.b(fnx.a.c, fnx.a.b, fnx.a.a)),
   e(new fnx.b(fnx.a.f, fnx.a.b, fnx.a.d), new fnx.b(fnx.a.f, fnx.a.e, fnx.a.d), new fnx.b(fnx.a.f, fnx.a.e, fnx.a.a), new fnx.b(fnx.a.f, fnx.a.b, fnx.a.a)),
   f(new fnx.b(fnx.a.c, fnx.a.b, fnx.a.a), new fnx.b(fnx.a.c, fnx.a.e, fnx.a.a), new fnx.b(fnx.a.c, fnx.a.e, fnx.a.d), new fnx.b(fnx.a.c, fnx.a.b, fnx.a.d));

   private static final fnx[] g = ac.a(new fnx[6], $$0 -> {
      $$0[fnx.a.e] = a;
      $$0[fnx.a.b] = b;
      $$0[fnx.a.d] = c;
      $$0[fnx.a.a] = d;
      $$0[fnx.a.f] = e;
      $$0[fnx.a.c] = f;
   });
   private final fnx.b[] h;

   public static fnx a(hc $$0) {
      return g[$$0.d()];
   }

   private fnx(fnx.b... $$0) {
      this.h = $$0;
   }

   public fnx.b a(int $$0) {
      return this.h[$$0];
   }

   public static final class a {
      public static final int a = hc.d.d();
      public static final int b = hc.b.d();
      public static final int c = hc.f.d();
      public static final int d = hc.c.d();
      public static final int e = hc.a.d();
      public static final int f = hc.e.d();
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
