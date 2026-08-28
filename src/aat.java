import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface aat {
   aat.b<? extends aat> a();

   static <B extends ByteBuf, T extends aat> zj<B, T> a(zm<B, T> $$0, zk<B, T> $$1) {
      return zj.a($$0, $$1);
   }

   static <T extends aat> aat.b<T> a(String $$0) {
      return new aat.b<>(new alb($$0));
   }

   static <B extends wl> zj<B, aat> a(final aat.a<B> $$0, List<aat.c<? super B, ?>> $$1) {
      final Map<alb, zj<? super B, ? extends aat>> $$2 = $$1.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a().a(), aat.c::b));
      return new zj<B, aat>() {
         private zj<? super B, ? extends aat> a(alb $$0x) {
            zj<? super B, ? extends aat> $$1 = $$2.get($$0);
            return $$1 != null ? $$1 : $$0.create($$0);
         }

         private <T extends aat> void a(B $$0x, aat.b<T> $$1, aat $$2x) {
            $$0.a($$1.a());
            zj<B, T> $$3 = this.a($$1.a);
            $$3.encode($$0, (T)$$2);
         }

         public void a(B $$0x, aat $$1) {
            this.a($$0, $$1.a(), $$1);
         }

         public aat a(B $$0x) {
            alb $$1 = $$0.q();
            return (aat)this.a($$1).decode($$0);
         }
      };
   }

   public interface a<B extends wl> {
      zj<B, ? extends aat> create(alb var1);
   }

   public static record b<T extends aat>(alb a) {
   }

   public static record c<B extends wl, T extends aat>(aat.b<T> a, zj<B, T> b) {
   }
}
