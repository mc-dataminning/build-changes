public class ahv implements zg<agi> {
   public static final yx<vw, ahv> a = zg.a(ahv::a, ahv::new);
   private final int b;

   public ahv(int $$0) {
      this.b = $$0;
   }

   private ahv(vw $$0) {
      this.b = $$0.readShort();
   }

   private void a(vw $$0) {
      $$0.l(this.b);
   }

   @Override
   public zi<ahv> a() {
      return agg.bT;
   }

   public void a(agi $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }
}
