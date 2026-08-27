import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class ajg<T> {
   private static final ConcurrentMap<ajg.a, ajg<?>> a = new MapMaker().weakValues().makeMap();
   private final ajh b;
   private final ajh c;

   public static <T> Codec<ajg<T>> a(ajg<? extends iy<T>> $$0) {
      return ajh.a.xmap($$1 -> a($$0, $$1), ajg::a);
   }

   public static <T> xs<ByteBuf, ajg<T>> b(ajg<? extends iy<T>> $$0) {
      return ajh.b.a($$1 -> a($$0, $$1), ajg::a);
   }

   public static <T> ajg<T> a(ajg<? extends iy<T>> $$0, ajh $$1) {
      return a($$0.c, $$1);
   }

   public static <T> ajg<iy<T>> a(ajh $$0) {
      return a(kj.a, $$0);
   }

   private static <T> ajg<T> a(ajh $$0, ajh $$1) {
      return (ajg<T>)a.computeIfAbsent(new ajg.a($$0, $$1), $$0x -> new ajg($$0x.a, $$0x.b));
   }

   private ajg(ajh $$0, ajh $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean c(ajg<? extends iy<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<ajg<E>> d(ajg<? extends iy<E>> $$0) {
      return this.c($$0) ? Optional.of((ajg<E>)this) : Optional.empty();
   }

   public ajh a() {
      return this.c;
   }

   public ajh b() {
      return this.b;
   }

   static record a(ajh a, ajh b) {
   }
}
