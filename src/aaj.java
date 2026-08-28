import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface aaj {
   aaj.b<? extends aaj> a();

   static <B extends ByteBuf, T extends aaj> yx<B, T> a(za<B, T> $$0, yy<B, T> $$1) {
      return yx.a($$0, $$1);
   }

   static <T extends aaj> aaj.b<T> a(String $$0) {
      return new aaj.b<>(akr.b($$0));
   }

   static <B extends vw> yx<B, aaj> a(final aaj.a<B> $$0, List<aaj.c<? super B, ?>> $$1) {
      final Map<akr, yx<? super B, ? extends aaj>> $$2 = $$1.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a().a(), aaj.c::b));
      return new yx<B, aaj>() {
         private yx<? super B, ? extends aaj> a(akr $$0x) {
            yx<? super B, ? extends aaj> $$1 = $$2.get($$0);
            return $$1 != null ? $$1 : $$0.create($$0);
         }

         private <T extends aaj> void a(B $$0x, aaj.b<T> $$1, aaj $$2x) {
            $$0.a($$1.a());
            yx<B, T> $$3 = this.a($$1.a);
            $$3.encode($$0, (T)$$2);
         }

         public void a(B $$0x, aaj $$1) {
            this.a($$0, $$1.a(), $$1);
         }

         public aaj a(B $$0x) {
            akr $$1 = $$0.q();
            return (aaj)this.a($$1).decode($$0);
         }
      };
   }

   public interface a<B extends vw> {
      yx<B, ? extends aaj> create(akr var1);
   }

   public static record b<T extends aaj>(akr a) {
   }

   public static record c<B extends vw, T extends aaj>(aaj.b<T> a, yx<B, T> b) {
   }
}
