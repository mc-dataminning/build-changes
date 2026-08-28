import java.util.UUID;

public class acf implements zs<ace> {
   public static final zj<ww, acf> a = zs.a(acf::a, acf::new);
   private static final double b = 8000.0;
   private static final double c = 3.9;
   private final int d;
   private final UUID e;
   private final bsv<?> f;
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

   public acf(bsp $$0) {
      this($$0, 0);
   }

   public acf(bsp $$0, int $$1) {
      this($$0.al(), $$0.cz(), $$0.du(), $$0.dw(), $$0.dA(), $$0.dH(), $$0.dF(), $$0.ak(), $$1, $$0.ds(), (double)$$0.cs());
   }

   public acf(bsp $$0, int $$1, iz $$2) {
      this($$0.al(), $$0.cz(), (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$0.dH(), $$0.dF(), $$0.ak(), $$1, $$0.ds(), (double)$$0.cs());
   }

   public acf(int $$0, UUID $$1, double $$2, double $$3, double $$4, float $$5, float $$6, bsv<?> $$7, int $$8, evm $$9, double $$10) {
      this.d = $$0;
      this.e = $$1;
      this.g = $$2;
      this.h = $$3;
      this.i = $$4;
      this.m = (byte)ayu.d($$5 * 256.0F / 360.0F);
      this.n = (byte)ayu.d($$6 * 256.0F / 360.0F);
      this.o = (byte)ayu.a($$10 * 256.0 / 360.0);
      this.f = $$7;
      this.p = $$8;
      this.j = (int)(ayu.a($$9.c, -3.9, 3.9) * 8000.0);
      this.k = (int)(ayu.a($$9.d, -3.9, 3.9) * 8000.0);
      this.l = (int)(ayu.a($$9.e, -3.9, 3.9) * 8000.0);
   }

   private acf(ww $$0) {
      this.d = $$0.l();
      this.e = $$0.n();
      this.f = zh.a(lq.v).decode($$0);
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

   private void a(ww $$0) {
      $$0.c(this.d);
      $$0.a(this.e);
      zh.a(lq.v).encode($$0, this.f);
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
   public zu<acf> a() {
      return agq.c;
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

   public bsv<?> f() {
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
