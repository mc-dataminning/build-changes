import java.util.List;

public abstract class dst {
   private static final int a = 5;
   private int b;
   private double c;

   protected abstract void a(dev var1, jg var2, dvd var3);

   protected abstract void b(dev var1, jg var2, dvd var3);

   protected abstract void a(dev var1, jg var2, dvd var3, int var4, int var5);

   protected abstract boolean a(coh var1);

   public void a(coh $$0, dev $$1, jg $$2, dvd $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, eaa.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
      this.c = Math.max($$0.gK(), this.c);
   }

   public void b(coh $$0, dev $$1, jg $$2, dvd $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, eaa.j, $$2);
         this.c = 0.0;
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private List<coh> a(dev $$0, jg $$1) {
      double $$2 = this.c + 4.0;
      ezc $$3 = new ezc($$1).g($$2);
      return $$0.a(dzo.a(coh.class), $$3, this::a);
   }

   public void c(dev $$0, jg $$1, dvd $$2) {
      List<coh> $$3 = this.a($$0, $$1);
      this.c = 0.0;

      for (coh $$4 : $$3) {
         this.c = Math.max($$4.gK(), this.c);
      }

      int $$5 = $$3.size();
      int $$6 = this.b;
      if ($$6 != $$5) {
         boolean $$7 = $$5 != 0;
         boolean $$8 = $$6 != 0;
         if ($$7 && !$$8) {
            this.a($$0, $$1, $$2);
            $$0.a(null, eaa.k, $$1);
         } else if (!$$7) {
            this.b($$0, $$1, $$2);
            $$0.a(null, eaa.j, $$1);
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

   private static void d(dev $$0, jg $$1, dvd $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}
