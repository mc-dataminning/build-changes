import javax.annotation.Nullable;

public abstract class crj extends crz implements chz {
   private final czo.a a;

   public crj(czo.a $$0, dez.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public dcm a(gu $$0, dfa $$1) {
      return new ddw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcm> dcn<T> a(cpm $$0, dfa $$1, dco<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(csn.gO) || $$1.a(csn.gP) || $$1.a(csn.gQ) || $$1.a(csn.gR);
         if ($$3) {
            return a($$2, dco.p, ddw::a);
         }
      }

      return null;
   }

   public czo.a a() {
      return this.a;
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return false;
   }

   @Override
   public bin g() {
      return bin.f;
   }
}
