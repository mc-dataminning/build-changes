public class agu implements zr<acg> {
   public static final zi<wv, agu> a = zr.a(agu::a, agu::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private static final int e = 8;
   private final int f;
   private final jq<bue> g;
   private final int h;
   private final int i;
   private final byte j;

   public agu(int $$0, bug $$1, boolean $$2) {
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

   private agu(wv $$0) {
      this.f = $$0.l();
      this.g = bue.b.decode($$0);
      this.h = $$0.l();
      this.i = $$0.l();
      this.j = $$0.readByte();
   }

   private void a(wv $$0) {
      $$0.c(this.f);
      bue.b.encode($$0, this.g);
      $$0.c(this.h);
      $$0.c(this.i);
      $$0.l(this.j);
   }

   @Override
   public zt<agu> a() {
      return agz.bh;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.f;
   }

   public jq<bue> e() {
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
