public class afc implements zw<aci> {
   public static final zn<wm, afc> a = zw.a(afc::a, afc::new);
   private final double b;
   private final double c;

   public afc(dtt $$0) {
      this.b = $$0.a();
      this.c = $$0.b();
   }

   private afc(wm $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
   }

   private void a(wm $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zy<afc> a() {
      return agu.ar;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public double b() {
      return this.c;
   }

   public double e() {
      return this.b;
   }
}
