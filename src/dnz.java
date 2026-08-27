import java.util.List;

public abstract class dnz {
   private static final int a = 5;
   private int b;
   private double c;

   protected abstract void a(dad var1, in var2, dqh var3);

   protected abstract void b(dad var1, in var2, dqh var3);

   protected abstract void a(dad var1, in var2, dqh var3, int var4, int var5);

   protected abstract boolean a(clh var1);

   public void a(clh $$0, dad $$1, in $$2, dqh $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, dva.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
      this.c = Math.max($$0.gA(), this.c);
   }

   public void b(clh $$0, dad $$1, in $$2, dqh $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, dva.j, $$2);
         this.c = 0.0;
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private List<clh> a(dad $$0, in $$1) {
      double $$2 = this.c + 4.0;
      etk $$3 = new etk($$1).g($$2);
      return $$0.a(duo.a(clh.class), $$3, this::a);
   }

   public void c(dad $$0, in $$1, dqh $$2) {
      List<clh> $$3 = this.a($$0, $$1);
      this.c = 0.0;

      for (clh $$4 : $$3) {
         this.c = Math.max($$4.gA(), this.c);
      }

      int $$5 = $$3.size();
      int $$6 = this.b;
      if ($$6 != $$5) {
         boolean $$7 = $$5 != 0;
         boolean $$8 = $$6 != 0;
         if ($$7 && !$$8) {
            this.a($$0, $$1, $$2);
            $$0.a(null, dva.k, $$1);
         } else if (!$$7) {
            this.b($$0, $$1, $$2);
            $$0.a(null, dva.j, $$1);
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

   private static void d(dad $$0, in $$1, dqh $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}
