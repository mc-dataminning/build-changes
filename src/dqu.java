public enum dqu implements ayq {
   a(ir.a),
   b(ir.b);

   private final ir c;

   private dqu(ir $$0) {
      this.c = $$0;
   }

   public ir a() {
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

   public dqu b() {
      return this == a ? b : a;
   }
}
