public enum ebk implements bak {
   a(jb.a),
   b(jb.b);

   private final jb c;

   private ebk(final jb $$0) {
      this.c = $$0;
   }

   public jb a() {
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

   public ebk b() {
      return this == a ? b : a;
   }
}
