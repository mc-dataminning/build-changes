import java.util.List;

public class aaf implements vd<ww> {
   private final int a;
   private final int[] b;

   public aaf(biq $$0) {
      this.a = $$0.ai();
      List<biq> $$1 = $$0.cQ();
      this.b = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.b[$$2] = $$1.get($$2).ai();
      }
   }

   public aaf(so $$0) {
      this.a = $$0.m();
      this.b = $$0.c();
   }

   @Override
   public void a(so $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
   }

   public void a(ww $$0) {
      $$0.a(this);
   }

   public int[] a() {
      return this.b;
   }

   public int d() {
      return this.a;
   }
}
