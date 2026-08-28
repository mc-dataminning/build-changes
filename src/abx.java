import java.util.UUID;

public class abx implements zh<abw> {
   public static final yy<wl, abx> a = zh.a(abx::a, abx::new);
   private static final double b = 8000.0;
   private static final double c = 3.9;
   private final int d;
   private final UUID e;
   private final bxc<?> f;
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

   public abx(bwt $$0, arq $$1) {
      this($$0, $$1, 0);
   }

   public abx(bwt $$0, arq $$1, int $$2) {
      this($$0.ao(), $$0.cG(), $$1.b().a(), $$1.b().b(), $$1.b().c(), $$1.d(), $$1.e(), $$0.an(), $$2, $$1.c(), (double)$$1.f());
   }

   public abx(bwt $$0, int $$1, iv $$2) {
      this($$0.ao(), $$0.cG(), (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$0.dN(), $$0.dL(), $$0.an(), $$1, $$0.dy(), (double)$$0.cA());
   }

   public abx(int $$0, UUID $$1, double $$2, double $$3, double $$4, float $$5, float $$6, bxc<?> $$7, int $$8, ffq $$9, double $$10) {
      this.d = $$0;
      this.e = $$1;
      this.g = $$2;
      this.h = $$3;
      this.i = $$4;
      this.m = azo.g($$5);
      this.n = azo.g($$6);
      this.o = azo.g((float)$$10);
      this.f = $$7;
      this.p = $$8;
      this.j = (int)(azo.a($$9.d, -3.9, 3.9) * 8000.0);
      this.k = (int)(azo.a($$9.e, -3.9, 3.9) * 8000.0);
      this.l = (int)(azo.a($$9.f, -3.9, 3.9) * 8000.0);
   }

   private abx(wl $$0) {
      this.d = $$0.l();
      this.e = $$0.n();
      this.f = yw.a(mh.B).decode($$0);
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

   private void a(wl $$0) {
      $$0.c(this.d);
      $$0.a(this.e);
      yw.a(mh.B).encode($$0, this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.a(this.i);
      $$0.l(this.m);
      $$0.l(this.n);
      $$0.l(this.o);
      $$0.c(this.p);
      $$0.m(this.j);
      $$0.m(this.k);
      $$0.m(this.l);
   }

   @Override
   public zj<abx> a() {
      return agp.c;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.d;
   }

   public UUID e() {
      return this.e;
   }

   public bxc<?> f() {
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
      return azo.a(this.m);
   }

   public float n() {
      return azo.a(this.n);
   }

   public float o() {
      return azo.a(this.o);
   }

   public int p() {
      return this.p;
   }
}
