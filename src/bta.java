public enum bta implements azt {
   a(bta.a.a, 0, 0, "mainhand"),
   b(bta.a.a, 1, 5, "offhand"),
   c(bta.a.b, 0, 1, "feet"),
   d(bta.a.b, 1, 2, "legs"),
   e(bta.a.b, 2, 3, "chest"),
   f(bta.a.b, 3, 4, "head"),
   g(bta.a.c, 0, 6, "body");

   public static final azt.a<bta> h = azt.a(bta::values);
   private final bta.a i;
   private final int j;
   private final int k;
   private final String l;

   private bta(final bta.a $$0, final int $$1, final int $$2, final String $$3) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.l = $$3;
   }

   public bta.a a() {
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
      return this.i == bta.a.b;
   }

   @Override
   public String c() {
      return this.l;
   }

   public static bta a(String $$0) {
      bta $$1 = h.a($$0);
      if ($$1 != null) {
         return $$1;
      } else {
         throw new IllegalArgumentException("Invalid slot '" + $$0 + "'");
      }
   }

   public static bta a(bta.a $$0, int $$1) {
      for (bta $$2 : values()) {
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
