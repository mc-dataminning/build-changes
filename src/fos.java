public enum fos {
   a(new fos.b(fos.a.f, fos.a.e, fos.a.a), new fos.b(fos.a.f, fos.a.e, fos.a.d), new fos.b(fos.a.c, fos.a.e, fos.a.d), new fos.b(fos.a.c, fos.a.e, fos.a.a)),
   b(new fos.b(fos.a.f, fos.a.b, fos.a.d), new fos.b(fos.a.f, fos.a.b, fos.a.a), new fos.b(fos.a.c, fos.a.b, fos.a.a), new fos.b(fos.a.c, fos.a.b, fos.a.d)),
   c(new fos.b(fos.a.c, fos.a.b, fos.a.d), new fos.b(fos.a.c, fos.a.e, fos.a.d), new fos.b(fos.a.f, fos.a.e, fos.a.d), new fos.b(fos.a.f, fos.a.b, fos.a.d)),
   d(new fos.b(fos.a.f, fos.a.b, fos.a.a), new fos.b(fos.a.f, fos.a.e, fos.a.a), new fos.b(fos.a.c, fos.a.e, fos.a.a), new fos.b(fos.a.c, fos.a.b, fos.a.a)),
   e(new fos.b(fos.a.f, fos.a.b, fos.a.d), new fos.b(fos.a.f, fos.a.e, fos.a.d), new fos.b(fos.a.f, fos.a.e, fos.a.a), new fos.b(fos.a.f, fos.a.b, fos.a.a)),
   f(new fos.b(fos.a.c, fos.a.b, fos.a.a), new fos.b(fos.a.c, fos.a.e, fos.a.a), new fos.b(fos.a.c, fos.a.e, fos.a.d), new fos.b(fos.a.c, fos.a.b, fos.a.d));

   private static final fos[] g = ac.a(new fos[6], $$0 -> {
      $$0[fos.a.e] = a;
      $$0[fos.a.b] = b;
      $$0[fos.a.d] = c;
      $$0[fos.a.a] = d;
      $$0[fos.a.f] = e;
      $$0[fos.a.c] = f;
   });
   private final fos.b[] h;

   public static fos a(hx $$0) {
      return g[$$0.d()];
   }

   private fos(fos.b... $$0) {
      this.h = $$0;
   }

   public fos.b a(int $$0) {
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
