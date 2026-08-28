public class ahf implements aac<acr> {
   public static final zt<xg, ahf> a = aac.a(ahf::a, ahf::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private static final int e = 8;
   private final int f;
   private final jq<bun> g;
   private final int h;
   private final int i;
   private final byte j;

   public ahf(int $$0, bup $$1, boolean $$2) {
      this.f = $$0;
      this.g = $$1.c();
      this.h = $$1.e();
      this.i = $$1.d();
      byte $$3 = 0;
      if ($$1.f()) {
         $$3 = (byte)($$3 | 1);
      }

      if ($$1.g()) {
         $$3 = (byte)($$3 | 2);
      }

      if ($$1.h()) {
         $$3 = (byte)($$3 | 4);
      }

      if ($$2) {
         $$3 = (byte)($$3 | 8);
      }

      this.j = $$3;
   }

   private ahf(xg $$0) {
      this.f = $$0.l();
      this.g = bun.b.decode($$0);
      this.h = $$0.l();
      this.i = $$0.l();
      this.j = $$0.readByte();
   }

   private void a(xg $$0) {
      $$0.c(this.f);
      bun.b.encode($$0, this.g);
      $$0.c(this.h);
      $$0.c(this.i);
      $$0.l(this.j);
   }

   @Override
   public aae<ahf> a() {
      return ahk.bh;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.f;
   }

   public jq<bun> e() {
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
