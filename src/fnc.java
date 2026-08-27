public enum fnc {
   a(new fnc.b(fnc.a.f, fnc.a.e, fnc.a.a), new fnc.b(fnc.a.f, fnc.a.e, fnc.a.d), new fnc.b(fnc.a.c, fnc.a.e, fnc.a.d), new fnc.b(fnc.a.c, fnc.a.e, fnc.a.a)),
   b(new fnc.b(fnc.a.f, fnc.a.b, fnc.a.d), new fnc.b(fnc.a.f, fnc.a.b, fnc.a.a), new fnc.b(fnc.a.c, fnc.a.b, fnc.a.a), new fnc.b(fnc.a.c, fnc.a.b, fnc.a.d)),
   c(new fnc.b(fnc.a.c, fnc.a.b, fnc.a.d), new fnc.b(fnc.a.c, fnc.a.e, fnc.a.d), new fnc.b(fnc.a.f, fnc.a.e, fnc.a.d), new fnc.b(fnc.a.f, fnc.a.b, fnc.a.d)),
   d(new fnc.b(fnc.a.f, fnc.a.b, fnc.a.a), new fnc.b(fnc.a.f, fnc.a.e, fnc.a.a), new fnc.b(fnc.a.c, fnc.a.e, fnc.a.a), new fnc.b(fnc.a.c, fnc.a.b, fnc.a.a)),
   e(new fnc.b(fnc.a.f, fnc.a.b, fnc.a.d), new fnc.b(fnc.a.f, fnc.a.e, fnc.a.d), new fnc.b(fnc.a.f, fnc.a.e, fnc.a.a), new fnc.b(fnc.a.f, fnc.a.b, fnc.a.a)),
   f(new fnc.b(fnc.a.c, fnc.a.b, fnc.a.a), new fnc.b(fnc.a.c, fnc.a.e, fnc.a.a), new fnc.b(fnc.a.c, fnc.a.e, fnc.a.d), new fnc.b(fnc.a.c, fnc.a.b, fnc.a.d));

   private static final fnc[] g = ac.a(new fnc[6], $$0 -> {
      $$0[fnc.a.e] = a;
      $$0[fnc.a.b] = b;
      $$0[fnc.a.d] = c;
      $$0[fnc.a.a] = d;
      $$0[fnc.a.f] = e;
      $$0[fnc.a.c] = f;
   });
   private final fnc.b[] h;

   public static fnc a(ha $$0) {
      return g[$$0.d()];
   }

   private fnc(fnc.b... $$0) {
      this.h = $$0;
   }

   public fnc.b a(int $$0) {
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
