public class acg implements zb<abm> {
   public static final ys<vu, acg> a = zb.a(acg::a, acg::new);
   private final int b;

   public acg(int $$0) {
      this.b = $$0;
   }

   private acg(vu $$0) {
      this.b = $$0.readUnsignedByte();
   }

   private void a(vu $$0) {
      $$0.k(this.b);
   }

   @Override
   public zd<acg> a() {
      return afx.t;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }
}
