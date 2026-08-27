public class acw implements yn<aay> {
   public static final ye<vg, acw> a = yn.a(acw::a, acw::new);
   private final ib b;
   private final boolean c;

   public acw(ib $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private acw(vg $$0) {
      this.b = $$0.e();
      this.c = $$0.readBoolean();
   }

   private void a(vg $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public yp<acw> a() {
      return afj.X;
   }

   public void a(aay $$0) {
      $$0.a(this);
   }

   public ib b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
