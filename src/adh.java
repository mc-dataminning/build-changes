public class adh implements zb<abm> {
   public static final ys<vu, adh> a = zb.a(adh::a, adh::new);
   private final double b;
   private final double c;
   private final double d;
   private final float e;
   private final float f;

   public adh(brh $$0) {
      this.b = $$0.ds();
      this.c = $$0.du();
      this.d = $$0.dy();
      this.e = $$0.dD();
      this.f = $$0.dF();
   }

   private adh(vu $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
   }

   private void a(vu $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
   }

   @Override
   public zd<adh> a() {
      return afx.U;
   }

   public void a(abm $$0) {
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
