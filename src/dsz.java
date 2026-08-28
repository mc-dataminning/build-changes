import java.util.List;

public abstract class dsz {
   private static final int a = 5;
   private int b;
   private double c;

   protected abstract void a(dfb var1, jh var2, dvj var3);

   protected abstract void b(dfb var1, jh var2, dvj var3);

   protected abstract void a(dfb var1, jh var2, dvj var3, int var4, int var5);

   protected abstract boolean a(com var1);

   public void a(com $$0, dfb $$1, jh $$2, dvj $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, eag.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
      this.c = Math.max($$0.gK(), this.c);
   }

   public void b(com $$0, dfb $$1, jh $$2, dvj $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, eag.j, $$2);
         this.c = 0.0;
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private List<com> a(dfb $$0, jh $$1) {
      double $$2 = this.c + 4.0;
      ezi $$3 = new ezi($$1).g($$2);
      return $$0.a(dzu.a(com.class), $$3, this::a);
   }

   public void c(dfb $$0, jh $$1, dvj $$2) {
      List<com> $$3 = this.a($$0, $$1);
      this.c = 0.0;

      for (com $$4 : $$3) {
         this.c = Math.max($$4.gK(), this.c);
      }

      int $$5 = $$3.size();
      int $$6 = this.b;
      if ($$6 != $$5) {
         boolean $$7 = $$5 != 0;
         boolean $$8 = $$6 != 0;
         if ($$7 && !$$8) {
            this.a($$0, $$1, $$2);
            $$0.a(null, eag.k, $$1);
         } else if (!$$7) {
            this.b($$0, $$1, $$2);
            $$0.a(null, eag.j, $$1);
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

   private static void d(dfb $$0, jh $$1, dvj $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}
