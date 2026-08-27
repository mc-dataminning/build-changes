import javax.annotation.Nullable;

public abstract class cri extends cry implements chy {
   private final czn.a a;

   public cri(czn.a $$0, dey.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public dcl a(gu $$0, dez $$1) {
      return new ddv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcl> dcm<T> a(cpl $$0, dez $$1, dcn<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(csm.gO) || $$1.a(csm.gP) || $$1.a(csm.gQ) || $$1.a(csm.gR);
         if ($$3) {
            return a($$2, dcn.p, ddv::a);
         }
      }

      return null;
   }

   public czn.a a() {
      return this.a;
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
      return false;
   }

   @Override
   public bin g() {
      return bin.f;
   }
}
