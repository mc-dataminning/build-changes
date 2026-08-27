import java.util.Optional;
import java.util.stream.Stream;

public interface dq extends in.a {
   static dq a(final in.a $$0, final ckl $$1) {
      return new dq() {
         @Override
         public Stream<ajb<? extends ix<?>>> a() {
            return $$0.a();
         }

         @Override
         public <T> Optional<in.b<T>> a(ajb<? extends ix<? extends T>> $$0x) {
            return $$0.a($$0).map($$1xx -> $$1xx.a($$1));
         }
      };
   }
}
