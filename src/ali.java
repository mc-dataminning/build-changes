import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class ali<T> {
   private static final ConcurrentMap<ali.a, ali<?>> a = new MapMaker().weakValues().makeMap();
   private final alj b;
   private final alj c;

   public static <T> Codec<ali<T>> a(ali<? extends kd<T>> $$0) {
      return alj.a.xmap($$1 -> a($$0, $$1), ali::a);
   }

   public static <T> zh<ByteBuf, ali<T>> b(ali<? extends kd<T>> $$0) {
      return alj.b.a($$1 -> a($$0, $$1), ali::a);
   }

   public static <T> ali<T> a(ali<? extends kd<T>> $$0, alj $$1) {
      return a($$0.c, $$1);
   }

   public static <T> ali<kd<T>> a(alj $$0) {
      return a(ma.a, $$0);
   }

   private static <T> ali<T> a(alj $$0, alj $$1) {
      return (ali<T>)a.computeIfAbsent(new ali.a($$0, $$1), $$0x -> new ali($$0x.a, $$0x.b));
   }

   private ali(alj $$0, alj $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean c(ali<? extends kd<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<ali<E>> d(ali<? extends kd<E>> $$0) {
      return this.c($$0) ? Optional.of((ali<E>)this) : Optional.empty();
   }

   public alj a() {
      return this.c;
   }

   public alj b() {
      return this.b;
   }

   public ali<kd<T>> c() {
      return a(this.b);
   }

   static record a(alj a, alj b) {
   }
}
