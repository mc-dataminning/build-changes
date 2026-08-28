import java.util.List;

public abstract class dvf {
   private static final int a = 5;
   private int b;
   private double c;

   protected abstract void a(dgz var1, ji var2, dxq var3);

   protected abstract void b(dgz var1, ji var2, dxq var3);

   protected abstract void a(dgz var1, ji var2, dxq var3, int var4, int var5);

   protected abstract boolean a(cpr var1);

   public void a(cpr $$0, dgz $$1, ji $$2, dxq $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, ecp.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
      this.c = Math.max($$0.gN(), this.c);
   }

   public void b(cpr $$0, dgz $$1, ji $$2, dxq $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, ecp.j, $$2);
         this.c = 0.0;
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private List<cpr> a(dgz $$0, ji $$1) {
      double $$2 = this.c + 4.0;
      fbs $$3 = new fbs($$1).g($$2);
      return $$0.a(ecb.a(cpr.class), $$3, this::a);
   }

   public void c(dgz $$0, ji $$1, dxq $$2) {
      List<cpr> $$3 = this.a($$0, $$1);
      this.c = 0.0;

      for (cpr $$4 : $$3) {
         this.c = Math.max($$4.gN(), this.c);
      }

      int $$5 = $$3.size();
      int $$6 = this.b;
      if ($$6 != $$5) {
         boolean $$7 = $$5 != 0;
         boolean $$8 = $$6 != 0;
         if ($$7 && !$$8) {
            this.a($$0, $$1, $$2);
            $$0.a(null, ecp.k, $$1);
         } else if (!$$7) {
            this.b($$0, $$1, $$2);
            $$0.a(null, ecp.j, $$1);
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

   private static void d(dgz $$0, ji $$1, dxq $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}
