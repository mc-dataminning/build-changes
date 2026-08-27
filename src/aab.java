import java.util.List;

public class aab implements va<ws> {
   private final int a;
   private final int[] b;

   public aab(bil $$0) {
      this.a = $$0.ah();
      List<bil> $$1 = $$0.cP();
      this.b = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.b[$$2] = $$1.get($$2).ah();
      }
   }

   public aab(sl $$0) {
      this.a = $$0.m();
      this.b = $$0.c();
   }

   @Override
   public void a(sl $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
   }

   public void a(ws $$0) {
      $$0.a(this);
   }

   public int[] a() {
      return this.b;
   }

   public int d() {
      return this.a;
   }
}
