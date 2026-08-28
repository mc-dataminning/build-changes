import java.util.Optional;

public class dfw extends dfz {
   private final buj a;

   public dfw(buj $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(dfy $$0, dfl $$1, ji $$2, dwv $$3, esx $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(dfy $$0, dfl $$1, ji $$2, dwv $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
