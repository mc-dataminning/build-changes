import javax.annotation.Nullable;

public class daq extends cxs implements cyg {
   private final awm a;

   public daq(dmm $$0, awm $$1, czg.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public bug a(ddf $$0) {
      bug $$1 = super.a($$0);
      crj $$2 = $$0.o();
      if ($$1.a() && $$2 != null) {
         $$2.a($$0.p(), cxy.b($$0.n(), $$2));
      }

      return $$1;
   }

   @Override
   protected awm a(eao $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable bxj $$0, djh $$1, iv $$2, @Nullable fet $$3) {
      if ($$1.k($$2) && $$1.v($$2)) {
         if (!$$1.C) {
            $$1.a($$2, this.c().m(), 3);
         }

         $$1.a($$0, efo.z, $$2);
         $$1.a($$0, $$2, this.a, awo.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
