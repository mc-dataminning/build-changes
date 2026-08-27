import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class ahc<T> {
   private static final ConcurrentMap<ahc.a, ahc<?>> a = new MapMaker().weakValues().makeMap();
   private final ahd b;
   private final ahd c;

   public static <T> Codec<ahc<T>> a(ahc<? extends it<T>> $$0) {
      return ahd.a.xmap($$1 -> a($$0, $$1), ahc::a);
   }

   public static <T> ahc<T> a(ahc<? extends it<T>> $$0, ahd $$1) {
      return a($$0.c, $$1);
   }

   public static <T> ahc<it<T>> a(ahd $$0) {
      return a(ke.a, $$0);
   }

   private static <T> ahc<T> a(ahd $$0, ahd $$1) {
      return (ahc<T>)a.computeIfAbsent(new ahc.a($$0, $$1), $$0x -> new ahc($$0x.a, $$0x.b));
   }

   private ahc(ahd $$0, ahd $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean b(ahc<? extends it<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<ahc<E>> c(ahc<? extends it<E>> $$0) {
      return this.b($$0) ? Optional.of((ahc<E>)this) : Optional.empty();
   }

   public ahd a() {
      return this.c;
   }

   public ahd b() {
      return this.b;
   }

   static record a(ahd a, ahd b) {
   }
}
