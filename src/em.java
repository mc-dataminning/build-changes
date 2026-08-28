import java.util.Optional;
import java.util.stream.Stream;

public interface em extends jl.a {
   static em a(final jl.a $$0, final coz $$1) {
      return new em() {
         @Override
         public Stream<akj<? extends jw<?>>> a() {
            return $$0.a();
         }

         @Override
         public <T> Optional<jl.b<T>> a(akj<? extends jw<? extends T>> $$0x) {
            return $$0.a($$0).map($$1xx -> $$1xx.a($$1));
         }
      };
   }
}
