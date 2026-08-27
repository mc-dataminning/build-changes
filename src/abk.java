public class abk implements wb<xu> {
   private final ib<aqc> a;
   private final aqe b;
   private final int c;
   private final float d;
   private final float e;
   private final long f;

   public abk(ib<aqc> $$0, aqe $$1, bjt $$2, float $$3, float $$4, long $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.ah();
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public abk(tl $$0) {
      this.a = $$0.a(jy.c.t(), aqc::b);
      this.b = $$0.b(aqe.class);
      this.c = $$0.n();
      this.d = $$0.readFloat();
      this.e = $$0.readFloat();
      this.f = $$0.readLong();
   }

   @Override
   public void a(tl $$0) {
      $$0.a(jy.c.t(), this.a, ($$0x, $$1) -> $$1.a($$0x));
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.b(this.f);
   }

   public ib<aqc> a() {
      return this.a;
   }

   public aqe d() {
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

   public void a(xu $$0) {
      $$0.a(this);
   }
}
