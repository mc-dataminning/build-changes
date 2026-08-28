import javax.annotation.Nullable;

public class cxn extends cul implements cva {
   private final awn a;

   public cxn(dij $$0, awn $$1, cwb.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public bsh a(czy $$0) {
      bsh $$1 = super.a($$0);
      cor $$2 = $$0.o();
      if ($$1.a() && $$2 != null) {
         $$2.a($$0.p(), cur.a($$0.n(), $$2));
      }

      return $$1;
   }

   @Override
   protected awn a(dvo $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable cor $$0, dff $$1, jh $$2, @Nullable ezn $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.C) {
            $$1.a($$2, this.d().m(), 3);
         }

         $$1.a($$0, eak.z, $$2);
         $$1.a($$0, $$2, this.a, awp.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
