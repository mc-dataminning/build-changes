import java.util.List;

public class asr {
   private int a;
   private int b;

   public boolean a(int $$0) {
      return this.b >= this.b($$0);
   }

   public boolean a(int $$0, List<aox> $$1) {
      int $$2 = (int)$$1.stream().filter(chl::fW).count();
      return $$2 >= this.b($$0);
   }

   public int b(int $$0) {
      return Math.max(1, awi.f((float)(this.a * $$0) / 100.0F));
   }

   public void a() {
      this.b = 0;
   }

   public int b() {
      return this.b;
   }

   public boolean a(List<aox> $$0) {
      int $$1 = this.a;
      int $$2 = this.b;
      this.a = 0;
      this.b = 0;

      for (aox $$3 : $$0) {
         if (!$$3.P_()) {
            this.a++;
            if ($$3.fD()) {
               this.b++;
            }
         }
      }

      return ($$2 > 0 || this.b > 0) && ($$1 != this.a || $$2 != this.b);
   }
}
