import java.util.List;

public abstract class dvk {
   private static final int a = 5;
   private int b;
   private double c;

   protected abstract void a(dhi var1, jh var2, dxv var3);

   protected abstract void b(dhi var1, jh var2, dxv var3);

   protected abstract void a(dhi var1, jh var2, dxv var3, int var4, int var5);

   protected abstract boolean a(cpx var1);

   public void a(cpx $$0, dhi $$1, jh $$2, dxv $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, ecr.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
      this.c = Math.max($$0.gJ(), this.c);
   }

   public void b(cpx $$0, dhi $$1, jh $$2, dxv $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, ecr.j, $$2);
         this.c = 0.0;
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private List<cpx> a(dhi $$0, jh $$1) {
      double $$2 = this.c + 4.0;
      fbt $$3 = new fbt($$1).g($$2);
      return $$0.a(ecf.a(cpx.class), $$3, this::a);
   }

   public void c(dhi $$0, jh $$1, dxv $$2) {
      List<cpx> $$3 = this.a($$0, $$1);
      this.c = 0.0;

      for (cpx $$4 : $$3) {
         this.c = Math.max($$4.gJ(), this.c);
      }

      int $$5 = $$3.size();
      int $$6 = this.b;
      if ($$6 != $$5) {
         boolean $$7 = $$5 != 0;
         boolean $$8 = $$6 != 0;
         if ($$7 && !$$8) {
            this.a($$0, $$1, $$2);
            $$0.a(null, ecr.k, $$1);
         } else if (!$$7) {
            this.b($$0, $$1, $$2);
            $$0.a(null, ecr.j, $$1);
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

   private static void d(dhi $$0, jh $$1, dxv $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}
