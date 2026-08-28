public enum dwf implements bag {
   a(jm.a),
   b(jm.b);

   private final jm c;

   private dwf(final jm $$0) {
      this.c = $$0;
   }

   public jm a() {
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

   public dwf b() {
      return this == a ? b : a;
   }
}
