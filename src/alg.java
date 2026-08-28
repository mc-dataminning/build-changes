import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class alg<T> {
   private static final ConcurrentMap<alg.a, alg<?>> a = new MapMaker().weakValues().makeMap();
   private final alh b;
   private final alh c;

   public static <T> Codec<alg<T>> a(alg<? extends kc<T>> $$0) {
      return alh.a.xmap($$1 -> a($$0, $$1), alg::a);
   }

   public static <T> zf<ByteBuf, alg<T>> b(alg<? extends kc<T>> $$0) {
      return alh.b.a($$1 -> a($$0, $$1), alg::a);
   }

   public static <T> alg<T> a(alg<? extends kc<T>> $$0, alh $$1) {
      return a($$0.c, $$1);
   }

   public static <T> alg<kc<T>> a(alh $$0) {
      return a(ly.a, $$0);
   }

   private static <T> alg<T> a(alh $$0, alh $$1) {
      return (alg<T>)a.computeIfAbsent(new alg.a($$0, $$1), $$0x -> new alg($$0x.a, $$0x.b));
   }

   private alg(alh $$0, alh $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean c(alg<? extends kc<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<alg<E>> d(alg<? extends kc<E>> $$0) {
      return this.c($$0) ? Optional.of((alg<E>)this) : Optional.empty();
   }

   public alh a() {
      return this.c;
   }

   public alh b() {
      return this.b;
   }

   public alg<kc<T>> c() {
      return a(this.b);
   }

   static record a(alh a, alh b) {
   }
}
