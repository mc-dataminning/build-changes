public enum bin implements ash {
   a(bin.a.a, 0, 0, "mainhand"),
   b(bin.a.a, 1, 5, "offhand"),
   c(bin.a.b, 0, 1, "feet"),
   d(bin.a.b, 1, 2, "legs"),
   e(bin.a.b, 2, 3, "chest"),
   f(bin.a.b, 3, 4, "head");

   public static final ash.a<bin> g = ash.a(bin::values);
   private final bin.a h;
   private final int i;
   private final int j;
   private final String k;

   private bin(bin.a $$0, int $$1, int $$2, String $$3) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
      this.k = $$3;
   }

   public bin.a a() {
      return this.h;
   }

   public int b() {
      return this.i;
   }

   public int a(int $$0) {
      return $$0 + this.i;
   }

   public int d() {
      return this.j;
   }

   public String e() {
      return this.k;
   }

   public boolean f() {
      return this.h == bin.a.b;
   }

   @Override
   public String c() {
      return this.k;
   }

   public static bin a(String $$0) {
      bin $$1 = g.a($$0);
      if ($$1 != null) {
         return $$1;
      } else {
         throw new IllegalArgumentException("Invalid slot '" + $$0 + "'");
      }
   }

   public static bin a(bin.a $$0, int $$1) {
      for (bin $$2 : values()) {
         if ($$2.a() == $$0 && $$2.b() == $$1) {
            return $$2;
         }
      }

      throw new IllegalArgumentException("Invalid slot '" + $$0 + "': " + $$1);
   }

   public static enum a {
      a,
      b;
   }
}
