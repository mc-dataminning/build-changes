public class cnk extends cna {
   private static final int b = 100;
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 150;
   private static final cil f = cil.a().a(150.0);
   private final cil g;
   private int h;

   public cnk(cmx $$0) {
      super($$0);
      this.g = cil.a().a(20.0).a(($$1, $$2) -> Math.abs($$1.dC() - $$0.dC()) <= 10.0);
   }

   @Override
   public void a(aru $$0) {
      this.h++;
      bxw $$1 = $$0.a(this.g, this.a, this.a.dA(), this.a.dC(), this.a.dG());
      if ($$1 != null) {
         if (this.h > 25) {
            this.a.t().a(cnn.h);
         } else {
            ffs $$2 = new ffs($$1.dA() - this.a.dA(), 0.0, $$1.dG() - this.a.dG()).d();
            ffs $$3 = new ffs((double)azq.a(this.a.dL() * (float) (Math.PI / 180.0)), 0.0, (double)(-azq.b(this.a.dL() * (float) (Math.PI / 180.0)))).d();
            float $$4 = (float)$$3.b($$2);
            float $$5 = (float)(Math.acos((double)$$4) * 180.0F / (float)Math.PI) + 0.5F;
            if ($$5 < 0.0F || $$5 > 10.0F) {
               double $$6 = $$1.dA() - this.a.c.dA();
               double $$7 = $$1.dG() - this.a.c.dG();
               double $$8 = azq.a(azq.d(180.0 - azq.d($$6, $$7) * 180.0F / (float)Math.PI - (double)this.a.dL()), -100.0, 100.0);
               this.a.bI *= 0.8F;
               float $$9 = (float)Math.sqrt($$6 * $$6 + $$7 * $$7) + 1.0F;
               float $$10 = $$9;
               if ($$9 > 40.0F) {
                  $$9 = 40.0F;
               }

               this.a.bI += (float)$$8 * (0.7F / $$9 / $$10);
               this.a.w(this.a.dL() + this.a.bI);
            }
         }
      } else if (this.h >= 100) {
         $$1 = $$0.a(f, this.a, this.a.dA(), this.a.dC(), this.a.dG());
         this.a.t().a(cnn.e);
         if ($$1 != null) {
            this.a.t().a(cnn.i);
            this.a.t().b(cnn.i).a(new ffs($$1.dA(), $$1.dC(), $$1.dG()));
         }
      }
   }

   @Override
   public void c() {
      this.h = 0;
   }

   @Override
   public cnn<cnk> h() {
      return cnn.g;
   }
}
