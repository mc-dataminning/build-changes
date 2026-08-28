import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class akj<T> {
   private static final ConcurrentMap<akj.a, akj<?>> a = new MapMaker().weakValues().makeMap();
   private final akk b;
   private final akk c;

   public static <T> Codec<akj<T>> a(akj<? extends jw<T>> $$0) {
      return akk.a.xmap($$1 -> a($$0, $$1), akj::a);
   }

   public static <T> ys<ByteBuf, akj<T>> b(akj<? extends jw<T>> $$0) {
      return akk.b.a($$1 -> a($$0, $$1), akj::a);
   }

   public static <T> akj<T> a(akj<? extends jw<T>> $$0, akk $$1) {
      return a($$0.c, $$1);
   }

   public static <T> akj<jw<T>> a(akk $$0) {
      return a(lr.a, $$0);
   }

   private static <T> akj<T> a(akk $$0, akk $$1) {
      return (akj<T>)a.computeIfAbsent(new akj.a($$0, $$1), $$0x -> new akj($$0x.a, $$0x.b));
   }

   private akj(akk $$0, akk $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean c(akj<? extends jw<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<akj<E>> d(akj<? extends jw<E>> $$0) {
      return this.c($$0) ? Optional.of((akj<E>)this) : Optional.empty();
   }

   public akk a() {
      return this.c;
   }

   public akk b() {
      return this.b;
   }

   public akj<jw<T>> c() {
      return a(this.b);
   }

   static record a(akk a, akk b) {
   }
}
