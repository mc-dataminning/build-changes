public class ach implements zo<acf> {
   public static final ze<vy, ach> a = zo.a(ach::a, ach::new);
   public static final int b = 0;
   public static final int c = 2;
   public static final int d = 3;
   public static final int e = 4;
   public static final int f = 5;
   private final int g;
   private final int h;

   public ach(bxe $$0, int $$1) {
      this.g = $$0.ao();
      this.h = $$1;
   }

   private ach(vy $$0) {
      this.g = $$0.l();
      this.h = $$0.readUnsignedByte();
   }

   private void a(vy $$0) {
      $$0.c(this.g);
      $$0.l(this.h);
   }

   @Override
   public zq<ach> a() {
      return agy.d;
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
