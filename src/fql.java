public enum fql {
   a(new fql.b(fql.a.f, fql.a.e, fql.a.a), new fql.b(fql.a.f, fql.a.e, fql.a.d), new fql.b(fql.a.c, fql.a.e, fql.a.d), new fql.b(fql.a.c, fql.a.e, fql.a.a)),
   b(new fql.b(fql.a.f, fql.a.b, fql.a.d), new fql.b(fql.a.f, fql.a.b, fql.a.a), new fql.b(fql.a.c, fql.a.b, fql.a.a), new fql.b(fql.a.c, fql.a.b, fql.a.d)),
   c(new fql.b(fql.a.c, fql.a.b, fql.a.d), new fql.b(fql.a.c, fql.a.e, fql.a.d), new fql.b(fql.a.f, fql.a.e, fql.a.d), new fql.b(fql.a.f, fql.a.b, fql.a.d)),
   d(new fql.b(fql.a.f, fql.a.b, fql.a.a), new fql.b(fql.a.f, fql.a.e, fql.a.a), new fql.b(fql.a.c, fql.a.e, fql.a.a), new fql.b(fql.a.c, fql.a.b, fql.a.a)),
   e(new fql.b(fql.a.f, fql.a.b, fql.a.d), new fql.b(fql.a.f, fql.a.e, fql.a.d), new fql.b(fql.a.f, fql.a.e, fql.a.a), new fql.b(fql.a.f, fql.a.b, fql.a.a)),
   f(new fql.b(fql.a.c, fql.a.b, fql.a.a), new fql.b(fql.a.c, fql.a.e, fql.a.a), new fql.b(fql.a.c, fql.a.e, fql.a.d), new fql.b(fql.a.c, fql.a.b, fql.a.d));

   private static final fql[] g = ac.a(new fql[6], $$0 -> {
      $$0[fql.a.e] = a;
      $$0[fql.a.b] = b;
      $$0[fql.a.d] = c;
      $$0[fql.a.a] = d;
      $$0[fql.a.f] = e;
      $$0[fql.a.c] = f;
   });
   private final fql.b[] h;

   public static fql a(hx $$0) {
      return g[$$0.d()];
   }

   private fql(fql.b... $$0) {
      this.h = $$0;
   }

   public fql.b a(int $$0) {
      return this.h[$$0];
   }

   public static final class a {
      public static final int a = hx.d.d();
      public static final int b = hx.b.d();
      public static final int c = hx.f.d();
      public static final int d = hx.c.d();
      public static final int e = hx.a.d();
      public static final int f = hx.e.d();
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
