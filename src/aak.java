import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface aak {
   aak.b<? extends aak> a();

   static <B extends ByteBuf, T extends aak> yy<B, T> a(zb<B, T> $$0, yz<B, T> $$1) {
      return yy.a($$0, $$1);
   }

   static <T extends aak> aak.b<T> a(String $$0) {
      return new aak.b<>(ali.b($$0));
   }

   static <B extends vw> yy<B, aak> a(final aak.a<B> $$0, List<aak.c<? super B, ?>> $$1) {
      final Map<ali, yy<? super B, ? extends aak>> $$2 = $$1.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a().a(), aak.c::b));
      return new yy<B, aak>() {
         private yy<? super B, ? extends aak> a(ali $$0x) {
            yy<? super B, ? extends aak> $$1 = $$2.get($$0);
            return $$1 != null ? $$1 : $$0.create($$0);
         }

         private <T extends aak> void a(B $$0x, aak.b<T> $$1, aak $$2x) {
            $$0.a($$1.a());
            yy<B, T> $$3 = this.a($$1.a);
            $$3.encode($$0, (T)$$2);
         }

         public void a(B $$0x, aak $$1) {
            this.a($$0, $$1.a(), $$1);
         }

         public aak a(B $$0x) {
            ali $$1 = $$0.q();
            return (aak)this.a($$1).decode($$0);
         }
      };
   }

   public interface a<B extends vw> {
      yy<B, ? extends aak> create(ali var1);
   }

   public static record b<T extends aak>(ali a) {
   }

   public static record c<B extends vw, T extends aak>(aak.b<T> a, yy<B, T> b) {
   }
}
