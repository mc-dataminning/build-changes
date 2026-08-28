import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class alb<T> {
   private static final ConcurrentMap<alb.a, alb<?>> a = new MapMaker().weakValues().makeMap();
   private final alc b;
   private final alc c;

   public static <T> Codec<alb<T>> a(alb<? extends ka<T>> $$0) {
      return alc.a.xmap($$1 -> a($$0, $$1), alb::a);
   }

   public static <T> zb<ByteBuf, alb<T>> b(alb<? extends ka<T>> $$0) {
      return alc.b.a($$1 -> a($$0, $$1), alb::a);
   }

   public static <T> alb<T> a(alb<? extends ka<T>> $$0, alc $$1) {
      return a($$0.c, $$1);
   }

   public static <T> alb<ka<T>> a(alc $$0) {
      return a(lv.a, $$0);
   }

   private static <T> alb<T> a(alc $$0, alc $$1) {
      return (alb<T>)a.computeIfAbsent(new alb.a($$0, $$1), $$0x -> new alb($$0x.a, $$0x.b));
   }

   private alb(alc $$0, alc $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean c(alb<? extends ka<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<alb<E>> d(alb<? extends ka<E>> $$0) {
      return this.c($$0) ? Optional.of((alb<E>)this) : Optional.empty();
   }

   public alc a() {
      return this.c;
   }

   public alc b() {
      return this.b;
   }

   public alb<ka<T>> c() {
      return a(this.b);
   }

   static record a(alc a, alc b) {
   }
}
