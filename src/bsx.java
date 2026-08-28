public enum bsx implements azj {
   a(bsx.a.a, 0, 0, "mainhand"),
   b(bsx.a.a, 1, 5, "offhand"),
   c(bsx.a.b, 0, 1, 1, "feet"),
   d(bsx.a.b, 1, 1, 2, "legs"),
   e(bsx.a.b, 2, 1, 3, "chest"),
   f(bsx.a.b, 3, 1, 4, "head"),
   g(bsx.a.c, 0, 1, 6, "body");

   public static final int h = 0;
   public static final azj.a<bsx> i = azj.a(bsx::values);
   private final bsx.a j;
   private final int k;
   private final int l;
   private final int m;
   private final String n;

   private bsx(final bsx.a $$0, final int $$1, final int $$2, final int $$3, final String $$4) {
      this.j = $$0;
      this.k = $$1;
      this.l = $$2;
      this.m = $$3;
      this.n = $$4;
   }

   private bsx(final bsx.a $$0, final int $$1, final int $$2, final String $$3) {
      this($$0, $$1, 0, $$2, $$3);
   }

   public bsx.a a() {
      return this.j;
   }

   public int b() {
      return this.k;
   }

   public int a(int $$0) {
      return $$0 + this.k;
   }

   public cuo a(cuo $$0) {
      return this.l > 0 ? $$0.a(this.l) : $$0;
   }

   public int d() {
      return this.m;
   }

   public String e() {
      return this.n;
   }

   public boolean f() {
      return this.j == bsx.a.b || this.j == bsx.a.c;
   }

   @Override
   public String c() {
      return this.n;
   }

   public static bsx a(String $$0) {
      bsx $$1 = i.a($$0);
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
