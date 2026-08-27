import java.util.List;

public abstract class dnb {
   private static final int a = 5;
   private int b;
   private double c;

   protected abstract void a(czg var1, id var2, dpi var3);

   protected abstract void b(czg var1, id var2, dpi var3);

   protected abstract void a(czg var1, id var2, dpi var3, int var4, int var5);

   protected abstract boolean a(cka var1);

   public void a(cka $$0, czg $$1, id $$2, dpi $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, dub.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
      this.c = Math.max($$0.gz(), this.c);
   }

   public void b(cka $$0, czg $$1, id $$2, dpi $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, dub.j, $$2);
         this.c = 0.0;
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private List<cka> a(czg $$0, id $$1) {
      double $$2 = this.c + 4.0;
      ese $$3 = new ese($$1).g($$2);
      return $$0.a(dtp.a(cka.class), $$3, this::a);
   }

   public void c(czg $$0, id $$1, dpi $$2) {
      List<cka> $$3 = this.a($$0, $$1);
      this.c = 0.0;

      for (cka $$4 : $$3) {
         this.c = Math.max($$4.gz(), this.c);
      }

      int $$5 = $$3.size();
      int $$6 = this.b;
      if ($$6 != $$5) {
         boolean $$7 = $$5 != 0;
         boolean $$8 = $$6 != 0;
         if ($$7 && !$$8) {
            this.a($$0, $$1, $$2);
            $$0.a(null, dub.k, $$1);
         } else if (!$$7) {
            this.b($$0, $$1, $$2);
            $$0.a(null, dub.j, $$1);
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

   private static void d(czg $$0, id $$1, dpi $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}
