import java.util.List;

public class afy implements zr<acg> {
   public static final zi<wh, afy> a = zr.a(afy::a, afy::new);
   private final int b;
   private final int[] c;

   public afy(bvb $$0) {
      this.b = $$0.ar();
      List<bvb> $$1 = $$0.cZ();
      this.c = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c[$$2] = $$1.get($$2).ar();
      }
   }

   private afy(wh $$0) {
      this.b = $$0.l();
      this.c = $$0.c();
   }

   private void a(wh $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zt<afy> a() {
      return agz.aN;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }

   public int[] b() {
      return this.c;
   }

   public int e() {
      return this.b;
   }
}
