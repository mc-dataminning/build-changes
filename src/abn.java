public class abn implements yv<abk> {
   public static final ym<vl, abn> a = yv.a(abn::a, abn::new);
   public static final int b = 0;
   public static final int c = 2;
   public static final int d = 3;
   public static final int e = 4;
   public static final int f = 5;
   private final int g;
   private final int h;

   public abn(buk $$0, int $$1) {
      this.g = $$0.ar();
      this.h = $$1;
   }

   private abn(vl $$0) {
      this.g = $$0.l();
      this.h = $$0.readUnsignedByte();
   }

   private void a(vl $$0) {
      $$0.c(this.g);
      $$0.l(this.h);
   }

   @Override
   public yx<abn> a() {
      return agd.e;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.g;
   }

   public int e() {
      return this.h;
   }
}
