import java.util.List;

public abstract class dms {
   private static final int a = 5;
   private int b;
   private double c;

   protected abstract void a(cyx var1, ib var2, doz var3);

   protected abstract void b(cyx var1, ib var2, doz var3);

   protected abstract void a(cyx var1, ib var2, doz var3, int var4, int var5);

   protected abstract boolean a(cjt var1);

   public void a(cjt $$0, cyx $$1, ib $$2, doz $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, dts.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
      this.c = Math.max($$0.gz(), this.c);
   }

   public void b(cjt $$0, cyx $$1, ib $$2, doz $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, dts.j, $$2);
         this.c = 0.0;
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private List<cjt> a(cyx $$0, ib $$1) {
      double $$2 = this.c + 4.0;
      erv $$3 = new erv($$1).g($$2);
      return $$0.a(dtg.a(cjt.class), $$3, this::a);
   }

   public void c(cyx $$0, ib $$1, doz $$2) {
      List<cjt> $$3 = this.a($$0, $$1);
      this.c = 0.0;

      for (cjt $$4 : $$3) {
         this.c = Math.max($$4.gz(), this.c);
      }

      int $$5 = $$3.size();
      int $$6 = this.b;
      if ($$6 != $$5) {
         boolean $$7 = $$5 != 0;
         boolean $$8 = $$6 != 0;
         if ($$7 && !$$8) {
            this.a($$0, $$1, $$2);
            $$0.a(null, dts.k, $$1);
         } else if (!$$7) {
            this.b($$0, $$1, $$2);
            $$0.a(null, dts.j, $$1);
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

   private static void d(cyx $$0, ib $$1, doz $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}
