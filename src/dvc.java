import java.util.List;

public abstract class dvc {
   private static final int a = 5;
   private int b;
   private double c;

   protected abstract void a(dha var1, jh var2, dxn var3);

   protected abstract void b(dha var1, jh var2, dxn var3);

   protected abstract void a(dha var1, jh var2, dxn var3, int var4, int var5);

   protected abstract boolean a(cps var1);

   public void a(cps $$0, dha $$1, jh $$2, dxn $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, ecj.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
      this.c = Math.max($$0.gH(), this.c);
   }

   public void b(cps $$0, dha $$1, jh $$2, dxn $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, ecj.j, $$2);
         this.c = 0.0;
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private List<cps> a(dha $$0, jh $$1) {
      double $$2 = this.c + 4.0;
      fbn $$3 = new fbn($$1).g($$2);
      return $$0.a(ebx.a(cps.class), $$3, this::a);
   }

   public void c(dha $$0, jh $$1, dxn $$2) {
      List<cps> $$3 = this.a($$0, $$1);
      this.c = 0.0;

      for (cps $$4 : $$3) {
         this.c = Math.max($$4.gH(), this.c);
      }

      int $$5 = $$3.size();
      int $$6 = this.b;
      if ($$6 != $$5) {
         boolean $$7 = $$5 != 0;
         boolean $$8 = $$6 != 0;
         if ($$7 && !$$8) {
            this.a($$0, $$1, $$2);
            $$0.a(null, ecj.k, $$1);
         } else if (!$$7) {
            this.b($$0, $$1, $$2);
            $$0.a(null, ecj.j, $$1);
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

   private static void d(dha $$0, jh $$1, dxn $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}
