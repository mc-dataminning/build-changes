import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class aeo<T> {
   private static final ConcurrentMap<aeo.a, aeo<?>> a = new MapMaker().weakValues().makeMap();
   private final aep b;
   private final aep c;

   public static <T> Codec<aeo<T>> a(aeo<? extends hs<T>> $$0) {
      return aep.a.xmap($$1 -> a($$0, $$1), aeo::a);
   }

   public static <T> aeo<T> a(aeo<? extends hs<T>> $$0, aep $$1) {
      return a($$0.c, $$1);
   }

   public static <T> aeo<hs<T>> a(aep $$0) {
      return a(jc.a, $$0);
   }

   private static <T> aeo<T> a(aep $$0, aep $$1) {
      return (aeo<T>)a.computeIfAbsent(new aeo.a($$0, $$1), $$0x -> new aeo($$0x.a, $$0x.b));
   }

   private aeo(aep $$0, aep $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean b(aeo<? extends hs<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<aeo<E>> c(aeo<? extends hs<E>> $$0) {
      return this.b($$0) ? Optional.of((aeo<E>)this) : Optional.empty();
   }

   public aep a() {
      return this.c;
   }

   public aep b() {
      return this.b;
   }

   static record a(aep a, aep b) {
   }
}
