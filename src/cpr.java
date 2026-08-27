import java.util.Optional;

public class cpr extends cpu {
   private final biw a;

   public cpr(biw $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(cpt $$0, cph $$1, gw $$2, dfd $$3, eag $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(cpt $$0, cph $$1, gw $$2, dfd $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
