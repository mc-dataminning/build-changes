import javax.annotation.Nullable;

public class dae extends cxg implements cxu {
   private final awm a;

   public dae(dma $$0, awm $$1, cyu.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public bub a(dct $$0) {
      bub $$1 = super.a($$0);
      cqy $$2 = $$0.o();
      if ($$1.a() && $$2 != null) {
         $$2.a($$0.p(), cxm.b($$0.n(), $$2));
      }

      return $$1;
   }

   @Override
   protected awm a(dzz $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable bxc $$0, div $$1, iu $$2, @Nullable fee $$3) {
      if ($$1.k($$2) && $$1.v($$2)) {
         if (!$$1.C) {
            $$1.a($$2, this.c().m(), 3);
         }

         $$1.a($$0, eez.z, $$2);
         $$1.a($$0, $$2, this.a, awo.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
