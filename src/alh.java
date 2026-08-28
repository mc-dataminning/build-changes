import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class alh<T> {
   private static final ConcurrentMap<alh.a, alh<?>> a = new MapMaker().weakValues().makeMap();
   private final ali b;
   private final ali c;

   public static <T> Codec<alh<T>> a(alh<? extends js<T>> $$0) {
      return ali.a.xmap($$1 -> a($$0, $$1), alh::a);
   }

   public static <T> yy<ByteBuf, alh<T>> b(alh<? extends js<T>> $$0) {
      return ali.b.a($$1 -> a($$0, $$1), alh::a);
   }

   public static <T> alh<T> a(alh<? extends js<T>> $$0, ali $$1) {
      return a($$0.c, $$1);
   }

   public static <T> alh<js<T>> a(ali $$0) {
      return a(mh.a, $$0);
   }

   private static <T> alh<T> a(ali $$0, ali $$1) {
      return (alh<T>)a.computeIfAbsent(new alh.a($$0, $$1), $$0x -> new alh($$0x.a, $$0x.b));
   }

   private alh(ali $$0, ali $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean c(alh<? extends js<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<alh<E>> d(alh<? extends js<E>> $$0) {
      return this.c($$0) ? Optional.of((alh<E>)this) : Optional.empty();
   }

   public ali a() {
      return this.c;
   }

   public ali b() {
      return this.b;
   }

   public alh<js<T>> c() {
      return a(this.b);
   }

   static record a(ali a, ali b) {
   }
}
