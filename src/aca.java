import java.util.UUID;

public class aca implements zk<abz> {
   public static final zb<wo, aca> a = zk.a(aca::a, aca::new);
   private static final double b = 8000.0;
   private static final double c = 3.9;
   private final int d;
   private final UUID e;
   private final btv<?> f;
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

   public aca(bto $$0, arg $$1) {
      this($$0, $$1, 0);
   }

   public aca(bto $$0, arg $$1, int $$2) {
      this($$0.ap(), $$0.cD(), $$1.b().a(), $$1.b().b(), $$1.b().c(), $$1.d(), $$1.e(), $$0.ao(), $$2, $$1.c(), (double)$$1.f());
   }

   public aca(bto $$0, int $$1, je $$2) {
      this($$0.ap(), $$0.cD(), (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$0.dK(), $$0.dI(), $$0.ao(), $$1, $$0.dv(), (double)$$0.cx());
   }

   public aca(int $$0, UUID $$1, double $$2, double $$3, double $$4, float $$5, float $$6, btv<?> $$7, int $$8, eys $$9, double $$10) {
      this.d = $$0;
      this.e = $$1;
      this.g = $$2;
      this.h = $$3;
      this.i = $$4;
      this.m = (byte)azd.d($$5 * 256.0F / 360.0F);
      this.n = (byte)azd.d($$6 * 256.0F / 360.0F);
      this.o = (byte)azd.a($$10 * 256.0 / 360.0);
      this.f = $$7;
      this.p = $$8;
      this.j = (int)(azd.a($$9.d, -3.9, 3.9) * 8000.0);
      this.k = (int)(azd.a($$9.e, -3.9, 3.9) * 8000.0);
      this.l = (int)(azd.a($$9.f, -3.9, 3.9) * 8000.0);
   }

   private aca(wo $$0) {
      this.d = $$0.l();
      this.e = $$0.n();
      this.f = yz.a(lv.z).decode($$0);
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

   private void a(wo $$0) {
      $$0.c(this.d);
      $$0.a(this.e);
      yz.a(lv.z).encode($$0, this.f);
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
   public zm<aca> a() {
      return ago.c;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.d;
   }

   public UUID e() {
      return this.e;
   }

   public btv<?> f() {
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
