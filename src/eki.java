import java.util.stream.Stream;

public abstract class eki extends ekj {
   @Override
   public final Stream<je> a_(ekh $$0, azl $$1, je $$2) {
      return this.a($$0, $$1, $$2) ? Stream.of($$2) : Stream.of();
   }

   protected abstract boolean a(ekh var1, azl var2, je var3);
}
