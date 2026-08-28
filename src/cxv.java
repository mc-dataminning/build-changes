import javax.annotation.Nullable;

public class cxv extends cut implements cvi {
   private final avy b;

   public cxv(djk $$0, avy $$1, cwj.a $$2) {
      super($$0, $$2);
      this.b = $$1;
   }

   @Override
   public bsi a(dag $$0) {
      bsi $$1 = super.a($$0);
      cov $$2 = $$0.o();
      if ($$1.a() && $$2 != null) {
         $$2.a($$0.p(), cuz.a($$0.n(), $$2));
      }

      return $$1;
   }

   @Override
   protected avy a(dwv $$0) {
      return this.b;
   }

   @Override
   public boolean a(@Nullable cov $$0, dgg $$1, ji $$2, @Nullable fau $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.C) {
            $$1.a($$2, this.d().m(), 3);
         }

         $$1.a($$0, ebr.z, $$2);
         $$1.a($$0, $$2, this.b, awa.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
