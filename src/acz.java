public class acz implements xf<za> {
   private final int a;
   private final double b;
   private final double c;
   private final double d;
   private final byte e;
   private final byte f;
   private final boolean g;

   public acz(blv $$0) {
      this.a = $$0.aj();
      elt $$1 = $$0.dl();
      this.b = $$1.c;
      this.c = $$1.d;
      this.d = $$1.e;
      this.e = (byte)((int)($$0.dC() * 256.0F / 360.0F));
      this.f = (byte)((int)($$0.dE() * 256.0F / 360.0F));
      this.g = $$0.aC();
   }

   public acz(ui $$0) {
      this.a = $$0.n();
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readByte();
      this.f = $$0.readByte();
      this.g = $$0.readBoolean();
   }

   @Override
   public void a(ui $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.k(this.e);
      $$0.k(this.f);
      $$0.a(this.g);
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public double d() {
      return this.b;
   }

   public double e() {
      return this.c;
   }

   public double f() {
      return this.d;
   }

   public byte g() {
      return this.e;
   }

   public byte h() {
      return this.f;
   }

   public boolean i() {
      return this.g;
   }
}
