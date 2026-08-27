public enum dqe implements ayg {
   a(ij.a),
   b(ij.b);

   private final ij c;

   private dqe(ij $$0) {
      this.c = $$0;
   }

   public ij a() {
      return this.c;
   }

   @Override
   public String toString() {
      return this.c();
   }

   @Override
   public String c() {
      return this == a ? "upper" : "lower";
   }

   public dqe b() {
      return this == a ? b : a;
   }
}
