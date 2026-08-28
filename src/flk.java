public enum flk {
   a(4),
   b(1),
   c(4);

   private final int d;

   private flk(final int $$0) {
      this.d = $$0;
   }

   public int a() {
      return this.d;
   }

   public boolean b() {
      return this == a || this == b;
   }

   public boolean c() {
      return this == c;
   }
}
