public class aib implements yw<agf> {
   public static final yn<vl, aib> a = yw.a(aib::a, aib::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private static final int e = 8;
   private final ji f;
   private final dwk.a g;
   private final dza h;
   private final String i;
   private final ji j;
   private final km k;
   private final dpf l;
   private final dqw m;
   private final String n;
   private final boolean o;
   private final boolean p;
   private final boolean q;
   private final boolean r;
   private final float s;
   private final long t;

   public aib(
      ji $$0,
      dwk.a $$1,
      dza $$2,
      String $$3,
      ji $$4,
      km $$5,
      dpf $$6,
      dqw $$7,
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

   private aib(vl $$0) {
      this.f = $$0.e();
      this.g = $$0.b(dwk.a.class);
      this.h = $$0.b(dza.class);
      this.i = $$0.p();
      int $$1 = 48;
      this.j = new ji(ayz.a($$0.readByte(), -48, 48), ayz.a($$0.readByte(), -48, 48), ayz.a($$0.readByte(), -48, 48));
      int $$2 = 48;
      this.k = new km(ayz.a($$0.readByte(), 0, 48), ayz.a($$0.readByte(), 0, 48), ayz.a($$0.readByte(), 0, 48));
      this.l = $$0.b(dpf.class);
      this.m = $$0.b(dqw.class);
      this.n = $$0.d(128);
      this.s = ayz.a($$0.readFloat(), 0.0F, 1.0F);
      this.t = $$0.m();
      int $$3 = $$0.readByte();
      this.o = ($$3 & 1) != 0;
      this.p = ($$3 & 8) != 0;
      this.q = ($$3 & 2) != 0;
      this.r = ($$3 & 4) != 0;
   }

   private void a(vl $$0) {
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
   public yy<aib> a() {
      return agd.cg;
   }

   public void a(agf $$0) {
      $$0.a(this);
   }

   public ji b() {
      return this.f;
   }

   public dwk.a e() {
      return this.g;
   }

   public dza f() {
      return this.h;
   }

   public String g() {
      return this.i;
   }

   public ji h() {
      return this.j;
   }

   public km i() {
      return this.k;
   }

   public dpf j() {
      return this.l;
   }

   public dqw k() {
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
