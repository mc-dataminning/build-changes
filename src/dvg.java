import java.util.stream.Stream;

public abstract class dvg extends dvh {
   @Override
   public final Stream<ht> a_(dvf $$0, ate $$1, ht $$2) {
      return this.a($$0, $$1, $$2) ? Stream.of($$2) : Stream.of();
   }

   protected abstract boolean a(dvf var1, ate var2, ht var3);
}
