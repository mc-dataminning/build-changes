public class ail implements zl<agr> {
   public static final zc<wb, ail> a = zl.a(ail::a, ail::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final jf e;
   private final dtm.a f;
   private final dwc g;
   private final String h;
   private final jf i;
   private final kj j;
   private final dmj k;
   private final doa l;
   private final String m;
   private final boolean n;
   private final boolean o;
   private final boolean p;
   private final float q;
   private final long r;

   public ail(
      jf $$0, dtm.a $$1, dwc $$2, String $$3, jf $$4, kj $$5, dmj $$6, doa $$7, String $$8, boolean $$9, boolean $$10, boolean $$11, float $$12, long $$13
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

   private ail(wb $$0) {
      this.e = $$0.e();
      this.f = $$0.b(dtm.a.class);
      this.g = $$0.b(dwc.class);
      this.h = $$0.p();
      int $$1 = 48;
      this.i = new jf(azf.a($$0.readByte(), -48, 48), azf.a($$0.readByte(), -48, 48), azf.a($$0.readByte(), -48, 48));
      int $$2 = 48;
      this.j = new kj(azf.a($$0.readByte(), 0, 48), azf.a($$0.readByte(), 0, 48), azf.a($$0.readByte(), 0, 48));
      this.k = $$0.b(dmj.class);
      this.l = $$0.b(doa.class);
      this.m = $$0.d(128);
      this.q = azf.a($$0.readFloat(), 0.0F, 1.0F);
      this.r = $$0.m();
      int $$3 = $$0.readByte();
      this.n = ($$3 & 1) != 0;
      this.o = ($$3 & 2) != 0;
      this.p = ($$3 & 4) != 0;
   }

   private void a(wb $$0) {
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
   public zn<ail> a() {
      return agp.cb;
   }

   public void a(agr $$0) {
      $$0.a(this);
   }

   public jf b() {
      return this.e;
   }

   public dtm.a e() {
      return this.f;
   }

   public dwc f() {
      return this.g;
   }

   public String g() {
      return this.h;
   }

   public jf h() {
      return this.i;
   }

   public kj i() {
      return this.j;
   }

   public dmj j() {
      return this.k;
   }

   public doa k() {
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
