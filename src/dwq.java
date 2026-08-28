public enum dwq implements bai {
   a(jm.a),
   b(jm.b);

   private final jm c;

   private dwq(final jm $$0) {
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

   public dwq b() {
      return this == a ? b : a;
   }
}
