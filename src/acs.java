public class acs implements xg<zb> {
   private final ih<ars> a;
   private final aru b;
   private final int c;
   private final float d;
   private final float e;
   private final long f;

   public acs(ih<ars> $$0, aru $$1, blw $$2, float $$3, float $$4, long $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.aj();
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public acs(uj $$0) {
      this.a = $$0.a(kd.b.t(), ars::b);
      this.b = $$0.b(aru.class);
      this.c = $$0.n();
      this.d = $$0.readFloat();
      this.e = $$0.readFloat();
      this.f = $$0.readLong();
   }

   @Override
   public void a(uj $$0) {
      $$0.a(kd.b.t(), this.a, ($$0x, $$1) -> $$1.a($$0x));
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.b(this.f);
   }

   public ih<ars> a() {
      return this.a;
   }

   public aru d() {
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

   public void a(zb $$0) {
      $$0.a(this);
   }
}
