public class aiw implements zo<aha> {
   public static final ze<vy, aiw> a = zo.a(aiw::a, aiw::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private static final int e = 8;
   private final iw f;
   private final eah.a g;
   private final eda h;
   private final String i;
   private final iw j;
   private final kb k;
   private final dsr l;
   private final dui m;
   private final String n;
   private final boolean o;
   private final boolean p;
   private final boolean q;
   private final boolean r;
   private final float s;
   private final long t;

   public aiw(
      iw $$0,
      eah.a $$1,
      eda $$2,
      String $$3,
      iw $$4,
      kb $$5,
      dsr $$6,
      dui $$7,
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

   private aiw(vy $$0) {
      this.f = $$0.e();
      this.g = $$0.b(eah.a.class);
      this.h = $$0.b(eda.class);
      this.i = $$0.p();
      int $$1 = 48;
      this.j = new iw(azz.a($$0.readByte(), -48, 48), azz.a($$0.readByte(), -48, 48), azz.a($$0.readByte(), -48, 48));
      int $$2 = 48;
      this.k = new kb(azz.a($$0.readByte(), 0, 48), azz.a($$0.readByte(), 0, 48), azz.a($$0.readByte(), 0, 48));
      this.l = $$0.b(dsr.class);
      this.m = $$0.b(dui.class);
      this.n = $$0.d(128);
      this.s = azz.a($$0.readFloat(), 0.0F, 1.0F);
      this.t = $$0.m();
      int $$3 = $$0.readByte();
      this.o = ($$3 & 1) != 0;
      this.p = ($$3 & 8) != 0;
      this.q = ($$3 & 2) != 0;
      this.r = ($$3 & 4) != 0;
   }

   private void a(vy $$0) {
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
   public zq<aiw> a() {
      return agy.ch;
   }

   public void a(aha $$0) {
      $$0.a(this);
   }

   public iw b() {
      return this.f;
   }

   public eah.a e() {
      return this.g;
   }

   public eda f() {
      return this.h;
   }

   public String g() {
      return this.i;
   }

   public iw h() {
      return this.j;
   }

   public kb i() {
      return this.k;
   }

   public dsr j() {
      return this.l;
   }

   public dui k() {
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
