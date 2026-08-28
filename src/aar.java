import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface aar {
   aar.b<? extends aar> a();

   static <B extends ByteBuf, T extends aar> zf<B, T> a(zi<B, T> $$0, zg<B, T> $$1) {
      return zf.a($$0, $$1);
   }

   static <T extends aar> aar.b<T> a(String $$0) {
      return new aar.b<>(alh.b($$0));
   }

   static <B extends we> zf<B, aar> a(final aar.a<B> $$0, List<aar.c<? super B, ?>> $$1) {
      final Map<alh, zf<? super B, ? extends aar>> $$2 = $$1.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a().a(), aar.c::b));
      return new zf<B, aar>() {
         private zf<? super B, ? extends aar> a(alh $$0x) {
            zf<? super B, ? extends aar> $$1 = $$2.get($$0);
            return $$1 != null ? $$1 : $$0.create($$0);
         }

         private <T extends aar> void a(B $$0x, aar.b<T> $$1, aar $$2x) {
            $$0.a($$1.a());
            zf<B, T> $$3 = this.a($$1.a);
            $$3.encode($$0, (T)$$2);
         }

         public void a(B $$0x, aar $$1) {
            this.a($$0, $$1.a(), $$1);
         }

         public aar a(B $$0x) {
            alh $$1 = $$0.q();
            return (aar)this.a($$1).decode($$0);
         }
      };
   }

   public interface a<B extends we> {
      zf<B, ? extends aar> create(alh var1);
   }

   public static record b<T extends aar>(alh a) {
   }

   public static record c<B extends we, T extends aar>(aar.b<T> a, zf<B, T> b) {
   }
}
