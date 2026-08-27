public class afp implements yn<afl> {
   public static final ye<vg, afp> a = yn.a(afp::a, afp::new);
   private final bnx b;

   public afp(bnx $$0) {
      this.b = $$0;
   }

   private afp(vg $$0) {
      this.b = bnx.a($$0.readUnsignedByte());
   }

   private void a(vg $$0) {
      $$0.k(this.b.a());
   }

   @Override
   public yp<afp> a() {
      return afj.bg;
   }

   public void a(afl $$0) {
      $$0.a(this);
   }

   public bnx b() {
      return this.b;
   }
}
