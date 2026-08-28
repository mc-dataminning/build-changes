import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class aku<T> {
   private static final ConcurrentMap<aku.a, aku<?>> a = new MapMaker().weakValues().makeMap();
   private final akv b;
   private final akv c;

   public static <T> Codec<aku<T>> a(aku<? extends ke<T>> $$0) {
      return akv.a.xmap($$1 -> a($$0, $$1), aku::a);
   }

   public static <T> yn<ByteBuf, aku<T>> b(aku<? extends ke<T>> $$0) {
      return akv.b.a($$1 -> a($$0, $$1), aku::a);
   }

   public static <T> aku<T> a(aku<? extends ke<T>> $$0, akv $$1) {
      return a($$0.c, $$1);
   }

   public static <T> aku<ke<T>> a(akv $$0) {
      return a(mc.a, $$0);
   }

   private static <T> aku<T> a(akv $$0, akv $$1) {
      return (aku<T>)a.computeIfAbsent(new aku.a($$0, $$1), $$0x -> new aku($$0x.a, $$0x.b));
   }

   private aku(akv $$0, akv $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean c(aku<? extends ke<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<aku<E>> d(aku<? extends ke<E>> $$0) {
      return this.c($$0) ? Optional.of((aku<E>)this) : Optional.empty();
   }

   public akv a() {
      return this.c;
   }

   public akv b() {
      return this.b;
   }

   public aku<ke<T>> c() {
      return a(this.b);
   }

   static record a(akv a, akv b) {
   }
}
