public class ado implements zl<aca> {
   public static final zc<wp, ado> a = zl.a(ado::a, ado::new);
   private final double b;
   private final double c;
   private final double d;
   private final float e;
   private final float f;
   private final float g;
   private final float h;
   private final int i;
   private final boolean j;
   private final lm k;

   public <T extends lm> ado(T $$0, boolean $$1, double $$2, double $$3, double $$4, float $$5, float $$6, float $$7, float $$8, int $$9) {
      this.k = $$0;
      this.j = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
      this.f = $$6;
      this.g = $$7;
      this.h = $$8;
      this.i = $$9;
   }

   private ado(wp $$0) {
      this.j = $$0.readBoolean();
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
      this.g = $$0.readFloat();
      this.h = $$0.readFloat();
      this.i = $$0.readInt();
      this.k = lo.bg.decode($$0);
   }

   private void a(wp $$0) {
      $$0.a(this.j);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.q(this.i);
      lo.bg.encode($$0, this.k);
   }

   @Override
   public zn<ado> a() {
      return agp.M;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.j;
   }

   public double e() {
      return this.b;
   }

   public double f() {
      return this.c;
   }

   public double g() {
      return this.d;
   }

   public float h() {
      return this.e;
   }

   public float i() {
      return this.f;
   }

   public float j() {
      return this.g;
   }

   public float k() {
      return this.h;
   }

   public int l() {
      return this.i;
   }

   public lm m() {
      return this.k;
   }
}
