public enum duw implements azy {
   a(jj.a),
   b(jj.b);

   private final jj c;

   private duw(final jj $$0) {
      this.c = $$0;
   }

   public jj a() {
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

   public duw b() {
      return this == a ? b : a;
   }
}
