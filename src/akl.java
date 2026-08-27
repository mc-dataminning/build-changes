import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class akl<T> {
   private static final ConcurrentMap<akl.a, akl<?>> a = new MapMaker().weakValues().makeMap();
   private final akm b;
   private final akm c;

   public static <T> Codec<akl<T>> a(akl<? extends jk<T>> $$0) {
      return akm.a.xmap($$1 -> a($$0, $$1), akl::a);
   }

   public static <T> yv<ByteBuf, akl<T>> b(akl<? extends jk<T>> $$0) {
      return akm.b.a($$1 -> a($$0, $$1), akl::a);
   }

   public static <T> akl<T> a(akl<? extends jk<T>> $$0, akm $$1) {
      return a($$0.c, $$1);
   }

   public static <T> akl<jk<T>> a(akm $$0) {
      return a(lf.a, $$0);
   }

   private static <T> akl<T> a(akm $$0, akm $$1) {
      return (akl<T>)a.computeIfAbsent(new akl.a($$0, $$1), $$0x -> new akl($$0x.a, $$0x.b));
   }

   private akl(akm $$0, akm $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean c(akl<? extends jk<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<akl<E>> d(akl<? extends jk<E>> $$0) {
      return this.c($$0) ? Optional.of((akl<E>)this) : Optional.empty();
   }

   public akm a() {
      return this.c;
   }

   public akm b() {
      return this.b;
   }

   public akl<jk<T>> c() {
      return a(this.b);
   }

   static record a(akm a, akm b) {
   }
}
