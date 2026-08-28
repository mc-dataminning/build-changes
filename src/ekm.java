import java.util.stream.Stream;

public abstract class ekm extends ekn {
   @Override
   public final Stream<jf> a_(ekl $$0, azn $$1, jf $$2) {
      return this.a($$0, $$1, $$2) ? Stream.of($$2) : Stream.of();
   }

   protected abstract boolean a(ekl var1, azn var2, jf var3);
}
