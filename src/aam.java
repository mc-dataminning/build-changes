public class aam implements vd<ww> {
   private final he<apc> a;
   private final ape b;
   private final int c;
   private final float d;
   private final float e;
   private final long f;

   public aam(he<apc> $$0, ape $$1, biq $$2, float $$3, float $$4, long $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.ah();
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public aam(so $$0) {
      this.a = $$0.a(jb.c.t(), apc::b);
      this.b = $$0.b(ape.class);
      this.c = $$0.m();
      this.d = $$0.readFloat();
      this.e = $$0.readFloat();
      this.f = $$0.readLong();
   }

   @Override
   public void a(so $$0) {
      $$0.a(jb.c.t(), this.a, ($$0x, $$1) -> $$1.a($$0x));
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.b(this.f);
   }

   public he<apc> a() {
      return this.a;
   }

   public ape d() {
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

   public void a(ww $$0) {
      $$0.a(this);
   }
}
