public class agm implements zs<ach> {
   public static final zj<wi, agm> a = zs.a(agm::a, agm::new);
   private final int b;
   private final double c;
   private final double d;
   private final double e;
   private final byte f;
   private final byte g;
   private final boolean h;

   public agm(bui $$0) {
      this.b = $$0.as();
      ezr $$1 = $$0.dx();
      this.c = $$1.d;
      this.d = $$1.e;
      this.e = $$1.f;
      this.f = azn.g($$0.dO());
      this.g = azn.g($$0.dQ());
      this.h = $$0.aL();
   }

   private agm(wi $$0) {
      this.b = $$0.l();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readDouble();
      this.f = $$0.readByte();
      this.g = $$0.readByte();
      this.h = $$0.readBoolean();
   }

   private void a(wi $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.l(this.f);
      $$0.l(this.g);
      $$0.a(this.h);
   }

   @Override
   public zu<agm> a() {
      return agw.ba;
   }

   public void a(ach $$0) {
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
      return azn.a(this.f);
   }

   public float i() {
      return azn.a(this.g);
   }

   public boolean j() {
      return this.h;
   }
}
