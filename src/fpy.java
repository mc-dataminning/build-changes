public enum fpy {
   a(new fpy.b(fpy.a.f, fpy.a.e, fpy.a.a), new fpy.b(fpy.a.f, fpy.a.e, fpy.a.d), new fpy.b(fpy.a.c, fpy.a.e, fpy.a.d), new fpy.b(fpy.a.c, fpy.a.e, fpy.a.a)),
   b(new fpy.b(fpy.a.f, fpy.a.b, fpy.a.d), new fpy.b(fpy.a.f, fpy.a.b, fpy.a.a), new fpy.b(fpy.a.c, fpy.a.b, fpy.a.a), new fpy.b(fpy.a.c, fpy.a.b, fpy.a.d)),
   c(new fpy.b(fpy.a.c, fpy.a.b, fpy.a.d), new fpy.b(fpy.a.c, fpy.a.e, fpy.a.d), new fpy.b(fpy.a.f, fpy.a.e, fpy.a.d), new fpy.b(fpy.a.f, fpy.a.b, fpy.a.d)),
   d(new fpy.b(fpy.a.f, fpy.a.b, fpy.a.a), new fpy.b(fpy.a.f, fpy.a.e, fpy.a.a), new fpy.b(fpy.a.c, fpy.a.e, fpy.a.a), new fpy.b(fpy.a.c, fpy.a.b, fpy.a.a)),
   e(new fpy.b(fpy.a.f, fpy.a.b, fpy.a.d), new fpy.b(fpy.a.f, fpy.a.e, fpy.a.d), new fpy.b(fpy.a.f, fpy.a.e, fpy.a.a), new fpy.b(fpy.a.f, fpy.a.b, fpy.a.a)),
   f(new fpy.b(fpy.a.c, fpy.a.b, fpy.a.a), new fpy.b(fpy.a.c, fpy.a.e, fpy.a.a), new fpy.b(fpy.a.c, fpy.a.e, fpy.a.d), new fpy.b(fpy.a.c, fpy.a.b, fpy.a.d));

   private static final fpy[] g = ac.a(new fpy[6], $$0 -> {
      $$0[fpy.a.e] = a;
      $$0[fpy.a.b] = b;
      $$0[fpy.a.d] = c;
      $$0[fpy.a.a] = d;
      $$0[fpy.a.f] = e;
      $$0[fpy.a.c] = f;
   });
   private final fpy.b[] h;

   public static fpy a(hx $$0) {
      return g[$$0.d()];
   }

   private fpy(fpy.b... $$0) {
      this.h = $$0;
   }

   public fpy.b a(int $$0) {
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
