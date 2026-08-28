public enum btw implements azz {
   a(btw.a.a, 0, 0, "mainhand"),
   b(btw.a.a, 1, 5, "offhand"),
   c(btw.a.b, 0, 1, 1, "feet"),
   d(btw.a.b, 1, 1, 2, "legs"),
   e(btw.a.b, 2, 1, 3, "chest"),
   f(btw.a.b, 3, 1, 4, "head"),
   g(btw.a.c, 0, 1, 6, "body");

   public static final int h = 0;
   public static final azz.a<btw> i = azz.a(btw::values);
   private final btw.a j;
   private final int k;
   private final int l;
   private final int m;
   private final String n;

   private btw(final btw.a $$0, final int $$1, final int $$2, final int $$3, final String $$4) {
      this.j = $$0;
      this.k = $$1;
      this.l = $$2;
      this.m = $$3;
      this.n = $$4;
   }

   private btw(final btw.a $$0, final int $$1, final int $$2, final String $$3) {
      this($$0, $$1, 0, $$2, $$3);
   }

   public btw.a a() {
      return this.j;
   }

   public int b() {
      return this.k;
   }

   public int a(int $$0) {
      return $$0 + this.k;
   }

   public cvp a(cvp $$0) {
      return this.l > 0 ? $$0.a(this.l) : $$0;
   }

   public int d() {
      return this.m;
   }

   public String e() {
      return this.n;
   }

   public boolean f() {
      return this.j == btw.a.b || this.j == btw.a.c;
   }

   @Override
   public String c() {
      return this.n;
   }

   public static btw a(String $$0) {
      btw $$1 = i.a($$0);
      if ($$1 != null) {
         return $$1;
      } else {
         throw new IllegalArgumentException("Invalid slot '" + $$0 + "'");
      }
   }

   public static enum a {
      a,
      b,
      c;
   }
}
