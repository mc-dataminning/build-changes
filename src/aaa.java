import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface aaa {
   aaa.b<? extends aaa> a();

   static <B extends ByteBuf, T extends aaa> yq<B, T> a(yt<B, T> $$0, yr<B, T> $$1) {
      return yq.a($$0, $$1);
   }

   static <T extends aaa> aaa.b<T> a(String $$0) {
      return new aaa.b<>(new akf($$0));
   }

   static <B extends vs> yq<B, aaa> a(final aaa.a<B> $$0, List<aaa.c<? super B, ?>> $$1) {
      final Map<akf, yq<? super B, ? extends aaa>> $$2 = $$1.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a().a(), aaa.c::b));
      return new yq<B, aaa>() {
         private yq<? super B, ? extends aaa> a(akf $$0x) {
            yq<? super B, ? extends aaa> $$1 = $$2.get($$0);
            return $$1 != null ? $$1 : $$0.create($$0);
         }

         private <T extends aaa> void a(B $$0x, aaa.b<T> $$1, aaa $$2x) {
            $$0.a($$1.a());
            yq<B, T> $$3 = this.a($$1.a);
            $$3.encode($$0, (T)$$2);
         }

         public void a(B $$0x, aaa $$1) {
            this.a($$0, $$1.a(), $$1);
         }

         public aaa a(B $$0x) {
            akf $$1 = $$0.q();
            return (aaa)this.a($$1).decode($$0);
         }
      };
   }

   public interface a<B extends vs> {
      yq<B, ? extends aaa> create(akf var1);
   }

   public static record b<T extends aaa>(akf a) {
   }

   public static record c<B extends vs, T extends aaa>(aaa.b<T> a, yq<B, T> b) {
   }
}
