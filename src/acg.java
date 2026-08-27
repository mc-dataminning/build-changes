public record acg(float a, boolean b) implements wo<yh> {
   public acg(ty $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static acg a(bjl $$0) {
      return new acg($$0.f(), $$0.l());
   }

   @Override
   public void a(ty $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(yh $$0) {
      $$0.a(this);
   }

   public boolean d() {
      return this.b;
   }
}
