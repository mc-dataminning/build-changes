import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface aag {
   aag.b<? extends aag> a();

   static <B extends ByteBuf, T extends aag> yu<B, T> a(yx<B, T> $$0, yv<B, T> $$1) {
      return yu.a($$0, $$1);
   }

   static <T extends aag> aag.b<T> a(String $$0) {
      return new aag.b<>(ale.b($$0));
   }

   static <B extends vs> yu<B, aag> a(final aag.a<B> $$0, List<aag.c<? super B, ?>> $$1) {
      final Map<ale, yu<? super B, ? extends aag>> $$2 = $$1.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a().a(), aag.c::b));
      return new yu<B, aag>() {
         private yu<? super B, ? extends aag> a(ale $$0x) {
            yu<? super B, ? extends aag> $$1 = $$2.get($$0);
            return $$1 != null ? $$1 : $$0.create($$0);
         }

         private <T extends aag> void a(B $$0x, aag.b<T> $$1, aag $$2x) {
            $$0.a($$1.a());
            yu<B, T> $$3 = this.a($$1.a);
            $$3.encode($$0, (T)$$2);
         }

         public void a(B $$0x, aag $$1) {
            this.a($$0, $$1.a(), $$1);
         }

         public aag a(B $$0x) {
            ale $$1 = $$0.q();
            return (aag)this.a($$1).decode($$0);
         }
      };
   }

   public interface a<B extends vs> {
      yu<B, ? extends aag> create(ale var1);
   }

   public static record b<T extends aag>(ale a) {
   }

   public static record c<B extends vs, T extends aag>(aag.b<T> a, yu<B, T> b) {
   }
}
