import java.util.List;

public class afc implements yv<abk> {
   public static final ym<vl, afc> a = yv.a(afc::a, afc::new);
   private final int b;
   private final int[] c;

   public afc(buj $$0) {
      this.b = $$0.ar();
      List<buj> $$1 = $$0.cZ();
      this.c = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c[$$2] = $$1.get($$2).ar();
      }
   }

   private afc(vl $$0) {
      this.b = $$0.l();
      this.c = $$0.c();
   }

   private void a(vl $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public yx<afc> a() {
      return agd.aN;
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
