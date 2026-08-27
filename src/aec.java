public class aec implements wk<acl> {
   private static final int a = 1;
   private static final int b = 2;
   private static final int c = 4;
   private final ht d;
   private final dgr.a e;
   private final dis f;
   private final String g;
   private final ht h;
   private final iw i;
   private final czw j;
   private final dbm k;
   private final String l;
   private final boolean m;
   private final boolean n;
   private final boolean o;
   private final float p;
   private final long q;

   public aec(
      ht $$0, dgr.a $$1, dis $$2, String $$3, ht $$4, iw $$5, czw $$6, dbm $$7, String $$8, boolean $$9, boolean $$10, boolean $$11, float $$12, long $$13
   ) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
      this.l = $$8;
      this.m = $$9;
      this.n = $$10;
      this.o = $$11;
      this.p = $$12;
      this.q = $$13;
   }

   public aec(tu $$0) {
      this.d = $$0.e();
      this.e = $$0.b(dgr.a.class);
      this.f = $$0.b(dis.class);
      this.g = $$0.s();
      int $$1 = 48;
      this.h = new ht(atm.a($$0.readByte(), -48, 48), atm.a($$0.readByte(), -48, 48), atm.a($$0.readByte(), -48, 48));
      int $$2 = 48;
      this.i = new iw(atm.a($$0.readByte(), 0, 48), atm.a($$0.readByte(), 0, 48), atm.a($$0.readByte(), 0, 48));
      this.j = $$0.b(czw.class);
      this.k = $$0.b(dbm.class);
      this.l = $$0.d(128);
      this.p = atm.a($$0.readFloat(), 0.0F, 1.0F);
      this.q = $$0.o();
      int $$3 = $$0.readByte();
      this.m = ($$3 & 1) != 0;
      this.n = ($$3 & 2) != 0;
      this.o = ($$3 & 4) != 0;
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.k(this.h.u());
      $$0.k(this.h.v());
      $$0.k(this.h.w());
      $$0.k(this.i.u());
      $$0.k(this.i.v());
      $$0.k(this.i.w());
      $$0.a(this.j);
      $$0.a(this.k);
      $$0.a(this.l);
      $$0.a(this.p);
      $$0.a(this.q);
      int $$1 = 0;
      if (this.m) {
         $$1 |= 1;
      }

      if (this.n) {
         $$1 |= 2;
      }

      if (this.o) {
         $$1 |= 4;
      }

      $$0.k($$1);
   }

   public void a(acl $$0) {
      $$0.a(this);
   }

   public ht a() {
      return this.d;
   }

   public dgr.a d() {
      return this.e;
   }

   public dis e() {
      return this.f;
   }

   public String f() {
      return this.g;
   }

   public ht g() {
      return this.h;
   }

   public iw h() {
      return this.i;
   }

   public czw i() {
      return this.j;
   }

   public dbm j() {
      return this.k;
   }

   public String k() {
      return this.l;
   }

   public boolean l() {
      return this.m;
   }

   public boolean m() {
      return this.n;
   }

   public boolean n() {
      return this.o;
   }

   public float o() {
      return this.p;
   }

   public long p() {
      return this.q;
   }
}
