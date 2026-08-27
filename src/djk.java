import java.util.List;

public abstract class djk {
   private static final int a = 5;
   private int b;
   private double c;

   protected abstract void a(cvr var1, hz var2, dlj var3);

   protected abstract void b(cvr var1, hz var2, dlj var3);

   protected abstract void a(cvr var1, hz var2, dlj var3, int var4, int var5);

   protected abstract boolean a(chl var1);

   public void a(chl $$0, cvr $$1, hz $$2, dlj $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, dpw.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
      this.c = Math.max($$0.gt(), this.c);
   }

   public void b(chl $$0, cvr $$1, hz $$2, dlj $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, dpw.j, $$2);
         this.c = 0.0;
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private List<chl> a(cvr $$0, hz $$1) {
      double $$2 = this.c + 4.0;
      enu $$3 = new enu($$1).g($$2);
      return $$0.a(dpk.a(chl.class), $$3, this::a);
   }

   public void c(cvr $$0, hz $$1, dlj $$2) {
      List<chl> $$3 = this.a($$0, $$1);
      this.c = 0.0;

      for (chl $$4 : $$3) {
         this.c = Math.max($$4.gt(), this.c);
      }

      int $$5 = $$3.size();
      int $$6 = this.b;
      if ($$6 != $$5) {
         boolean $$7 = $$5 != 0;
         boolean $$8 = $$6 != 0;
         if ($$7 && !$$8) {
            this.a($$0, $$1, $$2);
            $$0.a(null, dpw.k, $$1);
         } else if (!$$7) {
            this.b($$0, $$1, $$2);
            $$0.a(null, dpw.j, $$1);
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

   private static void d(cvr $$0, hz $$1, dlj $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}
