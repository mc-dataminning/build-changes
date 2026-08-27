public class aaa implements wu<yo> {
   private final double a;
   private final double b;
   private final double c;
   private final float d;
   private final float e;
   private final float f;
   private final float g;
   private final int h;
   private final boolean i;
   private final jt j;

   public <T extends jt> aaa(T $$0, boolean $$1, double $$2, double $$3, double $$4, float $$5, float $$6, float $$7, float $$8, int $$9) {
      this.j = $$0;
      this.i = $$1;
      this.a = $$2;
      this.b = $$3;
      this.c = $$4;
      this.d = $$5;
      this.e = $$6;
      this.f = $$7;
      this.g = $$8;
      this.h = $$9;
   }

   public aaa(ue $$0) {
      ju<?> $$1 = $$0.a(kb.j);
      this.i = $$0.readBoolean();
      this.a = $$0.readDouble();
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readFloat();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
      this.g = $$0.readFloat();
      this.h = $$0.readInt();
      this.j = this.a($$0, (ju<jt>)$$1);
   }

   private <T extends jt> T a(ue $$0, ju<T> $$1) {
      return $$1.d().b($$1, $$0);
   }

   @Override
   public void a(ue $$0) {
      $$0.a(kb.j, this.j.b());
      $$0.a(this.i);
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.p(this.h);
      this.j.a($$0);
   }

   public boolean a() {
      return this.i;
   }

   public double d() {
      return this.a;
   }

   public double e() {
      return this.b;
   }

   public double f() {
      return this.c;
   }

   public float g() {
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

   public int k() {
      return this.h;
   }

   public jt l() {
      return this.j;
   }

   public void a(yo $$0) {
      $$0.a(this);
   }
}
