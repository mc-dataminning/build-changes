import java.util.List;

public abstract class dsi {
   private static final int a = 5;
   private int b;
   private double c;

   protected abstract void a(dej var1, jf var2, dus var3);

   protected abstract void b(dej var1, jf var2, dus var3);

   protected abstract void a(dej var1, jf var2, dus var3, int var4, int var5);

   protected abstract boolean a(cnx var1);

   public void a(cnx $$0, dej $$1, jf $$2, dus $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, dzp.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
      this.c = Math.max($$0.gD(), this.c);
   }

   public void b(cnx $$0, dej $$1, jf $$2, dus $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, dzp.j, $$2);
         this.c = 0.0;
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private List<cnx> a(dej $$0, jf $$1) {
      double $$2 = this.c + 4.0;
      eyr $$3 = new eyr($$1).g($$2);
      return $$0.a(dzd.a(cnx.class), $$3, this::a);
   }

   public void c(dej $$0, jf $$1, dus $$2) {
      List<cnx> $$3 = this.a($$0, $$1);
      this.c = 0.0;

      for (cnx $$4 : $$3) {
         this.c = Math.max($$4.gD(), this.c);
      }

      int $$5 = $$3.size();
      int $$6 = this.b;
      if ($$6 != $$5) {
         boolean $$7 = $$5 != 0;
         boolean $$8 = $$6 != 0;
         if ($$7 && !$$8) {
            this.a($$0, $$1, $$2);
            $$0.a(null, dzp.k, $$1);
         } else if (!$$7) {
            this.b($$0, $$1, $$2);
            $$0.a(null, dzp.j, $$1);
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

   private static void d(dej $$0, jf $$1, dus $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}
