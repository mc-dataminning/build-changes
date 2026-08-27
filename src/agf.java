import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class agf<T> {
   private static final ConcurrentMap<agf.a, agf<?>> a = new MapMaker().weakValues().makeMap();
   private final agg b;
   private final agg c;

   public static <T> Codec<agf<T>> a(agf<? extends io<T>> $$0) {
      return agg.a.xmap($$1 -> a($$0, $$1), agf::a);
   }

   public static <T> agf<T> a(agf<? extends io<T>> $$0, agg $$1) {
      return a($$0.c, $$1);
   }

   public static <T> agf<io<T>> a(agg $$0) {
      return a(jy.a, $$0);
   }

   private static <T> agf<T> a(agg $$0, agg $$1) {
      return (agf<T>)a.computeIfAbsent(new agf.a($$0, $$1), $$0x -> new agf($$0x.a, $$0x.b));
   }

   private agf(agg $$0, agg $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean b(agf<? extends io<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<agf<E>> c(agf<? extends io<E>> $$0) {
      return this.b($$0) ? Optional.of((agf<E>)this) : Optional.empty();
   }

   public agg a() {
      return this.c;
   }

   public agg b() {
      return this.b;
   }

   static record a(agg a, agg b) {
   }
}
