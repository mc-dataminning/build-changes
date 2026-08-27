import java.util.List;

public class abw implements wu<yo> {
   private final int a;
   private final int[] b;

   public abw(blf $$0) {
      this.a = $$0.aj();
      List<blf> $$1 = $$0.cP();
      this.b = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.b[$$2] = $$1.get($$2).aj();
      }
   }

   public abw(ue $$0) {
      this.a = $$0.n();
      this.b = $$0.c();
   }

   @Override
   public void a(ue $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
   }

   public void a(yo $$0) {
      $$0.a(this);
   }

   public int[] a() {
      return this.b;
   }

   public int d() {
      return this.a;
   }
}
