import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class alq<T> {
   private static final ConcurrentMap<alq.a, alq<?>> a = new MapMaker().weakValues().makeMap();
   private final alr b;
   private final alr c;

   public static <T> Codec<alq<T>> a(alq<? extends jt<T>> $$0) {
      return alr.a.xmap($$1 -> a($$0, $$1), alq::a);
   }

   public static <T> ze<ByteBuf, alq<T>> b(alq<? extends jt<T>> $$0) {
      return alr.b.a($$1 -> a($$0, $$1), alq::a);
   }

   public static <T> alq<T> a(alq<? extends jt<T>> $$0, alr $$1) {
      return a($$0.c, $$1);
   }

   public static <T> alq<jt<T>> a(alr $$0) {
      return a(mi.a, $$0);
   }

   private static <T> alq<T> a(alr $$0, alr $$1) {
      return (alq<T>)a.computeIfAbsent(new alq.a($$0, $$1), $$0x -> new alq($$0x.a, $$0x.b));
   }

   private alq(alr $$0, alr $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean c(alq<? extends jt<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<alq<E>> d(alq<? extends jt<E>> $$0) {
      return this.c($$0) ? Optional.of((alq<E>)this) : Optional.empty();
   }

   public alr a() {
      return this.c;
   }

   public alr b() {
      return this.b;
   }

   public alq<jt<T>> c() {
      return a(this.b);
   }

   static record a(alr a, alr b) {
   }
}
