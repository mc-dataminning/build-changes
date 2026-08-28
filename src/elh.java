import java.util.stream.Stream;

public abstract class elh extends eli {
   @Override
   public final Stream<jh> a_(elg $$0, azv $$1, jh $$2) {
      return this.a($$0, $$1, $$2) ? Stream.of($$2) : Stream.of();
   }

   protected abstract boolean a(elg var1, azv var2, jh var3);
}
