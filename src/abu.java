import java.util.UUID;

public class abu implements zf<abt> {
   public static final yw<wj, abu> a = zf.a(abu::a, abu::new);
   private static final double b = 8000.0;
   private static final double c = 3.9;
   private final int d;
   private final UUID e;
   private final bsw<?> f;
   private final double g;
   private final double h;
   private final double i;
   private final int j;
   private final int k;
   private final int l;
   private final byte m;
   private final byte n;
   private final byte o;
   private final int p;

   public abu(bsq $$0) {
      this($$0, 0);
   }

   public abu(bsq $$0, int $$1) {
      this($$0.an(), $$0.cA(), $$0.dv(), $$0.dx(), $$0.dB(), $$0.dI(), $$0.dG(), $$0.am(), $$1, $$0.dt(), (double)$$0.ct());
   }

   public abu(bsq $$0, int $$1, jd $$2) {
      this($$0.an(), $$0.cA(), (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$0.dI(), $$0.dG(), $$0.am(), $$1, $$0.dt(), (double)$$0.ct());
   }

   public abu(int $$0, UUID $$1, double $$2, double $$3, double $$4, float $$5, float $$6, bsw<?> $$7, int $$8, eww $$9, double $$10) {
      this.d = $$0;
      this.e = $$1;
      this.g = $$2;
      this.h = $$3;
      this.i = $$4;
      this.m = (byte)ayn.d($$5 * 256.0F / 360.0F);
      this.n = (byte)ayn.d($$6 * 256.0F / 360.0F);
      this.o = (byte)ayn.a($$10 * 256.0 / 360.0);
      this.f = $$7;
      this.p = $$8;
      this.j = (int)(ayn.a($$9.c, -3.9, 3.9) * 8000.0);
      this.k = (int)(ayn.a($$9.d, -3.9, 3.9) * 8000.0);
      this.l = (int)(ayn.a($$9.e, -3.9, 3.9) * 8000.0);
   }

   private abu(wj $$0) {
      this.d = $$0.l();
      this.e = $$0.n();
      this.f = yu.a(lu.z).decode($$0);
      this.g = $$0.readDouble();
      this.h = $$0.readDouble();
      this.i = $$0.readDouble();
      this.m = $$0.readByte();
      this.n = $$0.readByte();
      this.o = $$0.readByte();
      this.p = $$0.l();
      this.j = $$0.readShort();
      this.k = $$0.readShort();
      this.l = $$0.readShort();
   }

   private void a(wj $$0) {
      $$0.c(this.d);
      $$0.a(this.e);
      yu.a(lu.z).encode($$0, this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.a(this.i);
      $$0.k(this.m);
      $$0.k(this.n);
      $$0.k(this.o);
      $$0.c(this.p);
      $$0.l(this.j);
      $$0.l(this.k);
      $$0.l(this.l);
   }

   @Override
   public zh<abu> a() {
      return agf.c;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.d;
   }

   public UUID e() {
      return this.e;
   }

   public bsw<?> f() {
      return this.f;
   }

   public double g() {
      return this.g;
   }

   public double h() {
      return this.h;
   }

   public double i() {
      return this.i;
   }

   public double j() {
      return (double)this.j / 8000.0;
   }

   public double k() {
      return (double)this.k / 8000.0;
   }

   public double l() {
      return (double)this.l / 8000.0;
   }

   public float m() {
      return (float)(this.m * 360) / 256.0F;
   }

   public float n() {
      return (float)(this.n * 360) / 256.0F;
   }

   public float o() {
      return (float)(this.o * 360) / 256.0F;
   }

   public int p() {
      return this.p;
   }
}
