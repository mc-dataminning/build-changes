public class ahq implements aac<ahm> {
   public static final zt<ws, ahq> a = aac.a(ahq::a, ahq::new);
   private final btf b;

   public ahq(btf $$0) {
      this.b = $$0;
   }

   private ahq(ws $$0) {
      this.b = btf.a($$0.readUnsignedByte());
   }

   private void a(ws $$0) {
      $$0.l(this.b.a());
   }

   @Override
   public aae<ahq> a() {
      return ahk.bn;
   }

   public void a(ahm $$0) {
      $$0.a(this);
   }

   public btf b() {
      return this.b;
   }
}
