import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class alf<T> {
   private static final ConcurrentMap<alf.a, alf<?>> a = new MapMaker().weakValues().makeMap();
   private final alg b;
   private final alg c;

   public static <T> Codec<alf<T>> a(alf<? extends jr<T>> $$0) {
      return alg.a.xmap($$1 -> a($$0, $$1), alf::a);
   }

   public static <T> yw<ByteBuf, alf<T>> b(alf<? extends jr<T>> $$0) {
      return alg.b.a($$1 -> a($$0, $$1), alf::a);
   }

   public static <T> alf<T> a(alf<? extends jr<T>> $$0, alg $$1) {
      return a($$0.c, $$1);
   }

   public static <T> alf<jr<T>> a(alg $$0) {
      return a(mg.a, $$0);
   }

   private static <T> alf<T> a(alg $$0, alg $$1) {
      return (alf<T>)a.computeIfAbsent(new alf.a($$0, $$1), $$0x -> new alf($$0x.a, $$0x.b));
   }

   private alf(alg $$0, alg $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean c(alf<? extends jr<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<alf<E>> d(alf<? extends jr<E>> $$0) {
      return this.c($$0) ? Optional.of((alf<E>)this) : Optional.empty();
   }

   public alg a() {
      return this.c;
   }

   public alg b() {
      return this.b;
   }

   public alf<jr<T>> c() {
      return a(this.b);
   }

   static record a(alg a, alg b) {
   }
}
