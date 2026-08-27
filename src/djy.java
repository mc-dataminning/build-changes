import java.util.List;

public abstract class djy {
   private static final int a = 5;
   private int b;
   private double c;

   protected abstract void a(cwe var1, ib var2, dme var3);

   protected abstract void b(cwe var1, ib var2, dme var3);

   protected abstract void a(cwe var1, ib var2, dme var3, int var4, int var5);

   protected abstract boolean a(cia var1);

   public void a(cia $$0, cwe $$1, ib $$2, dme $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, dqr.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
      this.c = Math.max($$0.gv(), this.c);
   }

   public void b(cia $$0, cwe $$1, ib $$2, dme $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, dqr.j, $$2);
         this.c = 0.0;
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private List<cia> a(cwe $$0, ib $$1) {
      double $$2 = this.c + 4.0;
      eoq $$3 = new eoq($$1).g($$2);
      return $$0.a(dqf.a(cia.class), $$3, this::a);
   }

   public void c(cwe $$0, ib $$1, dme $$2) {
      List<cia> $$3 = this.a($$0, $$1);
      this.c = 0.0;

      for (cia $$4 : $$3) {
         this.c = Math.max($$4.gv(), this.c);
      }

      int $$5 = $$3.size();
      int $$6 = this.b;
      if ($$6 != $$5) {
         boolean $$7 = $$5 != 0;
         boolean $$8 = $$6 != 0;
         if ($$7 && !$$8) {
            this.a($$0, $$1, $$2);
            $$0.a(null, dqr.k, $$1);
         } else if (!$$7) {
            this.b($$0, $$1, $$2);
            $$0.a(null, dqr.j, $$1);
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

   private static void d(cwe $$0, ib $$1, dme $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}
