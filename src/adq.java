import java.util.List;

public class adq implements xx<aag> {
   public static final xo<uq, adq> a = xx.a(adq::a, adq::new);
   private final int b;
   private final int[] c;

   public adq(bno $$0) {
      this.b = $$0.aj();
      List<bno> $$1 = $$0.cP();
      this.c = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c[$$2] = $$1.get($$2).aj();
      }
   }

   private adq(uq $$0) {
      this.b = $$0.n();
      this.c = $$0.c();
   }

   private void a(uq $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public xz<adq> a() {
      return aeq.aI;
   }

   public void a(aag $$0) {
      $$0.a(this);
   }

   public int[] b() {
      return this.c;
   }

   public int e() {
      return this.b;
   }
}
