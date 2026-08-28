import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface aam {
   aam.b<? extends aam> a();

   static <B extends ByteBuf, T extends aam> za<B, T> a(zd<B, T> $$0, zb<B, T> $$1) {
      return za.a($$0, $$1);
   }

   static <T extends aam> aam.b<T> a(String $$0) {
      return new aam.b<>(alk.b($$0));
   }

   static <B extends vy> za<B, aam> a(final aam.a<B> $$0, List<aam.c<? super B, ?>> $$1) {
      final Map<alk, za<? super B, ? extends aam>> $$2 = $$1.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a().a(), aam.c::b));
      return new za<B, aam>() {
         private za<? super B, ? extends aam> a(alk $$0x) {
            za<? super B, ? extends aam> $$1 = $$2.get($$0);
            return $$1 != null ? $$1 : $$0.create($$0);
         }

         private <T extends aam> void a(B $$0x, aam.b<T> $$1, aam $$2x) {
            $$0.a($$1.a());
            za<B, T> $$3 = this.a($$1.a);
            $$3.encode($$0, (T)$$2);
         }

         public void a(B $$0x, aam $$1) {
            this.a($$0, $$1.a(), $$1);
         }

         public aam a(B $$0x) {
            alk $$1 = $$0.q();
            return (aam)this.a($$1).decode($$0);
         }
      };
   }

   public interface a<B extends vy> {
      za<B, ? extends aam> create(alk var1);
   }

   public static record b<T extends aam>(alk a) {
   }

   public static record c<B extends vy, T extends aam>(aam.b<T> a, za<B, T> b) {
   }
}
