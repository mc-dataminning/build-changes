public class adv implements zv<ach> {
   public static final zm<wz, adv> a = zv.a(adv::a, adv::new);
   private final double b;
   private final double c;
   private final double d;
   private final float e;
   private final float f;
   private final float g;
   private final float h;
   private final int i;
   private final boolean j;
   private final lg k;

   public <T extends lg> adv(T $$0, boolean $$1, double $$2, double $$3, double $$4, float $$5, float $$6, float $$7, float $$8, int $$9) {
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

   private adv(wz $$0) {
      this.j = $$0.readBoolean();
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
      this.g = $$0.readFloat();
      this.h = $$0.readFloat();
      this.i = $$0.readInt();
      this.k = li.bg.decode($$0);
   }

   private void a(wz $$0) {
      $$0.a(this.j);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.p(this.i);
      li.bg.encode($$0, this.k);
   }

   @Override
   public zx<adv> a() {
      return agt.M;
   }

   public void a(ach $$0) {
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

   public lg m() {
      return this.k;
   }
}
