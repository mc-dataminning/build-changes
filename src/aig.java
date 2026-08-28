public class aig implements zl<agr> {
   public static final zc<wb, aig> a = zl.a(aig::a, aig::new);
   private final int b;

   public aig(int $$0) {
      this.b = $$0;
   }

   private aig(wb $$0) {
      this.b = $$0.readShort();
   }

   private void a(wb $$0) {
      $$0.m(this.b);
   }

   @Override
   public zn<aig> a() {
      return agp.bW;
   }

   public void a(agr $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }
}
