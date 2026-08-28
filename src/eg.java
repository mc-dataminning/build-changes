import java.util.Optional;
import java.util.stream.Stream;

public interface eg extends ji.a {
   static eg a(final ji.a $$0, final cvs $$1) {
      return new eg() {
         @Override
         public Stream<alq<? extends jt<?>>> b() {
            return $$0.b();
         }

         @Override
         public <T> Optional<ji.b<T>> a(alq<? extends jt<? extends T>> $$0x) {
            return $$0.a($$0).map($$1xx -> $$1xx.a($$1));
         }

         @Override
         public cvs a() {
            return $$1;
         }
      };
   }

   cvs a();
}
