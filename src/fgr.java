public record fgr(akh a, akh b, akh c, akh d) {
   public fgr(akh $$0, akh $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public fgr(akh $$0, akh $$1, akh $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public akh a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
