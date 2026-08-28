public class agz implements zp<agv> {
   public static final zg<wf, agz> a = zp.a(agz::a, agz::new);
   private final bsa b;

   public agz(bsa $$0) {
      this.b = $$0;
   }

   private agz(wf $$0) {
      this.b = bsa.a($$0.readUnsignedByte());
   }

   private void a(wf $$0) {
      $$0.l(this.b.a());
   }

   @Override
   public zr<agz> a() {
      return agt.bj;
   }

   public void a(agv $$0) {
      $$0.a(this);
   }

   public bsa b() {
      return this.b;
   }
}
