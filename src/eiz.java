import java.util.stream.Stream;

public abstract class eiz extends eja {
   @Override
   public final Stream<ir> a_(eiy $$0, ayt $$1, ir $$2) {
      return this.a($$0, $$1, $$2) ? Stream.of($$2) : Stream.of();
   }

   protected abstract boolean a(eiy var1, ayt var2, ir var3);
}
