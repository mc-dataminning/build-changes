public enum fnr {
   a(new fnr.b(fnr.a.f, fnr.a.e, fnr.a.a), new fnr.b(fnr.a.f, fnr.a.e, fnr.a.d), new fnr.b(fnr.a.c, fnr.a.e, fnr.a.d), new fnr.b(fnr.a.c, fnr.a.e, fnr.a.a)),
   b(new fnr.b(fnr.a.f, fnr.a.b, fnr.a.d), new fnr.b(fnr.a.f, fnr.a.b, fnr.a.a), new fnr.b(fnr.a.c, fnr.a.b, fnr.a.a), new fnr.b(fnr.a.c, fnr.a.b, fnr.a.d)),
   c(new fnr.b(fnr.a.c, fnr.a.b, fnr.a.d), new fnr.b(fnr.a.c, fnr.a.e, fnr.a.d), new fnr.b(fnr.a.f, fnr.a.e, fnr.a.d), new fnr.b(fnr.a.f, fnr.a.b, fnr.a.d)),
   d(new fnr.b(fnr.a.f, fnr.a.b, fnr.a.a), new fnr.b(fnr.a.f, fnr.a.e, fnr.a.a), new fnr.b(fnr.a.c, fnr.a.e, fnr.a.a), new fnr.b(fnr.a.c, fnr.a.b, fnr.a.a)),
   e(new fnr.b(fnr.a.f, fnr.a.b, fnr.a.d), new fnr.b(fnr.a.f, fnr.a.e, fnr.a.d), new fnr.b(fnr.a.f, fnr.a.e, fnr.a.a), new fnr.b(fnr.a.f, fnr.a.b, fnr.a.a)),
   f(new fnr.b(fnr.a.c, fnr.a.b, fnr.a.a), new fnr.b(fnr.a.c, fnr.a.e, fnr.a.a), new fnr.b(fnr.a.c, fnr.a.e, fnr.a.d), new fnr.b(fnr.a.c, fnr.a.b, fnr.a.d));

   private static final fnr[] g = ac.a(new fnr[6], $$0 -> {
      $$0[fnr.a.e] = a;
      $$0[fnr.a.b] = b;
      $$0[fnr.a.d] = c;
      $$0[fnr.a.a] = d;
      $$0[fnr.a.f] = e;
      $$0[fnr.a.c] = f;
   });
   private final fnr.b[] h;

   public static fnr a(ha $$0) {
      return g[$$0.d()];
   }

   private fnr(fnr.b... $$0) {
      this.h = $$0;
   }

   public fnr.b a(int $$0) {
      return this.h[$$0];
   }

   public static final class a {
      public static final int a = ha.d.d();
      public static final int b = ha.b.d();
      public static final int c = ha.f.d();
      public static final int d = ha.c.d();
      public static final int e = ha.a.d();
      public static final int f = ha.e.d();
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
