import javax.annotation.Nullable;

public class cyo extends cvm implements cwb {
   private final awu a;

   public cyo(dkd $$0, awu $$1, cxc.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public bta a(daz $$0) {
      bta $$1 = super.a($$0);
      cpo $$2 = $$0.o();
      if ($$1.a() && $$2 != null) {
         $$2.a($$0.p(), cvs.a($$0.n(), $$2));
      }

      return $$1;
   }

   @Override
   protected awu a(dxo $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable cpo $$0, dgz $$1, jh $$2, @Nullable fbn $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.C) {
            $$1.a($$2, this.d().m(), 3);
         }

         $$1.a($$0, eck.z, $$2);
         $$1.a($$0, $$2, this.a, aww.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
