public enum eca implements bam {
   a(jb.a),
   b(jb.b);

   private final jb c;

   private eca(final jb $$0) {
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

   public eca b() {
      return this == a ? b : a;
   }
}
