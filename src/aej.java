import java.util.List;

public class aej implements yn<aay> {
   public static final ye<vg, aej> a = yn.a(aej::a, aej::new);
   private final int b;
   private final int[] c;

   public aej(bpv $$0) {
      this.b = $$0.aj();
      List<bpv> $$1 = $$0.cP();
      this.c = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c[$$2] = $$1.get($$2).aj();
      }
   }

   private aej(vg $$0) {
      this.b = $$0.l();
      this.c = $$0.c();
   }

   private void a(vg $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public yp<aej> a() {
      return afj.aJ;
   }

   public void a(aay $$0) {
      $$0.a(this);
   }

   public int[] b() {
      return this.c;
   }

   public int e() {
      return this.b;
   }
}
