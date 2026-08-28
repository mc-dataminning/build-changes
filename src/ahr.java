public class ahr implements zl<agr> {
   public static final zc<wb, ahr> a = zl.a(ahr::a, ahr::new);
   private final double b;
   private final double c;
   private final double d;
   private final float e;
   private final float f;

   public ahr(btr $$0) {
      this.b = $$0.dx();
      this.c = $$0.dz();
      this.d = $$0.dD();
      this.e = $$0.dI();
      this.f = $$0.dK();
   }

   private ahr(wb $$0) {
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
   public zn<ahr> a() {
      return agp.bI;
   }

   public void a(agr $$0) {
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
