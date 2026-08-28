import java.util.stream.Stream;

public abstract class eom extends eon {
   @Override
   public final Stream<jj> a_(eol $$0, azs $$1, jj $$2) {
      return this.a($$0, $$1, $$2) ? Stream.of($$2) : Stream.of();
   }

   protected abstract boolean a(eol var1, azs var2, jj var3);
}
