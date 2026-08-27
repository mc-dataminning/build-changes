import java.util.List;

public abstract class djg {
   private static final int a = 5;
   private int b;
   private double c;

   protected abstract void a(cvn var1, hz var2, dlf var3);

   protected abstract void b(cvn var1, hz var2, dlf var3);

   protected abstract void a(cvn var1, hz var2, dlf var3, int var4, int var5);

   protected abstract boolean a(chh var1);

   public void a(chh $$0, cvn $$1, hz $$2, dlf $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, dpp.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
      this.c = Math.max($$0.gt(), this.c);
   }

   public void b(chh $$0, cvn $$1, hz $$2, dlf $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, dpp.j, $$2);
         this.c = 0.0;
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private List<chh> a(cvn $$0, hz $$1) {
      double $$2 = this.c + 4.0;
      enn $$3 = new enn($$1).g($$2);
      return $$0.a(dpd.a(chh.class), $$3, this::a);
   }

   public void c(cvn $$0, hz $$1, dlf $$2) {
      List<chh> $$3 = this.a($$0, $$1);
      this.c = 0.0;

      for (chh $$4 : $$3) {
         this.c = Math.max($$4.gt(), this.c);
      }

      int $$5 = $$3.size();
      int $$6 = this.b;
      if ($$6 != $$5) {
         boolean $$7 = $$5 != 0;
         boolean $$8 = $$6 != 0;
         if ($$7 && !$$8) {
            this.a($$0, $$1, $$2);
            $$0.a(null, dpp.k, $$1);
         } else if (!$$7) {
            this.b($$0, $$1, $$2);
            $$0.a(null, dpp.j, $$1);
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

   private static void d(cvn $$0, hz $$1, dlf $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}
