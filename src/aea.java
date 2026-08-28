public class aea implements zp<ace> {
   public static final zg<wf, aea> a = zp.a(aea::a, aea::new);
   private final double b;
   private final double c;
   private final double d;
   private final float e;
   private final float f;

   public aea(bue $$0) {
      this.b = $$0.dC();
      this.c = $$0.dE();
      this.d = $$0.dI();
      this.e = $$0.dN();
      this.f = $$0.dP();
   }

   private aea(wf $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
   }

   private void a(wf $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
   }

   @Override
   public zr<aea> a() {
      return agt.V;
   }

   public void a(ace $$0) {
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
