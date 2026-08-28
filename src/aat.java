import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface aat {
   aat.b<? extends aat> a();

   static <B extends ByteBuf, T extends aat> ze<B, T> a(zh<B, T> $$0, zf<B, T> $$1) {
      return ze.a($$0, $$1);
   }

   static <T extends aat> aat.b<T> a(String $$0) {
      return new aat.b<>(alr.b($$0));
   }

   static <B extends vy> ze<B, aat> a(final aat.a<B> $$0, List<aat.c<? super B, ?>> $$1) {
      final Map<alr, ze<? super B, ? extends aat>> $$2 = $$1.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a().a(), aat.c::b));
      return new ze<B, aat>() {
         private ze<? super B, ? extends aat> a(alr $$0x) {
            ze<? super B, ? extends aat> $$1 = $$2.get($$0);
            return $$1 != null ? $$1 : $$0.create($$0);
         }

         private <T extends aat> void a(B $$0x, aat.b<T> $$1, aat $$2x) {
            $$0.a($$1.a());
            ze<B, T> $$3 = this.a($$1.a);
            $$3.encode($$0, (T)$$2);
         }

         public void a(B $$0x, aat $$1) {
            this.a($$0, $$1.a(), $$1);
         }

         public aat a(B $$0x) {
            alr $$1 = $$0.q();
            return (aat)this.a($$1).decode($$0);
         }
      };
   }

   public interface a<B extends vy> {
      ze<B, ? extends aat> create(alr var1);
   }

   public static record b<T extends aat>(alr a) {
   }

   public static record c<B extends vy, T extends aat>(aat.b<T> a, ze<B, T> b) {
   }
}
