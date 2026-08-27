import java.util.Optional;

public class cpa extends cpd {
   private final big a;

   public cpa(big $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(cpc $$0, coq $$1, gv $$2, dey $$3, eab $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(cpc $$0, coq $$1, gv $$2, dey $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
