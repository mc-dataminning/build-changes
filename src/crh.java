import javax.annotation.Nullable;

public abstract class crh extends crx implements chx {
   private final czm.a a;

   public crh(czm.a $$0, dex.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public dck a(gv $$0, dey $$1) {
      return new ddu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dck> dcl<T> a(cpk $$0, dey $$1, dcm<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(csl.gO) || $$1.a(csl.gP) || $$1.a(csl.gQ) || $$1.a(csl.gR);
         if ($$3) {
            return a($$2, dcm.p, ddu::a);
         }
      }

      return null;
   }

   public czm.a a() {
      return this.a;
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }

   @Override
   public bil g() {
      return bil.f;
   }
}
