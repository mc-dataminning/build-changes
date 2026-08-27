import javax.annotation.Nullable;

public class cwl extends cwe {
   public cwl(dfd.d $$0) {
      super($$0);
   }

   public static dfe a() {
      return csr.G.n();
   }

   @Override
   public void a(cpq $$0, cbp $$1, gw $$2, dfe $$3, @Nullable dcq $$4, cja $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (cnl.a(cnn.v, $$5) == 0) {
         if ($$0.x_().i()) {
            $$0.a($$2, false);
            return;
         }

         dfe $$6 = $$0.a_($$2.d());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, a());
         }
      }
   }

   @Override
   public void b(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if ($$1.a(cpz.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dfe $$0, cpq $$1, gw $$2) {
      if ($$1.x_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, a());
         $$1.a($$2, a().b(), $$2);
      }
   }
}
