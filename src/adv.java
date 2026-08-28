public class adv implements zr<acg> {
   public static final zi<wv, adv> a = zr.a(adv::a, adv::new);
   private final double b;
   private final double c;
   private final double d;
   private final float e;
   private final float f;
   private final float g;
   private final float h;
   private final int i;
   private final boolean j;
   private final boolean k;
   private final lq l;

   public <T extends lq> adv(T $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, float $$6, float $$7, float $$8, float $$9, int $$10) {
      this.l = $$0;
      this.j = $$1;
      this.k = $$2;
      this.b = $$3;
      this.c = $$4;
      this.d = $$5;
      this.e = $$6;
      this.f = $$7;
      this.g = $$8;
      this.h = $$9;
      this.i = $$10;
   }

   private adv(wv $$0) {
      this.j = $$0.readBoolean();
      this.k = $$0.readBoolean();
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
      this.g = $$0.readFloat();
      this.h = $$0.readFloat();
      this.i = $$0.readInt();
      this.l = ls.bj.decode($$0);
   }

   private void a(wv $$0) {
      $$0.a(this.j);
      $$0.a(this.k);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.q(this.i);
      ls.bj.encode($$0, this.l);
   }

   @Override
   public zt<adv> a() {
      return agz.M;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.j;
   }

   public boolean e() {
      return this.k;
   }

   public double f() {
      return this.b;
   }

   public double g() {
      return this.c;
   }

   public double h() {
      return this.d;
   }

   public float i() {
      return this.e;
   }

   public float j() {
      return this.f;
   }

   public float k() {
      return this.g;
   }

   public float l() {
      return this.h;
   }

   public int m() {
      return this.i;
   }

   public lq n() {
      return this.l;
   }
}
