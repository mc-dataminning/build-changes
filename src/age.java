public class age implements zk<abz> {
   public static final zb<wa, age> a = zk.a(age::a, age::new);
   private final int b;
   private final double c;
   private final double d;
   private final double e;
   private final byte f;
   private final byte g;
   private final boolean h;

   public age(bto $$0) {
      this.b = $$0.ap();
      eys $$1 = $$0.dr();
      this.c = $$1.d;
      this.d = $$1.e;
      this.e = $$1.f;
      this.f = (byte)((int)($$0.dI() * 256.0F / 360.0F));
      this.g = (byte)((int)($$0.dK() * 256.0F / 360.0F));
      this.h = $$0.aH();
   }

   private age(wa $$0) {
      this.b = $$0.l();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readDouble();
      this.f = $$0.readByte();
      this.g = $$0.readByte();
      this.h = $$0.readBoolean();
   }

   private void a(wa $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.l(this.f);
      $$0.l(this.g);
      $$0.a(this.h);
   }

   @Override
   public zm<age> a() {
      return ago.ba;
   }

   public void a(abz $$0) {
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
