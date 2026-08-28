import java.util.UUID;

public class ace implements zo<acd> {
   public static final zf<ws, ace> a = zo.a(ace::a, ace::new);
   private static final double b = 8000.0;
   private static final double c = 3.9;
   private final int d;
   private final UUID e;
   private final bug<?> f;
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

   public ace(btz $$0, arl $$1) {
      this($$0, $$1, 0);
   }

   public ace(btz $$0, arl $$1, int $$2) {
      this($$0.ar(), $$0.cH(), $$1.b().a(), $$1.b().b(), $$1.b().c(), $$1.d(), $$1.e(), $$0.aq(), $$2, $$1.c(), (double)$$1.f());
   }

   public ace(btz $$0, int $$1, jg $$2) {
      this($$0.ar(), $$0.cH(), (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$0.dP(), $$0.dN(), $$0.aq(), $$1, $$0.dA(), (double)$$0.cB());
   }

   public ace(int $$0, UUID $$1, double $$2, double $$3, double $$4, float $$5, float $$6, bug<?> $$7, int $$8, ezh $$9, double $$10) {
      this.d = $$0;
      this.e = $$1;
      this.g = $$2;
      this.h = $$3;
      this.i = $$4;
      this.m = azj.g($$5);
      this.n = azj.g($$6);
      this.o = azj.g((float)$$10);
      this.f = $$7;
      this.p = $$8;
      this.j = (int)(azj.a($$9.d, -3.9, 3.9) * 8000.0);
      this.k = (int)(azj.a($$9.e, -3.9, 3.9) * 8000.0);
      this.l = (int)(azj.a($$9.f, -3.9, 3.9) * 8000.0);
   }

   private ace(ws $$0) {
      this.d = $$0.l();
      this.e = $$0.n();
      this.f = zd.a(ly.z).decode($$0);
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

   private void a(ws $$0) {
      $$0.c(this.d);
      $$0.a(this.e);
      zd.a(ly.z).encode($$0, this.f);
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
   public zq<ace> a() {
      return ags.c;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.d;
   }

   public UUID e() {
      return this.e;
   }

   public bug<?> f() {
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
      return azj.a(this.m);
   }

   public float n() {
      return azj.a(this.n);
   }

   public float o() {
      return azj.a(this.o);
   }

   public int p() {
      return this.p;
   }
}
