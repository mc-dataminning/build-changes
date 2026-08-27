public enum fnv {
   a(new fnv.b(fnv.a.f, fnv.a.e, fnv.a.a), new fnv.b(fnv.a.f, fnv.a.e, fnv.a.d), new fnv.b(fnv.a.c, fnv.a.e, fnv.a.d), new fnv.b(fnv.a.c, fnv.a.e, fnv.a.a)),
   b(new fnv.b(fnv.a.f, fnv.a.b, fnv.a.d), new fnv.b(fnv.a.f, fnv.a.b, fnv.a.a), new fnv.b(fnv.a.c, fnv.a.b, fnv.a.a), new fnv.b(fnv.a.c, fnv.a.b, fnv.a.d)),
   c(new fnv.b(fnv.a.c, fnv.a.b, fnv.a.d), new fnv.b(fnv.a.c, fnv.a.e, fnv.a.d), new fnv.b(fnv.a.f, fnv.a.e, fnv.a.d), new fnv.b(fnv.a.f, fnv.a.b, fnv.a.d)),
   d(new fnv.b(fnv.a.f, fnv.a.b, fnv.a.a), new fnv.b(fnv.a.f, fnv.a.e, fnv.a.a), new fnv.b(fnv.a.c, fnv.a.e, fnv.a.a), new fnv.b(fnv.a.c, fnv.a.b, fnv.a.a)),
   e(new fnv.b(fnv.a.f, fnv.a.b, fnv.a.d), new fnv.b(fnv.a.f, fnv.a.e, fnv.a.d), new fnv.b(fnv.a.f, fnv.a.e, fnv.a.a), new fnv.b(fnv.a.f, fnv.a.b, fnv.a.a)),
   f(new fnv.b(fnv.a.c, fnv.a.b, fnv.a.a), new fnv.b(fnv.a.c, fnv.a.e, fnv.a.a), new fnv.b(fnv.a.c, fnv.a.e, fnv.a.d), new fnv.b(fnv.a.c, fnv.a.b, fnv.a.d));

   private static final fnv[] g = ac.a(new fnv[6], $$0 -> {
      $$0[fnv.a.e] = a;
      $$0[fnv.a.b] = b;
      $$0[fnv.a.d] = c;
      $$0[fnv.a.a] = d;
      $$0[fnv.a.f] = e;
      $$0[fnv.a.c] = f;
   });
   private final fnv.b[] h;

   public static fnv a(ha $$0) {
      return g[$$0.d()];
   }

   private fnv(fnv.b... $$0) {
      this.h = $$0;
   }

   public fnv.b a(int $$0) {
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
