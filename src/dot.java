import java.util.List;

public abstract class dot {
   private static final int a = 5;
   private int b;
   private double c;

   protected abstract void a(dax var1, io var2, drb var3);

   protected abstract void b(dax var1, io var2, drb var3);

   protected abstract void a(dax var1, io var2, drb var3, int var4, int var5);

   protected abstract boolean a(clw var1);

   public void a(clw $$0, dax $$1, io $$2, drb $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, dvu.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
      this.c = Math.max($$0.gC(), this.c);
   }

   public void b(clw $$0, dax $$1, io $$2, drb $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, dvu.j, $$2);
         this.c = 0.0;
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private List<clw> a(dax $$0, io $$1) {
      double $$2 = this.c + 4.0;
      euf $$3 = new euf($$1).g($$2);
      return $$0.a(dvi.a(clw.class), $$3, this::a);
   }

   public void c(dax $$0, io $$1, drb $$2) {
      List<clw> $$3 = this.a($$0, $$1);
      this.c = 0.0;

      for (clw $$4 : $$3) {
         this.c = Math.max($$4.gC(), this.c);
      }

      int $$5 = $$3.size();
      int $$6 = this.b;
      if ($$6 != $$5) {
         boolean $$7 = $$5 != 0;
         boolean $$8 = $$6 != 0;
         if ($$7 && !$$8) {
            this.a($$0, $$1, $$2);
            $$0.a(null, dvu.k, $$1);
         } else if (!$$7) {
            this.b($$0, $$1, $$2);
            $$0.a(null, dvu.j, $$1);
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

   private static void d(dax $$0, io $$1, drb $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}
