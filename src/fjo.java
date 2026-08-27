public enum fjo {
   a(new fjo.b(fjo.a.f, fjo.a.e, fjo.a.a), new fjo.b(fjo.a.f, fjo.a.e, fjo.a.d), new fjo.b(fjo.a.c, fjo.a.e, fjo.a.d), new fjo.b(fjo.a.c, fjo.a.e, fjo.a.a)),
   b(new fjo.b(fjo.a.f, fjo.a.b, fjo.a.d), new fjo.b(fjo.a.f, fjo.a.b, fjo.a.a), new fjo.b(fjo.a.c, fjo.a.b, fjo.a.a), new fjo.b(fjo.a.c, fjo.a.b, fjo.a.d)),
   c(new fjo.b(fjo.a.c, fjo.a.b, fjo.a.d), new fjo.b(fjo.a.c, fjo.a.e, fjo.a.d), new fjo.b(fjo.a.f, fjo.a.e, fjo.a.d), new fjo.b(fjo.a.f, fjo.a.b, fjo.a.d)),
   d(new fjo.b(fjo.a.f, fjo.a.b, fjo.a.a), new fjo.b(fjo.a.f, fjo.a.e, fjo.a.a), new fjo.b(fjo.a.c, fjo.a.e, fjo.a.a), new fjo.b(fjo.a.c, fjo.a.b, fjo.a.a)),
   e(new fjo.b(fjo.a.f, fjo.a.b, fjo.a.d), new fjo.b(fjo.a.f, fjo.a.e, fjo.a.d), new fjo.b(fjo.a.f, fjo.a.e, fjo.a.a), new fjo.b(fjo.a.f, fjo.a.b, fjo.a.a)),
   f(new fjo.b(fjo.a.c, fjo.a.b, fjo.a.a), new fjo.b(fjo.a.c, fjo.a.e, fjo.a.a), new fjo.b(fjo.a.c, fjo.a.e, fjo.a.d), new fjo.b(fjo.a.c, fjo.a.b, fjo.a.d));

   private static final fjo[] g = ac.a(new fjo[6], $$0 -> {
      $$0[fjo.a.e] = a;
      $$0[fjo.a.b] = b;
      $$0[fjo.a.d] = c;
      $$0[fjo.a.a] = d;
      $$0[fjo.a.f] = e;
      $$0[fjo.a.c] = f;
   });
   private final fjo.b[] h;

   public static fjo a(ha $$0) {
      return g[$$0.d()];
   }

   private fjo(fjo.b... $$0) {
      this.h = $$0;
   }

   public fjo.b a(int $$0) {
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
