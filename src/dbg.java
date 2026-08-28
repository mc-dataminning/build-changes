import javax.annotation.Nullable;

public class dbg extends cyi implements cyw {
   private final awq a;

   public dbg(dne $$0, awq $$1, czw.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public but a(ddv $$0) {
      but $$1 = super.a($$0);
      crz $$2 = $$0.o();
      if ($$1.a() && $$2 != null) {
         $$2.a($$0.p(), cyo.b($$0.n(), $$2));
      }

      return $$1;
   }

   @Override
   protected awq a(ebg $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable bxw $$0, djz $$1, iw $$2, @Nullable ffo $$3) {
      if ($$1.k($$2) && $$1.v($$2)) {
         if (!$$1.C) {
            $$1.a($$2, this.c().m(), 3);
         }

         $$1.a($$0, egg.z, $$2);
         $$1.a($$0, $$2, this.a, aws.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
