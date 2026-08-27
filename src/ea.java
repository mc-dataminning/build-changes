import java.util.Optional;
import java.util.stream.Stream;

public interface ea extends iz.a {
   static ea a(final iz.a $$0, final col $$1) {
      return new ea() {
         @Override
         public Stream<akm<? extends jk<?>>> a() {
            return $$0.a();
         }

         @Override
         public <T> Optional<iz.b<T>> a(akm<? extends jk<? extends T>> $$0x) {
            return $$0.a($$0).map($$1xx -> $$1xx.a($$1));
         }
      };
   }
}
