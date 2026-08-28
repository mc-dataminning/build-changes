public enum bsy implements azk {
   a(bsy.a.a, 0, 0, "mainhand"),
   b(bsy.a.a, 1, 5, "offhand"),
   c(bsy.a.b, 0, 1, 1, "feet"),
   d(bsy.a.b, 1, 1, 2, "legs"),
   e(bsy.a.b, 2, 1, 3, "chest"),
   f(bsy.a.b, 3, 1, 4, "head"),
   g(bsy.a.c, 0, 1, 6, "body");

   public static final int h = 0;
   public static final azk.a<bsy> i = azk.a(bsy::values);
   private final bsy.a j;
   private final int k;
   private final int l;
   private final int m;
   private final String n;

   private bsy(final bsy.a $$0, final int $$1, final int $$2, final int $$3, final String $$4) {
      this.j = $$0;
      this.k = $$1;
      this.l = $$2;
      this.m = $$3;
      this.n = $$4;
   }

   private bsy(final bsy.a $$0, final int $$1, final int $$2, final String $$3) {
      this($$0, $$1, 0, $$2, $$3);
   }

   public bsy.a a() {
      return this.j;
   }

   public int b() {
      return this.k;
   }

   public int a(int $$0) {
      return $$0 + this.k;
   }

   public cuq a(cuq $$0) {
      return this.l > 0 ? $$0.a(this.l) : $$0;
   }

   public int d() {
      return this.m;
   }

   public String e() {
      return this.n;
   }

   public boolean f() {
      return this.j == bsy.a.b || this.j == bsy.a.c;
   }

   @Override
   public String c() {
      return this.n;
   }

   public static bsy a(String $$0) {
      bsy $$1 = i.a($$0);
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
