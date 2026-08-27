public enum fnq {
   a(new fnq.b(fnq.a.f, fnq.a.e, fnq.a.a), new fnq.b(fnq.a.f, fnq.a.e, fnq.a.d), new fnq.b(fnq.a.c, fnq.a.e, fnq.a.d), new fnq.b(fnq.a.c, fnq.a.e, fnq.a.a)),
   b(new fnq.b(fnq.a.f, fnq.a.b, fnq.a.d), new fnq.b(fnq.a.f, fnq.a.b, fnq.a.a), new fnq.b(fnq.a.c, fnq.a.b, fnq.a.a), new fnq.b(fnq.a.c, fnq.a.b, fnq.a.d)),
   c(new fnq.b(fnq.a.c, fnq.a.b, fnq.a.d), new fnq.b(fnq.a.c, fnq.a.e, fnq.a.d), new fnq.b(fnq.a.f, fnq.a.e, fnq.a.d), new fnq.b(fnq.a.f, fnq.a.b, fnq.a.d)),
   d(new fnq.b(fnq.a.f, fnq.a.b, fnq.a.a), new fnq.b(fnq.a.f, fnq.a.e, fnq.a.a), new fnq.b(fnq.a.c, fnq.a.e, fnq.a.a), new fnq.b(fnq.a.c, fnq.a.b, fnq.a.a)),
   e(new fnq.b(fnq.a.f, fnq.a.b, fnq.a.d), new fnq.b(fnq.a.f, fnq.a.e, fnq.a.d), new fnq.b(fnq.a.f, fnq.a.e, fnq.a.a), new fnq.b(fnq.a.f, fnq.a.b, fnq.a.a)),
   f(new fnq.b(fnq.a.c, fnq.a.b, fnq.a.a), new fnq.b(fnq.a.c, fnq.a.e, fnq.a.a), new fnq.b(fnq.a.c, fnq.a.e, fnq.a.d), new fnq.b(fnq.a.c, fnq.a.b, fnq.a.d));

   private static final fnq[] g = ac.a(new fnq[6], $$0 -> {
      $$0[fnq.a.e] = a;
      $$0[fnq.a.b] = b;
      $$0[fnq.a.d] = c;
      $$0[fnq.a.a] = d;
      $$0[fnq.a.f] = e;
      $$0[fnq.a.c] = f;
   });
   private final fnq.b[] h;

   public static fnq a(hc $$0) {
      return g[$$0.d()];
   }

   private fnq(fnq.b... $$0) {
      this.h = $$0;
   }

   public fnq.b a(int $$0) {
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
