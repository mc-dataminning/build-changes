public record aas(tn a, boolean b) implements vf<wy> {
   public aas(sq $$0) {
      this($$0.l(), $$0.readBoolean());
   }

   @Override
   public void a(sq $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(wy $$0) {
      $$0.a(this);
   }

   @Override
   public boolean b() {
      return true;
   }

   public boolean d() {
      return this.b;
   }
}
