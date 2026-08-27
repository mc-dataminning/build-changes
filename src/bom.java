public enum bom implements axg {
   a(bom.a.a, 0, 0, "mainhand"),
   b(bom.a.a, 1, 5, "offhand"),
   c(bom.a.b, 0, 1, "feet"),
   d(bom.a.b, 1, 2, "legs"),
   e(bom.a.b, 2, 3, "chest"),
   f(bom.a.b, 3, 4, "head"),
   g(bom.a.c, 0, 6, "body");

   public static final axg.a<bom> h = axg.a(bom::values);
   private final bom.a i;
   private final int j;
   private final int k;
   private final String l;

   private bom(bom.a $$0, int $$1, int $$2, String $$3) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.l = $$3;
   }

   public bom.a a() {
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
      return this.i == bom.a.b;
   }

   @Override
   public String c() {
      return this.l;
   }

   public static bom a(String $$0) {
      bom $$1 = h.a($$0);
      if ($$1 != null) {
         return $$1;
      } else {
         throw new IllegalArgumentException("Invalid slot '" + $$0 + "'");
      }
   }

   public static bom a(bom.a $$0, int $$1) {
      for (bom $$2 : values()) {
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
