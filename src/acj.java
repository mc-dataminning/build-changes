public class acj implements zr<acg> {
   public static final zi<wh, acj> a = zr.a(acj::a, acj::new);
   public static final int b = 0;
   public static final int c = 2;
   public static final int d = 3;
   public static final int e = 4;
   public static final int f = 5;
   private final int g;
   private final int h;

   public acj(bvb $$0, int $$1) {
      this.g = $$0.ar();
      this.h = $$1;
   }

   private acj(wh $$0) {
      this.g = $$0.l();
      this.h = $$0.readUnsignedByte();
   }

   private void a(wh $$0) {
      $$0.c(this.g);
      $$0.l(this.h);
   }

   @Override
   public zt<acj> a() {
      return agz.e;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.g;
   }

   public int e() {
      return this.h;
   }
}
