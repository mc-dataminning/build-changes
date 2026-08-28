import java.util.List;

public abstract class dun {
   private static final int a = 5;
   private int b;
   private double c;

   protected abstract void a(dgj var1, ji var2, dwy var3);

   protected abstract void b(dgj var1, ji var2, dwy var3);

   protected abstract void a(dgj var1, ji var2, dwy var3, int var4, int var5);

   protected abstract boolean a(coy var1);

   public void a(coy $$0, dgj $$1, ji $$2, dwy $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, ebu.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
      this.c = Math.max($$0.gL(), this.c);
   }

   public void b(coy $$0, dgj $$1, ji $$2, dwy $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, ebu.j, $$2);
         this.c = 0.0;
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private List<coy> a(dgj $$0, ji $$1) {
      double $$2 = this.c + 4.0;
      faw $$3 = new faw($$1).g($$2);
      return $$0.a(ebi.a(coy.class), $$3, this::a);
   }

   public void c(dgj $$0, ji $$1, dwy $$2) {
      List<coy> $$3 = this.a($$0, $$1);
      this.c = 0.0;

      for (coy $$4 : $$3) {
         this.c = Math.max($$4.gL(), this.c);
      }

      int $$5 = $$3.size();
      int $$6 = this.b;
      if ($$6 != $$5) {
         boolean $$7 = $$5 != 0;
         boolean $$8 = $$6 != 0;
         if ($$7 && !$$8) {
            this.a($$0, $$1, $$2);
            $$0.a(null, ebu.k, $$1);
         } else if (!$$7) {
            this.b($$0, $$1, $$2);
            $$0.a(null, ebu.j, $$1);
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

   private static void d(dgj $$0, ji $$1, dwy $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}
