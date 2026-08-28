public class aiw implements zr<ahb> {
   public static final zi<wh, aiw> a = zr.a(aiw::a, aiw::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final jh e;
   private final dwi.a f;
   private final dyx g;
   private final String h;
   private final jh i;
   private final kl j;
   private final dpc k;
   private final dqv l;
   private final String m;
   private final boolean n;
   private final boolean o;
   private final boolean p;
   private final float q;
   private final long r;

   public aiw(
      jh $$0, dwi.a $$1, dyx $$2, String $$3, jh $$4, kl $$5, dpc $$6, dqv $$7, String $$8, boolean $$9, boolean $$10, boolean $$11, float $$12, long $$13
   ) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.i = $$4;
      this.j = $$5;
      this.k = $$6;
      this.l = $$7;
      this.m = $$8;
      this.n = $$9;
      this.o = $$10;
      this.p = $$11;
      this.q = $$12;
      this.r = $$13;
   }

   private aiw(wh $$0) {
      this.e = $$0.e();
      this.f = $$0.b(dwi.a.class);
      this.g = $$0.b(dyx.class);
      this.h = $$0.p();
      int $$1 = 48;
      this.i = new jh(azu.a($$0.readByte(), -48, 48), azu.a($$0.readByte(), -48, 48), azu.a($$0.readByte(), -48, 48));
      int $$2 = 48;
      this.j = new kl(azu.a($$0.readByte(), 0, 48), azu.a($$0.readByte(), 0, 48), azu.a($$0.readByte(), 0, 48));
      this.k = $$0.b(dpc.class);
      this.l = $$0.b(dqv.class);
      this.m = $$0.d(128);
      this.q = azu.a($$0.readFloat(), 0.0F, 1.0F);
      this.r = $$0.m();
      int $$3 = $$0.readByte();
      this.n = ($$3 & 1) != 0;
      this.o = ($$3 & 2) != 0;
      this.p = ($$3 & 4) != 0;
   }

   private void a(wh $$0) {
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.l(this.i.u());
      $$0.l(this.i.v());
      $$0.l(this.i.w());
      $$0.l(this.j.u());
      $$0.l(this.j.v());
      $$0.l(this.j.w());
      $$0.a(this.k);
      $$0.a(this.l);
      $$0.a(this.m);
      $$0.a(this.q);
      $$0.a(this.r);
      int $$1 = 0;
      if (this.n) {
         $$1 |= 1;
      }

      if (this.o) {
         $$1 |= 2;
      }

      if (this.p) {
         $$1 |= 4;
      }

      $$0.l($$1);
   }

   @Override
   public zt<aiw> a() {
      return agz.cg;
   }

   public void a(ahb $$0) {
      $$0.a(this);
   }

   public jh b() {
      return this.e;
   }

   public dwi.a e() {
      return this.f;
   }

   public dyx f() {
      return this.g;
   }

   public String g() {
      return this.h;
   }

   public jh h() {
      return this.i;
   }

   public kl i() {
      return this.j;
   }

   public dpc j() {
      return this.k;
   }

   public dqv k() {
      return this.l;
   }

   public String l() {
      return this.m;
   }

   public boolean m() {
      return this.n;
   }

   public boolean n() {
      return this.o;
   }

   public boolean o() {
      return this.p;
   }

   public float p() {
      return this.q;
   }

   public long q() {
      return this.r;
   }
}
