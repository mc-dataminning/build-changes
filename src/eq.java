import java.util.Optional;
import java.util.stream.Stream;

public interface eq extends jq.a {
   static eq a(final jq.a $$0, final cqq $$1) {
      return new eq() {
         @Override
         public Stream<ald<? extends kb<?>>> a() {
            return $$0.a();
         }

         @Override
         public <T> Optional<jq.b<T>> a(ald<? extends kb<? extends T>> $$0x) {
            return $$0.a($$0).map($$1xx -> $$1xx.a($$1));
         }
      };
   }
}
