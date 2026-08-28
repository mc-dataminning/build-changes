public record agi(float b, boolean c) implements zj<aby> {
   public static final za<vy, agi> a = zj.a(agi::a, agi::new);

   private agi(vy $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static agi a(bvc $$0) {
      return new agi($$0.f(), $$0.l());
   }

   private void a(vy $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zl<agi> a() {
      return agr.cq;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
