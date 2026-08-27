public enum bpd implements axq {
   a(bpd.a.a, 0, 0, "mainhand"),
   b(bpd.a.a, 1, 5, "offhand"),
   c(bpd.a.b, 0, 1, "feet"),
   d(bpd.a.b, 1, 2, "legs"),
   e(bpd.a.b, 2, 3, "chest"),
   f(bpd.a.b, 3, 4, "head"),
   g(bpd.a.c, 0, 6, "body");

   public static final axq.a<bpd> h = axq.a(bpd::values);
   private final bpd.a i;
   private final int j;
   private final int k;
   private final String l;

   private bpd(bpd.a $$0, int $$1, int $$2, String $$3) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.l = $$3;
   }

   public bpd.a a() {
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
      return this.i == bpd.a.b;
   }

   @Override
   public String c() {
      return this.l;
   }

   public static bpd a(String $$0) {
      bpd $$1 = h.a($$0);
      if ($$1 != null) {
         return $$1;
      } else {
         throw new IllegalArgumentException("Invalid slot '" + $$0 + "'");
      }
   }

   public static bpd a(bpd.a $$0, int $$1) {
      for (bpd $$2 : values()) {
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
