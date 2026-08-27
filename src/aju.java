import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class aju<T> {
   private static final ConcurrentMap<aju.a, aju<?>> a = new MapMaker().weakValues().makeMap();
   private final ajv b;
   private final ajv c;

   public static <T> Codec<aju<T>> a(aju<? extends ja<T>> $$0) {
      return ajv.a.xmap($$1 -> a($$0, $$1), aju::a);
   }

   public static <T> yg<ByteBuf, aju<T>> b(aju<? extends ja<T>> $$0) {
      return ajv.b.a($$1 -> a($$0, $$1), aju::a);
   }

   public static <T> aju<T> a(aju<? extends ja<T>> $$0, ajv $$1) {
      return a($$0.c, $$1);
   }

   public static <T> aju<ja<T>> a(ajv $$0) {
      return a(ku.a, $$0);
   }

   private static <T> aju<T> a(ajv $$0, ajv $$1) {
      return (aju<T>)a.computeIfAbsent(new aju.a($$0, $$1), $$0x -> new aju($$0x.a, $$0x.b));
   }

   private aju(ajv $$0, ajv $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean c(aju<? extends ja<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<aju<E>> d(aju<? extends ja<E>> $$0) {
      return this.c($$0) ? Optional.of((aju<E>)this) : Optional.empty();
   }

   public ajv a() {
      return this.c;
   }

   public ajv b() {
      return this.b;
   }

   static record a(ajv a, ajv b) {
   }
}
