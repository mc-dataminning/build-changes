public record afq(float b, boolean c) implements zb<abn> {
   public static final ys<vr, afq> a = zb.a(afq::a, afq::new);

   private afq(vr $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static afq a(bqs $$0) {
      return new afq($$0.f(), $$0.l());
   }

   private void a(vr $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zd<afq> a() {
      return afz.cf;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
