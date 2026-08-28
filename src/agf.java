public class agf implements zb<agb> {
   public static final ys<vr, agf> a = zb.a(agf::a, agf::new);
   private final bqa b;

   public agf(bqa $$0) {
      this.b = $$0;
   }

   private agf(vr $$0) {
      this.b = bqa.a($$0.readUnsignedByte());
   }

   private void a(vr $$0) {
      $$0.k(this.b.a());
   }

   @Override
   public zd<agf> a() {
      return afz.bh;
   }

   public void a(agb $$0) {
      $$0.a(this);
   }

   public bqa b() {
      return this.b;
   }
}
