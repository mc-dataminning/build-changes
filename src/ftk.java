public enum ftk {
   a(new ftk.b(ftk.a.f, ftk.a.e, ftk.a.a), new ftk.b(ftk.a.f, ftk.a.e, ftk.a.d), new ftk.b(ftk.a.c, ftk.a.e, ftk.a.d), new ftk.b(ftk.a.c, ftk.a.e, ftk.a.a)),
   b(new ftk.b(ftk.a.f, ftk.a.b, ftk.a.d), new ftk.b(ftk.a.f, ftk.a.b, ftk.a.a), new ftk.b(ftk.a.c, ftk.a.b, ftk.a.a), new ftk.b(ftk.a.c, ftk.a.b, ftk.a.d)),
   c(new ftk.b(ftk.a.c, ftk.a.b, ftk.a.d), new ftk.b(ftk.a.c, ftk.a.e, ftk.a.d), new ftk.b(ftk.a.f, ftk.a.e, ftk.a.d), new ftk.b(ftk.a.f, ftk.a.b, ftk.a.d)),
   d(new ftk.b(ftk.a.f, ftk.a.b, ftk.a.a), new ftk.b(ftk.a.f, ftk.a.e, ftk.a.a), new ftk.b(ftk.a.c, ftk.a.e, ftk.a.a), new ftk.b(ftk.a.c, ftk.a.b, ftk.a.a)),
   e(new ftk.b(ftk.a.f, ftk.a.b, ftk.a.d), new ftk.b(ftk.a.f, ftk.a.e, ftk.a.d), new ftk.b(ftk.a.f, ftk.a.e, ftk.a.a), new ftk.b(ftk.a.f, ftk.a.b, ftk.a.a)),
   f(new ftk.b(ftk.a.c, ftk.a.b, ftk.a.a), new ftk.b(ftk.a.c, ftk.a.e, ftk.a.a), new ftk.b(ftk.a.c, ftk.a.e, ftk.a.d), new ftk.b(ftk.a.c, ftk.a.b, ftk.a.d));

   private static final ftk[] g = ac.a(new ftk[6], $$0 -> {
      $$0[ftk.a.e] = a;
      $$0[ftk.a.b] = b;
      $$0[ftk.a.d] = c;
      $$0[ftk.a.a] = d;
      $$0[ftk.a.f] = e;
      $$0[ftk.a.c] = f;
   });
   private final ftk.b[] h;

   public static ftk a(ic $$0) {
      return g[$$0.d()];
   }

   private ftk(ftk.b... $$0) {
      this.h = $$0;
   }

   public ftk.b a(int $$0) {
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
