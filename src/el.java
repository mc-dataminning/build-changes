import java.util.Optional;
import java.util.stream.Stream;

public interface el extends jk.a {
   static el a(final jk.a $$0, final cpl $$1) {
      return new el() {
         @Override
         public Stream<ale<? extends jv<?>>> a() {
            return $$0.a();
         }

         @Override
         public <T> Optional<jk.b<T>> a(ale<? extends jv<? extends T>> $$0x) {
            return $$0.a($$0).map($$1xx -> $$1xx.a($$1));
         }
      };
   }
}
