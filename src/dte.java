import java.util.List;

public abstract class dte {
   private static final int a = 5;
   private int b;
   private double c;

   protected abstract void a(dff var1, jh var2, dvo var3);

   protected abstract void b(dff var1, jh var2, dvo var3);

   protected abstract void a(dff var1, jh var2, dvo var3, int var4, int var5);

   protected abstract boolean a(cor var1);

   public void a(cor $$0, dff $$1, jh $$2, dvo $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, eak.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
      this.c = Math.max($$0.gM(), this.c);
   }

   public void b(cor $$0, dff $$1, jh $$2, dvo $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, eak.j, $$2);
         this.c = 0.0;
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private List<cor> a(dff $$0, jh $$1) {
      double $$2 = this.c + 4.0;
      ezm $$3 = new ezm($$1).g($$2);
      return $$0.a(dzy.a(cor.class), $$3, this::a);
   }

   public void c(dff $$0, jh $$1, dvo $$2) {
      List<cor> $$3 = this.a($$0, $$1);
      this.c = 0.0;

      for (cor $$4 : $$3) {
         this.c = Math.max($$4.gM(), this.c);
      }

      int $$5 = $$3.size();
      int $$6 = this.b;
      if ($$6 != $$5) {
         boolean $$7 = $$5 != 0;
         boolean $$8 = $$6 != 0;
         if ($$7 && !$$8) {
            this.a($$0, $$1, $$2);
            $$0.a(null, eak.k, $$1);
         } else if (!$$7) {
            this.b($$0, $$1, $$2);
            $$0.a(null, eak.j, $$1);
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

   private static void d(dff $$0, jh $$1, dvo $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}
