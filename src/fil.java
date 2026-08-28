import java.util.List;

public abstract class fil {
   public final int a;
   public final int b;
   public final int c;
   public final int d;

   public fil(int $$0, int $$1, int $$2, int $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public void a(fob $$0, int $$1, int $$2, int $$3, int $$4) {
      int $$5 = $$1 + this.c;
      int $$6 = $$2 + this.d;
      boolean $$7 = $$3 >= $$5 && $$3 <= $$5 + this.a && $$4 >= $$6 && $$4 <= $$6 + this.b;
      this.a($$0, $$5, $$6, $$7);
   }

   protected abstract void a(fob var1, int var2, int var3, boolean var4);

   public int a() {
      return this.c + this.a;
   }

   public int b() {
      return this.d + this.b;
   }

   public abstract void a(int var1);

   public static void a(fob $$0, List<fil> $$1, foj<?> $$2, int $$3, int $$4, int $$5, int $$6) {
      for (fil $$7 : $$1) {
         if ($$2.a() > $$7.a()) {
            $$7.a($$0, $$3, $$4, $$5, $$6);
         }
      }
   }

   public static void a(foj<?> $$0, fpm.a<?> $$1, List<fil> $$2, int $$3, double $$4, double $$5) {
      int $$6 = $$0.aH_().indexOf($$1);
      if ($$6 > -1) {
         $$0.a($$6);
         int $$7 = $$0.u();
         int $$8 = $$0.d($$6);
         int $$9 = (int)($$4 - (double)$$7);
         int $$10 = (int)($$5 - (double)$$8);

         for (fil $$11 : $$2) {
            if ($$9 >= $$11.c && $$9 <= $$11.a() && $$10 >= $$11.d && $$10 <= $$11.b()) {
               $$11.a($$6);
            }
         }
      }
   }
}
