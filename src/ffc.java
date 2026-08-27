public record ffc(ajt a, ajt b, ajt c, ajt d) {
   public ffc(ajt $$0, ajt $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public ffc(ajt $$0, ajt $$1, ajt $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public ajt a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
