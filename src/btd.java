public enum btd implements azu {
   a(btd.a.a, 0, 0, "mainhand"),
   b(btd.a.a, 1, 5, "offhand"),
   c(btd.a.b, 0, 1, "feet"),
   d(btd.a.b, 1, 2, "legs"),
   e(btd.a.b, 2, 3, "chest"),
   f(btd.a.b, 3, 4, "head"),
   g(btd.a.c, 0, 6, "body");

   public static final azu.a<btd> h = azu.a(btd::values);
   private final btd.a i;
   private final int j;
   private final int k;
   private final String l;

   private btd(final btd.a $$0, final int $$1, final int $$2, final String $$3) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.l = $$3;
   }

   public btd.a a() {
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
      return this.i == btd.a.b;
   }

   @Override
   public String c() {
      return this.l;
   }

   public static btd a(String $$0) {
      btd $$1 = h.a($$0);
      if ($$1 != null) {
         return $$1;
      } else {
         throw new IllegalArgumentException("Invalid slot '" + $$0 + "'");
      }
   }

   public static btd a(btd.a $$0, int $$1) {
      for (btd $$2 : values()) {
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
