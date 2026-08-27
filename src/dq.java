import java.util.Optional;
import java.util.stream.Stream;

public interface dq extends in.a {
   static dq a(final in.a $$0, final cmg $$1) {
      return new dq() {
         @Override
         public Stream<ajs<? extends iy<?>>> a() {
            return $$0.a();
         }

         @Override
         public <T> Optional<in.b<T>> a(ajs<? extends iy<? extends T>> $$0x) {
            return $$0.a($$0).map($$1xx -> $$1xx.a($$1));
         }
      };
   }
}
