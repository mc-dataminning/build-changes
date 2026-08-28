public record fir(alf a, alf b, alf c, alf d) {
   public fir(alf $$0, alf $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public fir(alf $$0, alf $$1, alf $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public alf a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
