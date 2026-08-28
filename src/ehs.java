import java.util.stream.Stream;

public abstract class ehs extends eht {
   @Override
   public final Stream<iz> a_(ehr $$0, azh $$1, iz $$2) {
      return this.a($$0, $$1, $$2) ? Stream.of($$2) : Stream.of();
   }

   protected abstract boolean a(ehr var1, azh var2, iz var3);
}
