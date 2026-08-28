import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface aau {
   aau.b<? extends aau> a();

   static <B extends ByteBuf, T extends aau> zi<B, T> a(zl<B, T> $$0, zj<B, T> $$1) {
      return zi.a($$0, $$1);
   }

   static <T extends aau> aau.b<T> a(String $$0) {
      return new aau.b<>(alp.b($$0));
   }

   static <B extends wh> zi<B, aau> a(final aau.a<B> $$0, List<aau.c<? super B, ?>> $$1) {
      final Map<alp, zi<? super B, ? extends aau>> $$2 = $$1.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a().a(), aau.c::b));
      return new zi<B, aau>() {
         private zi<? super B, ? extends aau> a(alp $$0x) {
            zi<? super B, ? extends aau> $$1 = $$2.get($$0);
            return $$1 != null ? $$1 : $$0.create($$0);
         }

         private <T extends aau> void a(B $$0x, aau.b<T> $$1, aau $$2x) {
            $$0.a($$1.a());
            zi<B, T> $$3 = this.a($$1.a);
            $$3.encode($$0, (T)$$2);
         }

         public void a(B $$0x, aau $$1) {
            this.a($$0, $$1.a(), $$1);
         }

         public aau a(B $$0x) {
            alp $$1 = $$0.q();
            return (aau)this.a($$1).decode($$0);
         }
      };
   }

   public interface a<B extends wh> {
      zi<B, ? extends aau> create(alp var1);
   }

   public static record b<T extends aau>(alp a) {
   }

   public static record c<B extends wh, T extends aau>(aau.b<T> a, zi<B, T> b) {
   }
}
