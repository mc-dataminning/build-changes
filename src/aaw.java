import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface aaw {
   aaw.b<? extends aaw> a();

   static <B extends ByteBuf, T extends aaw> zm<B, T> a(zp<B, T> $$0, zn<B, T> $$1) {
      return zm.a($$0, $$1);
   }

   static <T extends aaw> aaw.b<T> a(String $$0) {
      return new aaw.b<>(new ale($$0));
   }

   static <B extends wl> zm<B, aaw> a(final aaw.a<B> $$0, List<aaw.c<? super B, ?>> $$1) {
      final Map<ale, zm<? super B, ? extends aaw>> $$2 = $$1.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a().a(), aaw.c::b));
      return new zm<B, aaw>() {
         private zm<? super B, ? extends aaw> a(ale $$0x) {
            zm<? super B, ? extends aaw> $$1 = $$2.get($$0);
            return $$1 != null ? $$1 : $$0.create($$0);
         }

         private <T extends aaw> void a(B $$0x, aaw.b<T> $$1, aaw $$2x) {
            $$0.a($$1.a());
            zm<B, T> $$3 = this.a($$1.a);
            $$3.encode($$0, (T)$$2);
         }

         public void a(B $$0x, aaw $$1) {
            this.a($$0, $$1.a(), $$1);
         }

         public aaw a(B $$0x) {
            ale $$1 = $$0.q();
            return (aaw)this.a($$1).decode($$0);
         }
      };
   }

   public interface a<B extends wl> {
      zm<B, ? extends aaw> create(ale var1);
   }

   public static record b<T extends aaw>(ale a) {
   }

   public static record c<B extends wl, T extends aaw>(aaw.b<T> a, zm<B, T> b) {
   }
}
