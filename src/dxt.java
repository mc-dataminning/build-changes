import java.util.List;

public abstract class dxt {
   private static final int a = 5;
   private int b;
   private double c;

   protected abstract void a(dja var1, iu var2, eah var3);

   protected abstract void b(dja var1, iu var2, eah var3);

   protected abstract void a(dja var1, iu var2, eah var3, int var4, int var5);

   protected abstract boolean a(crc var1);

   public void a(crc $$0, dja $$1, iu $$2, eah $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, efh.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
      this.c = Math.max($$0.gL(), this.c);
   }

   public void b(crc $$0, dja $$1, iu $$2, eah $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, efh.j, $$2);
         this.c = 0.0;
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private List<crc> a(dja $$0, iu $$1) {
      double $$2 = this.c + 4.0;
      fel $$3 = new fel($$1).g($$2);
      return $$0.a(eet.a(crc.class), $$3, this::a);
   }

   public void c(dja $$0, iu $$1, eah $$2) {
      List<crc> $$3 = this.a($$0, $$1);
      this.c = 0.0;

      for (crc $$4 : $$3) {
         this.c = Math.max($$4.gL(), this.c);
      }

      int $$5 = $$3.size();
      int $$6 = this.b;
      if ($$6 != $$5) {
         boolean $$7 = $$5 != 0;
         boolean $$8 = $$6 != 0;
         if ($$7 && !$$8) {
            this.a($$0, $$1, $$2);
            $$0.a(null, efh.k, $$1);
         } else if (!$$7) {
            this.b($$0, $$1, $$2);
            $$0.a(null, efh.j, $$1);
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

   private static void d(dja $$0, iu $$1, eah $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}
