public class agi implements xx<aes> {
   public static final xo<uq, agi> a = xx.a(agi::a, agi::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final hz e;
   private final dkh.a f;
   private final dmp g;
   private final String h;
   private final hz i;
   private final jd j;
   private final ddk k;
   private final dfa l;
   private final String m;
   private final boolean n;
   private final boolean o;
   private final boolean p;
   private final float q;
   private final long r;

   public agi(
      hz $$0, dkh.a $$1, dmp $$2, String $$3, hz $$4, jd $$5, ddk $$6, dfa $$7, String $$8, boolean $$9, boolean $$10, boolean $$11, float $$12, long $$13
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

   private agi(uq $$0) {
      this.e = $$0.e();
      this.f = $$0.b(dkh.a.class);
      this.g = $$0.b(dmp.class);
      this.h = $$0.r();
      int $$1 = 48;
      this.i = new hz(awh.a($$0.readByte(), -48, 48), awh.a($$0.readByte(), -48, 48), awh.a($$0.readByte(), -48, 48));
      int $$2 = 48;
      this.j = new jd(awh.a($$0.readByte(), 0, 48), awh.a($$0.readByte(), 0, 48), awh.a($$0.readByte(), 0, 48));
      this.k = $$0.b(ddk.class);
      this.l = $$0.b(dfa.class);
      this.m = $$0.d(128);
      this.q = awh.a($$0.readFloat(), 0.0F, 1.0F);
      this.r = $$0.o();
      int $$3 = $$0.readByte();
      this.n = ($$3 & 1) != 0;
      this.o = ($$3 & 2) != 0;
      this.p = ($$3 & 4) != 0;
   }

   private void a(uq $$0) {
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
   public xz<agi> a() {
      return aeq.bU;
   }

   public void a(aes $$0) {
      $$0.a(this);
   }

   public hz b() {
      return this.e;
   }

   public dkh.a e() {
      return this.f;
   }

   public dmp f() {
      return this.g;
   }

   public String g() {
      return this.h;
   }

   public hz h() {
      return this.i;
   }

   public jd i() {
      return this.j;
   }

   public ddk j() {
      return this.k;
   }

   public dfa k() {
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
