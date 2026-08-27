public class aag implements ux<wp> {
   private final he<aov> a;
   private final aox b;
   private final int c;
   private final float d;
   private final float e;
   private final long f;

   public aag(he<aov> $$0, aox $$1, bii $$2, float $$3, float $$4, long $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.ah();
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public aag(si $$0) {
      this.a = $$0.a(jb.c.t(), aov::b);
      this.b = $$0.b(aox.class);
      this.c = $$0.m();
      this.d = $$0.readFloat();
      this.e = $$0.readFloat();
      this.f = $$0.readLong();
   }

   @Override
   public void a(si $$0) {
      $$0.a(jb.c.t(), this.a, ($$0x, $$1) -> $$1.a($$0x));
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.b(this.f);
   }

   public he<aov> a() {
      return this.a;
   }

   public aox d() {
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

   public void a(wp $$0) {
      $$0.a(this);
   }
}
