import java.util.stream.Stream;

public abstract class ehl extends ehm {
   @Override
   public final Stream<iz> a_(ehk $$0, azc $$1, iz $$2) {
      return this.a($$0, $$1, $$2) ? Stream.of($$2) : Stream.of();
   }

   protected abstract boolean a(ehk var1, azc var2, iz var3);
}
