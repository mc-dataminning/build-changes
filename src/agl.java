public record agl(float b) implements zb<agb> {
   public static final ys<vr, agl> a = zb.a(agl::a, agl::new);

   private agl(vr $$0) {
      this($$0.readFloat());
   }

   private void a(vr $$0) {
      $$0.a(this.b);
   }

   @Override
   public zd<agl> a() {
      return afz.bn;
   }

   public void a(agb $$0) {
      $$0.a(this);
   }
}
