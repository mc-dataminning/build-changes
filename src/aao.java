public class aao implements vf<wy> {
   private final hg<ape> a;
   private final apg b;
   private final int c;
   private final float d;
   private final float e;
   private final long f;

   public aao(hg<ape> $$0, apg $$1, bis $$2, float $$3, float $$4, long $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.ah();
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public aao(sq $$0) {
      this.a = $$0.a(jd.c.t(), ape::b);
      this.b = $$0.b(apg.class);
      this.c = $$0.m();
      this.d = $$0.readFloat();
      this.e = $$0.readFloat();
      this.f = $$0.readLong();
   }

   @Override
   public void a(sq $$0) {
      $$0.a(jd.c.t(), this.a, ($$0x, $$1) -> $$1.a($$0x));
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.b(this.f);
   }

   public hg<ape> a() {
      return this.a;
   }

   public apg d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public float f() {
      return this.d;
   }

   public float g() {
      return this.e;
   }

   public long h() {
      return this.f;
   }

   public void a(wy $$0) {
      $$0.a(this);
   }
}
