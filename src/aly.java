import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class aly<T> {
   private static final ConcurrentMap<aly.a, aly<?>> a = new MapMaker().weakValues().makeMap();
   private final alz b;
   private final alz c;

   public static <T> Codec<aly<T>> a(aly<? extends kd<T>> $$0) {
      return alz.a.xmap($$1 -> a($$0, $$1), aly::a);
   }

   public static <T> zt<ByteBuf, aly<T>> b(aly<? extends kd<T>> $$0) {
      return alz.b.a($$1 -> a($$0, $$1), aly::a);
   }

   public static <T> aly<T> a(aly<? extends kd<T>> $$0, alz $$1) {
      return a($$0.c, $$1);
   }

   public static <T> aly<kd<T>> a(alz $$0) {
      return a(mb.a, $$0);
   }

   private static <T> aly<T> a(alz $$0, alz $$1) {
      return (aly<T>)a.computeIfAbsent(new aly.a($$0, $$1), $$0x -> new aly($$0x.a, $$0x.b));
   }

   private aly(alz $$0, alz $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean c(aly<? extends kd<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<aly<E>> d(aly<? extends kd<E>> $$0) {
      return this.c($$0) ? Optional.of((aly<E>)this) : Optional.empty();
   }

   public alz a() {
      return this.c;
   }

   public alz b() {
      return this.b;
   }

   public aly<kd<T>> c() {
      return a(this.b);
   }

   static record a(alz a, alz b) {
   }
}
