public record agl(float b, boolean c) implements zw<aci> {
   public static final zn<wm, agl> a = zw.a(agl::a, agl::new);

   private agl(wm $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static agl a(brf $$0) {
      return new agl($$0.f(), $$0.l());
   }

   private void a(wm $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zy<agl> a() {
      return agu.cf;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
