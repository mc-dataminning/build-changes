public record fhm(akm a, akm b, akm c, akm d) {
   public fhm(akm $$0, akm $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public fhm(akm $$0, akm $$1, akm $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public akm a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
