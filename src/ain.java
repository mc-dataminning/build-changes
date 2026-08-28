public class ain implements zh<agr> {
   public static final yy<vw, ain> a = zh.a(ain::a, ain::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private static final int e = 8;
   private final iv f;
   private final dzv.a g;
   private final eco h;
   private final String i;
   private final iv j;
   private final ka k;
   private final dsf l;
   private final dtw m;
   private final String n;
   private final boolean o;
   private final boolean p;
   private final boolean q;
   private final boolean r;
   private final float s;
   private final long t;

   public ain(
      iv $$0,
      dzv.a $$1,
      eco $$2,
      String $$3,
      iv $$4,
      ka $$5,
      dsf $$6,
      dtw $$7,
      String $$8,
      boolean $$9,
      boolean $$10,
      boolean $$11,
      boolean $$12,
      float $$13,
      long $$14
   ) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.j = $$4;
      this.k = $$5;
      this.l = $$6;
      this.m = $$7;
      this.n = $$8;
      this.o = $$9;
      this.p = $$10;
      this.q = $$11;
      this.r = $$12;
      this.s = $$13;
      this.t = $$14;
   }

   private ain(vw $$0) {
      this.f = $$0.e();
      this.g = $$0.b(dzv.a.class);
      this.h = $$0.b(eco.class);
      this.i = $$0.p();
      int $$1 = 48;
      this.j = new iv(azo.a($$0.readByte(), -48, 48), azo.a($$0.readByte(), -48, 48), azo.a($$0.readByte(), -48, 48));
      int $$2 = 48;
      this.k = new ka(azo.a($$0.readByte(), 0, 48), azo.a($$0.readByte(), 0, 48), azo.a($$0.readByte(), 0, 48));
      this.l = $$0.b(dsf.class);
      this.m = $$0.b(dtw.class);
      this.n = $$0.d(128);
      this.s = azo.a($$0.readFloat(), 0.0F, 1.0F);
      this.t = $$0.m();
      int $$3 = $$0.readByte();
      this.o = ($$3 & 1) != 0;
      this.p = ($$3 & 8) != 0;
      this.q = ($$3 & 2) != 0;
      this.r = ($$3 & 4) != 0;
   }

   private void a(vw $$0) {
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.a(this.i);
      $$0.l(this.j.u());
      $$0.l(this.j.v());
      $$0.l(this.j.w());
      $$0.l(this.k.u());
      $$0.l(this.k.v());
      $$0.l(this.k.w());
      $$0.a(this.l);
      $$0.a(this.m);
      $$0.a(this.n);
      $$0.a(this.s);
      $$0.a(this.t);
      int $$1 = 0;
      if (this.o) {
         $$1 |= 1;
      }

      if (this.q) {
         $$1 |= 2;
      }

      if (this.r) {
         $$1 |= 4;
      }

      if (this.p) {
         $$1 |= 8;
      }

      $$0.l($$1);
   }

   @Override
   public zj<ain> a() {
      return agp.ch;
   }

   public void a(agr $$0) {
      $$0.a(this);
   }

   public iv b() {
      return this.f;
   }

   public dzv.a e() {
      return this.g;
   }

   public eco f() {
      return this.h;
   }

   public String g() {
      return this.i;
   }

   public iv h() {
      return this.j;
   }

   public ka i() {
      return this.k;
   }

   public dsf j() {
      return this.l;
   }

   public dtw k() {
      return this.m;
   }

   public String l() {
      return this.n;
   }

   public boolean m() {
      return this.o;
   }

   public boolean n() {
      return this.p;
   }

   public boolean o() {
      return this.q;
   }

   public boolean p() {
      return this.r;
   }

   public float q() {
      return this.s;
   }

   public long r() {
      return this.t;
   }
}
