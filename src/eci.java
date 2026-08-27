import java.util.stream.Stream;

public abstract class eci extends ecj {
   @Override
   public final Stream<ib> a_(ech $$0, axd $$1, ib $$2) {
      return this.a($$0, $$1, $$2) ? Stream.of($$2) : Stream.of();
   }

   protected abstract boolean a(ech var1, axd var2, ib var3);
}
