import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class alj<T> {
   private static final ConcurrentMap<alj.a, alj<?>> a = new MapMaker().weakValues().makeMap();
   private final alk b;
   private final alk c;

   public static <T> Codec<alj<T>> a(alj<? extends jt<T>> $$0) {
      return alk.a.xmap($$1 -> a($$0, $$1), alj::a);
   }

   public static <T> za<ByteBuf, alj<T>> b(alj<? extends jt<T>> $$0) {
      return alk.b.a($$1 -> a($$0, $$1), alj::a);
   }

   public static <T> alj<T> a(alj<? extends jt<T>> $$0, alk $$1) {
      return a($$0.c, $$1);
   }

   public static <T> alj<jt<T>> a(alk $$0) {
      return a(mi.a, $$0);
   }

   private static <T> alj<T> a(alk $$0, alk $$1) {
      return (alj<T>)a.computeIfAbsent(new alj.a($$0, $$1), $$0x -> new alj($$0x.a, $$0x.b));
   }

   private alj(alk $$0, alk $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean c(alj<? extends jt<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<alj<E>> d(alj<? extends jt<E>> $$0) {
      return this.c($$0) ? Optional.of((alj<E>)this) : Optional.empty();
   }

   public alk a() {
      return this.c;
   }

   public alk b() {
      return this.b;
   }

   public alj<jt<T>> c() {
      return a(this.b);
   }

   static record a(alk a, alk b) {
   }
}
