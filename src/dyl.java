import java.util.stream.Stream;

public abstract class dyl extends dym {
   @Override
   public final Stream<hx> a_(dyk $$0, auu $$1, hx $$2) {
      return this.a($$0, $$1, $$2) ? Stream.of($$2) : Stream.of();
   }

   protected abstract boolean a(dyk var1, auu var2, hx var3);
}
