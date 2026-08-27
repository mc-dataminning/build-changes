public class aaf implements uo<zb> {
   private static final int a = 1;
   private static final int b = 2;
   private final float c;
   private final float d;
   private final boolean e;
   private final boolean f;

   public aaf(float $$0, float $$1, boolean $$2, boolean $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public aaf(sf $$0) {
      this.c = $$0.readFloat();
      this.d = $$0.readFloat();
      byte $$1 = $$0.readByte();
      this.e = ($$1 & 1) > 0;
      this.f = ($$1 & 2) > 0;
   }

   @Override
   public void a(sf $$0) {
      $$0.writeFloat(this.c);
      $$0.writeFloat(this.d);
      byte $$1 = 0;
      if (this.e) {
         $$1 = (byte)($$1 | 1);
      }

      if (this.f) {
         $$1 = (byte)($$1 | 2);
      }

      $$0.writeByte($$1);
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public float a() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }
}
