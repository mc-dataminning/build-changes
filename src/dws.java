import java.util.stream.Stream;

public abstract class dws extends dwt {
   @Override
   public final Stream<hx> a_(dwr $$0, atw $$1, hx $$2) {
      return this.a($$0, $$1, $$2) ? Stream.of($$2) : Stream.of();
   }

   protected abstract boolean a(dwr var1, atw var2, hx var3);
}
