public enum frz {
   a(new frz.b(frz.a.f, frz.a.e, frz.a.a), new frz.b(frz.a.f, frz.a.e, frz.a.d), new frz.b(frz.a.c, frz.a.e, frz.a.d), new frz.b(frz.a.c, frz.a.e, frz.a.a)),
   b(new frz.b(frz.a.f, frz.a.b, frz.a.d), new frz.b(frz.a.f, frz.a.b, frz.a.a), new frz.b(frz.a.c, frz.a.b, frz.a.a), new frz.b(frz.a.c, frz.a.b, frz.a.d)),
   c(new frz.b(frz.a.c, frz.a.b, frz.a.d), new frz.b(frz.a.c, frz.a.e, frz.a.d), new frz.b(frz.a.f, frz.a.e, frz.a.d), new frz.b(frz.a.f, frz.a.b, frz.a.d)),
   d(new frz.b(frz.a.f, frz.a.b, frz.a.a), new frz.b(frz.a.f, frz.a.e, frz.a.a), new frz.b(frz.a.c, frz.a.e, frz.a.a), new frz.b(frz.a.c, frz.a.b, frz.a.a)),
   e(new frz.b(frz.a.f, frz.a.b, frz.a.d), new frz.b(frz.a.f, frz.a.e, frz.a.d), new frz.b(frz.a.f, frz.a.e, frz.a.a), new frz.b(frz.a.f, frz.a.b, frz.a.a)),
   f(new frz.b(frz.a.c, frz.a.b, frz.a.a), new frz.b(frz.a.c, frz.a.e, frz.a.a), new frz.b(frz.a.c, frz.a.e, frz.a.d), new frz.b(frz.a.c, frz.a.b, frz.a.d));

   private static final frz[] g = ac.a(new frz[6], $$0 -> {
      $$0[frz.a.e] = a;
      $$0[frz.a.b] = b;
      $$0[frz.a.d] = c;
      $$0[frz.a.a] = d;
      $$0[frz.a.f] = e;
      $$0[frz.a.c] = f;
   });
   private final frz.b[] h;

   public static frz a(ia $$0) {
      return g[$$0.d()];
   }

   private frz(frz.b... $$0) {
      this.h = $$0;
   }

   public frz.b a(int $$0) {
      return this.h[$$0];
   }

   public static final class a {
      public static final int a = ia.d.d();
      public static final int b = ia.b.d();
      public static final int c = ia.f.d();
      public static final int d = ia.c.d();
      public static final int e = ia.a.d();
      public static final int f = ia.e.d();
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
