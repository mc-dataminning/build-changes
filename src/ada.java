public record ada(float a, boolean b) implements xf<za> {
   public ada(ui $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static ada a(bkl $$0) {
      return new ada($$0.f(), $$0.l());
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   public boolean d() {
      return this.b;
   }
}
