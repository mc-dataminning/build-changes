import java.util.List;

public abstract class dya {
   private static final int a = 5;
   private int b;
   private double c;

   protected abstract void a(djh var1, iv var2, eao var3);

   protected abstract void b(djh var1, iv var2, eao var3);

   protected abstract void a(djh var1, iv var2, eao var3, int var4, int var5);

   protected abstract boolean a(crj var1);

   public void a(crj $$0, djh $$1, iv $$2, eao $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, efo.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
      this.c = Math.max($$0.gK(), this.c);
   }

   public void b(crj $$0, djh $$1, iv $$2, eao $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, efo.j, $$2);
         this.c = 0.0;
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private List<crj> a(djh $$0, iv $$1) {
      double $$2 = this.c + 4.0;
      fes $$3 = new fes($$1).g($$2);
      return $$0.a(efa.a(crj.class), $$3, this::a);
   }

   public void c(djh $$0, iv $$1, eao $$2) {
      List<crj> $$3 = this.a($$0, $$1);
      this.c = 0.0;

      for (crj $$4 : $$3) {
         this.c = Math.max($$4.gK(), this.c);
      }

      int $$5 = $$3.size();
      int $$6 = this.b;
      if ($$6 != $$5) {
         boolean $$7 = $$5 != 0;
         boolean $$8 = $$6 != 0;
         if ($$7 && !$$8) {
            this.a($$0, $$1, $$2);
            $$0.a(null, efo.k, $$1);
         } else if (!$$7) {
            this.b($$0, $$1, $$2);
            $$0.a(null, efo.j, $$1);
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

   private static void d(djh $$0, iv $$1, eao $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}
