import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class alo<T> {
   private static final ConcurrentMap<alo.a, alo<?>> a = new MapMaker().weakValues().makeMap();
   private final alp b;
   private final alp c;

   public static <T> Codec<alo<T>> a(alo<? extends kd<T>> $$0) {
      return alp.a.xmap($$1 -> a($$0, $$1), alo::a);
   }

   public static <T> zi<ByteBuf, alo<T>> b(alo<? extends kd<T>> $$0) {
      return alp.b.a($$1 -> a($$0, $$1), alo::a);
   }

   public static <T> alo<T> a(alo<? extends kd<T>> $$0, alp $$1) {
      return a($$0.c, $$1);
   }

   public static <T> alo<kd<T>> a(alp $$0) {
      return a(mb.a, $$0);
   }

   private static <T> alo<T> a(alp $$0, alp $$1) {
      return (alo<T>)a.computeIfAbsent(new alo.a($$0, $$1), $$0x -> new alo($$0x.a, $$0x.b));
   }

   private alo(alp $$0, alp $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean c(alo<? extends kd<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<alo<E>> d(alo<? extends kd<E>> $$0) {
      return this.c($$0) ? Optional.of((alo<E>)this) : Optional.empty();
   }

   public alp a() {
      return this.c;
   }

   public alp b() {
      return this.b;
   }

   public alo<kd<T>> c() {
      return a(this.b);
   }

   static record a(alp a, alp b) {
   }
}
