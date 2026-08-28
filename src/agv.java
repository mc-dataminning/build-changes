public class agv implements zl<agr> {
   public static final zc<wb, agv> a = zl.a(agv::a, agv::new);
   private final brp b;

   public agv(brp $$0) {
      this.b = $$0;
   }

   private agv(wb $$0) {
      this.b = brp.a($$0.readUnsignedByte());
   }

   private void a(wb $$0) {
      $$0.l(this.b.a());
   }

   @Override
   public zn<agv> a() {
      return agp.bj;
   }

   public void a(agr $$0) {
      $$0.a(this);
   }

   public brp b() {
      return this.b;
   }
}
