import java.util.List;

public abstract class dyq {
   private static final int a = 5;
   private int b;
   private double c;

   protected abstract void a(djx var1, iv var2, ebe var3);

   protected abstract void b(djx var1, iv var2, ebe var3);

   protected abstract void a(djx var1, iv var2, ebe var3, int var4, int var5);

   protected abstract boolean a(crx var1);

   public void a(crx $$0, djx $$1, iv $$2, ebe $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, ege.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
      this.c = Math.max($$0.gL(), this.c);
   }

   public void b(crx $$0, djx $$1, iv $$2, ebe $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, ege.j, $$2);
         this.c = 0.0;
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private List<crx> a(djx $$0, iv $$1) {
      double $$2 = this.c + 4.0;
      ffl $$3 = new ffl($$1).g($$2);
      return $$0.a(efq.a(crx.class), $$3, this::a);
   }

   public void c(djx $$0, iv $$1, ebe $$2) {
      List<crx> $$3 = this.a($$0, $$1);
      this.c = 0.0;

      for (crx $$4 : $$3) {
         this.c = Math.max($$4.gL(), this.c);
      }

      int $$5 = $$3.size();
      int $$6 = this.b;
      if ($$6 != $$5) {
         boolean $$7 = $$5 != 0;
         boolean $$8 = $$6 != 0;
         if ($$7 && !$$8) {
            this.a($$0, $$1, $$2);
            $$0.a(null, ege.k, $$1);
         } else if (!$$7) {
            this.b($$0, $$1, $$2);
            $$0.a(null, ege.j, $$1);
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

   private static void d(djx $$0, iv $$1, ebe $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}
