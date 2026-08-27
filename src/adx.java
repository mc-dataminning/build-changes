import java.util.List;

public class adx implements yb<aam> {
   public static final xs<uu, adx> a = yb.a(adx::a, adx::new);
   private final int b;
   private final int[] c;

   public adx(box $$0) {
      this.b = $$0.aj();
      List<box> $$1 = $$0.cP();
      this.c = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c[$$2] = $$1.get($$2).aj();
      }
   }

   private adx(uu $$0) {
      this.b = $$0.l();
      this.c = $$0.c();
   }

   private void a(uu $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public yd<adx> a() {
      return aex.aJ;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public int[] b() {
      return this.c;
   }

   public int e() {
      return this.b;
   }
}
