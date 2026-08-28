import java.util.Optional;
import java.util.stream.Stream;

public interface ep extends jp.a {
   static ep a(final jp.a $$0, final cqh $$1) {
      return new ep() {
         @Override
         public Stream<ala<? extends ka<?>>> a() {
            return $$0.a();
         }

         @Override
         public <T> Optional<jp.b<T>> a(ala<? extends ka<? extends T>> $$0x) {
            return $$0.a($$0).map($$1xx -> $$1xx.a($$1));
         }
      };
   }
}
