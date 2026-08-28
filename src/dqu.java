import java.util.List;

public abstract class dqu {
   private static final int a = 5;
   private int b;
   private double c;

   protected abstract void a(dcw var1, jd var2, dtc var3);

   protected abstract void b(dcw var1, jd var2, dtc var3);

   protected abstract void a(dcw var1, jd var2, dtc var3, int var4, int var5);

   protected abstract boolean a(cmx var1);

   public void a(cmx $$0, dcw $$1, jd $$2, dtc $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, dxz.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
      this.c = Math.max($$0.gy(), this.c);
   }

   public void b(cmx $$0, dcw $$1, jd $$2, dtc $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, dxz.j, $$2);
         this.c = 0.0;
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private List<cmx> a(dcw $$0, jd $$1) {
      double $$2 = this.c + 4.0;
      ewx $$3 = new ewx($$1).g($$2);
      return $$0.a(dxn.a(cmx.class), $$3, this::a);
   }

   public void c(dcw $$0, jd $$1, dtc $$2) {
      List<cmx> $$3 = this.a($$0, $$1);
      this.c = 0.0;

      for (cmx $$4 : $$3) {
         this.c = Math.max($$4.gy(), this.c);
      }

      int $$5 = $$3.size();
      int $$6 = this.b;
      if ($$6 != $$5) {
         boolean $$7 = $$5 != 0;
         boolean $$8 = $$6 != 0;
         if ($$7 && !$$8) {
            this.a($$0, $$1, $$2);
            $$0.a(null, dxz.k, $$1);
         } else if (!$$7) {
            this.b($$0, $$1, $$2);
            $$0.a(null, dxz.j, $$1);
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

   private static void d(dcw $$0, jd $$1, dtc $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}
