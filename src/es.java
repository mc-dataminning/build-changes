import java.util.Optional;
import java.util.stream.Stream;

public interface es extends js.a {
   static es a(final js.a $$0, final crf $$1) {
      return new es() {
         @Override
         public Stream<alh<? extends kd<?>>> b() {
            return $$0.b();
         }

         @Override
         public <T> Optional<js.b<T>> a(alh<? extends kd<? extends T>> $$0x) {
            return $$0.a($$0).map($$1xx -> $$1xx.a($$1));
         }

         @Override
         public crf a() {
            return $$1;
         }
      };
   }

   crf a();
}
