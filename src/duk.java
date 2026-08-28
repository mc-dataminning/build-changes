import java.util.List;

public abstract class duk {
   private static final int a = 5;
   private int b;
   private double c;

   protected abstract void a(dgg var1, ji var2, dwv var3);

   protected abstract void b(dgg var1, ji var2, dwv var3);

   protected abstract void a(dgg var1, ji var2, dwv var3, int var4, int var5);

   protected abstract boolean a(cov var1);

   public void a(cov $$0, dgg $$1, ji $$2, dwv $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, ebr.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
      this.c = Math.max($$0.gL(), this.c);
   }

   public void b(cov $$0, dgg $$1, ji $$2, dwv $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, ebr.j, $$2);
         this.c = 0.0;
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private List<cov> a(dgg $$0, ji $$1) {
      double $$2 = this.c + 4.0;
      fat $$3 = new fat($$1).g($$2);
      return $$0.a(ebf.a(cov.class), $$3, this::a);
   }

   public void c(dgg $$0, ji $$1, dwv $$2) {
      List<cov> $$3 = this.a($$0, $$1);
      this.c = 0.0;

      for (cov $$4 : $$3) {
         this.c = Math.max($$4.gL(), this.c);
      }

      int $$5 = $$3.size();
      int $$6 = this.b;
      if ($$6 != $$5) {
         boolean $$7 = $$5 != 0;
         boolean $$8 = $$6 != 0;
         if ($$7 && !$$8) {
            this.a($$0, $$1, $$2);
            $$0.a(null, ebr.k, $$1);
         } else if (!$$7) {
            this.b($$0, $$1, $$2);
            $$0.a(null, ebr.j, $$1);
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

   private static void d(dgg $$0, ji $$1, dwv $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}
