import javax.annotation.Nullable;

public class cxf extends cuc implements cus {
   private final awj a;

   public cxf(dhy $$0, awj $$1, cvt.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public bry a(czo $$0) {
      bry $$1 = super.a($$0);
      coh $$2 = $$0.o();
      if ($$1.a() && $$2 != null) {
         $$2.a($$0.p(), cui.a($$0.n(), $$2));
      }

      return $$1;
   }

   @Override
   protected awj a(dvd $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable coh $$0, dev $$1, jg $$2, @Nullable ezd $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.C) {
            $$1.a($$2, this.d().m(), 3);
         }

         $$1.a($$0, eaa.z, $$2);
         $$1.a($$0, $$2, this.a, awl.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
