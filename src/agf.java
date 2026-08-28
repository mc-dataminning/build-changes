public class agf implements zb<agb> {
   public static final ys<vr, agf> a = zb.a(agf::a, agf::new);
   private final bqe b;

   public agf(bqe $$0) {
      this.b = $$0;
   }

   private agf(vr $$0) {
      this.b = bqe.a($$0.readUnsignedByte());
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

   public bqe b() {
      return this.b;
   }
}
