public class agf implements zl<aca> {
   public static final zc<wb, agf> a = zl.a(agf::a, agf::new);
   private final int b;
   private final double c;
   private final double d;
   private final double e;
   private final byte f;
   private final byte g;
   private final boolean h;

   public agf(btr $$0) {
      this.b = $$0.ap();
      eyw $$1 = $$0.dr();
      this.c = $$1.d;
      this.d = $$1.e;
      this.e = $$1.f;
      this.f = azf.g($$0.dI());
      this.g = azf.g($$0.dK());
      this.h = $$0.aH();
   }

   private agf(wb $$0) {
      this.b = $$0.l();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readDouble();
      this.f = $$0.readByte();
      this.g = $$0.readByte();
      this.h = $$0.readBoolean();
   }

   private void a(wb $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.l(this.f);
      $$0.l(this.g);
      $$0.a(this.h);
   }

   @Override
   public zn<agf> a() {
      return agp.ba;
   }

   public void a(aca $$0) {
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
      return azf.a(this.f);
   }

   public float i() {
      return azf.a(this.g);
   }

   public boolean j() {
      return this.h;
   }
}
