import java.util.stream.Stream;

public abstract class ebm extends ebn {
   @Override
   public final Stream<ib> a_(ebl $$0, awt $$1, ib $$2) {
      return this.a($$0, $$1, $$2) ? Stream.of($$2) : Stream.of();
   }

   protected abstract boolean a(ebl var1, awt var2, ib var3);
}
