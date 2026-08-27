public enum dkd implements avk {
   a(ic.a),
   b(ic.b);

   private final ic c;

   private dkd(ic $$0) {
      this.c = $$0;
   }

   public ic a() {
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

   public dkd b() {
      return this == a ? b : a;
   }
}
