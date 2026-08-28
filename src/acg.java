import java.util.UUID;

public class acg implements zq<acf> {
   public static final zh<wu, acg> a = zq.a(acg::a, acg::new);
   private static final double b = 8000.0;
   private static final double c = 3.9;
   private final int d;
   private final UUID e;
   private final bus<?> f;
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

   public acg(bul $$0, arn $$1) {
      this($$0, $$1, 0);
   }

   public acg(bul $$0, arn $$1, int $$2) {
      this($$0.ar(), $$0.cG(), $$1.b().a(), $$1.b().b(), $$1.b().c(), $$1.d(), $$1.e(), $$0.aq(), $$2, $$1.c(), (double)$$1.f());
   }

   public acg(bul $$0, int $$1, jh $$2) {
      this($$0.ar(), $$0.cG(), (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$0.dN(), $$0.dL(), $$0.aq(), $$1, $$0.dy(), (double)$$0.cA());
   }

   public acg(int $$0, UUID $$1, double $$2, double $$3, double $$4, float $$5, float $$6, bus<?> $$7, int $$8, ezy $$9, double $$10) {
      this.d = $$0;
      this.e = $$1;
      this.g = $$2;
      this.h = $$3;
      this.i = $$4;
      this.m = azm.g($$5);
      this.n = azm.g($$6);
      this.o = azm.g((float)$$10);
      this.f = $$7;
      this.p = $$8;
      this.j = (int)(azm.a($$9.d, -3.9, 3.9) * 8000.0);
      this.k = (int)(azm.a($$9.e, -3.9, 3.9) * 8000.0);
      this.l = (int)(azm.a($$9.f, -3.9, 3.9) * 8000.0);
   }

   private acg(wu $$0) {
      this.d = $$0.l();
      this.e = $$0.n();
      this.f = zf.a(ma.z).decode($$0);
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

   private void a(wu $$0) {
      $$0.c(this.d);
      $$0.a(this.e);
      zf.a(ma.z).encode($$0, this.f);
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
   public zs<acg> a() {
      return agu.c;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.d;
   }

   public UUID e() {
      return this.e;
   }

   public bus<?> f() {
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
      return azm.a(this.m);
   }

   public float n() {
      return azm.a(this.n);
   }

   public float o() {
      return azm.a(this.o);
   }

   public int p() {
      return this.p;
   }
}
