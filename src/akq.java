import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class akq<T> {
   private static final ConcurrentMap<akq.a, akq<?>> a = new MapMaker().weakValues().makeMap();
   private final akr b;
   private final akr c;

   public static <T> Codec<akq<T>> a(akq<? extends jz<T>> $$0) {
      return akr.a.xmap($$1 -> a($$0, $$1), akq::a);
   }

   public static <T> yx<ByteBuf, akq<T>> b(akq<? extends jz<T>> $$0) {
      return akr.b.a($$1 -> a($$0, $$1), akq::a);
   }

   public static <T> akq<T> a(akq<? extends jz<T>> $$0, akr $$1) {
      return a($$0.c, $$1);
   }

   public static <T> akq<jz<T>> a(akr $$0) {
      return a(lu.a, $$0);
   }

   private static <T> akq<T> a(akr $$0, akr $$1) {
      return (akq<T>)a.computeIfAbsent(new akq.a($$0, $$1), $$0x -> new akq($$0x.a, $$0x.b));
   }

   private akq(akr $$0, akr $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean c(akq<? extends jz<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<akq<E>> d(akq<? extends jz<E>> $$0) {
      return this.c($$0) ? Optional.of((akq<E>)this) : Optional.empty();
   }

   public akr a() {
      return this.c;
   }

   public akr b() {
      return this.b;
   }

   public akq<jz<T>> c() {
      return a(this.b);
   }

   static record a(akr a, akr b) {
   }
}
