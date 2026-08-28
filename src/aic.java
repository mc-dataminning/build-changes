public class aic implements yw<agg> {
   public static final yn<vl, aic> a = yw.a(aic::a, aic::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final ji e;
   private final dvs.a f;
   private final dyh g;
   private final String h;
   private final ji i;
   private final km j;
   private final dom k;
   private final dqf l;
   private final String m;
   private final boolean n;
   private final boolean o;
   private final boolean p;
   private final float q;
   private final long r;

   public aic(
      ji $$0, dvs.a $$1, dyh $$2, String $$3, ji $$4, km $$5, dom $$6, dqf $$7, String $$8, boolean $$9, boolean $$10, boolean $$11, float $$12, long $$13
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

   private aic(vl $$0) {
      this.e = $$0.e();
      this.f = $$0.b(dvs.a.class);
      this.g = $$0.b(dyh.class);
      this.h = $$0.p();
      int $$1 = 48;
      this.i = new ji(ayz.a($$0.readByte(), -48, 48), ayz.a($$0.readByte(), -48, 48), ayz.a($$0.readByte(), -48, 48));
      int $$2 = 48;
      this.j = new km(ayz.a($$0.readByte(), 0, 48), ayz.a($$0.readByte(), 0, 48), ayz.a($$0.readByte(), 0, 48));
      this.k = $$0.b(dom.class);
      this.l = $$0.b(dqf.class);
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
   public yy<aic> a() {
      return age.ch;
   }

   public void a(agg $$0) {
      $$0.a(this);
   }

   public ji b() {
      return this.e;
   }

   public dvs.a e() {
      return this.f;
   }

   public dyh f() {
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

   public dom j() {
      return this.k;
   }

   public dqf k() {
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
