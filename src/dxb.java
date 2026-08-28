import java.util.List;

public abstract class dxb {
   private static final int a = 5;
   private int b;
   private double c;

   protected abstract void a(dip var1, iu var2, dzo var3);

   protected abstract void b(dip var1, iu var2, dzo var3);

   protected abstract void a(dip var1, iu var2, dzo var3, int var4, int var5);

   protected abstract boolean a(cqs var1);

   public void a(cqs $$0, dip $$1, iu $$2, dzo $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, eeo.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
      this.c = Math.max($$0.gK(), this.c);
   }

   public void b(cqs $$0, dip $$1, iu $$2, dzo $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, eeo.j, $$2);
         this.c = 0.0;
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private List<cqs> a(dip $$0, iu $$1) {
      double $$2 = this.c + 4.0;
      fdr $$3 = new fdr($$1).g($$2);
      return $$0.a(eea.a(cqs.class), $$3, this::a);
   }

   public void c(dip $$0, iu $$1, dzo $$2) {
      List<cqs> $$3 = this.a($$0, $$1);
      this.c = 0.0;

      for (cqs $$4 : $$3) {
         this.c = Math.max($$4.gK(), this.c);
      }

      int $$5 = $$3.size();
      int $$6 = this.b;
      if ($$6 != $$5) {
         boolean $$7 = $$5 != 0;
         boolean $$8 = $$6 != 0;
         if ($$7 && !$$8) {
            this.a($$0, $$1, $$2);
            $$0.a(null, eeo.k, $$1);
         } else if (!$$7) {
            this.b($$0, $$1, $$2);
            $$0.a(null, eeo.j, $$1);
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

   private static void d(dip $$0, iu $$1, dzo $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}
