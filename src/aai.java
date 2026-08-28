import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface aai {
   aai.b<? extends aai> a();

   static <B extends ByteBuf, T extends aai> yw<B, T> a(yz<B, T> $$0, yx<B, T> $$1) {
      return yw.a($$0, $$1);
   }

   static <T extends aai> aai.b<T> a(String $$0) {
      return new aai.b<>(alg.b($$0));
   }

   static <B extends vu> yw<B, aai> a(final aai.a<B> $$0, List<aai.c<? super B, ?>> $$1) {
      final Map<alg, yw<? super B, ? extends aai>> $$2 = $$1.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a().a(), aai.c::b));
      return new yw<B, aai>() {
         private yw<? super B, ? extends aai> a(alg $$0x) {
            yw<? super B, ? extends aai> $$1 = $$2.get($$0);
            return $$1 != null ? $$1 : $$0.create($$0);
         }

         private <T extends aai> void a(B $$0x, aai.b<T> $$1, aai $$2x) {
            $$0.a($$1.a());
            yw<B, T> $$3 = this.a($$1.a);
            $$3.encode($$0, (T)$$2);
         }

         public void a(B $$0x, aai $$1) {
            this.a($$0, $$1.a(), $$1);
         }

         public aai a(B $$0x) {
            alg $$1 = $$0.q();
            return (aai)this.a($$1).decode($$0);
         }
      };
   }

   public interface a<B extends vu> {
      yw<B, ? extends aai> create(alg var1);
   }

   public static record b<T extends aai>(alg a) {
   }

   public static record c<B extends vu, T extends aai>(aai.b<T> a, yw<B, T> b) {
   }
}
