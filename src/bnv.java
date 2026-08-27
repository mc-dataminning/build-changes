public enum bnv implements axc {
   a(bnv.a.a, 0, 0, "mainhand"),
   b(bnv.a.a, 1, 5, "offhand"),
   c(bnv.a.b, 0, 1, "feet"),
   d(bnv.a.b, 1, 2, "legs"),
   e(bnv.a.b, 2, 3, "chest"),
   f(bnv.a.b, 3, 4, "head");

   public static final axc.a<bnv> g = axc.a(bnv::values);
   private final bnv.a h;
   private final int i;
   private final int j;
   private final String k;

   private bnv(bnv.a $$0, int $$1, int $$2, String $$3) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
      this.k = $$3;
   }

   public bnv.a a() {
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
      return this.h == bnv.a.b;
   }

   @Override
   public String c() {
      return this.k;
   }

   public static bnv a(String $$0) {
      bnv $$1 = g.a($$0);
      if ($$1 != null) {
         return $$1;
      } else {
         throw new IllegalArgumentException("Invalid slot '" + $$0 + "'");
      }
   }

   public static bnv a(bnv.a $$0, int $$1) {
      for (bnv $$2 : values()) {
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
