public enum dtw implements azj {
   a(ji.a),
   b(ji.b);

   private final ji c;

   private dtw(final ji $$0) {
      this.c = $$0;
   }

   public ji a() {
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

   public dtw b() {
      return this == a ? b : a;
   }
}
