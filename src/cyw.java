import javax.annotation.Nullable;

public class cyw extends cvu implements cwj {
   private final axe a;

   public cyw(dkl $$0, axe $$1, cxk.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public bti a(dbh $$0) {
      bti $$1 = super.a($$0);
      cpw $$2 = $$0.o();
      if ($$1.a() && $$2 != null) {
         $$2.a($$0.p(), cwa.a($$0.n(), $$2));
      }

      return $$1;
   }

   @Override
   protected axe a(dxu $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable cpw $$0, dhh $$1, jh $$2, @Nullable fbt $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.C) {
            $$1.a($$2, this.d().m(), 3);
         }

         $$1.a($$0, ecq.z, $$2);
         $$1.a($$0, $$2, this.a, axg.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
