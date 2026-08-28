import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface aav {
   aav.b<? extends aav> a();

   static <B extends ByteBuf, T extends aav> zj<B, T> a(zm<B, T> $$0, zk<B, T> $$1) {
      return zj.a($$0, $$1);
   }

   static <T extends aav> aav.b<T> a(String $$0) {
      return new aav.b<>(all.b($$0));
   }

   static <B extends wi> zj<B, aav> a(final aav.a<B> $$0, List<aav.c<? super B, ?>> $$1) {
      final Map<all, zj<? super B, ? extends aav>> $$2 = $$1.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a().a(), aav.c::b));
      return new zj<B, aav>() {
         private zj<? super B, ? extends aav> a(all $$0x) {
            zj<? super B, ? extends aav> $$1 = $$2.get($$0);
            return $$1 != null ? $$1 : $$0.create($$0);
         }

         private <T extends aav> void a(B $$0x, aav.b<T> $$1, aav $$2x) {
            $$0.a($$1.a());
            zj<B, T> $$3 = this.a($$1.a);
            $$3.encode($$0, (T)$$2);
         }

         public void a(B $$0x, aav $$1) {
            this.a($$0, $$1.a(), $$1);
         }

         public aav a(B $$0x) {
            all $$1 = $$0.q();
            return (aav)this.a($$1).decode($$0);
         }
      };
   }

   public interface a<B extends wi> {
      zj<B, ? extends aav> create(all var1);
   }

   public static record b<T extends aav>(all a) {
   }

   public static record c<B extends wi, T extends aav>(aav.b<T> a, zj<B, T> b) {
   }
}
