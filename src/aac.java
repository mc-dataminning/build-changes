import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface aac {
   aac.b<? extends aac> a();

   static <B extends ByteBuf, T extends aac> ys<B, T> a(yv<B, T> $$0, yt<B, T> $$1) {
      return ys.a($$0, $$1);
   }

   static <T extends aac> aac.b<T> a(String $$0) {
      return new aac.b<>(new akk($$0));
   }

   static <B extends vr> ys<B, aac> a(final aac.a<B> $$0, List<aac.c<? super B, ?>> $$1) {
      final Map<akk, ys<? super B, ? extends aac>> $$2 = $$1.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a().a(), aac.c::b));
      return new ys<B, aac>() {
         private ys<? super B, ? extends aac> a(akk $$0x) {
            ys<? super B, ? extends aac> $$1 = $$2.get($$0);
            return $$1 != null ? $$1 : $$0.create($$0);
         }

         private <T extends aac> void a(B $$0x, aac.b<T> $$1, aac $$2x) {
            $$0.a($$1.a());
            ys<B, T> $$3 = this.a($$1.a);
            $$3.encode($$0, (T)$$2);
         }

         public void a(B $$0x, aac $$1) {
            this.a($$0, $$1.a(), $$1);
         }

         public aac a(B $$0x) {
            akk $$1 = $$0.q();
            return (aac)this.a($$1).decode($$0);
         }
      };
   }

   public interface a<B extends vr> {
      ys<B, ? extends aac> create(akk var1);
   }

   public static record b<T extends aac>(akk a) {
   }

   public static record c<B extends vr, T extends aac>(aac.b<T> a, ys<B, T> b) {
   }
}
