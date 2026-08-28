public class edl {
   public final bac a;
   private double b;
   private boolean c;

   public edl(bac $$0) {
      this.a = $$0;
   }

   public void a() {
      this.c = false;
   }

   public double b() {
      if (this.c) {
         this.c = false;
         return this.b;
      } else {
         double $$0;
         double $$1;
         double $$2;
         do {
            $$0 = 2.0 * this.a.j() - 1.0;
            $$1 = 2.0 * this.a.j() - 1.0;
            $$2 = azu.k($$0) + azu.k($$1);
         } while ($$2 >= 1.0 || $$2 == 0.0);

         double $$3 = Math.sqrt(-2.0 * Math.log($$2) / $$2);
         this.b = $$1 * $$3;
         this.c = true;
         return $$0 * $$3;
      }
   }
}
