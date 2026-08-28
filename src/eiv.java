import java.util.stream.Stream;

public abstract class eiv extends eiw {
   @Override
   public final Stream<jd> a_(eiu $$0, ayw $$1, jd $$2) {
      return this.a($$0, $$1, $$2) ? Stream.of($$2) : Stream.of();
   }

   protected abstract boolean a(eiu var1, ayw var2, jd var3);
}
