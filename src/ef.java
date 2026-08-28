import java.util.Optional;
import java.util.stream.Stream;

public interface ef extends jh.a {
   static ef a(final jh.a $$0, final cvh $$1) {
      return new ef() {
         @Override
         public Stream<alh<? extends js<?>>> b() {
            return $$0.b();
         }

         @Override
         public <T> Optional<jh.b<T>> a(alh<? extends js<? extends T>> $$0x) {
            return $$0.a($$0).map($$1xx -> $$1xx.a($$1));
         }

         @Override
         public cvh a() {
            return $$1;
         }
      };
   }

   cvh a();
}
