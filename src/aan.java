import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface aan {
   aan.b<? extends aan> a();

   static <B extends ByteBuf, T extends aan> zb<B, T> a(ze<B, T> $$0, zc<B, T> $$1) {
      return zb.a($$0, $$1);
   }

   static <T extends aan> aan.b<T> a(String $$0) {
      return new aan.b<>(alc.b($$0));
   }

   static <B extends wa> zb<B, aan> a(final aan.a<B> $$0, List<aan.c<? super B, ?>> $$1) {
      final Map<alc, zb<? super B, ? extends aan>> $$2 = $$1.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a().a(), aan.c::b));
      return new zb<B, aan>() {
         private zb<? super B, ? extends aan> a(alc $$0x) {
            zb<? super B, ? extends aan> $$1 = $$2.get($$0);
            return $$1 != null ? $$1 : $$0.create($$0);
         }

         private <T extends aan> void a(B $$0x, aan.b<T> $$1, aan $$2x) {
            $$0.a($$1.a());
            zb<B, T> $$3 = this.a($$1.a);
            $$3.encode($$0, (T)$$2);
         }

         public void a(B $$0x, aan $$1) {
            this.a($$0, $$1.a(), $$1);
         }

         public aan a(B $$0x) {
            alc $$1 = $$0.q();
            return (aan)this.a($$1).decode($$0);
         }
      };
   }

   public interface a<B extends wa> {
      zb<B, ? extends aan> create(alc var1);
   }

   public static record b<T extends aan>(alc a) {
   }

   public static record c<B extends wa, T extends aan>(aan.b<T> a, zb<B, T> b) {
   }
}
