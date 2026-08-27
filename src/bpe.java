public enum bpe implements axq {
   a(bpe.a.a, 0, 0, "mainhand"),
   b(bpe.a.a, 1, 5, "offhand"),
   c(bpe.a.b, 0, 1, "feet"),
   d(bpe.a.b, 1, 2, "legs"),
   e(bpe.a.b, 2, 3, "chest"),
   f(bpe.a.b, 3, 4, "head"),
   g(bpe.a.c, 0, 6, "body");

   public static final axq.a<bpe> h = axq.a(bpe::values);
   private final bpe.a i;
   private final int j;
   private final int k;
   private final String l;

   private bpe(bpe.a $$0, int $$1, int $$2, String $$3) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.l = $$3;
   }

   public bpe.a a() {
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
      return this.i == bpe.a.b;
   }

   @Override
   public String c() {
      return this.l;
   }

   public static bpe a(String $$0) {
      bpe $$1 = h.a($$0);
      if ($$1 != null) {
         return $$1;
      } else {
         throw new IllegalArgumentException("Invalid slot '" + $$0 + "'");
      }
   }

   public static bpe a(bpe.a $$0, int $$1) {
      for (bpe $$2 : values()) {
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
