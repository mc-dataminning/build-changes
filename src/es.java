import java.util.Optional;
import java.util.stream.Stream;

public interface es extends js.a {
   static es a(final js.a $$0, final css $$1) {
      return new es() {
         @Override
         public Stream<aly<? extends kd<?>>> b() {
            return $$0.b();
         }

         @Override
         public <T> Optional<js.b<T>> a(aly<? extends kd<? extends T>> $$0x) {
            return $$0.a($$0).map($$1xx -> $$1xx.a($$1));
         }

         @Override
         public css a() {
            return $$1;
         }
      };
   }

   css a();
}
