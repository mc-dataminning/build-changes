import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class ajs<T> {
   private static final ConcurrentMap<ajs.a, ajs<?>> a = new MapMaker().weakValues().makeMap();
   private final ajt b;
   private final ajt c;

   public static <T> Codec<ajs<T>> a(ajs<? extends iy<T>> $$0) {
      return ajt.a.xmap($$1 -> a($$0, $$1), ajs::a);
   }

   public static <T> ye<ByteBuf, ajs<T>> b(ajs<? extends iy<T>> $$0) {
      return ajt.b.a($$1 -> a($$0, $$1), ajs::a);
   }

   public static <T> ajs<T> a(ajs<? extends iy<T>> $$0, ajt $$1) {
      return a($$0.c, $$1);
   }

   public static <T> ajs<iy<T>> a(ajt $$0) {
      return a(ks.a, $$0);
   }

   private static <T> ajs<T> a(ajt $$0, ajt $$1) {
      return (ajs<T>)a.computeIfAbsent(new ajs.a($$0, $$1), $$0x -> new ajs($$0x.a, $$0x.b));
   }

   private ajs(ajt $$0, ajt $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean c(ajs<? extends iy<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<ajs<E>> d(ajs<? extends iy<E>> $$0) {
      return this.c($$0) ? Optional.of((ajs<E>)this) : Optional.empty();
   }

   public ajt a() {
      return this.c;
   }

   public ajt b() {
      return this.b;
   }

   static record a(ajt a, ajt b) {
   }
}
