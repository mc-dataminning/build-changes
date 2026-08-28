public class adw implements zb<abn> {
   public static final ys<vr, adw> a = zb.a(adw::a, adw::new);
   private final int b;
   private final double c;

   public adw(int $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private adw(vr $$0) {
      this.b = $$0.l();
      this.c = $$0.readDouble();
   }

   private void a(vr $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zd<adw> a() {
      return afz.be;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public double e() {
      return this.c;
   }
}
