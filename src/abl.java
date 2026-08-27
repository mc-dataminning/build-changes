import java.util.List;

public class abl implements wk<yd> {
   private final int a;
   private final int[] b;

   public abl(bkq $$0) {
      this.a = $$0.aj();
      List<bkq> $$1 = $$0.cQ();
      this.b = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.b[$$2] = $$1.get($$2).aj();
      }
   }

   public abl(tu $$0) {
      this.a = $$0.n();
      this.b = $$0.c();
   }

   @Override
   public void a(tu $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
   }

   public void a(yd $$0) {
      $$0.a(this);
   }

   public int[] a() {
      return this.b;
   }

   public int d() {
      return this.a;
   }
}
