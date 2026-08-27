public record adt(float a) implements xf<adj> {
   public adt(ui $$0) {
      this($$0.readFloat());
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.a);
   }

   public void a(adj $$0) {
      $$0.a(this);
   }
}
