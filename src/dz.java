import java.util.Optional;
import java.util.stream.Stream;

public interface dz extends iy.a {
   static dz a(final iy.a $$0, final cnu $$1) {
      return new dz() {
         @Override
         public Stream<akg<? extends jj<?>>> a() {
            return $$0.a();
         }

         @Override
         public <T> Optional<iy.b<T>> a(akg<? extends jj<? extends T>> $$0x) {
            return $$0.a($$0).map($$1xx -> $$1xx.a($$1));
         }
      };
   }
}
