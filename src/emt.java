import java.util.stream.Stream;

public abstract class emt extends emu {
   @Override
   public final Stream<ji> a_(ems $$0, azh $$1, ji $$2) {
      return this.a($$0, $$1, $$2) ? Stream.of($$2) : Stream.of();
   }

   protected abstract boolean a(ems var1, azh var2, ji var3);
}
