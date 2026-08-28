import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface aat {
   aat.b<? extends aat> a();

   static <B extends ByteBuf, T extends aat> zh<B, T> a(zk<B, T> $$0, zi<B, T> $$1) {
      return zh.a($$0, $$1);
   }

   static <T extends aat> aat.b<T> a(String $$0) {
      return new aat.b<>(alj.b($$0));
   }

   static <B extends wg> zh<B, aat> a(final aat.a<B> $$0, List<aat.c<? super B, ?>> $$1) {
      final Map<alj, zh<? super B, ? extends aat>> $$2 = $$1.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a().a(), aat.c::b));
      return new zh<B, aat>() {
         private zh<? super B, ? extends aat> a(alj $$0x) {
            zh<? super B, ? extends aat> $$1 = $$2.get($$0);
            return $$1 != null ? $$1 : $$0.create($$0);
         }

         private <T extends aat> void a(B $$0x, aat.b<T> $$1, aat $$2x) {
            $$0.a($$1.a());
            zh<B, T> $$3 = this.a($$1.a);
            $$3.encode($$0, (T)$$2);
         }

         public void a(B $$0x, aat $$1) {
            this.a($$0, $$1.a(), $$1);
         }

         public aat a(B $$0x) {
            alj $$1 = $$0.q();
            return (aat)this.a($$1).decode($$0);
         }
      };
   }

   public interface a<B extends wg> {
      zh<B, ? extends aat> create(alj var1);
   }

   public static record b<T extends aat>(alj a) {
   }

   public static record c<B extends wg, T extends aat>(aat.b<T> a, zh<B, T> b) {
   }
}
