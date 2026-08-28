import java.util.List;

public abstract class dpu {
   private static final int a = 5;
   private int b;
   private double c;

   protected abstract void a(dby var1, iz var2, dsc var3);

   protected abstract void b(dby var1, iz var2, dsc var3);

   protected abstract void a(dby var1, iz var2, dsc var3, int var4, int var5);

   protected abstract boolean a(cmx var1);

   public void a(cmx $$0, dby $$1, iz $$2, dsc $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, dwv.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
      this.c = Math.max($$0.gC(), this.c);
   }

   public void b(cmx $$0, dby $$1, iz $$2, dsc $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, dwv.j, $$2);
         this.c = 0.0;
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private List<cmx> a(dby $$0, iz $$1) {
      double $$2 = this.c + 4.0;
      evm $$3 = new evm($$1).g($$2);
      return $$0.a(dwj.a(cmx.class), $$3, this::a);
   }

   public void c(dby $$0, iz $$1, dsc $$2) {
      List<cmx> $$3 = this.a($$0, $$1);
      this.c = 0.0;

      for (cmx $$4 : $$3) {
         this.c = Math.max($$4.gC(), this.c);
      }

      int $$5 = $$3.size();
      int $$6 = this.b;
      if ($$6 != $$5) {
         boolean $$7 = $$5 != 0;
         boolean $$8 = $$6 != 0;
         if ($$7 && !$$8) {
            this.a($$0, $$1, $$2);
            $$0.a(null, dwv.k, $$1);
         } else if (!$$7) {
            this.b($$0, $$1, $$2);
            $$0.a(null, dwv.j, $$1);
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

   private static void d(dby $$0, iz $$1, dsc $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}
