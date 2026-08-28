public class agk implements zq<acf> {
   public static final zh<wg, agk> a = zq.a(agk::a, agk::new);
   private final int b;
   private final double c;
   private final double d;
   private final double e;
   private final byte f;
   private final byte g;
   private final boolean h;

   public agk(bul $$0) {
      this.b = $$0.ar();
      ezy $$1 = $$0.du();
      this.c = $$1.d;
      this.d = $$1.e;
      this.e = $$1.f;
      this.f = azm.g($$0.dL());
      this.g = azm.g($$0.dN());
      this.h = $$0.aJ();
   }

   private agk(wg $$0) {
      this.b = $$0.l();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readDouble();
      this.f = $$0.readByte();
      this.g = $$0.readByte();
      this.h = $$0.readBoolean();
   }

   private void a(wg $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.l(this.f);
      $$0.l(this.g);
      $$0.a(this.h);
   }

   @Override
   public zs<agk> a() {
      return agu.ba;
   }

   public void a(acf $$0) {
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
      return azm.a(this.f);
   }

   public float i() {
      return azm.a(this.g);
   }

   public boolean j() {
      return this.h;
   }
}
