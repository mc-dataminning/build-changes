public class aex implements xd<adg> {
   private static final int a = 1;
   private static final int b = 2;
   private static final int c = 4;
   private final hx d;
   private final dic.a e;
   private final dkk f;
   private final String g;
   private final hx h;
   private final jb i;
   private final dbf j;
   private final dcv k;
   private final String l;
   private final boolean m;
   private final boolean n;
   private final boolean o;
   private final float p;
   private final long q;

   public aex(
      hx $$0, dic.a $$1, dkk $$2, String $$3, hx $$4, jb $$5, dbf $$6, dcv $$7, String $$8, boolean $$9, boolean $$10, boolean $$11, float $$12, long $$13
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

   public aex(ug $$0) {
      this.d = $$0.e();
      this.e = $$0.b(dic.a.class);
      this.f = $$0.b(dkk.class);
      this.g = $$0.s();
      int $$1 = 48;
      this.h = new hx(aui.a($$0.readByte(), -48, 48), aui.a($$0.readByte(), -48, 48), aui.a($$0.readByte(), -48, 48));
      int $$2 = 48;
      this.i = new jb(aui.a($$0.readByte(), 0, 48), aui.a($$0.readByte(), 0, 48), aui.a($$0.readByte(), 0, 48));
      this.j = $$0.b(dbf.class);
      this.k = $$0.b(dcv.class);
      this.l = $$0.d(128);
      this.p = aui.a($$0.readFloat(), 0.0F, 1.0F);
      this.q = $$0.o();
      int $$3 = $$0.readByte();
      this.m = ($$3 & 1) != 0;
      this.n = ($$3 & 2) != 0;
      this.o = ($$3 & 4) != 0;
   }

   @Override
   public void a(ug $$0) {
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

   public void a(adg $$0) {
      $$0.a(this);
   }

   public hx a() {
      return this.d;
   }

   public dic.a d() {
      return this.e;
   }

   public dkk e() {
      return this.f;
   }

   public String f() {
      return this.g;
   }

   public hx g() {
      return this.h;
   }

   public jb h() {
      return this.i;
   }

   public dbf i() {
      return this.j;
   }

   public dcv j() {
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
