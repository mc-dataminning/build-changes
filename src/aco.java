public class aco implements xd<yx> {
   private final ih<arl> a;
   private final arn b;
   private final int c;
   private final float d;
   private final float e;
   private final long f;

   public aco(ih<arl> $$0, arn $$1, blp $$2, float $$3, float $$4, long $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.aj();
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public aco(ug $$0) {
      this.a = $$0.a(kd.b.t(), arl::b);
      this.b = $$0.b(arn.class);
      this.c = $$0.n();
      this.d = $$0.readFloat();
      this.e = $$0.readFloat();
      this.f = $$0.readLong();
   }

   @Override
   public void a(ug $$0) {
      $$0.a(kd.b.t(), this.a, ($$0x, $$1) -> $$1.a($$0x));
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.b(this.f);
   }

   public ih<arl> a() {
      return this.a;
   }

   public arn d() {
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

   public void a(yx $$0) {
      $$0.a(this);
   }
}
