public record eyl(ahd a, ahd b, ahd c, ahd d) {
   public eyl(ahd $$0, ahd $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public eyl(ahd $$0, ahd $$1, ahd $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public ahd a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
