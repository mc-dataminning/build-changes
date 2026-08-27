public enum bqs implements ayq {
   a(bqs.a.a, 0, 0, "mainhand"),
   b(bqs.a.a, 1, 5, "offhand"),
   c(bqs.a.b, 0, 1, "feet"),
   d(bqs.a.b, 1, 2, "legs"),
   e(bqs.a.b, 2, 3, "chest"),
   f(bqs.a.b, 3, 4, "head"),
   g(bqs.a.c, 0, 6, "body");

   public static final ayq.a<bqs> h = ayq.a(bqs::values);
   private final bqs.a i;
   private final int j;
   private final int k;
   private final String l;

   private bqs(bqs.a $$0, int $$1, int $$2, String $$3) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.l = $$3;
   }

   public bqs.a a() {
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
      return this.i == bqs.a.b;
   }

   @Override
   public String c() {
      return this.l;
   }

   public static bqs a(String $$0) {
      bqs $$1 = h.a($$0);
      if ($$1 != null) {
         return $$1;
      } else {
         throw new IllegalArgumentException("Invalid slot '" + $$0 + "'");
      }
   }

   public static bqs a(bqs.a $$0, int $$1) {
      for (bqs $$2 : values()) {
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
