public class ahw implements ze<age> {
   public static final yv<vx, ahw> a = ze.a(ahw::a, ahw::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final io e;
   private final dpx.a f;
   private final dsn g;
   private final String h;
   private final io i;
   private final js j;
   private final dix k;
   private final dkn l;
   private final String m;
   private final boolean n;
   private final boolean o;
   private final boolean p;
   private final float q;
   private final long r;

   public ahw(
      io $$0, dpx.a $$1, dsn $$2, String $$3, io $$4, js $$5, dix $$6, dkn $$7, String $$8, boolean $$9, boolean $$10, boolean $$11, float $$12, long $$13
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

   private ahw(vx $$0) {
      this.e = $$0.e();
      this.f = $$0.b(dpx.a.class);
      this.g = $$0.b(dsn.class);
      this.h = $$0.p();
      int $$1 = 48;
      this.i = new io(ayf.a($$0.readByte(), -48, 48), ayf.a($$0.readByte(), -48, 48), ayf.a($$0.readByte(), -48, 48));
      int $$2 = 48;
      this.j = new js(ayf.a($$0.readByte(), 0, 48), ayf.a($$0.readByte(), 0, 48), ayf.a($$0.readByte(), 0, 48));
      this.k = $$0.b(dix.class);
      this.l = $$0.b(dkn.class);
      this.m = $$0.d(128);
      this.q = ayf.a($$0.readFloat(), 0.0F, 1.0F);
      this.r = $$0.m();
      int $$3 = $$0.readByte();
      this.n = ($$3 & 1) != 0;
      this.o = ($$3 & 2) != 0;
      this.p = ($$3 & 4) != 0;
   }

   private void a(vx $$0) {
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.k(this.i.u());
      $$0.k(this.i.v());
      $$0.k(this.i.w());
      $$0.k(this.j.u());
      $$0.k(this.j.v());
      $$0.k(this.j.w());
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

      $$0.k($$1);
   }

   @Override
   public zg<ahw> a() {
      return agc.bY;
   }

   public void a(age $$0) {
      $$0.a(this);
   }

   public io b() {
      return this.e;
   }

   public dpx.a e() {
      return this.f;
   }

   public dsn f() {
      return this.g;
   }

   public String g() {
      return this.h;
   }

   public io h() {
      return this.i;
   }

   public js i() {
      return this.j;
   }

   public dix j() {
      return this.k;
   }

   public dkn k() {
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
