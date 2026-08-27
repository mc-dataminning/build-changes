public class afg implements yp<aba> {
   public static final yg<vt, afg> a = yp.a(afg::a, afg::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private static final int e = 8;
   private final int f;
   private final in<bpk> g;
   private final int h;
   private final int i;
   private final byte j;

   public afg(int $$0, bpm $$1, boolean $$2) {
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

   private afg(vt $$0) {
      this.f = $$0.l();
      this.g = ye.b(ku.R).decode($$0);
      this.h = $$0.l();
      this.i = $$0.l();
      this.j = $$0.readByte();
   }

   private void a(vt $$0) {
      $$0.c(this.f);
      ye.b(ku.R).encode($$0, this.g);
      $$0.c(this.h);
      $$0.c(this.i);
      $$0.k(this.j);
   }

   @Override
   public yr<afg> a() {
      return afl.bc;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.f;
   }

   public in<bpk> e() {
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
