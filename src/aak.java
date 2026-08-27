public record aak(tf a, boolean b) implements ux<wp> {
   public aak(si $$0) {
      this($$0.l(), $$0.readBoolean());
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(wp $$0) {
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
