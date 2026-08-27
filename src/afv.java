import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class afv<T> {
   private static final ConcurrentMap<afv.a, afv<?>> a = new MapMaker().weakValues().makeMap();
   private final afw b;
   private final afw c;

   public static <T> Codec<afv<T>> a(afv<? extends io<T>> $$0) {
      return afw.a.xmap($$1 -> a($$0, $$1), afv::a);
   }

   public static <T> afv<T> a(afv<? extends io<T>> $$0, afw $$1) {
      return a($$0.c, $$1);
   }

   public static <T> afv<io<T>> a(afw $$0) {
      return a(jy.a, $$0);
   }

   private static <T> afv<T> a(afw $$0, afw $$1) {
      return (afv<T>)a.computeIfAbsent(new afv.a($$0, $$1), $$0x -> new afv($$0x.a, $$0x.b));
   }

   private afv(afw $$0, afw $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean b(afv<? extends io<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<afv<E>> c(afv<? extends io<E>> $$0) {
      return this.b($$0) ? Optional.of((afv<E>)this) : Optional.empty();
   }

   public afw a() {
      return this.c;
   }

   public afw b() {
      return this.b;
   }

   static record a(afw a, afw b) {
   }
}
