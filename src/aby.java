public class aby implements wo<yh> {
   public static final float a = 8.0F;
   private final ig<aqu> b;
   private final aqw c;
   private final int d;
   private final int e;
   private final int f;
   private final float g;
   private final float h;
   private final long i;

   public aby(ig<aqu> $$0, aqw $$1, double $$2, double $$3, double $$4, float $$5, float $$6, long $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = (int)($$2 * 8.0);
      this.e = (int)($$3 * 8.0);
      this.f = (int)($$4 * 8.0);
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public aby(ty $$0) {
      this.b = $$0.a(kc.c.t(), aqu::b);
      this.c = $$0.b(aqw.class);
      this.d = $$0.readInt();
      this.e = $$0.readInt();
      this.f = $$0.readInt();
      this.g = $$0.readFloat();
      this.h = $$0.readFloat();
      this.i = $$0.readLong();
   }

   @Override
   public void a(ty $$0) {
      $$0.a(kc.c.t(), this.b, ($$0x, $$1) -> $$1.a($$0x));
      $$0.a(this.c);
      $$0.p(this.d);
      $$0.p(this.e);
      $$0.p(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.b(this.i);
   }

   public ig<aqu> a() {
      return this.b;
   }

   public aqw d() {
      return this.c;
   }

   public double e() {
      return (double)((float)this.d / 8.0F);
   }

   public double f() {
      return (double)((float)this.e / 8.0F);
   }

   public double g() {
      return (double)((float)this.f / 8.0F);
   }

   public float h() {
      return this.g;
   }

   public float i() {
      return this.h;
   }

   public long j() {
      return this.i;
   }

   public void a(yh $$0) {
      $$0.a(this);
   }
}
