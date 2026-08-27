import java.util.UUID;

public class abx implements zl<abw> {
   public static final zc<wp, abx> a = zl.a(abx::a, abx::new);
   private static final double b = 8000.0;
   private static final double c = 3.9;
   private final int d;
   private final UUID e;
   private final bsb<?> f;
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

   public abx(brv $$0) {
      this($$0, 0);
   }

   public abx(brv $$0, int $$1) {
      this($$0.al(), $$0.cE(), $$0.dz(), $$0.dB(), $$0.dF(), $$0.dM(), $$0.dK(), $$0.ak(), $$1, $$0.dx(), (double)$$0.cx());
   }

   public abx(brv $$0, int $$1, ir $$2) {
      this($$0.al(), $$0.cE(), (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$0.dM(), $$0.dK(), $$0.ak(), $$1, $$0.dx(), (double)$$0.cx());
   }

   public abx(int $$0, UUID $$1, double $$2, double $$3, double $$4, float $$5, float $$6, bsb<?> $$7, int $$8, ewu $$9, double $$10) {
      this.d = $$0;
      this.e = $$1;
      this.g = $$2;
      this.h = $$3;
      this.i = $$4;
      this.m = (byte)aym.d($$5 * 256.0F / 360.0F);
      this.n = (byte)aym.d($$6 * 256.0F / 360.0F);
      this.o = (byte)aym.a($$10 * 256.0 / 360.0);
      this.f = $$7;
      this.p = $$8;
      this.j = (int)(aym.a($$9.c, -3.9, 3.9) * 8000.0);
      this.k = (int)(aym.a($$9.d, -3.9, 3.9) * 8000.0);
      this.l = (int)(aym.a($$9.e, -3.9, 3.9) * 8000.0);
   }

   private abx(wp $$0) {
      this.d = $$0.l();
      this.e = $$0.n();
      this.f = za.a(li.v).decode($$0);
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

   private void a(wp $$0) {
      $$0.c(this.d);
      $$0.a(this.e);
      za.a(li.v).encode($$0, this.f);
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
   public zn<abx> a() {
      return agj.c;
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

   public bsb<?> f() {
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
