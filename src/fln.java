public record fln(alb a, alb b, alb c, alb d) {
   public fln(alb $$0, alb $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public fln(alb $$0, alb $$1, alb $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public alb a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
