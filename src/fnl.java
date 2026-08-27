public enum fnl {
   a(new fnl.b(fnl.a.f, fnl.a.e, fnl.a.a), new fnl.b(fnl.a.f, fnl.a.e, fnl.a.d), new fnl.b(fnl.a.c, fnl.a.e, fnl.a.d), new fnl.b(fnl.a.c, fnl.a.e, fnl.a.a)),
   b(new fnl.b(fnl.a.f, fnl.a.b, fnl.a.d), new fnl.b(fnl.a.f, fnl.a.b, fnl.a.a), new fnl.b(fnl.a.c, fnl.a.b, fnl.a.a), new fnl.b(fnl.a.c, fnl.a.b, fnl.a.d)),
   c(new fnl.b(fnl.a.c, fnl.a.b, fnl.a.d), new fnl.b(fnl.a.c, fnl.a.e, fnl.a.d), new fnl.b(fnl.a.f, fnl.a.e, fnl.a.d), new fnl.b(fnl.a.f, fnl.a.b, fnl.a.d)),
   d(new fnl.b(fnl.a.f, fnl.a.b, fnl.a.a), new fnl.b(fnl.a.f, fnl.a.e, fnl.a.a), new fnl.b(fnl.a.c, fnl.a.e, fnl.a.a), new fnl.b(fnl.a.c, fnl.a.b, fnl.a.a)),
   e(new fnl.b(fnl.a.f, fnl.a.b, fnl.a.d), new fnl.b(fnl.a.f, fnl.a.e, fnl.a.d), new fnl.b(fnl.a.f, fnl.a.e, fnl.a.a), new fnl.b(fnl.a.f, fnl.a.b, fnl.a.a)),
   f(new fnl.b(fnl.a.c, fnl.a.b, fnl.a.a), new fnl.b(fnl.a.c, fnl.a.e, fnl.a.a), new fnl.b(fnl.a.c, fnl.a.e, fnl.a.d), new fnl.b(fnl.a.c, fnl.a.b, fnl.a.d));

   private static final fnl[] g = ac.a(new fnl[6], $$0 -> {
      $$0[fnl.a.e] = a;
      $$0[fnl.a.b] = b;
      $$0[fnl.a.d] = c;
      $$0[fnl.a.a] = d;
      $$0[fnl.a.f] = e;
      $$0[fnl.a.c] = f;
   });
   private final fnl.b[] h;

   public static fnl a(ha $$0) {
      return g[$$0.d()];
   }

   private fnl(fnl.b... $$0) {
      this.h = $$0;
   }

   public fnl.b a(int $$0) {
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
