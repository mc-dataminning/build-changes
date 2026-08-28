import java.util.List;

public abstract class dqa {
   private static final int a = 5;
   private int b;
   private double c;

   protected abstract void a(dcd var1, ja var2, dsh var3);

   protected abstract void b(dcd var1, ja var2, dsh var3);

   protected abstract void a(dcd var1, ja var2, dsh var3, int var4, int var5);

   protected abstract boolean a(cmh var1);

   public void a(cmh $$0, dcd $$1, ja $$2, dsh $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, dxa.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
      this.c = Math.max($$0.gy(), this.c);
   }

   public void b(cmh $$0, dcd $$1, ja $$2, dsh $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, dxa.j, $$2);
         this.c = 0.0;
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private List<cmh> a(dcd $$0, ja $$1) {
      double $$2 = this.c + 4.0;
      evu $$3 = new evu($$1).g($$2);
      return $$0.a(dwo.a(cmh.class), $$3, this::a);
   }

   public void c(dcd $$0, ja $$1, dsh $$2) {
      List<cmh> $$3 = this.a($$0, $$1);
      this.c = 0.0;

      for (cmh $$4 : $$3) {
         this.c = Math.max($$4.gy(), this.c);
      }

      int $$5 = $$3.size();
      int $$6 = this.b;
      if ($$6 != $$5) {
         boolean $$7 = $$5 != 0;
         boolean $$8 = $$6 != 0;
         if ($$7 && !$$8) {
            this.a($$0, $$1, $$2);
            $$0.a(null, dxa.k, $$1);
         } else if (!$$7) {
            this.b($$0, $$1, $$2);
            $$0.a(null, dxa.j, $$1);
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

   private static void d(dcd $$0, ja $$1, dsh $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}
