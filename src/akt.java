import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class akt<T> {
   private static final ConcurrentMap<akt.a, akt<?>> a = new MapMaker().weakValues().makeMap();
   private final aku b;
   private final aku c;

   public static <T> Codec<akt<T>> a(akt<? extends ke<T>> $$0) {
      return aku.a.xmap($$1 -> a($$0, $$1), akt::a);
   }

   public static <T> ym<ByteBuf, akt<T>> b(akt<? extends ke<T>> $$0) {
      return aku.b.a($$1 -> a($$0, $$1), akt::a);
   }

   public static <T> akt<T> a(akt<? extends ke<T>> $$0, aku $$1) {
      return a($$0.c, $$1);
   }

   public static <T> akt<ke<T>> a(aku $$0) {
      return a(mc.a, $$0);
   }

   private static <T> akt<T> a(aku $$0, aku $$1) {
      return (akt<T>)a.computeIfAbsent(new akt.a($$0, $$1), $$0x -> new akt($$0x.a, $$0x.b));
   }

   private akt(aku $$0, aku $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean c(akt<? extends ke<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<akt<E>> d(akt<? extends ke<E>> $$0) {
      return this.c($$0) ? Optional.of((akt<E>)this) : Optional.empty();
   }

   public aku a() {
      return this.c;
   }

   public aku b() {
      return this.b;
   }

   public akt<ke<T>> c() {
      return a(this.b);
   }

   static record a(aku a, aku b) {
   }
}
