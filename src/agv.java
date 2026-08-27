public class agv implements zb<afz> {
   public static final ys<vu, agv> a = zb.a(agv::a, agv::new);
   private final boolean b;

   public agv(boolean $$0) {
      this.b = $$0;
   }

   private agv(vu $$0) {
      this.b = $$0.readBoolean();
   }

   private void a(vu $$0) {
      $$0.a(this.b);
   }

   @Override
   public zd<agv> a() {
      return afx.by;
   }

   public void a(afz $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.b;
   }
}
