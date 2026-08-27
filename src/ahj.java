public class ahj implements zl<agl> {
   public static final zc<we, ahj> a = zl.a(ahj::a, ahj::new);
   private final double b;
   private final double c;
   private final double d;
   private final float e;
   private final float f;

   public ahj(brv $$0) {
      this.b = $$0.dz();
      this.c = $$0.dB();
      this.d = $$0.dF();
      this.e = $$0.dK();
      this.f = $$0.dM();
   }

   private ahj(we $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
   }

   private void a(we $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
   }

   @Override
   public zn<ahj> a() {
      return agj.bF;
   }

   public void a(agl $$0) {
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
