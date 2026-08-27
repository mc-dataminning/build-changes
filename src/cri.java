import java.util.Optional;

public class cri extends crl {
   private final bki a;

   public cri(bki $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(crk $$0, cqy $$1, ht $$2, dgw $$3, ecg $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(crk $$0, cqy $$1, ht $$2, dgw $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
