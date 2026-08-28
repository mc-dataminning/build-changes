import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface aas {
   aas.b<? extends aas> a();

   static <B extends ByteBuf, T extends aas> zg<B, T> a(zj<B, T> $$0, zh<B, T> $$1) {
      return zg.a($$0, $$1);
   }

   static <T extends aas> aas.b<T> a(String $$0) {
      return new aas.b<>(ali.b($$0));
   }

   static <B extends wf> zg<B, aas> a(final aas.a<B> $$0, List<aas.c<? super B, ?>> $$1) {
      final Map<ali, zg<? super B, ? extends aas>> $$2 = $$1.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a().a(), aas.c::b));
      return new zg<B, aas>() {
         private zg<? super B, ? extends aas> a(ali $$0x) {
            zg<? super B, ? extends aas> $$1 = $$2.get($$0);
            return $$1 != null ? $$1 : $$0.create($$0);
         }

         private <T extends aas> void a(B $$0x, aas.b<T> $$1, aas $$2x) {
            $$0.a($$1.a());
            zg<B, T> $$3 = this.a($$1.a);
            $$3.encode($$0, (T)$$2);
         }

         public void a(B $$0x, aas $$1) {
            this.a($$0, $$1.a(), $$1);
         }

         public aas a(B $$0x) {
            ali $$1 = $$0.q();
            return (aas)this.a($$1).decode($$0);
         }
      };
   }

   public interface a<B extends wf> {
      zg<B, ? extends aas> create(ali var1);
   }

   public static record b<T extends aas>(ali a) {
   }

   public static record c<B extends wf, T extends aas>(aas.b<T> a, zg<B, T> b) {
   }
}
