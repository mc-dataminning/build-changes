import java.util.List;

public class aev implements yz<abk> {
   public static final yq<vs, aev> a = yz.a(aev::a, aev::new);
   private final int b;
   private final int[] c;

   public aev(bql $$0) {
      this.b = $$0.aj();
      List<bql> $$1 = $$0.cQ();
      this.c = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c[$$2] = $$1.get($$2).aj();
      }
   }

   private aev(vs $$0) {
      this.b = $$0.l();
      this.c = $$0.c();
   }

   private void a(vs $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zb<aev> a() {
      return afv.aJ;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public int[] b() {
      return this.c;
   }

   public int e() {
      return this.b;
   }
}
