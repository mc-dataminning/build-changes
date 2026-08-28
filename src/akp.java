import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class akp<T> {
   private static final ConcurrentMap<akp.a, akp<?>> a = new MapMaker().weakValues().makeMap();
   private final akq b;
   private final akq c;

   public static <T> Codec<akp<T>> a(akp<? extends jz<T>> $$0) {
      return akq.a.xmap($$1 -> a($$0, $$1), akp::a);
   }

   public static <T> yw<ByteBuf, akp<T>> b(akp<? extends jz<T>> $$0) {
      return akq.b.a($$1 -> a($$0, $$1), akp::a);
   }

   public static <T> akp<T> a(akp<? extends jz<T>> $$0, akq $$1) {
      return a($$0.c, $$1);
   }

   public static <T> akp<jz<T>> a(akq $$0) {
      return a(lu.a, $$0);
   }

   private static <T> akp<T> a(akq $$0, akq $$1) {
      return (akp<T>)a.computeIfAbsent(new akp.a($$0, $$1), $$0x -> new akp($$0x.a, $$0x.b));
   }

   private akp(akq $$0, akq $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean c(akp<? extends jz<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<akp<E>> d(akp<? extends jz<E>> $$0) {
      return this.c($$0) ? Optional.of((akp<E>)this) : Optional.empty();
   }

   public akq a() {
      return this.c;
   }

   public akq b() {
      return this.b;
   }

   public akp<jz<T>> c() {
      return a(this.b);
   }

   static record a(akq a, akq b) {
   }
}
