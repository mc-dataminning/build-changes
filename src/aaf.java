import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface aaf {
   aaf.b<? extends aaf> a();

   static <B extends ByteBuf, T extends aaf> yt<B, T> a(yw<B, T> $$0, yu<B, T> $$1) {
      return yt.a($$0, $$1);
   }

   static <T extends aaf> aaf.b<T> a(String $$0) {
      return new aaf.b<>(ald.b($$0));
   }

   static <B extends vr> yt<B, aaf> a(final aaf.a<B> $$0, List<aaf.c<? super B, ?>> $$1) {
      final Map<ald, yt<? super B, ? extends aaf>> $$2 = $$1.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a().a(), aaf.c::b));
      return new yt<B, aaf>() {
         private yt<? super B, ? extends aaf> a(ald $$0x) {
            yt<? super B, ? extends aaf> $$1 = $$2.get($$0);
            return $$1 != null ? $$1 : $$0.create($$0);
         }

         private <T extends aaf> void a(B $$0x, aaf.b<T> $$1, aaf $$2x) {
            $$0.a($$1.a());
            yt<B, T> $$3 = this.a($$1.a);
            $$3.encode($$0, (T)$$2);
         }

         public void a(B $$0x, aaf $$1) {
            this.a($$0, $$1.a(), $$1);
         }

         public aaf a(B $$0x) {
            ald $$1 = $$0.q();
            return (aaf)this.a($$1).decode($$0);
         }
      };
   }

   public interface a<B extends vr> {
      yt<B, ? extends aaf> create(ald var1);
   }

   public static record b<T extends aaf>(ald a) {
   }

   public static record c<B extends vr, T extends aaf>(aaf.b<T> a, yt<B, T> b) {
   }
}
