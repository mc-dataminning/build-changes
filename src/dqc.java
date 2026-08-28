import java.util.List;

public abstract class dqc {
   private static final int a = 5;
   private int b;
   private double c;

   protected abstract void a(dcf var1, ja var2, dsk var3);

   protected abstract void b(dcf var1, ja var2, dsk var3);

   protected abstract void a(dcf var1, ja var2, dsk var3, int var4, int var5);

   protected abstract boolean a(cmk var1);

   public void a(cmk $$0, dcf $$1, ja $$2, dsk $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, dxg.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
      this.c = Math.max($$0.gz(), this.c);
   }

   public void b(cmk $$0, dcf $$1, ja $$2, dsk $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, dxg.j, $$2);
         this.c = 0.0;
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private List<cmk> a(dcf $$0, ja $$1) {
      double $$2 = this.c + 4.0;
      ewa $$3 = new ewa($$1).g($$2);
      return $$0.a(dwu.a(cmk.class), $$3, this::a);
   }

   public void c(dcf $$0, ja $$1, dsk $$2) {
      List<cmk> $$3 = this.a($$0, $$1);
      this.c = 0.0;

      for (cmk $$4 : $$3) {
         this.c = Math.max($$4.gz(), this.c);
      }

      int $$5 = $$3.size();
      int $$6 = this.b;
      if ($$6 != $$5) {
         boolean $$7 = $$5 != 0;
         boolean $$8 = $$6 != 0;
         if ($$7 && !$$8) {
            this.a($$0, $$1, $$2);
            $$0.a(null, dxg.k, $$1);
         } else if (!$$7) {
            this.b($$0, $$1, $$2);
            $$0.a(null, dxg.j, $$1);
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

   private static void d(dcf $$0, ja $$1, dsk $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}
