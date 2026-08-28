import java.util.Optional;
import java.util.stream.Stream;

public interface et extends ju.a {
   static et a(final ju.a $$0, final cte $$1) {
      return new et() {
         @Override
         public Stream<alc<? extends kf<?>>> b() {
            return $$0.b();
         }

         @Override
         public <T> Optional<ju.b<T>> a(alc<? extends kf<? extends T>> $$0x) {
            return $$0.a($$0).map($$1xx -> $$1xx.a($$1));
         }

         @Override
         public cte a() {
            return $$1;
         }
      };
   }

   cte a();
}
