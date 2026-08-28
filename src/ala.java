import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class ala<T> {
   private static final ConcurrentMap<ala.a, ala<?>> a = new MapMaker().weakValues().makeMap();
   private final alb b;
   private final alb c;

   public static <T> Codec<ala<T>> a(ala<? extends jv<T>> $$0) {
      return alb.a.xmap($$1 -> a($$0, $$1), ala::a);
   }

   public static <T> zj<ByteBuf, ala<T>> b(ala<? extends jv<T>> $$0) {
      return alb.b.a($$1 -> a($$0, $$1), ala::a);
   }

   public static <T> ala<T> a(ala<? extends jv<T>> $$0, alb $$1) {
      return a($$0.c, $$1);
   }

   public static <T> ala<jv<T>> a(alb $$0) {
      return a(lq.a, $$0);
   }

   private static <T> ala<T> a(alb $$0, alb $$1) {
      return (ala<T>)a.computeIfAbsent(new ala.a($$0, $$1), $$0x -> new ala($$0x.a, $$0x.b));
   }

   private ala(alb $$0, alb $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean c(ala<? extends jv<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<ala<E>> d(ala<? extends jv<E>> $$0) {
      return this.c($$0) ? Optional.of((ala<E>)this) : Optional.empty();
   }

   public alb a() {
      return this.c;
   }

   public alb b() {
      return this.b;
   }

   public ala<jv<T>> c() {
      return a(this.b);
   }

   static record a(alb a, alb b) {
   }
}
