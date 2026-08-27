public class aeg implements xx<aag> {
   public static final xo<uq, aeg> a = xx.a(aeg::a, aeg::new);
   private final int b;
   private final double c;
   private final double d;
   private final double e;
   private final byte f;
   private final byte g;
   private final boolean h;

   public aeg(bno $$0) {
      this.b = $$0.aj();
      ens $$1 = $$0.dl();
      this.c = $$1.c;
      this.d = $$1.d;
      this.e = $$1.e;
      this.f = (byte)((int)($$0.dC() * 256.0F / 360.0F));
      this.g = (byte)((int)($$0.dE() * 256.0F / 360.0F));
      this.h = $$0.aC();
   }

   private aeg(uq $$0) {
      this.b = $$0.n();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readDouble();
      this.f = $$0.readByte();
      this.g = $$0.readByte();
      this.h = $$0.readBoolean();
   }

   private void a(uq $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.k(this.f);
      $$0.k(this.g);
      $$0.a(this.h);
   }

   @Override
   public xz<aeg> a() {
      return aeq.aY;
   }

   public void a(aag $$0) {
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

   public byte h() {
      return this.f;
   }

   public byte i() {
      return this.g;
   }

   public boolean j() {
      return this.h;
   }
}
