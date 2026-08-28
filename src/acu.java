public class acu implements aac<acr> {
   public static final zt<ws, acu> a = aac.a(acu::a, acu::new);
   public static final int b = 0;
   public static final int c = 2;
   public static final int d = 3;
   public static final int e = 4;
   public static final int f = 5;
   private final int g;
   private final int h;

   public acu(bvf $$0, int $$1) {
      this.g = $$0.ar();
      this.h = $$1;
   }

   private acu(ws $$0) {
      this.g = $$0.l();
      this.h = $$0.readUnsignedByte();
   }

   private void a(ws $$0) {
      $$0.c(this.g);
      $$0.l(this.h);
   }

   @Override
   public aae<acu> a() {
      return ahk.e;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.g;
   }

   public int e() {
      return this.h;
   }
}
