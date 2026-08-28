import javax.annotation.Nullable;

public class cys extends cvq implements cwf {
   private final axe a;

   public cys(dke $$0, axe $$1, cxg.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public bte a(dbd $$0) {
      bte $$1 = super.a($$0);
      cps $$2 = $$0.o();
      if ($$1.a() && $$2 != null) {
         $$2.a($$0.p(), cvw.a($$0.n(), $$2));
      }

      return $$1;
   }

   @Override
   protected axe a(dxn $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable cps $$0, dha $$1, jh $$2, @Nullable fbo $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.C) {
            $$1.a($$2, this.d().m(), 3);
         }

         $$1.a($$0, ecj.z, $$2);
         $$1.a($$0, $$2, this.a, axg.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
