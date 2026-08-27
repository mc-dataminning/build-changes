import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class ajb<T> {
   private static final ConcurrentMap<ajb.a, ajb<?>> a = new MapMaker().weakValues().makeMap();
   private final ajc b;
   private final ajc c;

   public static <T> Codec<ajb<T>> a(ajb<? extends ix<T>> $$0) {
      return ajc.a.xmap($$1 -> a($$0, $$1), ajb::a);
   }

   public static <T> xq<ByteBuf, ajb<T>> b(ajb<? extends ix<T>> $$0) {
      return ajc.b.a($$1 -> a($$0, $$1), ajb::a);
   }

   public static <T> ajb<T> a(ajb<? extends ix<T>> $$0, ajc $$1) {
      return a($$0.c, $$1);
   }

   public static <T> ajb<ix<T>> a(ajc $$0) {
      return a(ki.a, $$0);
   }

   private static <T> ajb<T> a(ajc $$0, ajc $$1) {
      return (ajb<T>)a.computeIfAbsent(new ajb.a($$0, $$1), $$0x -> new ajb($$0x.a, $$0x.b));
   }

   private ajb(ajc $$0, ajc $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean c(ajb<? extends ix<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<ajb<E>> d(ajb<? extends ix<E>> $$0) {
      return this.c($$0) ? Optional.of((ajb<E>)this) : Optional.empty();
   }

   public ajc a() {
      return this.c;
   }

   public ajc b() {
      return this.b;
   }

   static record a(ajc a, ajc b) {
   }
}
