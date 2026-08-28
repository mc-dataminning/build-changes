public class aiq implements zq<agw> {
   public static final zh<wg, aiq> a = zq.a(aiq::a, aiq::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final jh e;
   private final dup.a f;
   private final dxe g;
   private final String h;
   private final jh i;
   private final kl j;
   private final dnm k;
   private final dpd l;
   private final String m;
   private final boolean n;
   private final boolean o;
   private final boolean p;
   private final float q;
   private final long r;

   public aiq(
      jh $$0, dup.a $$1, dxe $$2, String $$3, jh $$4, kl $$5, dnm $$6, dpd $$7, String $$8, boolean $$9, boolean $$10, boolean $$11, float $$12, long $$13
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

   private aiq(wg $$0) {
      this.e = $$0.e();
      this.f = $$0.b(dup.a.class);
      this.g = $$0.b(dxe.class);
      this.h = $$0.p();
      int $$1 = 48;
      this.i = new jh(azm.a($$0.readByte(), -48, 48), azm.a($$0.readByte(), -48, 48), azm.a($$0.readByte(), -48, 48));
      int $$2 = 48;
      this.j = new kl(azm.a($$0.readByte(), 0, 48), azm.a($$0.readByte(), 0, 48), azm.a($$0.readByte(), 0, 48));
      this.k = $$0.b(dnm.class);
      this.l = $$0.b(dpd.class);
      this.m = $$0.d(128);
      this.q = azm.a($$0.readFloat(), 0.0F, 1.0F);
      this.r = $$0.m();
      int $$3 = $$0.readByte();
      this.n = ($$3 & 1) != 0;
      this.o = ($$3 & 2) != 0;
      this.p = ($$3 & 4) != 0;
   }

   private void a(wg $$0) {
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
   public zs<aiq> a() {
      return agu.cb;
   }

   public void a(agw $$0) {
      $$0.a(this);
   }

   public jh b() {
      return this.e;
   }

   public dup.a e() {
      return this.f;
   }

   public dxe f() {
      return this.g;
   }

   public String g() {
      return this.h;
   }

   public jh h() {
      return this.i;
   }

   public kl i() {
      return this.j;
   }

   public dnm j() {
      return this.k;
   }

   public dpd k() {
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
