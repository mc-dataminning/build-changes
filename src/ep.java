import java.util.Optional;
import java.util.stream.Stream;

public interface ep extends jo.a {
   static ep a(final jo.a $$0, final cpj $$1) {
      return new ep() {
         @Override
         public Stream<akp<? extends jz<?>>> a() {
            return $$0.a();
         }

         @Override
         public <T> Optional<jo.b<T>> a(akp<? extends jz<? extends T>> $$0x) {
            return $$0.a($$0).map($$1xx -> $$1xx.a($$1));
         }
      };
   }
}
