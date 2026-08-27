import java.util.UUID;

public class abb implements yp<aba> {
   public static final yg<vt, abb> a = yp.a(abb::a, abb::new);
   private static final double b = 8000.0;
   private static final double c = 3.9;
   private final int d;
   private final UUID e;
   private final bqg<?> f;
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

   public abb(bqa $$0) {
      this($$0, 0);
   }

   public abb(bqa $$0, int $$1) {
      this($$0.aj(), $$0.cw(), $$0.dr(), $$0.dt(), $$0.dx(), $$0.dE(), $$0.dC(), $$0.ai(), $$1, $$0.dp(), (double)$$0.cp());
   }

   public abb(bqa $$0, int $$1, id $$2) {
      this($$0.aj(), $$0.cw(), (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$0.dE(), $$0.dC(), $$0.ai(), $$1, $$0.dp(), (double)$$0.cp());
   }

   public abb(int $$0, UUID $$1, double $$2, double $$3, double $$4, float $$5, float $$6, bqg<?> $$7, int $$8, esj $$9, double $$10) {
      this.d = $$0;
      this.e = $$1;
      this.g = $$2;
      this.h = $$3;
      this.i = $$4;
      this.m = (byte)axm.d($$5 * 256.0F / 360.0F);
      this.n = (byte)axm.d($$6 * 256.0F / 360.0F);
      this.o = (byte)axm.a($$10 * 256.0 / 360.0);
      this.f = $$7;
      this.p = $$8;
      this.j = (int)(axm.a($$9.c, -3.9, 3.9) * 8000.0);
      this.k = (int)(axm.a($$9.d, -3.9, 3.9) * 8000.0);
      this.l = (int)(axm.a($$9.e, -3.9, 3.9) * 8000.0);
   }

   private abb(vt $$0) {
      this.d = $$0.l();
      this.e = $$0.n();
      this.f = ye.a(ku.v).decode($$0);
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

   private void a(vt $$0) {
      $$0.c(this.d);
      $$0.a(this.e);
      ye.a(ku.v).encode($$0, this.f);
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
   public yr<abb> a() {
      return afl.c;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.d;
   }

   public UUID e() {
      return this.e;
   }

   public bqg<?> f() {
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
