import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class akm<T> {
   private static final ConcurrentMap<akm.a, akm<?>> a = new MapMaker().weakValues().makeMap();
   private final akn b;
   private final akn c;

   public static <T> Codec<akm<T>> a(akm<? extends jk<T>> $$0) {
      return akn.a.xmap($$1 -> a($$0, $$1), akm::a);
   }

   public static <T> yv<ByteBuf, akm<T>> b(akm<? extends jk<T>> $$0) {
      return akn.b.a($$1 -> a($$0, $$1), akm::a);
   }

   public static <T> akm<T> a(akm<? extends jk<T>> $$0, akn $$1) {
      return a($$0.c, $$1);
   }

   public static <T> akm<jk<T>> a(akn $$0) {
      return a(lf.a, $$0);
   }

   private static <T> akm<T> a(akn $$0, akn $$1) {
      return (akm<T>)a.computeIfAbsent(new akm.a($$0, $$1), $$0x -> new akm($$0x.a, $$0x.b));
   }

   private akm(akn $$0, akn $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean c(akm<? extends jk<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<akm<E>> d(akm<? extends jk<E>> $$0) {
      return this.c($$0) ? Optional.of((akm<E>)this) : Optional.empty();
   }

   public akn a() {
      return this.c;
   }

   public akn b() {
      return this.b;
   }

   public akm<jk<T>> c() {
      return a(this.b);
   }

   static record a(akn a, akn b) {
   }
}
