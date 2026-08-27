public enum fmx {
   a(new fmx.b(fmx.a.f, fmx.a.e, fmx.a.a), new fmx.b(fmx.a.f, fmx.a.e, fmx.a.d), new fmx.b(fmx.a.c, fmx.a.e, fmx.a.d), new fmx.b(fmx.a.c, fmx.a.e, fmx.a.a)),
   b(new fmx.b(fmx.a.f, fmx.a.b, fmx.a.d), new fmx.b(fmx.a.f, fmx.a.b, fmx.a.a), new fmx.b(fmx.a.c, fmx.a.b, fmx.a.a), new fmx.b(fmx.a.c, fmx.a.b, fmx.a.d)),
   c(new fmx.b(fmx.a.c, fmx.a.b, fmx.a.d), new fmx.b(fmx.a.c, fmx.a.e, fmx.a.d), new fmx.b(fmx.a.f, fmx.a.e, fmx.a.d), new fmx.b(fmx.a.f, fmx.a.b, fmx.a.d)),
   d(new fmx.b(fmx.a.f, fmx.a.b, fmx.a.a), new fmx.b(fmx.a.f, fmx.a.e, fmx.a.a), new fmx.b(fmx.a.c, fmx.a.e, fmx.a.a), new fmx.b(fmx.a.c, fmx.a.b, fmx.a.a)),
   e(new fmx.b(fmx.a.f, fmx.a.b, fmx.a.d), new fmx.b(fmx.a.f, fmx.a.e, fmx.a.d), new fmx.b(fmx.a.f, fmx.a.e, fmx.a.a), new fmx.b(fmx.a.f, fmx.a.b, fmx.a.a)),
   f(new fmx.b(fmx.a.c, fmx.a.b, fmx.a.a), new fmx.b(fmx.a.c, fmx.a.e, fmx.a.a), new fmx.b(fmx.a.c, fmx.a.e, fmx.a.d), new fmx.b(fmx.a.c, fmx.a.b, fmx.a.d));

   private static final fmx[] g = ac.a(new fmx[6], $$0 -> {
      $$0[fmx.a.e] = a;
      $$0[fmx.a.b] = b;
      $$0[fmx.a.d] = c;
      $$0[fmx.a.a] = d;
      $$0[fmx.a.f] = e;
      $$0[fmx.a.c] = f;
   });
   private final fmx.b[] h;

   public static fmx a(hb $$0) {
      return g[$$0.d()];
   }

   private fmx(fmx.b... $$0) {
      this.h = $$0;
   }

   public fmx.b a(int $$0) {
      return this.h[$$0];
   }

   public static final class a {
      public static final int a = hb.d.d();
      public static final int b = hb.b.d();
      public static final int c = hb.f.d();
      public static final int d = hb.c.d();
      public static final int e = hb.a.d();
      public static final int f = hb.e.d();
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
