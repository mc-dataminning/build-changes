public record acw(int b, float c) implements zb<abn> {
   public static final ys<vr, acw> a = zb.a(acw::a, acw::new);

   public acw(bsy $$0) {
      this($$0.al(), $$0.eE());
   }

   private acw(vr $$0) {
      this($$0.l(), $$0.readFloat());
   }

   private void a(vr $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zd<acw> a() {
      return afz.I;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public float e() {
      return this.c;
   }
}
