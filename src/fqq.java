public enum fqq {
   a(new fqq.b(fqq.a.f, fqq.a.e, fqq.a.a), new fqq.b(fqq.a.f, fqq.a.e, fqq.a.d), new fqq.b(fqq.a.c, fqq.a.e, fqq.a.d), new fqq.b(fqq.a.c, fqq.a.e, fqq.a.a)),
   b(new fqq.b(fqq.a.f, fqq.a.b, fqq.a.d), new fqq.b(fqq.a.f, fqq.a.b, fqq.a.a), new fqq.b(fqq.a.c, fqq.a.b, fqq.a.a), new fqq.b(fqq.a.c, fqq.a.b, fqq.a.d)),
   c(new fqq.b(fqq.a.c, fqq.a.b, fqq.a.d), new fqq.b(fqq.a.c, fqq.a.e, fqq.a.d), new fqq.b(fqq.a.f, fqq.a.e, fqq.a.d), new fqq.b(fqq.a.f, fqq.a.b, fqq.a.d)),
   d(new fqq.b(fqq.a.f, fqq.a.b, fqq.a.a), new fqq.b(fqq.a.f, fqq.a.e, fqq.a.a), new fqq.b(fqq.a.c, fqq.a.e, fqq.a.a), new fqq.b(fqq.a.c, fqq.a.b, fqq.a.a)),
   e(new fqq.b(fqq.a.f, fqq.a.b, fqq.a.d), new fqq.b(fqq.a.f, fqq.a.e, fqq.a.d), new fqq.b(fqq.a.f, fqq.a.e, fqq.a.a), new fqq.b(fqq.a.f, fqq.a.b, fqq.a.a)),
   f(new fqq.b(fqq.a.c, fqq.a.b, fqq.a.a), new fqq.b(fqq.a.c, fqq.a.e, fqq.a.a), new fqq.b(fqq.a.c, fqq.a.e, fqq.a.d), new fqq.b(fqq.a.c, fqq.a.b, fqq.a.d));

   private static final fqq[] g = ac.a(new fqq[6], $$0 -> {
      $$0[fqq.a.e] = a;
      $$0[fqq.a.b] = b;
      $$0[fqq.a.d] = c;
      $$0[fqq.a.a] = d;
      $$0[fqq.a.f] = e;
      $$0[fqq.a.c] = f;
   });
   private final fqq.b[] h;

   public static fqq a(ib $$0) {
      return g[$$0.d()];
   }

   private fqq(fqq.b... $$0) {
      this.h = $$0;
   }

   public fqq.b a(int $$0) {
      return this.h[$$0];
   }

   public static final class a {
      public static final int a = ib.d.d();
      public static final int b = ib.b.d();
      public static final int c = ib.f.d();
      public static final int d = ib.c.d();
      public static final int e = ib.a.d();
      public static final int f = ib.e.d();
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
