import java.util.List;

public class afg implements zg<abu> {
   public static final yx<vw, afg> a = zg.a(afg::a, afg::new);
   private final int b;
   private final int[] c;

   public afg(bsr $$0) {
      this.b = $$0.an();
      List<bsr> $$1 = $$0.cS();
      this.c = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c[$$2] = $$1.get($$2).an();
      }
   }

   private afg(vw $$0) {
      this.b = $$0.l();
      this.c = $$0.c();
   }

   private void a(vw $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zi<afg> a() {
      return agg.aJ;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public int[] b() {
      return this.c;
   }

   public int e() {
      return this.b;
   }
}
