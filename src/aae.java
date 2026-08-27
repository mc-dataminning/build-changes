public record aae(int a, float b) implements xd<yx> {
   public aae(bmf $$0) {
      this($$0.aj(), $$0.eE());
   }

   public aae(ug $$0) {
      this($$0.n(), $$0.readFloat());
   }

   @Override
   public void a(ug $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
   }

   public void a(yx $$0) {
      $$0.a(this);
   }

   public float d() {
      return this.b;
   }
}
