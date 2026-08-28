public class aht implements zp<agv> {
   public static final zg<wf, aht> a = zp.a(aht::a, aht::new);
   private final boolean b;

   public aht(boolean $$0) {
      this.b = $$0;
   }

   private aht(wf $$0) {
      this.b = $$0.readBoolean();
   }

   private void a(wf $$0) {
      $$0.a(this.b);
   }

   @Override
   public zr<aht> a() {
      return agt.bD;
   }

   public void a(agv $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.b;
   }
}
