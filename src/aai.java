public record aai(int a, float b) implements xg<zb> {
   public aai(bmo $$0) {
      this($$0.aj(), $$0.eE());
   }

   public aai(uj $$0) {
      this($$0.n(), $$0.readFloat());
   }

   @Override
   public void a(uj $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public float d() {
      return this.b;
   }
}
