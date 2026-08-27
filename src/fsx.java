public enum fsx {
   a(new fsx.b(fsx.a.f, fsx.a.e, fsx.a.a), new fsx.b(fsx.a.f, fsx.a.e, fsx.a.d), new fsx.b(fsx.a.c, fsx.a.e, fsx.a.d), new fsx.b(fsx.a.c, fsx.a.e, fsx.a.a)),
   b(new fsx.b(fsx.a.f, fsx.a.b, fsx.a.d), new fsx.b(fsx.a.f, fsx.a.b, fsx.a.a), new fsx.b(fsx.a.c, fsx.a.b, fsx.a.a), new fsx.b(fsx.a.c, fsx.a.b, fsx.a.d)),
   c(new fsx.b(fsx.a.c, fsx.a.b, fsx.a.d), new fsx.b(fsx.a.c, fsx.a.e, fsx.a.d), new fsx.b(fsx.a.f, fsx.a.e, fsx.a.d), new fsx.b(fsx.a.f, fsx.a.b, fsx.a.d)),
   d(new fsx.b(fsx.a.f, fsx.a.b, fsx.a.a), new fsx.b(fsx.a.f, fsx.a.e, fsx.a.a), new fsx.b(fsx.a.c, fsx.a.e, fsx.a.a), new fsx.b(fsx.a.c, fsx.a.b, fsx.a.a)),
   e(new fsx.b(fsx.a.f, fsx.a.b, fsx.a.d), new fsx.b(fsx.a.f, fsx.a.e, fsx.a.d), new fsx.b(fsx.a.f, fsx.a.e, fsx.a.a), new fsx.b(fsx.a.f, fsx.a.b, fsx.a.a)),
   f(new fsx.b(fsx.a.c, fsx.a.b, fsx.a.a), new fsx.b(fsx.a.c, fsx.a.e, fsx.a.a), new fsx.b(fsx.a.c, fsx.a.e, fsx.a.d), new fsx.b(fsx.a.c, fsx.a.b, fsx.a.d));

   private static final fsx[] g = ac.a(new fsx[6], $$0 -> {
      $$0[fsx.a.e] = a;
      $$0[fsx.a.b] = b;
      $$0[fsx.a.d] = c;
      $$0[fsx.a.a] = d;
      $$0[fsx.a.f] = e;
      $$0[fsx.a.c] = f;
   });
   private final fsx.b[] h;

   public static fsx a(ic $$0) {
      return g[$$0.d()];
   }

   private fsx(fsx.b... $$0) {
      this.h = $$0;
   }

   public fsx.b a(int $$0) {
      return this.h[$$0];
   }

   public static final class a {
      public static final int a = ic.d.d();
      public static final int b = ic.b.d();
      public static final int c = ic.f.d();
      public static final int d = ic.c.d();
      public static final int e = ic.a.d();
      public static final int f = ic.e.d();
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
