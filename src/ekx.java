import java.util.stream.Stream;

public abstract class ekx extends eky {
   @Override
   public final Stream<jg> a_(ekw $$0, azr $$1, jg $$2) {
      return this.a($$0, $$1, $$2) ? Stream.of($$2) : Stream.of();
   }

   protected abstract boolean a(ekw var1, azr var2, jg var3);
}
