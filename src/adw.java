public class adw implements zl<aca> {
   public static final zc<wb, adw> a = zl.a(adw::a, adw::new);
   private final double b;
   private final double c;
   private final double d;
   private final float e;
   private final float f;

   public adw(btr $$0) {
      this.b = $$0.dx();
      this.c = $$0.dz();
      this.d = $$0.dD();
      this.e = $$0.dI();
      this.f = $$0.dK();
   }

   private adw(wb $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
   }

   private void a(wb $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
   }

   @Override
   public zn<adw> a() {
      return agp.V;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public double b() {
      return this.b;
   }

   public double e() {
      return this.c;
   }

   public double f() {
      return this.d;
   }

   public float g() {
      return this.e;
   }

   public float h() {
      return this.f;
   }
}
