public enum bsb implements ayx {
   a(bsb.a.a, 0, 0, "mainhand"),
   b(bsb.a.a, 1, 5, "offhand"),
   c(bsb.a.b, 0, 1, "feet"),
   d(bsb.a.b, 1, 2, "legs"),
   e(bsb.a.b, 2, 3, "chest"),
   f(bsb.a.b, 3, 4, "head"),
   g(bsb.a.c, 0, 6, "body");

   public static final ayx.a<bsb> h = ayx.a(bsb::values);
   private final bsb.a i;
   private final int j;
   private final int k;
   private final String l;

   private bsb(bsb.a $$0, int $$1, int $$2, String $$3) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.l = $$3;
   }

   public bsb.a a() {
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
      return this.i == bsb.a.b;
   }

   @Override
   public String c() {
      return this.l;
   }

   public static bsb a(String $$0) {
      bsb $$1 = h.a($$0);
      if ($$1 != null) {
         return $$1;
      } else {
         throw new IllegalArgumentException("Invalid slot '" + $$0 + "'");
      }
   }

   public static bsb a(bsb.a $$0, int $$1) {
      for (bsb $$2 : values()) {
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
