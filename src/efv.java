import java.util.stream.Stream;

public abstract class efv extends efw {
   @Override
   public final Stream<in> a_(efu $$0, ayg $$1, in $$2) {
      return this.a($$0, $$1, $$2) ? Stream.of($$2) : Stream.of();
   }

   protected abstract boolean a(efu var1, ayg var2, in var3);
}
