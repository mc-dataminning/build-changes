import java.util.List;

public abstract class fjl {
   public final int a;
   public final int b;
   public final int c;
   public final int d;

   public fjl(int $$0, int $$1, int $$2, int $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public void a(fns $$0, int $$1, int $$2, int $$3, int $$4) {
      int $$5 = $$1 + this.c;
      int $$6 = $$2 + this.d;
      boolean $$7 = $$3 >= $$5 && $$3 <= $$5 + this.a && $$4 >= $$6 && $$4 <= $$6 + this.b;
      this.a($$0, $$5, $$6, $$7);
   }

   protected abstract void a(fns var1, int var2, int var3, boolean var4);

   public int a() {
      return this.c + this.a;
   }

   public int b() {
      return this.d + this.b;
   }

   public abstract void a(int var1);

   public static void a(fns $$0, List<fjl> $$1, foa<?> $$2, int $$3, int $$4, int $$5, int $$6) {
      for (fjl $$7 : $$1) {
         if ($$2.a() > $$7.a()) {
            $$7.a($$0, $$3, $$4, $$5, $$6);
         }
      }
   }

   public static void a(foa<?> $$0, fpc.a<?> $$1, List<fjl> $$2, int $$3, double $$4, double $$5) {
      int $$6 = $$0.aI_().indexOf($$1);
      if ($$6 > -1) {
         $$0.a($$6);
         int $$7 = $$0.s();
         int $$8 = $$0.e($$6);
         int $$9 = (int)($$4 - (double)$$7);
         int $$10 = (int)($$5 - (double)$$8);

         for (fjl $$11 : $$2) {
            if ($$9 >= $$11.c && $$9 <= $$11.a() && $$10 >= $$11.d && $$10 <= $$11.b()) {
               $$11.a($$6);
            }
         }
      }
   }
}
