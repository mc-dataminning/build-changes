import java.util.List;

public class aaf implements ve<wx> {
   private final int a;
   private final int[] b;

   public aaf(biw $$0) {
      this.a = $$0.ah();
      List<biw> $$1 = $$0.cP();
      this.b = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.b[$$2] = $$1.get($$2).ah();
      }
   }

   public aaf(so $$0) {
      this.a = $$0.n();
      this.b = $$0.c();
   }

   @Override
   public void a(so $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
   }

   public void a(wx $$0) {
      $$0.a(this);
   }

   public int[] a() {
      return this.b;
   }

   public int d() {
      return this.a;
   }
}
