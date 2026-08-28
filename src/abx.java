public class abx implements zg<abu> {
   public static final yx<vw, abx> a = zg.a(abx::a, abx::new);
   public static final int b = 0;
   public static final int c = 2;
   public static final int d = 3;
   public static final int e = 4;
   public static final int f = 5;
   private final int g;
   private final int h;

   public abx(bsr $$0, int $$1) {
      this.g = $$0.an();
      this.h = $$1;
   }

   private abx(vw $$0) {
      this.g = $$0.l();
      this.h = $$0.readUnsignedByte();
   }

   private void a(vw $$0) {
      $$0.c(this.g);
      $$0.k(this.h);
   }

   @Override
   public zi<abx> a() {
      return agg.e;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.g;
   }

   public int e() {
      return this.h;
   }
}
