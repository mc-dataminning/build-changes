public class aib implements yv<agf> {
   public static final ym<vl, aib> a = yv.a(aib::a, aib::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final ji e;
   private final dvr.a f;
   private final dyg g;
   private final String h;
   private final ji i;
   private final km j;
   private final dol k;
   private final dqe l;
   private final String m;
   private final boolean n;
   private final boolean o;
   private final boolean p;
   private final float q;
   private final long r;

   public aib(
      ji $$0, dvr.a $$1, dyg $$2, String $$3, ji $$4, km $$5, dol $$6, dqe $$7, String $$8, boolean $$9, boolean $$10, boolean $$11, float $$12, long $$13
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

   private aib(vl $$0) {
      this.e = $$0.e();
      this.f = $$0.b(dvr.a.class);
      this.g = $$0.b(dyg.class);
      this.h = $$0.p();
      int $$1 = 48;
      this.i = new ji(ayz.a($$0.readByte(), -48, 48), ayz.a($$0.readByte(), -48, 48), ayz.a($$0.readByte(), -48, 48));
      int $$2 = 48;
      this.j = new km(ayz.a($$0.readByte(), 0, 48), ayz.a($$0.readByte(), 0, 48), ayz.a($$0.readByte(), 0, 48));
      this.k = $$0.b(dol.class);
      this.l = $$0.b(dqe.class);
      this.m = $$0.d(128);
      this.q = ayz.a($$0.readFloat(), 0.0F, 1.0F);
      this.r = $$0.m();
      int $$3 = $$0.readByte();
      this.n = ($$3 & 1) != 0;
      this.o = ($$3 & 2) != 0;
      this.p = ($$3 & 4) != 0;
   }

   private void a(vl $$0) {
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
   public yx<aib> a() {
      return agd.ch;
   }

   public void a(agf $$0) {
      $$0.a(this);
   }

   public ji b() {
      return this.e;
   }

   public dvr.a e() {
      return this.f;
   }

   public dyg f() {
      return this.g;
   }

   public String g() {
      return this.h;
   }

   public ji h() {
      return this.i;
   }

   public km i() {
      return this.j;
   }

   public dol j() {
      return this.k;
   }

   public dqe k() {
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
