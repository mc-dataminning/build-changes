public record fnj(all a, all b, all c, all d) {
   public fnj(all $$0, all $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public fnj(all $$0, all $$1, all $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public all a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
