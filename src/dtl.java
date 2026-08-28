import java.util.List;

public abstract class dtl {
   private static final int a = 5;
   private int b;
   private double c;

   protected abstract void a(dfm var1, jh var2, dvv var3);

   protected abstract void b(dfm var1, jh var2, dvv var3);

   protected abstract void a(dfm var1, jh var2, dvv var3, int var4, int var5);

   protected abstract boolean a(cou var1);

   public void a(cou $$0, dfm $$1, jh $$2, dvv $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, ear.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
      this.c = Math.max($$0.gH(), this.c);
   }

   public void b(cou $$0, dfm $$1, jh $$2, dvv $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, ear.j, $$2);
         this.c = 0.0;
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private List<cou> a(dfm $$0, jh $$1) {
      double $$2 = this.c + 4.0;
      ezt $$3 = new ezt($$1).g($$2);
      return $$0.a(eaf.a(cou.class), $$3, this::a);
   }

   public void c(dfm $$0, jh $$1, dvv $$2) {
      List<cou> $$3 = this.a($$0, $$1);
      this.c = 0.0;

      for (cou $$4 : $$3) {
         this.c = Math.max($$4.gH(), this.c);
      }

      int $$5 = $$3.size();
      int $$6 = this.b;
      if ($$6 != $$5) {
         boolean $$7 = $$5 != 0;
         boolean $$8 = $$6 != 0;
         if ($$7 && !$$8) {
            this.a($$0, $$1, $$2);
            $$0.a(null, ear.k, $$1);
         } else if (!$$7) {
            this.b($$0, $$1, $$2);
            $$0.a(null, ear.j, $$1);
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

   private static void d(dfm $$0, jh $$1, dvv $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}
