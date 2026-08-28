public class agj implements zp<ace> {
   public static final zg<wf, agj> a = zp.a(agj::a, agj::new);
   private final int b;
   private final double c;
   private final double d;
   private final double e;
   private final byte f;
   private final byte g;
   private final boolean h;

   public agj(bue $$0) {
      this.b = $$0.as();
      ezn $$1 = $$0.dw();
      this.c = $$1.d;
      this.d = $$1.e;
      this.e = $$1.f;
      this.f = azk.g($$0.dN());
      this.g = azk.g($$0.dP());
      this.h = $$0.aK();
   }

   private agj(wf $$0) {
      this.b = $$0.l();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readDouble();
      this.f = $$0.readByte();
      this.g = $$0.readByte();
      this.h = $$0.readBoolean();
   }

   private void a(wf $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.l(this.f);
      $$0.l(this.g);
      $$0.a(this.h);
   }

   @Override
   public zr<agj> a() {
      return agt.ba;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public double e() {
      return this.c;
   }

   public double f() {
      return this.d;
   }

   public double g() {
      return this.e;
   }

   public float h() {
      return azk.a(this.f);
   }

   public float i() {
      return azk.a(this.g);
   }

   public boolean j() {
      return this.h;
   }
}
