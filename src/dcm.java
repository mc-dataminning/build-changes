import java.util.Optional;

public class dcm extends dcp {
   private final bsr a;

   public dcm(bsr $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(dco $$0, dcc $$1, jd $$2, dtc $$3, epc $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(dco $$0, dcc $$1, jd $$2, dtc $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
