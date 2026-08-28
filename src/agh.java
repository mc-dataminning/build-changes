public record agh(float b, boolean c) implements zs<ace> {
   public static final zj<wl, agh> a = zs.a(agh::a, agh::new);

   private agh(wl $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static agh a(bra $$0) {
      return new agh($$0.f(), $$0.l());
   }

   private void a(wl $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zu<agh> a() {
      return agq.cf;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
