public record eue(aey a, aey b, aey c, aey d) {
   public eue(aey $$0, aey $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public eue(aey $$0, aey $$1, aey $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public aey a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
