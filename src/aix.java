import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class aix<T> {
   private static final ConcurrentMap<aix.a, aix<?>> a = new MapMaker().weakValues().makeMap();
   private final aiy b;
   private final aiy c;

   public static <T> Codec<aix<T>> a(aix<? extends iv<T>> $$0) {
      return aiy.a.xmap($$1 -> a($$0, $$1), aix::a);
   }

   public static <T> xo<ByteBuf, aix<T>> b(aix<? extends iv<T>> $$0) {
      return aiy.b.a($$1 -> a($$0, $$1), aix::a);
   }

   public static <T> aix<T> a(aix<? extends iv<T>> $$0, aiy $$1) {
      return a($$0.c, $$1);
   }

   public static <T> aix<iv<T>> a(aiy $$0) {
      return a(kg.a, $$0);
   }

   private static <T> aix<T> a(aiy $$0, aiy $$1) {
      return (aix<T>)a.computeIfAbsent(new aix.a($$0, $$1), $$0x -> new aix($$0x.a, $$0x.b));
   }

   private aix(aiy $$0, aiy $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean c(aix<? extends iv<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<aix<E>> d(aix<? extends iv<E>> $$0) {
      return this.c($$0) ? Optional.of((aix<E>)this) : Optional.empty();
   }

   public aiy a() {
      return this.c;
   }

   public aiy b() {
      return this.b;
   }

   static record a(aiy a, aiy b) {
   }
}
