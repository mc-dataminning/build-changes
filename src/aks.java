import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class aks<T> {
   private static final ConcurrentMap<aks.a, aks<?>> a = new MapMaker().weakValues().makeMap();
   private final akt b;
   private final akt c;

   public static <T> Codec<aks<T>> a(aks<? extends jn<T>> $$0) {
      return akt.a.xmap($$1 -> a($$0, $$1), aks::a);
   }

   public static <T> zc<ByteBuf, aks<T>> b(aks<? extends jn<T>> $$0) {
      return akt.b.a($$1 -> a($$0, $$1), aks::a);
   }

   public static <T> aks<T> a(aks<? extends jn<T>> $$0, akt $$1) {
      return a($$0.c, $$1);
   }

   public static <T> aks<jn<T>> a(akt $$0) {
      return a(li.a, $$0);
   }

   private static <T> aks<T> a(akt $$0, akt $$1) {
      return (aks<T>)a.computeIfAbsent(new aks.a($$0, $$1), $$0x -> new aks($$0x.a, $$0x.b));
   }

   private aks(akt $$0, akt $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean c(aks<? extends jn<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<aks<E>> d(aks<? extends jn<E>> $$0) {
      return this.c($$0) ? Optional.of((aks<E>)this) : Optional.empty();
   }

   public akt a() {
      return this.c;
   }

   public akt b() {
      return this.b;
   }

   public aks<jn<T>> c() {
      return a(this.b);
   }

   static record a(akt a, akt b) {
   }
}
