import java.util.List;

public abstract class dps {
   private static final int a = 5;
   private int b;
   private double c;

   protected abstract void a(dbw var1, iz var2, dsa var3);

   protected abstract void b(dbw var1, iz var2, dsa var3);

   protected abstract void a(dbw var1, iz var2, dsa var3, int var4, int var5);

   protected abstract boolean a(cmv var1);

   public void a(cmv $$0, dbw $$1, iz $$2, dsa $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, dwt.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
      this.c = Math.max($$0.gC(), this.c);
   }

   public void b(cmv $$0, dbw $$1, iz $$2, dsa $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, dwt.j, $$2);
         this.c = 0.0;
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private List<cmv> a(dbw $$0, iz $$1) {
      double $$2 = this.c + 4.0;
      evk $$3 = new evk($$1).g($$2);
      return $$0.a(dwh.a(cmv.class), $$3, this::a);
   }

   public void c(dbw $$0, iz $$1, dsa $$2) {
      List<cmv> $$3 = this.a($$0, $$1);
      this.c = 0.0;

      for (cmv $$4 : $$3) {
         this.c = Math.max($$4.gC(), this.c);
      }

      int $$5 = $$3.size();
      int $$6 = this.b;
      if ($$6 != $$5) {
         boolean $$7 = $$5 != 0;
         boolean $$8 = $$6 != 0;
         if ($$7 && !$$8) {
            this.a($$0, $$1, $$2);
            $$0.a(null, dwt.k, $$1);
         } else if (!$$7) {
            this.b($$0, $$1, $$2);
            $$0.a(null, dwt.j, $$1);
         }

         this.b = $$5;
      }

      this.a($$0, $$1, $$2, $$6, $$5);
      if ($$5 > 0) {
         d($$0, $$1, $$2);
      }
   }

   public int a() {
      return this.b;
   }

   private static void d(dbw $$0, iz $$1, dsa $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}
