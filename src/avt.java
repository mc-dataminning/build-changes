import java.util.List;

public class avt {
   private int a;
   private int b;

   public boolean a(int $$0) {
      return this.b >= this.b($$0);
   }

   public boolean a(int $$0, List<arr> $$1) {
      int $$2 = (int)$$1.stream().filter(crm::gn).count();
      return $$2 >= this.b($$0);
   }

   public int b(int $$0) {
      return Math.max(1, azm.f((float)(this.a * $$0) / 100.0F));
   }

   public void a() {
      this.b = 0;
   }

   public int b() {
      return this.b;
   }

   public boolean a(List<arr> $$0) {
      int $$1 = this.a;
      int $$2 = this.b;
      this.a = 0;
      this.b = 0;

      for (arr $$3 : $$0) {
         if (!$$3.V_()) {
            this.a++;
            if ($$3.fQ()) {
               this.b++;
            }
         }
      }

      return ($$2 > 0 || this.b > 0) && ($$1 != this.a || $$2 != this.b);
   }
}
