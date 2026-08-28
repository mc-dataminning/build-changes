import java.util.Optional;
import java.util.stream.Stream;

public interface ee extends jg.a {
   static ee a(final jg.a $$0, final cum $$1) {
      return new ee() {
         @Override
         public Stream<alf<? extends jr<?>>> b() {
            return $$0.b();
         }

         @Override
         public <T> Optional<jg.b<T>> a(alf<? extends jr<? extends T>> $$0x) {
            return $$0.a($$0).map($$1xx -> $$1xx.a($$1));
         }

         @Override
         public cum a() {
            return $$1;
         }
      };
   }

   cum a();
}
