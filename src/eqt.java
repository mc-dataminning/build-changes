import java.util.stream.Stream;

public abstract class eqt extends equ {
   @Override
   public final Stream<iv> a_(eqs $$0, azv $$1, iv $$2) {
      return this.a($$0, $$1, $$2) ? Stream.of($$2) : Stream.of();
   }

   protected abstract boolean a(eqs var1, azv var2, iv var3);
}
