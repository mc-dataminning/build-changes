import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface aaf {
   aaf.b<? extends aaf> a();

   static <B extends ByteBuf, T extends aaf> yv<B, T> a(yy<B, T> $$0, yw<B, T> $$1) {
      return yv.a($$0, $$1);
   }

   static <T extends aaf> aaf.b<T> a(String $$0) {
      return new aaf.b<>(new akn($$0));
   }

   static <B extends vx> yv<B, aaf> a(final aaf.a<B> $$0, List<aaf.c<? super B, ?>> $$1) {
      final Map<akn, yv<? super B, ? extends aaf>> $$2 = $$1.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a().a(), aaf.c::b));
      return new yv<B, aaf>() {
         private yv<? super B, ? extends aaf> a(akn $$0x) {
            yv<? super B, ? extends aaf> $$1 = $$2.get($$0);
            return $$1 != null ? $$1 : $$0.create($$0);
         }

         private <T extends aaf> void a(B $$0x, aaf.b<T> $$1, aaf $$2x) {
            $$0.a($$1.a());
            yv<B, T> $$3 = this.a($$1.a);
            $$3.encode($$0, (T)$$2);
         }

         public void a(B $$0x, aaf $$1) {
            this.a($$0, $$1.a(), $$1);
         }

         public aaf a(B $$0x) {
            akn $$1 = $$0.q();
            return (aaf)this.a($$1).decode($$0);
         }
      };
   }

   public interface a<B extends vx> {
      yv<B, ? extends aaf> create(akn var1);
   }

   public static record b<T extends aaf>(akn a) {
   }

   public static record c<B extends vx, T extends aaf>(aaf.b<T> a, yv<B, T> b) {
   }
}
