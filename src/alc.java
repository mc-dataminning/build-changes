import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class alc<T> {
   private static final ConcurrentMap<alc.a, alc<?>> a = new MapMaker().weakValues().makeMap();
   private final ald b;
   private final ald c;

   public static <T> Codec<alc<T>> a(alc<? extends kf<T>> $$0) {
      return ald.a.xmap($$1 -> a($$0, $$1), alc::a);
   }

   public static <T> yt<ByteBuf, alc<T>> b(alc<? extends kf<T>> $$0) {
      return ald.b.a($$1 -> a($$0, $$1), alc::a);
   }

   public static <T> alc<T> a(alc<? extends kf<T>> $$0, ald $$1) {
      return a($$0.c, $$1);
   }

   public static <T> alc<kf<T>> a(ald $$0) {
      return a(me.a, $$0);
   }

   private static <T> alc<T> a(ald $$0, ald $$1) {
      return (alc<T>)a.computeIfAbsent(new alc.a($$0, $$1), $$0x -> new alc($$0x.a, $$0x.b));
   }

   private alc(ald $$0, ald $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean c(alc<? extends kf<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<alc<E>> d(alc<? extends kf<E>> $$0) {
      return this.c($$0) ? Optional.of((alc<E>)this) : Optional.empty();
   }

   public ald a() {
      return this.c;
   }

   public ald b() {
      return this.b;
   }

   public alc<kf<T>> c() {
      return a(this.b);
   }

   static record a(ald a, ald b) {
   }
}
