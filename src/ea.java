import java.util.Optional;
import java.util.stream.Stream;

public interface ea extends iz.a {
   static ea a(final iz.a $$0, final coj $$1) {
      return new ea() {
         @Override
         public Stream<akl<? extends jk<?>>> a() {
            return $$0.a();
         }

         @Override
         public <T> Optional<iz.b<T>> a(akl<? extends jk<? extends T>> $$0x) {
            return $$0.a($$0).map($$1xx -> $$1xx.a($$1));
         }
      };
   }
}
