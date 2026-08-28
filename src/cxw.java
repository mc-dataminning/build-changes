import javax.annotation.Nullable;

public class cxw extends cuu implements cvj {
   private final avz a;

   public cxw(djl $$0, avz $$1, cwk.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public bsj a(dah $$0) {
      bsj $$1 = super.a($$0);
      cow $$2 = $$0.o();
      if ($$1.a() && $$2 != null) {
         $$2.a($$0.p(), cva.b($$0.n(), $$2));
      }

      return $$1;
   }

   @Override
   protected avz a(dww $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable cow $$0, dgh $$1, ji $$2, @Nullable fav $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.C) {
            $$1.a($$2, this.d().m(), 3);
         }

         $$1.a($$0, ebs.z, $$2);
         $$1.a($$0, $$2, this.a, awb.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
