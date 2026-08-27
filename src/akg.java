import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class akg<T> {
   private static final ConcurrentMap<akg.a, akg<?>> a = new MapMaker().weakValues().makeMap();
   private final akh b;
   private final akh c;

   public static <T> Codec<akg<T>> a(akg<? extends jj<T>> $$0) {
      return akh.a.xmap($$1 -> a($$0, $$1), akg::a);
   }

   public static <T> ys<ByteBuf, akg<T>> b(akg<? extends jj<T>> $$0) {
      return akh.b.a($$1 -> a($$0, $$1), akg::a);
   }

   public static <T> akg<T> a(akg<? extends jj<T>> $$0, akh $$1) {
      return a($$0.c, $$1);
   }

   public static <T> akg<jj<T>> a(akh $$0) {
      return a(le.a, $$0);
   }

   private static <T> akg<T> a(akh $$0, akh $$1) {
      return (akg<T>)a.computeIfAbsent(new akg.a($$0, $$1), $$0x -> new akg($$0x.a, $$0x.b));
   }

   private akg(akh $$0, akh $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean c(akg<? extends jj<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<akg<E>> d(akg<? extends jj<E>> $$0) {
      return this.c($$0) ? Optional.of((akg<E>)this) : Optional.empty();
   }

   public akh a() {
      return this.c;
   }

   public akh b() {
      return this.b;
   }

   public akg<jj<T>> c() {
      return a(this.b);
   }

   static record a(akh a, akh b) {
   }
}
