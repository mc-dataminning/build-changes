import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface aax {
   aax.b<? extends aax> a();

   static <B extends ByteBuf, T extends aax> zn<B, T> a(zq<B, T> $$0, zo<B, T> $$1) {
      return zn.a($$0, $$1);
   }

   static <T extends aax> aax.b<T> a(String $$0) {
      return new aax.b<>(new alf($$0));
   }

   static <B extends wm> zn<B, aax> a(final aax.a<B> $$0, List<aax.c<? super B, ?>> $$1) {
      final Map<alf, zn<? super B, ? extends aax>> $$2 = $$1.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a().a(), aax.c::b));
      return new zn<B, aax>() {
         private zn<? super B, ? extends aax> a(alf $$0x) {
            zn<? super B, ? extends aax> $$1 = $$2.get($$0);
            return $$1 != null ? $$1 : $$0.create($$0);
         }

         private <T extends aax> void a(B $$0x, aax.b<T> $$1, aax $$2x) {
            $$0.a($$1.a());
            zn<B, T> $$3 = this.a($$1.a);
            $$3.encode($$0, (T)$$2);
         }

         public void a(B $$0x, aax $$1) {
            this.a($$0, $$1.a(), $$1);
         }

         public aax a(B $$0x) {
            alf $$1 = $$0.q();
            return (aax)this.a($$1).decode($$0);
         }
      };
   }

   public interface a<B extends wm> {
      zn<B, ? extends aax> create(alf var1);
   }

   public static record b<T extends aax>(alf a) {
   }

   public static record c<B extends wm, T extends aax>(aax.b<T> a, zn<B, T> b) {
   }
}
