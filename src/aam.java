import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface aam {
   aam.b<? extends aam> a();

   static <B extends ByteBuf, T extends aam> zc<B, T> a(zf<B, T> $$0, zd<B, T> $$1) {
      return zc.a($$0, $$1);
   }

   static <T extends aam> aam.b<T> a(String $$0) {
      return new aam.b<>(new akt($$0));
   }

   static <B extends we> zc<B, aam> a(final aam.a<B> $$0, List<aam.c<? super B, ?>> $$1) {
      final Map<akt, zc<? super B, ? extends aam>> $$2 = $$1.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a().a(), aam.c::b));
      return new zc<B, aam>() {
         private zc<? super B, ? extends aam> a(akt $$0x) {
            zc<? super B, ? extends aam> $$1 = $$2.get($$0);
            return $$1 != null ? $$1 : $$0.create($$0);
         }

         private <T extends aam> void a(B $$0x, aam.b<T> $$1, aam $$2x) {
            $$0.a($$1.a());
            zc<B, T> $$3 = this.a($$1.a);
            $$3.encode($$0, (T)$$2);
         }

         public void a(B $$0x, aam $$1) {
            this.a($$0, $$1.a(), $$1);
         }

         public aam a(B $$0x) {
            akt $$1 = $$0.q();
            return (aam)this.a($$1).decode($$0);
         }
      };
   }

   public interface a<B extends we> {
      zc<B, ? extends aam> create(akt var1);
   }

   public static record b<T extends aam>(akt a) {
   }

   public static record c<B extends we, T extends aam>(aam.b<T> a, zc<B, T> b) {
   }
}
