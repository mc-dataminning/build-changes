public class aan implements ve<wx> {
   private final hg<apd> a;
   private final apf b;
   private final int c;
   private final float d;
   private final float e;
   private final long f;

   public aan(hg<apd> $$0, apf $$1, biq $$2, float $$3, float $$4, long $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.ah();
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public aan(sp $$0) {
      this.a = $$0.a(jd.c.t(), apd::b);
      this.b = $$0.b(apf.class);
      this.c = $$0.m();
      this.d = $$0.readFloat();
      this.e = $$0.readFloat();
      this.f = $$0.readLong();
   }

   @Override
   public void a(sp $$0) {
      $$0.a(jd.c.t(), this.a, ($$0x, $$1) -> $$1.a($$0x));
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.b(this.f);
   }

   public hg<apd> a() {
      return this.a;
   }

   public apf d() {
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

   public void a(wx $$0) {
      $$0.a(this);
   }
}
