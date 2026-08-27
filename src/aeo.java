public class aeo implements xz<aai> {
   public static final xq<vd, aeo> a = xz.a(aeo::a, aeo::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private static final int e = 8;
   private final int f;
   private final il<bnq> g;
   private final int h;
   private final int i;
   private final byte j;

   public aeo(int $$0, bns $$1, boolean $$2) {
      this.f = $$0;
      this.g = $$1.b();
      this.h = $$1.d();
      this.i = $$1.c();
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

      this.j = $$3;
   }

   private aeo(vd $$0) {
      this.f = $$0.l();
      this.g = xo.b(ki.Q).decode($$0);
      this.h = $$0.l();
      this.i = $$0.l();
      this.j = $$0.readByte();
   }

   private void a(vd $$0) {
      $$0.c(this.f);
      xo.b(ki.Q).encode($$0, this.g);
      $$0.c(this.h);
      $$0.c(this.i);
      $$0.k(this.j);
   }

   @Override
   public yb<aeo> a() {
      return aet.bc;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.f;
   }

   public il<bnq> e() {
      return this.g;
   }

   public int f() {
      return this.h;
   }

   public int g() {
      return this.i;
   }

   public boolean h() {
      return (this.j & 2) != 0;
   }

   public boolean i() {
      return (this.j & 1) != 0;
   }

   public boolean j() {
      return (this.j & 4) != 0;
   }

   public boolean k() {
      return (this.j & 8) != 0;
   }
}
