import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class alk<T> {
   private static final ConcurrentMap<alk.a, alk<?>> a = new MapMaker().weakValues().makeMap();
   private final all b;
   private final all c;

   public static <T> Codec<alk<T>> a(alk<? extends kd<T>> $$0) {
      return all.a.xmap($$1 -> a($$0, $$1), alk::a);
   }

   public static <T> zj<ByteBuf, alk<T>> b(alk<? extends kd<T>> $$0) {
      return all.b.a($$1 -> a($$0, $$1), alk::a);
   }

   public static <T> alk<T> a(alk<? extends kd<T>> $$0, all $$1) {
      return a($$0.c, $$1);
   }

   public static <T> alk<kd<T>> a(all $$0) {
      return a(ma.a, $$0);
   }

   private static <T> alk<T> a(all $$0, all $$1) {
      return (alk<T>)a.computeIfAbsent(new alk.a($$0, $$1), $$0x -> new alk($$0x.a, $$0x.b));
   }

   private alk(all $$0, all $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean c(alk<? extends kd<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<alk<E>> d(alk<? extends kd<E>> $$0) {
      return this.c($$0) ? Optional.of((alk<E>)this) : Optional.empty();
   }

   public all a() {
      return this.c;
   }

   public all b() {
      return this.b;
   }

   public alk<kd<T>> c() {
      return a(this.b);
   }

   static record a(all a, all b) {
   }
}
