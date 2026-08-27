import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class ahf<T> {
   private static final ConcurrentMap<ahf.a, ahf<?>> a = new MapMaker().weakValues().makeMap();
   private final ahg b;
   private final ahg c;

   public static <T> Codec<ahf<T>> a(ahf<? extends it<T>> $$0) {
      return ahg.a.xmap($$1 -> a($$0, $$1), ahf::a);
   }

   public static <T> ahf<T> a(ahf<? extends it<T>> $$0, ahg $$1) {
      return a($$0.c, $$1);
   }

   public static <T> ahf<it<T>> a(ahg $$0) {
      return a(ke.a, $$0);
   }

   private static <T> ahf<T> a(ahg $$0, ahg $$1) {
      return (ahf<T>)a.computeIfAbsent(new ahf.a($$0, $$1), $$0x -> new ahf($$0x.a, $$0x.b));
   }

   private ahf(ahg $$0, ahg $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean b(ahf<? extends it<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<ahf<E>> c(ahf<? extends it<E>> $$0) {
      return this.b($$0) ? Optional.of((ahf<E>)this) : Optional.empty();
   }

   public ahg a() {
      return this.c;
   }

   public ahg b() {
      return this.b;
   }

   static record a(ahg a, ahg b) {
   }
}
