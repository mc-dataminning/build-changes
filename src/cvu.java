import java.util.Optional;

public class cvu extends cvx {
   private final bof a;

   public cvu(bof $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(cvw $$0, cvk $$1, ib $$2, dme $$3, ehr $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(cvw $$0, cvk $$1, ib $$2, dme $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
