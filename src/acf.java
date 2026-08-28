import java.util.UUID;

public class acf implements zp<ace> {
   public static final zg<wt, acf> a = zp.a(acf::a, acf::new);
   private static final double b = 8000.0;
   private static final double c = 3.9;
   private final int d;
   private final UUID e;
   private final bul<?> f;
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

   public acf(bue $$0, arm $$1) {
      this($$0, $$1, 0);
   }

   public acf(bue $$0, arm $$1, int $$2) {
      this($$0.as(), $$0.cH(), $$1.b().a(), $$1.b().b(), $$1.b().c(), $$1.d(), $$1.e(), $$0.ar(), $$2, $$1.c(), (double)$$1.f());
   }

   public acf(bue $$0, int $$1, jh $$2) {
      this($$0.as(), $$0.cH(), (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$0.dP(), $$0.dN(), $$0.ar(), $$1, $$0.dA(), (double)$$0.cB());
   }

   public acf(int $$0, UUID $$1, double $$2, double $$3, double $$4, float $$5, float $$6, bul<?> $$7, int $$8, ezn $$9, double $$10) {
      this.d = $$0;
      this.e = $$1;
      this.g = $$2;
      this.h = $$3;
      this.i = $$4;
      this.m = azk.g($$5);
      this.n = azk.g($$6);
      this.o = azk.g((float)$$10);
      this.f = $$7;
      this.p = $$8;
      this.j = (int)(azk.a($$9.d, -3.9, 3.9) * 8000.0);
      this.k = (int)(azk.a($$9.e, -3.9, 3.9) * 8000.0);
      this.l = (int)(azk.a($$9.f, -3.9, 3.9) * 8000.0);
   }

   private acf(wt $$0) {
      this.d = $$0.l();
      this.e = $$0.n();
      this.f = ze.a(lz.z).decode($$0);
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

   private void a(wt $$0) {
      $$0.c(this.d);
      $$0.a(this.e);
      ze.a(lz.z).encode($$0, this.f);
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
   public zr<acf> a() {
      return agt.c;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.d;
   }

   public UUID e() {
      return this.e;
   }

   public bul<?> f() {
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
      return azk.a(this.m);
   }

   public float n() {
      return azk.a(this.n);
   }

   public float o() {
      return azk.a(this.o);
   }

   public int p() {
      return this.p;
   }
}
