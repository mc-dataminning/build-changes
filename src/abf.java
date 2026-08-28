import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface abf {
   abf.b<? extends abf> a();

   static <B extends ByteBuf, T extends abf> zt<B, T> a(zw<B, T> $$0, zu<B, T> $$1) {
      return zt.a($$0, $$1);
   }

   static <T extends abf> abf.b<T> a(String $$0) {
      return new abf.b<>(alz.b($$0));
   }

   static <B extends ws> zt<B, abf> a(final abf.a<B> $$0, List<abf.c<? super B, ?>> $$1) {
      final Map<alz, zt<? super B, ? extends abf>> $$2 = $$1.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a().a(), abf.c::b));
      return new zt<B, abf>() {
         private zt<? super B, ? extends abf> a(alz $$0x) {
            zt<? super B, ? extends abf> $$1 = $$2.get($$0);
            return $$1 != null ? $$1 : $$0.create($$0);
         }

         private <T extends abf> void a(B $$0x, abf.b<T> $$1, abf $$2x) {
            $$0.a($$1.a());
            zt<B, T> $$3 = this.a($$1.a);
            $$3.encode($$0, (T)$$2);
         }

         public void a(B $$0x, abf $$1) {
            this.a($$0, $$1.a(), $$1);
         }

         public abf a(B $$0x) {
            alz $$1 = $$0.q();
            return (abf)this.a($$1).decode($$0);
         }
      };
   }

   public interface a<B extends ws> {
      zt<B, ? extends abf> create(alz var1);
   }

   public static record b<T extends abf>(alz a) {
   }

   public static record c<B extends ws, T extends abf>(abf.b<T> a, zt<B, T> b) {
   }
}
