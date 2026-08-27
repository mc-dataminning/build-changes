public record fau(aiy a, aiy b, aiy c, aiy d) {
   public fau(aiy $$0, aiy $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public fau(aiy $$0, aiy $$1, aiy $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public aiy a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
