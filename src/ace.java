public class ace implements va<aaz> {
   private static final int a = 1;
   private static final int b = 2;
   private final float c;
   private final float d;
   private final boolean e;
   private final boolean f;

   public ace(float $$0, float $$1, boolean $$2, boolean $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public ace(sl $$0) {
      this.c = $$0.readFloat();
      this.d = $$0.readFloat();
      byte $$1 = $$0.readByte();
      this.e = ($$1 & 1) > 0;
      this.f = ($$1 & 2) > 0;
   }

   @Override
   public void a(sl $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      byte $$1 = 0;
      if (this.e) {
         $$1 = (byte)($$1 | 1);
      }

      if (this.f) {
         $$1 = (byte)($$1 | 2);
      }

      $$0.k($$1);
   }

   public void a(aaz $$0) {
      $$0.a(this);
   }

   public float a() {
      return this.c;
   }

   public float d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public boolean f() {
      return this.f;
   }
}
