import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class aev<T> {
   private static final ConcurrentMap<aev.a, aev<?>> a = new MapMaker().weakValues().makeMap();
   private final aew b;
   private final aew c;

   public static <T> Codec<aev<T>> a(aev<? extends hq<T>> $$0) {
      return aew.a.xmap($$1 -> a($$0, $$1), aev::a);
   }

   public static <T> aev<T> a(aev<? extends hq<T>> $$0, aew $$1) {
      return a($$0.c, $$1);
   }

   public static <T> aev<hq<T>> a(aew $$0) {
      return a(jb.a, $$0);
   }

   private static <T> aev<T> a(aew $$0, aew $$1) {
      return (aev<T>)a.computeIfAbsent(new aev.a($$0, $$1), $$0x -> new aev($$0x.a, $$0x.b));
   }

   private aev(aew $$0, aew $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean b(aev<? extends hq<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<aev<E>> c(aev<? extends hq<E>> $$0) {
      return this.b($$0) ? Optional.of((aev<E>)this) : Optional.empty();
   }

   public aew a() {
      return this.c;
   }

   public aew b() {
      return this.b;
   }

   static record a(aew a, aew b) {
   }
}
