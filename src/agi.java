public class agi implements zo<acd> {
   public static final zf<we, agi> a = zo.a(agi::a, agi::new);
   private final int b;
   private final double c;
   private final double d;
   private final double e;
   private final byte f;
   private final byte g;
   private final boolean h;

   public agi(btz $$0) {
      this.b = $$0.ar();
      ezh $$1 = $$0.dw();
      this.c = $$1.d;
      this.d = $$1.e;
      this.e = $$1.f;
      this.f = azj.g($$0.dN());
      this.g = azj.g($$0.dP());
      this.h = $$0.aJ();
   }

   private agi(we $$0) {
      this.b = $$0.l();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readDouble();
      this.f = $$0.readByte();
      this.g = $$0.readByte();
      this.h = $$0.readBoolean();
   }

   private void a(we $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.l(this.f);
      $$0.l(this.g);
      $$0.a(this.h);
   }

   @Override
   public zq<agi> a() {
      return ags.ba;
   }

   public void a(acd $$0) {
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
      return azj.a(this.f);
   }

   public float i() {
      return azj.a(this.g);
   }

   public boolean j() {
      return this.h;
   }
}
