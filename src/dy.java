import java.util.Optional;
import java.util.stream.Stream;

public interface dy extends ix.a {
   static dy a(final ix.a $$0, final cmy $$1) {
      return new dy() {
         @Override
         public Stream<ake<? extends ji<?>>> a() {
            return $$0.a();
         }

         @Override
         public <T> Optional<ix.b<T>> a(ake<? extends ji<? extends T>> $$0x) {
            return $$0.a($$0).map($$1xx -> $$1xx.a($$1));
         }
      };
   }
}
