import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class ale<T> {
   private static final ConcurrentMap<ale.a, ale<?>> a = new MapMaker().weakValues().makeMap();
   private final alf b;
   private final alf c;

   public static <T> Codec<ale<T>> a(ale<? extends jv<T>> $$0) {
      return alf.a.xmap($$1 -> a($$0, $$1), ale::a);
   }

   public static <T> zn<ByteBuf, ale<T>> b(ale<? extends jv<T>> $$0) {
      return alf.b.a($$1 -> a($$0, $$1), ale::a);
   }

   public static <T> ale<T> a(ale<? extends jv<T>> $$0, alf $$1) {
      return a($$0.c, $$1);
   }

   public static <T> ale<jv<T>> a(alf $$0) {
      return a(lq.a, $$0);
   }

   private static <T> ale<T> a(alf $$0, alf $$1) {
      return (ale<T>)a.computeIfAbsent(new ale.a($$0, $$1), $$0x -> new ale($$0x.a, $$0x.b));
   }

   private ale(alf $$0, alf $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean c(ale<? extends jv<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<ale<E>> d(ale<? extends jv<E>> $$0) {
      return this.c($$0) ? Optional.of((ale<E>)this) : Optional.empty();
   }

   public alf a() {
      return this.c;
   }

   public alf b() {
      return this.b;
   }

   public ale<jv<T>> c() {
      return a(this.b);
   }

   static record a(alf a, alf b) {
   }
}
