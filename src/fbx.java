public record fbx(ajc a, ajc b, ajc c, ajc d) {
   public fbx(ajc $$0, ajc $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public fbx(ajc $$0, ajc $$1, ajc $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public ajc a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
