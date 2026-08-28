public enum dvz implements baf {
   a(jl.a),
   b(jl.b);

   private final jl c;

   private dvz(final jl $$0) {
      this.c = $$0;
   }

   public jl a() {
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

   public dvz b() {
      return this == a ? b : a;
   }
}
