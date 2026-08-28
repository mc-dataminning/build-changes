public class adp implements zg<abu> {
   public static final yx<vw, adp> a = zg.a(adp::a, adp::new);
   private final double b;
   private final double c;
   private final double d;
   private final float e;
   private final float f;

   public adp(bsr $$0) {
      this.b = $$0.dt();
      this.c = $$0.dv();
      this.d = $$0.dz();
      this.e = $$0.dE();
      this.f = $$0.dG();
   }

   private adp(vw $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
   }

   private void a(vw $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
   }

   @Override
   public zi<adp> a() {
      return agg.U;
   }

   public void a(abu $$0) {
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
