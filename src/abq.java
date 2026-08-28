public class abq implements zb<abn> {
   public static final ys<vr, abq> a = zb.a(abq::a, abq::new);
   public static final int b = 0;
   public static final int c = 2;
   public static final int d = 3;
   public static final int e = 4;
   public static final int f = 5;
   private final int g;
   private final int h;

   public abq(bsh $$0, int $$1) {
      this.g = $$0.an();
      this.h = $$1;
   }

   private abq(vr $$0) {
      this.g = $$0.l();
      this.h = $$0.readUnsignedByte();
   }

   private void a(vr $$0) {
      $$0.c(this.g);
      $$0.k(this.h);
   }

   @Override
   public zd<abq> a() {
      return afz.e;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.g;
   }

   public int e() {
      return this.h;
   }
}
