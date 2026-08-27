import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class ags<T> {
   private static final ConcurrentMap<ags.a, ags<?>> a = new MapMaker().weakValues().makeMap();
   private final agt b;
   private final agt c;

   public static <T> Codec<ags<T>> a(ags<? extends ir<T>> $$0) {
      return agt.a.xmap($$1 -> a($$0, $$1), ags::a);
   }

   public static <T> ags<T> a(ags<? extends ir<T>> $$0, agt $$1) {
      return a($$0.c, $$1);
   }

   public static <T> ags<ir<T>> a(agt $$0) {
      return a(kc.a, $$0);
   }

   private static <T> ags<T> a(agt $$0, agt $$1) {
      return (ags<T>)a.computeIfAbsent(new ags.a($$0, $$1), $$0x -> new ags($$0x.a, $$0x.b));
   }

   private ags(agt $$0, agt $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean b(ags<? extends ir<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<ags<E>> c(ags<? extends ir<E>> $$0) {
      return this.b($$0) ? Optional.of((ags<E>)this) : Optional.empty();
   }

   public agt a() {
      return this.c;
   }

   public agt b() {
      return this.b;
   }

   static record a(agt a, agt b) {
   }
}
