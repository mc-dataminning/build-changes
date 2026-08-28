import java.util.List;

public abstract class dsf {
   private static final int a = 5;
   private int b;
   private double c;

   protected abstract void a(deg var1, je var2, duo var3);

   protected abstract void b(deg var1, je var2, duo var3);

   protected abstract void a(deg var1, je var2, duo var3, int var4, int var5);

   protected abstract boolean a(cnu var1);

   public void a(cnu $$0, deg $$1, je $$2, duo $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, dzl.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
      this.c = Math.max($$0.gC(), this.c);
   }

   public void b(cnu $$0, deg $$1, je $$2, duo $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, dzl.j, $$2);
         this.c = 0.0;
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private List<cnu> a(deg $$0, je $$1) {
      double $$2 = this.c + 4.0;
      eyn $$3 = new eyn($$1).g($$2);
      return $$0.a(dyz.a(cnu.class), $$3, this::a);
   }

   public void c(deg $$0, je $$1, duo $$2) {
      List<cnu> $$3 = this.a($$0, $$1);
      this.c = 0.0;

      for (cnu $$4 : $$3) {
         this.c = Math.max($$4.gC(), this.c);
      }

      int $$5 = $$3.size();
      int $$6 = this.b;
      if ($$6 != $$5) {
         boolean $$7 = $$5 != 0;
         boolean $$8 = $$6 != 0;
         if ($$7 && !$$8) {
            this.a($$0, $$1, $$2);
            $$0.a(null, dzl.k, $$1);
         } else if (!$$7) {
            this.b($$0, $$1, $$2);
            $$0.a(null, dzl.j, $$1);
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

   private static void d(deg $$0, je $$1, duo $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}
