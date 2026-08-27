public class adf implements xg<zb> {
   private static final int a = 1;
   private static final int b = 2;
   private static final int c = 4;
   private static final int d = 8;
   private final int e;
   private final ih<blh> f;
   private final byte g;
   private final int h;
   private final byte i;

   public adf(int $$0, blj $$1, boolean $$2) {
      this.e = $$0;
      this.f = $$1.b();
      this.g = (byte)($$1.d() & 0xFF);
      this.h = $$1.c();
      byte $$3 = 0;
      if ($$1.e()) {
         $$3 = (byte)($$3 | 1);
      }

      if ($$1.f()) {
         $$3 = (byte)($$3 | 2);
      }

      if ($$1.g()) {
         $$3 = (byte)($$3 | 4);
      }

      if ($$2) {
         $$3 = (byte)($$3 | 8);
      }

      this.i = $$3;
   }

   public adf(uj $$0) {
      this.e = $$0.n();
      this.f = $$0.a(kd.d.t());
      this.g = $$0.readByte();
      this.h = $$0.n();
      this.i = $$0.readByte();
   }

   @Override
   public void a(uj $$0) {
      $$0.c(this.e);
      $$0.a(kd.d.t(), this.f);
      $$0.k(this.g);
      $$0.c(this.h);
      $$0.k(this.i);
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.e;
   }

   public ih<blh> d() {
      return this.f;
   }

   public byte e() {
      return this.g;
   }

   public int f() {
      return this.h;
   }

   public boolean g() {
      return (this.i & 2) != 0;
   }

   public boolean h() {
      return (this.i & 1) != 0;
   }

   public boolean i() {
      return (this.i & 4) != 0;
   }

   public boolean j() {
      return (this.i & 8) != 0;
   }
}
