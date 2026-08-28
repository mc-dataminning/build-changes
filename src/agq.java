public record agq(float b, boolean c) implements zr<acg> {
   public static final zi<wh, agq> a = zr.a(agq::a, agq::new);

   private agq(wh $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static agq a(btj $$0) {
      return new agq($$0.f(), $$0.l());
   }

   private void a(wh $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zt<agq> a() {
      return agz.cn;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
