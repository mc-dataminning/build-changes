public class acv implements zp<ace> {
   public static final zg<wf, acv> a = zp.a(acv::a, acv::new);
   private final boolean b;

   public acv(boolean $$0) {
      this.b = $$0;
   }

   private acv(wf $$0) {
      this.b = $$0.readBoolean();
   }

   private void a(wf $$0) {
      $$0.a(this.b);
   }

   @Override
   public zr<acv> a() {
      return agt.q;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.b;
   }
}
