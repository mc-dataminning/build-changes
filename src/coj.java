import javax.annotation.Nullable;

public abstract class coj extends cpa implements cfa {
   private final cwp.a a;

   public coj(cwp.a $$0, dca.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public czn a(gu $$0, dcb $$1) {
      return new dax($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends czn> czo<T> a(cmm $$0, dcb $$1, czp<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(cpo.gO) || $$1.a(cpo.gP) || $$1.a(cpo.gQ) || $$1.a(cpo.gR);
         if ($$3) {
            return a($$2, czp.p, dax::a);
         }
      }

      return null;
   }

   public cwp.a a() {
      return this.a;
   }

   @Override
   public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
      return false;
   }

   @Override
   public bfo g() {
      return bfo.f;
   }
}
