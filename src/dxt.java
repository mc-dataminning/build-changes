public enum dxt implements azv {
   a(jn.a),
   b(jn.b);

   private final jn c;

   private dxt(final jn $$0) {
      this.c = $$0;
   }

   public jn a() {
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

   public dxt b() {
      return this == a ? b : a;
   }
}
