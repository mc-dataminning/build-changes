public class ach implements zs<ace> {
   public static final zj<wl, ach> a = zs.a(ach::a, ach::new);
   public static final int b = 0;
   public static final int c = 2;
   public static final int d = 3;
   public static final int e = 4;
   public static final int f = 5;
   private final int g;
   private final int h;

   public ach(bsp $$0, int $$1) {
      this.g = $$0.al();
      this.h = $$1;
   }

   private ach(wl $$0) {
      this.g = $$0.l();
      this.h = $$0.readUnsignedByte();
   }

   private void a(wl $$0) {
      $$0.c(this.g);
      $$0.k(this.h);
   }

   @Override
   public zu<ach> a() {
      return agq.e;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.g;
   }

   public int e() {
      return this.h;
   }
}
