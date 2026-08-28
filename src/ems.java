import java.util.stream.Stream;

public abstract class ems extends emt {
   @Override
   public final Stream<ji> a_(emr $$0, azh $$1, ji $$2) {
      return this.a($$0, $$1, $$2) ? Stream.of($$2) : Stream.of();
   }

   protected abstract boolean a(emr var1, azh var2, ji var3);
}
