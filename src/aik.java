public class aik implements zp<agv> {
   public static final zg<wf, aik> a = zp.a(aik::a, aik::new);
   private final int b;

   public aik(int $$0) {
      this.b = $$0;
   }

   private aik(wf $$0) {
      this.b = $$0.readShort();
   }

   private void a(wf $$0) {
      $$0.m(this.b);
   }

   @Override
   public zr<aik> a() {
      return agt.bW;
   }

   public void a(agv $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }
}
