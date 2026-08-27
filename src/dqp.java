import java.util.List;

public abstract class dqp {
   private static final int a = 5;
   private int b;
   private double c;

   protected abstract void a(dca var1, ir var2, dtc var3);

   protected abstract void b(dca var1, ir var2, dtc var3);

   protected abstract void a(dca var1, ir var2, dtc var3, int var4, int var5);

   protected abstract boolean a(cly var1);

   public void a(cly $$0, dca $$1, ir $$2, dtc $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, dxv.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
      this.c = Math.max($$0.gN(), this.c);
   }

   public void b(cly $$0, dca $$1, ir $$2, dtc $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, dxv.j, $$2);
         this.c = 0.0;
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private List<cly> a(dca $$0, ir $$1) {
      double $$2 = this.c + 4.0;
      ewp $$3 = new ewp($$1).g($$2);
      return $$0.a(dxj.a(cly.class), $$3, this::a);
   }

   public void c(dca $$0, ir $$1, dtc $$2) {
      List<cly> $$3 = this.a($$0, $$1);
      this.c = 0.0;

      for (cly $$4 : $$3) {
         this.c = Math.max($$4.gN(), this.c);
      }

      int $$5 = $$3.size();
      int $$6 = this.b;
      if ($$6 != $$5) {
         boolean $$7 = $$5 != 0;
         boolean $$8 = $$6 != 0;
         if ($$7 && !$$8) {
            this.a($$0, $$1, $$2);
            $$0.a(null, dxv.k, $$1);
         } else if (!$$7) {
            this.b($$0, $$1, $$2);
            $$0.a(null, dxv.j, $$1);
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

   private static void d(dca $$0, ir $$1, dtc $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}
