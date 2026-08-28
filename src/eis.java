import java.util.stream.Stream;

public abstract class eis extends eit {
   @Override
   public final Stream<jd> a_(eir $$0, ayv $$1, jd $$2) {
      return this.a($$0, $$1, $$2) ? Stream.of($$2) : Stream.of();
   }

   protected abstract boolean a(eir var1, ayv var2, jd var3);
}
