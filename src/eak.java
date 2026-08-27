import java.util.stream.Stream;

public abstract class eak extends eal {
   @Override
   public final Stream<hz> a_(eaj $$0, awo $$1, hz $$2) {
      return this.a($$0, $$1, $$2) ? Stream.of($$2) : Stream.of();
   }

   protected abstract boolean a(eaj var1, awo var2, hz var3);
}
