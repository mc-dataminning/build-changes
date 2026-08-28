import java.util.List;

public abstract class dqd {
   private static final int a = 5;
   private int b;
   private double c;

   protected abstract void a(dcg var1, ja var2, dsl var3);

   protected abstract void b(dcg var1, ja var2, dsl var3);

   protected abstract void a(dcg var1, ja var2, dsl var3, int var4, int var5);

   protected abstract boolean a(cml var1);

   public void a(cml $$0, dcg $$1, ja $$2, dsl $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, dxh.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
      this.c = Math.max($$0.gA(), this.c);
   }

   public void b(cml $$0, dcg $$1, ja $$2, dsl $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, dxh.j, $$2);
         this.c = 0.0;
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private List<cml> a(dcg $$0, ja $$1) {
      double $$2 = this.c + 4.0;
      ewc $$3 = new ewc($$1).g($$2);
      return $$0.a(dwv.a(cml.class), $$3, this::a);
   }

   public void c(dcg $$0, ja $$1, dsl $$2) {
      List<cml> $$3 = this.a($$0, $$1);
      this.c = 0.0;

      for (cml $$4 : $$3) {
         this.c = Math.max($$4.gA(), this.c);
      }

      int $$5 = $$3.size();
      int $$6 = this.b;
      if ($$6 != $$5) {
         boolean $$7 = $$5 != 0;
         boolean $$8 = $$6 != 0;
         if ($$7 && !$$8) {
            this.a($$0, $$1, $$2);
            $$0.a(null, dxh.k, $$1);
         } else if (!$$7) {
            this.b($$0, $$1, $$2);
            $$0.a(null, dxh.j, $$1);
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

   private static void d(dcg $$0, ja $$1, dsl $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}
