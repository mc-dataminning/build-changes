import java.util.stream.Stream;

public abstract class epo extends epp {
   @Override
   public final Stream<iu> a_(epn $$0, azt $$1, iu $$2) {
      return this.a($$0, $$1, $$2) ? Stream.of($$2) : Stream.of();
   }

   protected abstract boolean a(epn var1, azt var2, iu var3);
}
