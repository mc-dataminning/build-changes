import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class ahg<T> {
   private static final ConcurrentMap<ahg.a, ahg<?>> a = new MapMaker().weakValues().makeMap();
   private final ahh b;
   private final ahh c;

   public static <T> Codec<ahg<T>> a(ahg<? extends it<T>> $$0) {
      return ahh.a.xmap($$1 -> a($$0, $$1), ahg::a);
   }

   public static <T> ahg<T> a(ahg<? extends it<T>> $$0, ahh $$1) {
      return a($$0.c, $$1);
   }

   public static <T> ahg<it<T>> a(ahh $$0) {
      return a(ke.a, $$0);
   }

   private static <T> ahg<T> a(ahh $$0, ahh $$1) {
      return (ahg<T>)a.computeIfAbsent(new ahg.a($$0, $$1), $$0x -> new ahg($$0x.a, $$0x.b));
   }

   private ahg(ahh $$0, ahh $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean b(ahg<? extends it<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<ahg<E>> c(ahg<? extends it<E>> $$0) {
      return this.b($$0) ? Optional.of((ahg<E>)this) : Optional.empty();
   }

   public ahh a() {
      return this.c;
   }

   public ahh b() {
      return this.b;
   }

   static record a(ahh a, ahh b) {
   }
}
