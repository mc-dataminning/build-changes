public enum btb implements azu {
   a(btb.a.a, 0, 0, "mainhand"),
   b(btb.a.a, 1, 5, "offhand"),
   c(btb.a.b, 0, 1, "feet"),
   d(btb.a.b, 1, 2, "legs"),
   e(btb.a.b, 2, 3, "chest"),
   f(btb.a.b, 3, 4, "head"),
   g(btb.a.c, 0, 6, "body");

   public static final azu.a<btb> h = azu.a(btb::values);
   private final btb.a i;
   private final int j;
   private final int k;
   private final String l;

   private btb(final btb.a $$0, final int $$1, final int $$2, final String $$3) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.l = $$3;
   }

   public btb.a a() {
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
      return this.i == btb.a.b;
   }

   @Override
   public String c() {
      return this.l;
   }

   public static btb a(String $$0) {
      btb $$1 = h.a($$0);
      if ($$1 != null) {
         return $$1;
      } else {
         throw new IllegalArgumentException("Invalid slot '" + $$0 + "'");
      }
   }

   public static btb a(btb.a $$0, int $$1) {
      for (btb $$2 : values()) {
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
