import java.util.stream.Stream;

public abstract class eho extends ehp {
   @Override
   public final Stream<iz> a_(ehn $$0, azf $$1, iz $$2) {
      return this.a($$0, $$1, $$2) ? Stream.of($$2) : Stream.of();
   }

   protected abstract boolean a(ehn var1, azf var2, iz var3);
}
