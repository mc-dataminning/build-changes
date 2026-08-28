public class aig implements zf<agp> {
   public static final yw<vu, aig> a = zf.a(aig::a, aig::new);
   private final int b;

   public aig(int $$0) {
      this.b = $$0;
   }

   private aig(vu $$0) {
      this.b = $$0.readShort();
   }

   private void a(vu $$0) {
      $$0.m(this.b);
   }

   @Override
   public zh<aig> a() {
      return agn.cc;
   }

   public void a(agp $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }
}
