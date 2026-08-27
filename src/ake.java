import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class ake<T> {
   private static final ConcurrentMap<ake.a, ake<?>> a = new MapMaker().weakValues().makeMap();
   private final akf b;
   private final akf c;

   public static <T> Codec<ake<T>> a(ake<? extends ji<T>> $$0) {
      return akf.a.xmap($$1 -> a($$0, $$1), ake::a);
   }

   public static <T> yq<ByteBuf, ake<T>> b(ake<? extends ji<T>> $$0) {
      return akf.b.a($$1 -> a($$0, $$1), ake::a);
   }

   public static <T> ake<T> a(ake<? extends ji<T>> $$0, akf $$1) {
      return a($$0.c, $$1);
   }

   public static <T> ake<ji<T>> a(akf $$0) {
      return a(ld.a, $$0);
   }

   private static <T> ake<T> a(akf $$0, akf $$1) {
      return (ake<T>)a.computeIfAbsent(new ake.a($$0, $$1), $$0x -> new ake($$0x.a, $$0x.b));
   }

   private ake(akf $$0, akf $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean c(ake<? extends ji<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<ake<E>> d(ake<? extends ji<E>> $$0) {
      return this.c($$0) ? Optional.of((ake<E>)this) : Optional.empty();
   }

   public akf a() {
      return this.c;
   }

   public akf b() {
      return this.b;
   }

   static record a(akf a, akf b) {
   }
}
