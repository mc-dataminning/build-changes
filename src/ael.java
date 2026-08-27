public class ael implements xx<aag> {
   public static final xo<vb, ael> a = xx.a(ael::a, ael::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private static final int e = 8;
   private final int f;
   private final ij<bnb> g;
   private final byte h;
   private final int i;
   private final byte j;

   public ael(int $$0, bnd $$1, boolean $$2) {
      this.f = $$0;
      this.g = $$1.b();
      this.h = (byte)($$1.d() & 0xFF);
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

   private ael(vb $$0) {
      this.f = $$0.n();
      this.g = xm.b(kg.Q).decode($$0);
      this.h = $$0.readByte();
      this.i = $$0.n();
      this.j = $$0.readByte();
   }

   private void a(vb $$0) {
      $$0.c(this.f);
      xm.b(kg.Q).encode($$0, this.g);
      $$0.k(this.h);
      $$0.c(this.i);
      $$0.k(this.j);
   }

   @Override
   public xz<ael> a() {
      return aeq.bb;
   }

   public void a(aag $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.f;
   }

   public ij<bnb> e() {
      return this.g;
   }

   public byte f() {
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
