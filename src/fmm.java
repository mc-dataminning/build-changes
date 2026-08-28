public record fmm(alh a, alh b, alh c, alh d) {
   public fmm(alh $$0, alh $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public fmm(alh $$0, alh $$1, alh $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public alh a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
