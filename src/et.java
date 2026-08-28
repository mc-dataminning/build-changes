import java.util.Optional;
import java.util.stream.Stream;

public interface et extends jt.a {
   static et a(final jt.a $$0, final crt $$1) {
      return new et() {
         @Override
         public Stream<akt<? extends ke<?>>> b() {
            return $$0.b();
         }

         @Override
         public <T> Optional<jt.b<T>> a(akt<? extends ke<? extends T>> $$0x) {
            return $$0.a($$0).map($$1xx -> $$1xx.a($$1));
         }

         @Override
         public crt a() {
            return $$1;
         }
      };
   }

   crt a();
}
