import java.util.EnumSet;

public class bwl extends bvu {
   private static final bzn b = bzn.b().a(6.0);
   public static final int a = 400;
   private final cay c;
   private chn d;
   private int e;

   public bwl(cay $$0) {
      this.c = $$0;
      this.a(EnumSet.of(bvu.a.a, bvu.a.b));
   }

   @Override
   public boolean a() {
      if (!this.c.dJ().P()) {
         return false;
      } else if (this.c.ef().a(8000) != 0) {
         return false;
      } else {
         this.d = this.c.dJ().a(chn.class, b, this.c, this.c.do(), this.c.dq(), this.c.du(), this.c.cE().c(6.0, 2.0, 6.0));
         return this.d != null;
      }
   }

   @Override
   public boolean b() {
      return this.e > 0;
   }

   @Override
   public void c() {
      this.e = this.a(400);
      this.c.w(true);
   }

   @Override
   public void d() {
      this.c.w(false);
      this.d = null;
   }

   @Override
   public void e() {
      this.c.I().a(this.d, 30.0F, 30.0F);
      this.e--;
   }
}
