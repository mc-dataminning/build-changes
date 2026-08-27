public class abp implements zb<abm> {
   public static final ys<vu, abp> a = zb.a(abp::a, abp::new);
   public static final int b = 0;
   public static final int c = 2;
   public static final int d = 3;
   public static final int e = 4;
   public static final int f = 5;
   private final int g;
   private final int h;

   public abp(brh $$0, int $$1) {
      this.g = $$0.aj();
      this.h = $$1;
   }

   private abp(vu $$0) {
      this.g = $$0.l();
      this.h = $$0.readUnsignedByte();
   }

   private void a(vu $$0) {
      $$0.c(this.g);
      $$0.k(this.h);
   }

   @Override
   public zd<abp> a() {
      return afx.e;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.g;
   }

   public int e() {
      return this.h;
   }
}
