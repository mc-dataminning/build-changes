import java.util.List;

public abstract class dvj {
   private static final int a = 5;
   private int b;
   private double c;

   protected abstract void a(dhh var1, jh var2, dxu var3);

   protected abstract void b(dhh var1, jh var2, dxu var3);

   protected abstract void a(dhh var1, jh var2, dxu var3, int var4, int var5);

   protected abstract boolean a(cpw var1);

   public void a(cpw $$0, dhh $$1, jh $$2, dxu $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, ecq.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
      this.c = Math.max($$0.gJ(), this.c);
   }

   public void b(cpw $$0, dhh $$1, jh $$2, dxu $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, ecq.j, $$2);
         this.c = 0.0;
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private List<cpw> a(dhh $$0, jh $$1) {
      double $$2 = this.c + 4.0;
      fbs $$3 = new fbs($$1).g($$2);
      return $$0.a(ece.a(cpw.class), $$3, this::a);
   }

   public void c(dhh $$0, jh $$1, dxu $$2) {
      List<cpw> $$3 = this.a($$0, $$1);
      this.c = 0.0;

      for (cpw $$4 : $$3) {
         this.c = Math.max($$4.gJ(), this.c);
      }

      int $$5 = $$3.size();
      int $$6 = this.b;
      if ($$6 != $$5) {
         boolean $$7 = $$5 != 0;
         boolean $$8 = $$6 != 0;
         if ($$7 && !$$8) {
            this.a($$0, $$1, $$2);
            $$0.a(null, ecq.k, $$1);
         } else if (!$$7) {
            this.b($$0, $$1, $$2);
            $$0.a(null, ecq.j, $$1);
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

   private static void d(dhh $$0, jh $$1, dxu $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}
