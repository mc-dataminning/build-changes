import java.util.stream.Stream;

public abstract class dwb extends dwc {
   @Override
   public final Stream<ht> a_(dwa $$0, ato $$1, ht $$2) {
      return this.a($$0, $$1, $$2) ? Stream.of($$2) : Stream.of();
   }

   protected abstract boolean a(dwa var1, ato var2, ht var3);
}
