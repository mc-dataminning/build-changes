public record aft(float b, boolean c) implements ze<abq> {
   public static final yv<vx, aft> a = ze.a(aft::a, aft::new);

   private aft(vx $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static aft a(bqh $$0) {
      return new aft($$0.f(), $$0.l());
   }

   private void a(vx $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zg<aft> a() {
      return agc.cf;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
