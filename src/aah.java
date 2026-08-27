public record aah(int a, float b) implements xf<za> {
   public aah(bmk $$0) {
      this($$0.aj(), $$0.eE());
   }

   public aah(ui $$0) {
      this($$0.n(), $$0.readFloat());
   }

   @Override
   public void a(ui $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   public float d() {
      return this.b;
   }
}
