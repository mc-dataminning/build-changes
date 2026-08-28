import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class ald<T> {
   private static final ConcurrentMap<ald.a, ald<?>> a = new MapMaker().weakValues().makeMap();
   private final ale b;
   private final ale c;

   public static <T> Codec<ald<T>> a(ald<? extends jv<T>> $$0) {
      return ale.a.xmap($$1 -> a($$0, $$1), ald::a);
   }

   public static <T> zm<ByteBuf, ald<T>> b(ald<? extends jv<T>> $$0) {
      return ale.b.a($$1 -> a($$0, $$1), ald::a);
   }

   public static <T> ald<T> a(ald<? extends jv<T>> $$0, ale $$1) {
      return a($$0.c, $$1);
   }

   public static <T> ald<jv<T>> a(ale $$0) {
      return a(lq.a, $$0);
   }

   private static <T> ald<T> a(ale $$0, ale $$1) {
      return (ald<T>)a.computeIfAbsent(new ald.a($$0, $$1), $$0x -> new ald($$0x.a, $$0x.b));
   }

   private ald(ale $$0, ale $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean c(ald<? extends jv<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<ald<E>> d(ald<? extends jv<E>> $$0) {
      return this.c($$0) ? Optional.of((ald<E>)this) : Optional.empty();
   }

   public ale a() {
      return this.c;
   }

   public ale b() {
      return this.b;
   }

   public ald<jv<T>> c() {
      return a(this.b);
   }

   static record a(ale a, ale b) {
   }
}
