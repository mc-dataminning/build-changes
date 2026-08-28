import java.util.stream.Stream;

public abstract class eqo extends eqp {
   @Override
   public final Stream<iv> a_(eqn $$0, azv $$1, iv $$2) {
      return this.a($$0, $$1, $$2) ? Stream.of($$2) : Stream.of();
   }

   protected abstract boolean a(eqn var1, azv var2, iv var3);
}
