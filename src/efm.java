import java.util.stream.Stream;

public abstract class efm extends efn {
   @Override
   public final Stream<im> a_(efl $$0, ayd $$1, im $$2) {
      return this.a($$0, $$1, $$2) ? Stream.of($$2) : Stream.of();
   }

   protected abstract boolean a(efl var1, ayd var2, im var3);
}
