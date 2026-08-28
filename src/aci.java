public class aci implements zq<acf> {
   public static final zh<wg, aci> a = zq.a(aci::a, aci::new);
   public static final int b = 0;
   public static final int c = 2;
   public static final int d = 3;
   public static final int e = 4;
   public static final int f = 5;
   private final int g;
   private final int h;

   public aci(bul $$0, int $$1) {
      this.g = $$0.ar();
      this.h = $$1;
   }

   private aci(wg $$0) {
      this.g = $$0.l();
      this.h = $$0.readUnsignedByte();
   }

   private void a(wg $$0) {
      $$0.c(this.g);
      $$0.l(this.h);
   }

   @Override
   public zs<aci> a() {
      return agu.e;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.g;
   }

   public int e() {
      return this.h;
   }
}
