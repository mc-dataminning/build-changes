public enum bsd implements ayz {
   a(bsd.a.a, 0, 0, "mainhand"),
   b(bsd.a.a, 1, 5, "offhand"),
   c(bsd.a.b, 0, 1, "feet"),
   d(bsd.a.b, 1, 2, "legs"),
   e(bsd.a.b, 2, 3, "chest"),
   f(bsd.a.b, 3, 4, "head"),
   g(bsd.a.c, 0, 6, "body");

   public static final ayz.a<bsd> h = ayz.a(bsd::values);
   private final bsd.a i;
   private final int j;
   private final int k;
   private final String l;

   private bsd(bsd.a $$0, int $$1, int $$2, String $$3) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.l = $$3;
   }

   public bsd.a a() {
      return this.i;
   }

   public int b() {
      return this.j;
   }

   public int a(int $$0) {
      return $$0 + this.j;
   }

   public int d() {
      return this.k;
   }

   public String e() {
      return this.l;
   }

   public boolean f() {
      return this.i == bsd.a.b;
   }

   @Override
   public String c() {
      return this.l;
   }

   public static bsd a(String $$0) {
      bsd $$1 = h.a($$0);
      if ($$1 != null) {
         return $$1;
      } else {
         throw new IllegalArgumentException("Invalid slot '" + $$0 + "'");
      }
   }

   public static bsd a(bsd.a $$0, int $$1) {
      for (bsd $$2 : values()) {
         if ($$2.a() == $$0 && $$2.b() == $$1) {
            return $$2;
         }
      }

      throw new IllegalArgumentException("Invalid slot '" + $$0 + "': " + $$1);
   }

   public static enum a {
      a,
      b,
      c;
   }
}
