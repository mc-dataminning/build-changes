import java.util.List;

public class abp implements wo<yh> {
   private final int a;
   private final int[] b;

   public abp(bkv $$0) {
      this.a = $$0.aj();
      List<bkv> $$1 = $$0.cQ();
      this.b = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.b[$$2] = $$1.get($$2).aj();
      }
   }

   public abp(ty $$0) {
      this.a = $$0.n();
      this.b = $$0.c();
   }

   @Override
   public void a(ty $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
   }

   public void a(yh $$0) {
      $$0.a(this);
   }

   public int[] a() {
      return this.b;
   }

   public int d() {
      return this.a;
   }
}
