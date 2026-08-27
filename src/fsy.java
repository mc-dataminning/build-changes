public enum fsy {
   a(new fsy.b(fsy.a.f, fsy.a.e, fsy.a.a), new fsy.b(fsy.a.f, fsy.a.e, fsy.a.d), new fsy.b(fsy.a.c, fsy.a.e, fsy.a.d), new fsy.b(fsy.a.c, fsy.a.e, fsy.a.a)),
   b(new fsy.b(fsy.a.f, fsy.a.b, fsy.a.d), new fsy.b(fsy.a.f, fsy.a.b, fsy.a.a), new fsy.b(fsy.a.c, fsy.a.b, fsy.a.a), new fsy.b(fsy.a.c, fsy.a.b, fsy.a.d)),
   c(new fsy.b(fsy.a.c, fsy.a.b, fsy.a.d), new fsy.b(fsy.a.c, fsy.a.e, fsy.a.d), new fsy.b(fsy.a.f, fsy.a.e, fsy.a.d), new fsy.b(fsy.a.f, fsy.a.b, fsy.a.d)),
   d(new fsy.b(fsy.a.f, fsy.a.b, fsy.a.a), new fsy.b(fsy.a.f, fsy.a.e, fsy.a.a), new fsy.b(fsy.a.c, fsy.a.e, fsy.a.a), new fsy.b(fsy.a.c, fsy.a.b, fsy.a.a)),
   e(new fsy.b(fsy.a.f, fsy.a.b, fsy.a.d), new fsy.b(fsy.a.f, fsy.a.e, fsy.a.d), new fsy.b(fsy.a.f, fsy.a.e, fsy.a.a), new fsy.b(fsy.a.f, fsy.a.b, fsy.a.a)),
   f(new fsy.b(fsy.a.c, fsy.a.b, fsy.a.a), new fsy.b(fsy.a.c, fsy.a.e, fsy.a.a), new fsy.b(fsy.a.c, fsy.a.e, fsy.a.d), new fsy.b(fsy.a.c, fsy.a.b, fsy.a.d));

   private static final fsy[] g = ac.a(new fsy[6], $$0 -> {
      $$0[fsy.a.e] = a;
      $$0[fsy.a.b] = b;
      $$0[fsy.a.d] = c;
      $$0[fsy.a.a] = d;
      $$0[fsy.a.f] = e;
      $$0[fsy.a.c] = f;
   });
   private final fsy.b[] h;

   public static fsy a(ic $$0) {
      return g[$$0.d()];
   }

   private fsy(fsy.b... $$0) {
      this.h = $$0;
   }

   public fsy.b a(int $$0) {
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
