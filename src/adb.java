public record adb(float a, boolean b) implements xg<zb> {
   public adb(uj $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static adb a(bkn $$0) {
      return new adb($$0.f(), $$0.l());
   }

   @Override
   public void a(uj $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public boolean d() {
      return this.b;
   }
}
