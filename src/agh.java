import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class agh<T> {
   private static final ConcurrentMap<agh.a, agh<?>> a = new MapMaker().weakValues().makeMap();
   private final agi b;
   private final agi c;

   public static <T> Codec<agh<T>> a(agh<? extends io<T>> $$0) {
      return agi.a.xmap($$1 -> a($$0, $$1), agh::a);
   }

   public static <T> agh<T> a(agh<? extends io<T>> $$0, agi $$1) {
      return a($$0.c, $$1);
   }

   public static <T> agh<io<T>> a(agi $$0) {
      return a(jy.a, $$0);
   }

   private static <T> agh<T> a(agi $$0, agi $$1) {
      return (agh<T>)a.computeIfAbsent(new agh.a($$0, $$1), $$0x -> new agh($$0x.a, $$0x.b));
   }

   private agh(agi $$0, agi $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean b(agh<? extends io<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<agh<E>> c(agh<? extends io<E>> $$0) {
      return this.b($$0) ? Optional.of((agh<E>)this) : Optional.empty();
   }

   public agi a() {
      return this.c;
   }

   public agi b() {
      return this.b;
   }

   static record a(agi a, agi b) {
   }
}
