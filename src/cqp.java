import java.util.Optional;

public class cqp extends cqs {
   private final bjt a;

   public cqp(bjt $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(cqr $$0, cqf $$1, ht $$2, dgb $$3, ebe $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(cqr $$0, cqf $$1, ht $$2, dgb $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
