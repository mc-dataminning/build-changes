public class abx implements wo<yh> {
   private final ig<aqu> a;
   private final aqw b;
   private final int c;
   private final float d;
   private final float e;
   private final long f;

   public abx(ig<aqu> $$0, aqw $$1, bkv $$2, float $$3, float $$4, long $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.aj();
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public abx(ty $$0) {
      this.a = $$0.a(kc.c.t(), aqu::b);
      this.b = $$0.b(aqw.class);
      this.c = $$0.n();
      this.d = $$0.readFloat();
      this.e = $$0.readFloat();
      this.f = $$0.readLong();
   }

   @Override
   public void a(ty $$0) {
      $$0.a(kc.c.t(), this.a, ($$0x, $$1) -> $$1.a($$0x));
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.b(this.f);
   }

   public ig<aqu> a() {
      return this.a;
   }

   public aqw d() {
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

   public void a(yh $$0) {
      $$0.a(this);
   }
}
