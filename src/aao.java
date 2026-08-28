import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface aao {
   aao.b<? extends aao> a();

   static <B extends ByteBuf, T extends aao> zc<B, T> a(zf<B, T> $$0, zd<B, T> $$1) {
      return zc.a($$0, $$1);
   }

   static <T extends aao> aao.b<T> a(String $$0) {
      return new aao.b<>(ale.b($$0));
   }

   static <B extends wb> zc<B, aao> a(final aao.a<B> $$0, List<aao.c<? super B, ?>> $$1) {
      final Map<ale, zc<? super B, ? extends aao>> $$2 = $$1.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a().a(), aao.c::b));
      return new zc<B, aao>() {
         private zc<? super B, ? extends aao> a(ale $$0x) {
            zc<? super B, ? extends aao> $$1 = $$2.get($$0);
            return $$1 != null ? $$1 : $$0.create($$0);
         }

         private <T extends aao> void a(B $$0x, aao.b<T> $$1, aao $$2x) {
            $$0.a($$1.a());
            zc<B, T> $$3 = this.a($$1.a);
            $$3.encode($$0, (T)$$2);
         }

         public void a(B $$0x, aao $$1) {
            this.a($$0, $$1.a(), $$1);
         }

         public aao a(B $$0x) {
            ale $$1 = $$0.q();
            return (aao)this.a($$1).decode($$0);
         }
      };
   }

   public interface a<B extends wb> {
      zc<B, ? extends aao> create(ale var1);
   }

   public static record b<T extends aao>(ale a) {
   }

   public static record c<B extends wb, T extends aao>(aao.b<T> a, zc<B, T> b) {
   }
}
