public class acg implements zo<acd> {
   public static final zf<we, acg> a = zo.a(acg::a, acg::new);
   public static final int b = 0;
   public static final int c = 2;
   public static final int d = 3;
   public static final int e = 4;
   public static final int f = 5;
   private final int g;
   private final int h;

   public acg(btz $$0, int $$1) {
      this.g = $$0.ar();
      this.h = $$1;
   }

   private acg(we $$0) {
      this.g = $$0.l();
      this.h = $$0.readUnsignedByte();
   }

   private void a(we $$0) {
      $$0.c(this.g);
      $$0.l(this.h);
   }

   @Override
   public zq<acg> a() {
      return ags.e;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.g;
   }

   public int e() {
      return this.h;
   }
}
