public record frd(aku a, aku b, aku c, aku d) {
   public frd(aku $$0, aku $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public frd(aku $$0, aku $$1, aku $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public aku a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
